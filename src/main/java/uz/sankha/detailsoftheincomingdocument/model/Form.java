package uz.sankha.detailsoftheincomingdocument.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Form {
    @NotNull
    @Size(min = 1,max = 15,message = "Обязательное поле вы должны ввести ходьбу одну цифру или букву")
    private String reg_Id;

    @NotNull
    @Size(min = 1,message ="Обязательное поле" )
    private String correspondent;

    @NotNull
    @Size(min = 1,max = 100,message = "Обязательное поле 1-100 ")
    private String topic;

    public Form(String reg_Id,String correspondent,String topic) {
        this.reg_Id = reg_Id;
        this.correspondent = correspondent;
        this.topic = topic;
    }

    public Form() {

    }

    public String getReg_Id() {
        return reg_Id;
    }

    public void setReg_Id(String reg_Id) {
        this.reg_Id = reg_Id;
    }

    public String getCorrespondent() {
        return correspondent;
    }

    public void setCorrespondent(String correspondent) {
        this.correspondent = correspondent;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }
}
