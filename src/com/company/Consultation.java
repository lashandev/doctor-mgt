package com.company;

import java.sql.Time;
import java.util.Date;

public class Consultation {
    private Doctor doctor;
    private Date consultationDate;
    private int consultationTime;
    private int consultationCost;
    private String consultationNotes;
    private String consultationHour;

    public Consultation(int consultationCost){
        this.doctor = doctor;
        this.consultationHour = consultationHour;
        this.consultationCost = consultationCost;
    }

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
    public void setConsultationCost(int consultationCost){

        this.consultationCost= consultationCost;
    }
    public int getConsultationCost(){

        return consultationCost;
    }
    public void setConsultationNotes(String consultationNotes){

        this.consultationNotes= consultationNotes;
    }
    public String getConsultationNotes(){

        return consultationNotes;
    }

}
