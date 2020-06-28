package uz.sankha.detailsoftheincomingdocument.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.sankha.detailsoftheincomingdocument.model.FormData;
import uz.sankha.detailsoftheincomingdocument.repository.FormRepository;

@Service
public class FormServices {

    @Autowired
    FormRepository formRepository;

    public void addForm(FormData formData){


        formRepository.save(formData);
    }
}
