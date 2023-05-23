import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
import java.sql.*;  
public class Deposit  extends JFrame implements ActionListener  
{  
    JLabel l1, l2, l3, l4,l5;
    JTextField t1, t2, t5;
    JButton b1, b2;  
    JPasswordField p1,p2;
    Deposit() 
    {  
        setVisible(true);  
        setSize(700, 700);  
        setLayout(null);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setTitle("Account to Bank:");
        l1 = new JLabel("Account to Bank:");
        l1.setForeground(Color.blue);  
        l1.setFont(new Font("Serif", Font.BOLD, 20));  
        l2 = new JLabel("Account Id:");
		l3= new JLabel("Bank Id:");
        l4 = new JLabel("Enter Password:");  
        l5 = new JLabel("Amount:");    
    
        t1 = new JTextField();  
        t2 = new JTextField();  
        p1 = new JPasswordField();  
        p2 = new JPasswordField();
         

        b1 = new JButton("SUBMIT");  
        b2 = new JButton("EXIT");  
        b1.addActionListener(this);  
        b2.addActionListener(this);  
        l1.setBounds(100, 30, 400, 30);  
        l2.setBounds(80, 70, 200, 30);  
        l3.setBounds(80, 110, 200, 30);  
        l4.setBounds(80, 150, 200, 30);  
        l5.setBounds(80, 190, 200, 30);  
        t1.setBounds(300, 70, 200, 30);  
        t2.setBounds(300, 110, 200, 30);  
        p1.setBounds(300, 150, 200, 30);  
        p2.setBounds(300, 190, 200, 30);    
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
          
      
 
        add(b1);  
        add(b2);  
    }  
    public void actionPerformed(ActionEvent ae)   
    { 

         if(ae.getSource()==b2)
			{
				Page5 f = new Page5();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if (ae.getSource()==b1)
			{
			    
			}
	
	}
              
            
    
}  
