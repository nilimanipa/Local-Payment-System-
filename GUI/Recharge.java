import javax.swing.*;  
import java.awt.*;  
import java.awt.event.*;  
import java.sql.*;  
public class Recharge  extends JFrame implements ActionListener  
{  
    JLabel l1, l2,l3;
    JTextField t1, t2;
    JButton b1, b2;  
    JPanel p1;
    Recharge() 
    {  
        setVisible(true);  
        setSize(700, 700);  
        setLayout(null);  
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        setTitle("Page2");
        l1 = new JLabel("RECHARGE:");
        l1.setForeground(Color.blue);  
        l1.setFont(new Font("Serif", Font.BOLD, 20));  
        l2= new JLabel("Number:");
        l3 = new JLabel("Ammount:");     
    
        t1 = new JTextField();  
        t2 = new JTextField();  
        p1 = new JPanel();  

        b1 = new JButton("SEND");  
        b2 = new JButton("BACK");  
        b1.addActionListener(this);  
        b2.addActionListener(this);  
        l1.setBounds(100, 30, 400, 30);  
        l2.setBounds(80, 70, 200, 30);  
        l3.setBounds(80, 110, 200, 30);    
        t1.setBounds(300, 70, 200, 30);  
        t2.setBounds(300, 110, 200, 30);  
        p1.setBounds(300, 150, 200, 30);    
        b1.setBounds(50, 200, 100, 30);  
        b2.setBounds(170, 200, 100, 30);  
        add(l1);  
        add(l2);  
        add(t1);  
        add(l3);  
        add(t2);    
        add(p1);  
        add(b1);  
        add(b2);
		
    }  
    public void actionPerformed(ActionEvent ae)   
    {  if (ae.getSource()==b1)  
		{
   
   success f = new success();
				this.setVisible(false);
				f.setVisible(true);
   
   }

          else if (ae.getSource()==b2)
			{
			    Page4 f = new Page4();
				this.setVisible(false);
				f.setVisible(true);
			} 
		
    }
	   
}  


              
            
    