

import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
import java.sql.*;  
public class Page3 extends JFrame implements ActionListener   
{  
    JLabel l1, l2, l3, l4, l5, l6, l7;  
    JTextField t1, t2, t5, t6;  
    JButton b1, b2;  
    JPasswordField p1, p2;  
    Page3()  
    {  
        setVisible(true);  
        setSize(700, 700);  
        setLayout(null);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        setTitle("Page3");  
        l1 = new JLabel("Create Account:");  
        l1.setForeground(Color.blue);  
        l1.setFont(new Font("Serif", Font.BOLD, 20));  
        l2 = new JLabel("Name:");  
        l3 = new JLabel("NID:");  
        l4 = new JLabel("Create Password:");  
        l5 = new JLabel("Confirm Password:");  
        l6 = new JLabel("Address:");  
        l7 = new JLabel("Phone No:");   
        t1 = new JTextField();  
        t2 = new JTextField();  
        p1 = new JPasswordField();  
        p2 = new JPasswordField();  
        t5 = new JTextField();  
        t6 = new JTextField();    
        b1 = new JButton("SUBMIT");  
        b2 = new JButton("BACK");  
        b1.addActionListener(this);  
        b2.addActionListener(this);  
        l1.setBounds(100, 30, 400, 30);  
        l2.setBounds(80, 70, 200, 30);  
        l3.setBounds(80, 110, 200, 30);  
        l4.setBounds(80, 150, 200, 30);  
        l5.setBounds(80, 190, 200, 30);  
        l6.setBounds(80, 230, 200, 30);  
        l7.setBounds(80, 270, 200, 30);  
          
        t1.setBounds(300, 70, 200, 30);  
        t2.setBounds(300, 110, 200, 30);  
        p1.setBounds(300, 150, 200, 30);  
        p2.setBounds(300, 190, 200, 30);  
        t5.setBounds(300, 230, 200, 30);  
        t6.setBounds(300, 270, 200, 30);    
        b1.setBounds(50, 350, 100, 30);  
        b2.setBounds(170, 350, 100, 30);  
        add(l1);  
        add(l2);  
        add(t1);  
        add(l3);  
        add(t2);  
        add(l4);  
        add(p1);  
        add(l5);  
        add(p2);  
        add(l6);  
        add(t5);  
        add(l7);  
        add(t6);     
        add(b1);  
        add(b2);  
    }  
    public void actionPerformed(ActionEvent ae)   
    {  if (ae.getSource()==b1)  
		{
			 JAVA_LBL f = new JAVA_LBL();
				this.setVisible(false);
				f.setVisible(true);
          }   
          else if (ae.getSource()==b2)
			{
			    Page1 f = new Page1();
				this.setVisible(false);
				f.setVisible(true);
			} 
       
    }   
       public static void main(String args[])  
    {  
        new Page3();  
    }  
}