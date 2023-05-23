

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.sql.*;
import javax.swing.*;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.*;  
import java.awt.event.*; 
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JAVA_LBL extends JFrame{

 private JPanel contentPane;
 int LblTextlength = 0;
 Timer tm;
 int counter = 0;
  JButton b1;
  
 public static void main(String[] args) {
  EventQueue.invokeLater(new Runnable() {
   public void run() {
    try {
     JAVA_LBL frame = new JAVA_LBL();
     frame.setVisible(true);
    } catch (Exception e) {
     e.printStackTrace();
    }
   }
  });
 }

 
 public JAVA_LBL() {
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setBounds(100, 200, 450, 300);
  contentPane = new JPanel();
  contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
  setContentPane(contentPane);
  contentPane.setLayout(null);
  

  b1 = new JButton("BACK");   
  b1.setBounds(44,150,100, 36);
  b1.setLayout(null); 
  contentPane.add(b1);
  
  JLabel lblMsg = new JLabel("YOUR ACCOUNT IS ACTIVATED");
  lblMsg.setForeground(Color.BLUE);
  lblMsg.setFont(new Font("Tahoma", Font.BOLD, 16));
  lblMsg.setBounds(38, 73, 313, 36);
  contentPane.add(lblMsg);
  
  String txt = lblMsg.getText();
  LblTextlength = txt.length();
  
  tm = new Timer(150, new ActionListener() {
   
 
   public void actionPerformed(ActionEvent ae) {
    
    counter++;
    if(counter > LblTextlength)
    {
     lblMsg.setText("");
     counter = 0;
    }else{
     lblMsg.setText(txt.substring(0,counter));
     
     if(lblMsg.getForeground() == Color.blue)
     {
      lblMsg.setForeground(Color.red);
     } 
     else if(lblMsg.getForeground() == Color.red)
     {
      lblMsg.setForeground(Color.green);
     }
     else if(lblMsg.getForeground() == Color.green)
     {
      lblMsg.setForeground(Color.blue);
     }
	 
    
    }
	   
   }
  });
  
  tm.start();
  
 }
}
