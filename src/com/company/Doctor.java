package com.company;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class Doctor extends Person{
    private int licenceNum;
    private String specialisation;


    public Doctor(){}
    public Doctor(String name, String surName, LocalDate dateOfBirth, int mobileNum, int licenceNum, String specialisation) {
        super(name, surName, dateOfBirth, mobileNum);
        this.licenceNum = licenceNum;
        this.specialisation = specialisation;
    }




    public void setLicenceNum(int licenceNum){
        this.licenceNum = licenceNum;
    }
    public int getLicenceNum(){
        return licenceNum;
    }
    public void setSpecialisation(String specialisation){
        this.specialisation = specialisation;
    }
    public String getSpecialisation(){
        return specialisation;
    }


}
