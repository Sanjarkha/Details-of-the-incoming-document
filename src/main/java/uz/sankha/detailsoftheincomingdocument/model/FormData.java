package uz.sankha.detailsoftheincomingdocument.model;

import javax.persistence.*;

@Entity
@Table(name = "form")
public class FormData {

    @Column(name = "Id")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;

    @Column(name = "reg_Id")
    private String reg_Id;

    @Column(name = "reg_date")
    private String reg_date;


    @Column(name = "source_doc_id")
    private String source_doc_id;

    @Column(name = "source_doc_date")
    private String source_doc_date;

    @Column(name = "delivery_form")
    private Integer delivery_form;

    @Column(name = "correspondent")
    private Integer correspondent;

    @Column(name = "topic")
    private String topic;

    @Column(name = "description")
    private String description;

    @Column(name = "period_of_execution")
    private String period_of_execution;

    @Column(name = "access")
    private Boolean access;

    @Column(name = "control")
    private Boolean control;

    public FormData(){

    }

    public FormData(String reg_Id, String reg_date, String source_doc_id, String source_doc_date, Integer delivery_form, Integer correspondent, String topic, String description, String period_of_execution, Boolean access, Boolean control) {

        this.reg_Id = reg_Id;
        this.reg_date = reg_date;
        this.source_doc_id = source_doc_id;
        this.source_doc_date = source_doc_date;
        this.delivery_form = delivery_form;
        this.correspondent = correspondent;
        this.topic = topic;
        this.description = description;
        this.period_of_execution = period_of_execution;
        this.access = access;
        this.control = control;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getReg_Id() {
        return reg_Id;
    }

    public void setReg_Id(String reg_Id) {
        this.reg_Id = reg_Id;
    }

    public String getReg_date() {
        return reg_date;
    }

    public void setReg_date(String reg_date) {
        this.reg_date = reg_date;
    }

    public String getSource_doc_id() {
        return source_doc_id;
    }

    public void setSource_doc_id(String source_doc_id) {
        this.source_doc_id = source_doc_id;
    }

    public String getSource_doc_date() {
        return source_doc_date;
    }

    public void setSource_doc_date(String source_doc_date) {
        this.source_doc_date = source_doc_date;
    }

    public Integer getDelivery_form() {
        return delivery_form;
    }

    public void setDelivery_form(Integer delivery_form) {
        this.delivery_form = delivery_form;
    }

    public Integer getCorrespondent() {
        return correspondent;
    }

    public void setCorrespondent(Integer correspondent) {
        this.correspondent = correspondent;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getPeriod_of_execution() {
        return period_of_execution;
    }

    public void setPeriod_of_execution(String period_of_execution) {
        this.period_of_execution = period_of_execution;
    }

    public Boolean getAccess() {
        return access;
    }

    public void setAccess(Boolean access) {
        this.access = access;
    }

    public Boolean getControl() {
        return control;
    }

    public void setControl(Boolean control) {
        this.control = control;
    }
}
