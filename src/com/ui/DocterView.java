package com.ui;

import com.company.Doctor;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;
import java.util.List;
import java.util.stream.Collectors;

public class DocterView extends JFrame {
    private JTable doctor_table;
    private List<Doctor> doctors = new ArrayList<>();
    public DocterView()  {
        initUI();
        setLocationRelativeTo(null);
        loadDoctors();
    }

    private void initUI() {
        setSize(600,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(null);
        JLabel header = new JLabel("List Of All Doctors");
        header.setBounds(0,0,600,20);
        add(header);

        JScrollPane jScrollPane = new JScrollPane();
        doctor_table = new javax.swing.JTable();
        doctor_table.setModel(new DefaultTableModel(
                new Object[][]{

                },
                new String[]{
                        "Name",
                        "SurName",
                        "DOB",
                        "Specialisation"
                }
        ));

        jScrollPane.setViewportView(doctor_table);
        jScrollPane.setBounds(25,25,550,275);
        add(jScrollPane);

        JButton buttonAssignDoctor = new JButton("Assign Doctor");
        buttonAssignDoctor.setBounds(25,310,200,30);
        add(buttonAssignDoctor);

        buttonAssignDoctor.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonAssignDoctorActionPerformed(e);
            }
        });

        JButton button_sort = new JButton("Sort Doctors to Ascending Order");
        button_sort.setBounds(250,310,300,30);
        add(button_sort);
        button_sort.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                buttonSortActionPerfoemed(e);
            }
        });

    }

    private void buttonSortActionPerfoemed(ActionEvent e) {
        List<Doctor> sortedList = doctors.stream()
                .sorted(Comparator.comparing(Doctor::getSurName))
                .collect(Collectors.toList());

        DefaultTableModel dtm = (DefaultTableModel) doctor_table.getModel();
        dtm.setRowCount(0);
        for (Doctor doctor : sortedList) {
            Vector v = new Vector();
            v.add(doctor.getName());
            v.add(doctor.getSurName());
            v.add(doctor.getDate_Of_Birth());
            v.add(doctor.getSpecialisation());
            dtm.addRow(v);
        }
    }

    private void buttonAssignDoctorActionPerformed(ActionEvent e) {
        int selectedRow = doctor_table.getSelectedRow();
        String name = doctor_table.getValueAt(selectedRow, 0).toString();
        PationAssignDoctorView pationAssignDoctorView = new PationAssignDoctorView(name);
        pationAssignDoctorView.setVisible(true);
        this.dispose();
    }

    private void loadDoctors() {
        try {
            loadFile();
            DefaultTableModel dtm = (DefaultTableModel) doctor_table.getModel();
            dtm.setRowCount(0);
            for (Doctor doctor : doctors) {
                Vector v = new Vector();
                v.add(doctor.getName());
                v.add(doctor.getSurName());
                v.add(doctor.getDate_Of_Birth());
                v.add(doctor.getSpecialisation());
                dtm.addRow(v);
            }
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    public void loadFile() throws FileNotFoundException, ParseException {
        File file = new File("test.txt");
        String[] filedata;
        //using Scanner class to read data
        Scanner myscanner = new Scanner(file);
        while (myscanner.hasNextLine()) {
            filedata = myscanner.nextLine().split(",");
            LocalDate dateD = null;
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
            if (filedata[2]!=null){
                dateD = LocalDate.parse(filedata[2].trim(),formatter);
            }
            doctors.add(new Doctor(filedata[0].trim(), filedata[1].trim(), dateD, Integer.parseInt(filedata[3].trim()), filedata[4].trim(), filedata[5]));
        }
    }

    public static void main(String[] args) {
        DocterView docterView = new DocterView();
        docterView.setVisible(true);
    }
}
