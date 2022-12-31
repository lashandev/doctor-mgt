package com.company;

import java.time.LocalDate;
import java.util.Date;

public class Patient extends Person{

    private int patientId;

    public Patient(String name, String surName, LocalDate dateOfBirth, int mobileNum, int licenceNum, String specialisation){
        super(name, surName, dateOfBirth, mobileNum);
    }
    public void setPatientId(int patientId){
        this.patientId = patientId;
    }
    public int getPatientId() {
        return patientId;
    }
}
