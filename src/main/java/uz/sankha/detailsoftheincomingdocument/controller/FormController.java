package uz.sankha.detailsoftheincomingdocument.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import uz.sankha.detailsoftheincomingdocument.entity.Form;
import uz.sankha.detailsoftheincomingdocument.repository.FormRepository;

import javax.servlet.http.HttpServletRequest;
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
    private String requisites(Model model, HttpServletRequest request){
        System.out.println("Reg id:"+request.getParameter("reg_Id"));
        System.out.println("Reg date:"+request.getParameter("reg_date"));
        System.out.println("source id:"+request.getParameter("source_doc_id"));
        System.out.println("source date:"+request.getParameter("source_doc_date"));
        System.out.println("delivary form:"+request.getParameter("delivery_form"));
        System.out.println("Correspondent:"+request.getParameter("correspondent"));
        System.out.println("Topic:"+request.getParameter("topic"));
        System.out.println("Descript:"+request.getParameter("description"));
        System.out.println("Period:"+request.getParameter("period_of_execution"));
        System.out.println("Acces:"+request.getParameter("access"));
        System.out.println("Control:"+request.getParameter("control"));
        Form n=new Form();
        n.setAccess(true);
        n.setDelivery_form("Sanjar000");
        n.setReg_date("Today");
        formRepository.save(n);
        return form(model);
    }

}
