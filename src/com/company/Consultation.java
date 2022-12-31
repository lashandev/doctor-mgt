package com.company;

import java.sql.Time;
import java.util.Date;

public class Consultation {
    private Date consultationDate;
    private Time consultationTime;
    private Double consultationCost;
    private String consultationNotes;

    public void setConsultationDate(Date consultationDate){
        this.consultationDate= consultationDate;
    }
    public Date getConsultationDate(){
        return consultationDate;
    }
    public void setConsultationTime(Time consultationDate){
        this.consultationTime= consultationTime;
    }
    public Time getConsultationTime(){
        return consultationTime;
    }
    public void setConsultationCost(Double consultationCost){
        this.consultationCost= consultationCost;
    }
    public Double getConsultationCost(){
        return consultationCost;
    }
    public void setConsultationNotes(String consultationNotes){
        this.consultationNotes= consultationNotes;
    }
    public String getConsultationNotes(){
        return consultationNotes;
    }

}
