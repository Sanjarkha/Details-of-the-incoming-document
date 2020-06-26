package uz.sankha.detailsoftheincomingdocument.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.sankha.detailsoftheincomingdocument.entity.Form;
import uz.sankha.detailsoftheincomingdocument.repository.FormRepository;

@Service
public class FormServices {

    @Autowired
    FormRepository formRepository;
    private Long Id=50L;
    private String reg_Id="50";
    private String reg_date="60";
    private String source_doc_id="70";
    private String source_doc_date="80";

    public void addForm(Form form){
        formRepository.save(form);
    }
}
