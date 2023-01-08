package com.company;

import java.util.Date;

public class Consultation {
    private Doctor doctor;
    private Date consultationDate;
    private int consultationTime;
    private double consultationCost;
    private String consultationNotes;

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Date getConsultationDate() {
        return consultationDate;
    }

    public void setConsultationDate(Date consultationDate) {
        this.consultationDate = consultationDate;
    }

    public int getConsultationTime() {
        return consultationTime;
    }

    public void setConsultationTime(int consultationTime) {
        this.consultationTime = consultationTime;
    }

    public double getConsultationCost() {
        return consultationCost;
    }

    public void setConsultationCost(double consultationCost) {
        this.consultationCost = consultationCost;
    }

    public String getConsultationNotes() {
        return consultationNotes;
    }

    public void setConsultationNotes(String consultationNotes) {
        this.consultationNotes = consultationNotes;
    }

    public int getConsultationHour() {
        return consultationHour;
    }

    public void setConsultationHour(int consultationHour) {
        this.consultationHour = consultationHour;
    }

    private int consultationHour;


}
