package com.company;

import java.time.LocalDate;

public class Patient extends Person{

    private int patientId;
    private int consultationHours;
    private int consultationcost;

    public Patient(String name, String  surName, LocalDate dateOfBirth, int mobileNum, int consultationHours,int patientId){
        super(name, surName, dateOfBirth, mobileNum);
        this.consultationHours = consultationHours;
        this.patientId = patientId;
    }



    public void setPatientId(int patientId){

        this.patientId = patientId;
    }
    public int getPatientId() {

        return patientId;
    }
    public void setConsultationHours(int consultationHours){
        this.consultationHours = consultationHours;
    }

    public int getConsultationHours() {
        return consultationHours;
    }
    public  void setConsultationcost(int consultationcost){
        this.consultationcost = consultationcost;
    }
    public int getConsultationcost() {
        return consultationcost;
   }
}
