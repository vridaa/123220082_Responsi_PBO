/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view.dosen;

import controller.ControllerDosen;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import model.dosen.ModelDosen;


public class EditDataDosen extends JFrame {
   
    ControllerDosen controller;
    
    JLabel header = new JLabel("Edit Dosen");
    JLabel labelInputNama = new JLabel("Nama");
    JLabel labelInputNIDN = new JLabel("NO Hp");
    JLabel labelemail=new JLabel("Email");
    JTextField inputNama = new JTextField();
    JTextField inputNIDN = new JTextField();
    JTextField inputEmail= new JTextField();
    JButton tombolEdit = new JButton("Edit Dosen");
    JButton tombolKembali = new JButton("Kembali");

    public EditDataDosen(ModelDosen dosen) {
        
        setTitle("Edit Dosen");
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);
        setSize(480, 280);

        add(header);
        add(labelInputNama);
        add(labelInputNIDN);
        add(inputNama);
        add(inputNIDN);
        add(tombolEdit);
        add(tombolKembali);

        header.setBounds(20, 8, 440, 24);
        labelInputNama.setBounds(20, 32, 440, 24);
        inputNama.setBounds(18, 56, 440, 36);
        labelInputNIDN.setBounds(20, 96, 440, 24);
        inputNIDN.setBounds(18, 120, 440, 36);
        labelemail.setBounds(20, 150, 440, 24);
        inputEmail.setBounds(18, 170, 440, 36);
        tombolKembali.setBounds(20, 220, 215, 40);
        tombolEdit.setBounds(240, 220, 215, 40);
        
        
        inputNama.setText(dosen.getNama());
        inputNIDN.setText(dosen.getNoHp());
        inputEmail.setText(dosen.getEmail());
        
        
        controller = new ControllerDosen(this);

        tombolKembali.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();
                new ViewDataDosen();
            }
        });

        tombolEdit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                controller.editDosen(dosen.getId());
            }
        });
    }
    
 
    public String getInputNama() {
        return inputNama.getText();
    }
  
    public String getInputEmail() {
        return inputEmail.getText();
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getInputNoHp() {
        return inputNIDN.getText();
       // throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}