

import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
import java.sql.*;  
public class Problem extends JFrame implements ActionListener   
{  
    JLabel l1, l2, l3, l4, l5, l6;  
    JTextField t1, t2,t3,t4, t5;  
    JButton b1, b2;   
    Problem()  
    {  
        setVisible(true);  
        setSize(700, 700);  
        setLayout(null);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 

        setTitle("Report");  
        l1 = new JLabel("REPORT:");  
        l1.setForeground(Color.blue);  
        l1.setFont(new Font("Serif", Font.BOLD, 20));  
        l2 = new JLabel("Account ID:");  
        l3 = new JLabel("Name:");  
        l4 = new JLabel("Mobile Number:");  
        l5 = new JLabel("Problem Topic:");  
        l6 = new JLabel("Describe Problem:");    
        t1 = new JTextField();  
        t2 = new JTextField();  
		t3 = new JTextField();  
        t4 = new JTextField();
        t5 = new JTextField();     
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
          
        t1.setBounds(300, 70, 200, 30);  
        t2.setBounds(300, 110, 200, 30);  
        t3.setBounds(300, 150, 200, 30);  
        t4.setBounds(300, 190, 200, 30);   
        t5.setBounds(300, 230, 200, 30);    
        b1.setBounds(50, 350, 100, 30);  
        b2.setBounds(170, 350, 100, 30);  
        add(l1);  
        add(l2);  
        add(t1);  
        add(l3);  
        add(t2);  
        add(l4);  
        add(t3);  
        add(l5);  
        add(t4);  
        add(l6);  
        add(t5);          
        add(b1);  
        add(b2);  
    }  
    public void actionPerformed(ActionEvent ae)   
    {  if (ae.getSource()==b1)  
		{
			 report f = new report();
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
        new Problem();  
    }  
}