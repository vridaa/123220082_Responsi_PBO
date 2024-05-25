/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.dosen;

import controller.ControllerDosen;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class InputDataDosen extends JFrame {

    ControllerDosen controller;
    
    JLabel header = new JLabel("Input Dosen");
    JLabel labelInputNama = new JLabel("Nama");
    JLabel labelInputNIDN = new JLabel("NO HP");
    JLabel labelemail=new JLabel("Email");
    JTextField inputEmail= new JTextField();
    JTextField inputNama = new JTextField();
    JTextField inputNIDN = new JTextField();
    JButton tombolTambah = new JButton("Tambah Dosen");
    JButton tombolKembali = new JButton("Kembali");

    public InputDataDosen() {
        setTitle("Input Dosen");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setSize(680,500);

        add(header);
        add(labelInputNama);
        add(labelInputNIDN);
        add(labelemail);
        add(inputNama);
        add(inputNIDN);
        add(inputEmail);
        add(tombolTambah);
        add(tombolKembali);

        header.setBounds(20, 8, 440, 24);
        labelInputNama.setBounds(20, 32, 440, 24);
        inputNama.setBounds(18, 56, 440, 36);
        labelInputNIDN.setBounds(20, 96, 440, 24);
        inputNIDN.setBounds(18, 120, 440, 36);
        labelemail.setBounds(20, 150, 440, 24);
        inputEmail.setBounds(18, 170, 440, 36);
        tombolKembali.setBounds(20, 220, 215, 40);
        tombolTambah.setBounds(240, 220, 215, 40);
        
        controller = new ControllerDosen(this);

   
        tombolKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
               
                new ViewDataDosen();
            }
        });

        tombolTambah.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    controller.insertDosen();
                } catch (Exception ex) {
                    Logger.getLogger(InputDataDosen.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }
    

    public String getInputNama() {
        return inputNama.getText();
    }
    

    public String getInputNoHp() {
        return inputNIDN.getText();
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getInputEmail() {
        return inputEmail.getText();
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}