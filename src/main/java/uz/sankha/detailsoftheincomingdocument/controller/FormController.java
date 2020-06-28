package uz.sankha.detailsoftheincomingdocument.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import uz.sankha.detailsoftheincomingdocument.model.Form;
import uz.sankha.detailsoftheincomingdocument.model.FormData;
import uz.sankha.detailsoftheincomingdocument.repository.FormRepository;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class FormController {
    @Autowired
    private FormRepository formRepository;
    @RequestMapping("/form")
    String form(Model model){
        Date date =new Date();
        SimpleDateFormat dateFormat=new SimpleDateFormat("dd.MM.yyyy");

        model.addAttribute("regdate",dateFormat.format(date));
        return"form";
    }

    @PostMapping("/requisites")
    private String requisites( Model model, HttpServletRequest request){
        System.out.println(request.getParameter("correspondent"));
        FormData fdate=new FormData();
        fdate.setReg_Id(request.getParameter("reg_Id"));

        fdate.setSource_doc_id(request.getParameter("source_doc_id"));


        fdate.setTopic(request.getParameter("topic"));
        fdate.setDescription(request.getParameter("description"));

        fdate.setAccess(true);
        fdate.setControl(false);
        fdate.setDelivery_form(2);
        fdate.setCorrespondent(1);

        formRepository.save(fdate);
        return form(model);
    }

}
