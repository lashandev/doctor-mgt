package com.ui;

import javax.swing.*;

public class PationAssignDoctorView  extends JFrame {
    private JLabel labelName;

    public PationAssignDoctorView(){
        initUI();
        setLocationRelativeTo(null);
    }

    public PationAssignDoctorView(String name){
        this();
        labelName.setText(name);
    }

    private void initUI() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,400);
        JLabel label1 = new JLabel("Doctor Name :");
        label1.setBounds(5,5,200,20);
        add(label1);

        labelName = new JLabel();
        labelName.setBounds(210,5, 200,20);
        add(labelName);
    }

    public static void main(String[] args) {
        PationAssignDoctorView pationAssignDoctorView = new PationAssignDoctorView();
        pationAssignDoctorView.setVisible(true);
    }
}
