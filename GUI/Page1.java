import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Page1 extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4,l5;
		JTextField t1,t2,t3;
		JButton b1,b2,b3,b4; 
		JPanel p1,p2,p3,p4;
		
	public Page1()
	{
		super("page 1");
		this.setSize(2000,1000);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(2000,85));
		p1.setBackground(Color.green);
		p1.setLayout(null);
		
		l1 = new JLabel("LOCAL PAYMENT SYSTEM");
		l1.setFont(new Font("Serif",Font.BOLD,32));
		l1.setForeground(Color.black);
		l1.setBounds(400,20,1500,32);
		p1.add(l1);

		p2 = new JPanel();
		p2.setSize(new Dimension(2000,150));
		p2.setBackground(Color.white);
		p2.setLayout(null);
		
	    l2 = new JLabel("BUG BUSTERS");
		l2.setFont(new Font("Serif",Font.BOLD,32));
		l2.setForeground(Color.black);
		l2.setBounds(350,20,1500,32);
		p2.add(l2);
		
		p3 = new JPanel(); 
		p3.setSize(new Dimension(2000,550));
		p3.setBackground(Color.cyan);
		p3.setLayout(null);
		
		b1 = new JButton("LOGIN");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,26));
		b1.setForeground(Color.blue);
		b1.setBounds(400,180,620,40);
		b1.addActionListener(this);
		b1.setLayout(null);
		p3.add(b1);
		
		b2 = new JButton("REGISTER");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,26));
		b2.setForeground(Color.blue);
		b2.setBounds(400,270,620,40);
		b2.addActionListener(this); 
		b2.setLayout(null);
		p3.add(b2);
		
		b3 = new JButton("REPORT");
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,26));
		b3.setForeground(Color.blue);
		b3.setBounds(400,350,620,40);
		b3.addActionListener(this);
		b3.setLayout(null);
		p3.add(b3);
		
		p4 = new JPanel();
		p4.setSize(new Dimension(2000,350));
		p4.setBackground(Color.black);
		p4.setLayout(null);
		
		b4 = new JButton("BACK");
		b4.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		b4.setForeground(Color.red);
		b4.setBounds(635,600,150,45);b4.setBackground(Color.black);
		b4.addActionListener(this);b4.setLayout(null);
		p4.add(b4);

        this.add(p1);		
        this.add(p2);
		this.add(p3);
		this.add(p4);
	}

		public void actionPerformed(ActionEvent ae)
		{
			
			
		    if(ae.getSource()==b4)
			{
				
			}
			
			else if (ae.getSource()==b1)
			{
			    Page2 f = new Page2();
				this.setVisible(false);
				f.setVisible(true);
			}
			 
			else if (ae.getSource()==b2)
			{
			    Page3 f = new Page3();
				this.setVisible(false);
				f.setVisible(true);
			}
			
			else if (ae.getSource()==b3)
			{
			    Problem f = new Problem();
				this.setVisible(false);
				f.setVisible(true);
			}
			
		
		}


}






