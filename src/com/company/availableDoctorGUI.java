package com.company;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class availableDoctorGUI extends JFrame {

    private JLabel labelName;
    private JTextField txt_date;
    private JTextField txt_time;
    private JDateChooser dateChooser;

    private JComboBox<String> start,end;

    public availableDoctorGUI(){
        initUI();
        setLocationRelativeTo(null);
    }

    public availableDoctorGUI(String dL){
        this();
        labelName.setText(dL);
    }

    private void initUI() {
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(600,400);
        BorderLayout borderLayout = new BorderLayout();

        JLabel label1 = new JLabel("Licence Number :");
        label1.setBounds(5,5,200,20);
        add(label1);

        JLabel label2 = new JLabel("Enter consultation Date and Time to Check Availability of the Doctor,");
        label2.setBounds(5,60,400,20);
        add(label2);

        JButton bookDoctor = new JButton("Book Consultation");
        bookDoctor.setBounds(60,240,150,20);
        add(bookDoctor);
        bookDoctor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bookDoctor(e);
            }
        });

        JButton checkDoctor = new JButton("Check Availability");
        checkDoctor.setBounds(10,140,150,20);
        add(checkDoctor);
        checkDoctor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkDoctorActionPerformed(e);
            }
        });

        JLabel label5 = new JLabel("Your Doctor is Available");
        label5.setBounds(5,5,200,400);
        add(label5);

        labelName = new JLabel();
        labelName.setBounds(210,5, 200,20);
        add(labelName);


        JLabel label4 = new JLabel("Consultation Date :");
        label4.setBounds(5,90,200,20);
        add(label4);

        dateChooser = new JDateChooser();
        dateChooser.setBounds(150,90,150,20);
        add(dateChooser);



        JLabel label3 = new JLabel("Consultation Time :");
        label3.setBounds(5,115,200,20);
        txt_date = new JTextField(20);
        add(label3);
        add(txt_date);

        start = new JComboBox<>();
        start.setModel(new DefaultComboBoxModel<>(new String[]{
                "13:00",
                "14:00",
                "15:00",
                "16:00",
                "17:00",
                "18:00",
                "19:00",
        }));
        start.setBounds(150,115,100,20);
        add(start);

        end = new JComboBox<>();
        end.setModel(new DefaultComboBoxModel<>(new String[]{
                "14:00",
                "15:00",
                "16:00",
                "17:00",
                "18:00",
                "20:00",
        }));
        end.setBounds(260,115,100,20);
        add(end);

    }

    private void checkDoctorActionPerformed(ActionEvent e) {
        Date date = dateChooser.getDate();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        System.out.println(sdf.format(date));
    }

    private void bookDoctor(ActionEvent e) {
        patientDetailsGUI patientDetailsGUI = new patientDetailsGUI();
        patientDetailsGUI.setVisible(true);
        this.dispose();
    }

    public static void main(String[] args) {
        availableDoctorGUI availableDoctorGUI = new availableDoctorGUI();
        availableDoctorGUI.setVisible(true);
    }


}
