/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.mahasiswa;

import controller.ControllerMahasiswa;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class InputData extends JFrame {
    
    ControllerMahasiswa controller;
    
    JLabel header = new JLabel("Input Mahasiswa");
    JLabel labelInputNama = new JLabel("Nama");
    JLabel labelInputNIM = new JLabel("NIM");
    JLabel labelemail= new JLabel("Email");
    JTextField inputNama = new JTextField();
    JTextField inputNIM = new JTextField();
    JTextField inputemail = new JTextField();
    JButton tombolTambah = new JButton("Tambah Mahasiswa");
    JButton tombolKembali = new JButton("Kembali");

    public InputData() {
        setTitle("Input Mahasiswa");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setSize(480, 280);

        add(header);
        add(labelInputNama);
        add(labelInputNIM);
        add(inputNama);
        add(inputNIM);
        add(tombolTambah);
        add(tombolKembali);
        add(labelemail);
        add(inputemail);

        header.setBounds(20, 8, 440, 24);
        labelInputNama.setBounds(20, 32, 440, 24);
        inputNama.setBounds(18, 56, 440, 36);
        labelInputNIM.setBounds(20, 96, 440, 24);
        inputNIM.setBounds(18, 120, 440, 36);
        labelemail.setBounds(20, 150, 440, 24);
        inputemail.setBounds(18, 180, 440, 36);
        tombolKembali.setBounds(20, 220, 215, 40);
        tombolTambah.setBounds(240, 220, 215, 40);
        
        controller = new ControllerMahasiswa(this);

        tombolKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
               
                new ViewData();
            }
        });

        tombolTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.insertMahasiswa();
            }
        });
    }
    
    public String getInputNama() {
        return inputNama.getText();
    }
    
    public String getInputNIM() {
        return inputNIM.getText();
    }
}