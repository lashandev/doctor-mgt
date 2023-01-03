package com.company;

import javax.swing.*;
import java.awt.*;

public class patientDetailsGUI extends JFrame {

    private JTextField txt_Name;
    private JTextField txt_Surname;
    private JTextField txt_dateOfbirth;
    private JTextField txt_mobileNum;
    private JTextField txt_patientId;
    private JTextArea txt_notes;
    private JButton button;

    public patientDetailsGUI(){
        initUI();
        setLocationRelativeTo(null);
    }
    private void initUI(){
        setSize(600,400);
        BorderLayout borderLayout = new BorderLayout();

        JLabel jl0 = new JLabel("ENTER PATIENT DETAILS");
        jl0.setBounds(210,10,200,20);
        add(jl0);

        JPanel jp1 = new JPanel();
        add(jp1,borderLayout.CENTER);
        jp1.setBorder(BorderFactory.createEmptyBorder(50,20,20,20));

        GridLayout gridLayout = new GridLayout(7,2);
        gridLayout.setVgap(10);
        jp1.setLayout(gridLayout);

        JLabel jl1 = new JLabel("Patient Name :");
        txt_Name = new JTextField(20);
        jp1.add(jl1);
        jp1.add(txt_Name);

        JLabel jl2 = new JLabel("Patient Surame :");
        txt_Surname = new JTextField(20);
        jp1.add(jl2);
        jp1.add(txt_Surname);

        JLabel jl3 = new JLabel("Patient Date of Birth :");
        txt_dateOfbirth = new JTextField(20);
        jp1.add(jl3);
        jp1.add(txt_dateOfbirth);

        JLabel jl4 = new JLabel("Patient Mobile Number :");
        txt_mobileNum = new JTextField(20);
        jp1.add(jl4);
        jp1.add(txt_mobileNum);

        JLabel jl5 = new JLabel("Patient ID :");
        txt_patientId = new JTextField(20);
        jp1.add(jl5);
        jp1.add(txt_patientId);

        JLabel jl6 = new JLabel("Additional Notes :");
        txt_notes = new JTextArea(10,20);
        jp1.add(jl6);
        jp1.add(txt_notes);

        JLabel jl7 = new JLabel();
        button = new JButton("Confirm Booking ");
        jp1.add(jl7);
        jp1.add(button);

        setVisible(true);

    }
    public static void main(String[] args) {
        patientDetailsGUI patientDetailsGUI = new patientDetailsGUI();
        patientDetailsGUI.setVisible(true);
    }
}
