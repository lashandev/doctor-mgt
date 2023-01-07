package com.company;
import com.toedter.calendar.JDateChooser;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;

public class availableDoctorGUI extends JFrame {

    private JLabel labelName;
    private JTextField txt_date;
    private JTextField txt_time;
    private JDateChooser dateChooser;
    private JComboBox<String> start,hours;

    ArrayList<Consultation> consultations = new ArrayList<>();

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

        JPanel panel1 = new JPanel();

        JLabel label2 = new JLabel("Enter consultation Date and Time to Check Availability of the Doctor,");
        label2.setBounds(5,5,400,20);
        add(label2);

        JLabel label1 = new JLabel("Doctor Licence Number :");
        label1.setBounds(5,40,200,20);
        add(label1);

        JLabel label4 = new JLabel("Consultation Date :");
        label4.setBounds(5,90,200,20);
        add(label4);
        dateChooser = new JDateChooser();
        dateChooser.setBounds(150,90,200,20);
        add(dateChooser);


        JLabel label3 = new JLabel("Consultation Time :");
        label3.setBounds(5,120,200,20);
        add(label3);
        start = new JComboBox<>();
        start.setModel(new DefaultComboBoxModel<>(new String[]{
                "08:00",
                "09:00",
                "10:00",
                "11:00",
                "12:00",
                "13:00",
                "14:00",
                "15:00",
                "16:00",
                "17:00",
        }));
        start.setBounds(150,120,100,20);
        add(start);

        JLabel label6 = new JLabel("Consultation Duration");
        label6.setBounds(5,150,200,20);
        hours = new JComboBox<>();
        hours.setModel(new DefaultComboBoxModel<>(new String[]{
                "01 H",
                "02 H",
                "03 H",
        }));
        hours.setBounds(150,150,100,20);
        add(label6);
        add(hours);


        JButton checkDoctor = new JButton("Check Availability");
        checkDoctor.setBounds(10,200,150,30);
        add(checkDoctor);
        checkDoctor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
                Date consultationDate = dateChooser.getDate();
                LocalDate dateD = null;

                int consultationTime = (int)start.getSelectedItem();
                int consultationHours = (int)start.getSelectedItem();

                saveConsultation();
            }
        });


        JLabel label5 = new JLabel("Your Doctor is Available");
        label5.setBounds(10,240,200,20);
        add(label5);

        JButton bookDoctor = new JButton("Book Consultation");
        bookDoctor.setBackground(Color.cyan);
        bookDoctor.setBounds(150,280,150,40);
        add(bookDoctor);
        bookDoctor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bookDoctor(e);
            }
        });

        labelName = new JLabel();
        labelName.setBounds(210,5, 200,20);
        add(labelName);

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

    public void saveConsultation() {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("booking.txt",true));
            for (Consultation x : consultations) {
                writer.write(x.getConsultationDate() + " , " + x.getConsultationTime());
                writer.newLine();
            }
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
