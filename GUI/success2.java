

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

public class success2 extends JFrame {

 private JPanel contentPane;
 int LblTextlength = 0;
 Timer tm;
 int counter = 0;

 
 public static void main(String[] args) {
  EventQueue.invokeLater(new Runnable() {
   public void run() {
    try {
     success2 frame = new success2();
     frame.setVisible(true);
    } catch (Exception e) {
     e.printStackTrace();
    }
   }
  });
 }

 
 public success2() {
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setBounds(100, 100, 450, 300);
  contentPane = new JPanel();
  contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
  setContentPane(contentPane);
  contentPane.setLayout(null);
  
  JLabel lblMsg = new JLabel("PAYMENT SUCCESSFUL");
  lblMsg.setForeground(Color.BLUE);
  lblMsg.setFont(new Font("Tahoma", Font.BOLD, 16));
  lblMsg.setBounds(38, 73, 313, 36);
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

