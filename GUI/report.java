

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class report extends JFrame {

 private JPanel contentPane;
 int LblTextlength = 0;
 Timer tm;
 int counter = 0;

 
 public static void main(String[] args) {
  EventQueue.invokeLater(new Runnable() {
   public void run() {
    try {
     report frame = new report();
     frame.setVisible(true);
    } catch (Exception e) {
     e.printStackTrace();
    }
   }
  });
 }

 
 public report() {
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setBounds(0,0,2000,1000);
  contentPane = new JPanel();
  contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
  setContentPane(contentPane);
  contentPane.setLayout(null);
  
  JLabel lblMsg = new JLabel("Thanks for your valuable report.Depending on your problem,as soon as possible we'll try to fix this.HAVE A NICE DAY.");
  lblMsg.setForeground(Color.BLUE);
  lblMsg.setFont(new Font("Tahoma", Font.BOLD,16));
  lblMsg.setBounds(50,200,1000,16);
  contentPane.add(lblMsg);
  
  String txt = lblMsg.getText();
  LblTextlength = txt.length();
  
  tm = new Timer(150, new ActionListener() {
   
   @Override
   public void actionPerformed(ActionEvent arg0) {
    
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

