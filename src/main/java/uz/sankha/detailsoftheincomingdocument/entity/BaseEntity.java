package uz.sankha.detailsoftheincomingdocument.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class BaseEntity {
    @Id
    private Long Id;
    private String reg_Id;
    private String reg_date;
    private String source_doc_id;
    private String source_doc_date;
    private String delivery_form;
    private String correspondent;
    private String topic;
    private String description;
    private String period_of_execution;
    private Boolean access;
    private Boolean control;
}
