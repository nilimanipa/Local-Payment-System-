import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.event.ActionEvent;

public class Page4 extends JFrame implements ActionListener
{
		JLabel l1,l2,l3,l4,l5;
		JTextField t1,t2,t3;
		JButton b1,b2,b3,b4,b5; 
		JPanel p1,p2,p3,p4;
		
	public Page4()
	{
		super("page 4");
		this.setSize(2000,1000);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		p1 = new JPanel();
		p1.setSize(new Dimension(2000,85));
		p1.setBackground(Color.green);
		p1.setLayout(null);
		
		l1 = new JLabel("WElCOME");
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
		
		b1 = new JButton("PAYMENT");
		b1.setFont(new Font("Comic Sans MS",Font.BOLD,26));
		b1.setForeground(Color.blue);
		b1.setBounds(400,180,620,40);
		b1.addActionListener(this);
		b1.setLayout(null);
		p3.add(b1);
		
		b2 = new JButton("TRANSACTION");
		b2.setFont(new Font("Comic Sans MS",Font.BOLD,26));
		b2.setForeground(Color.blue);
		b2.setBounds(400,270,620,40);
		b2.addActionListener(this); 
		b2.setLayout(null);
		p3.add(b2);
		
		b3 = new JButton("RECHARGE");
		b3.setFont(new Font("Comic Sans MS",Font.BOLD,26));
		b3.setForeground(Color.blue);
		b3.setBounds(400,350,620,40);
		b3.addActionListener(this);
		b3.setLayout(null);
		p3.add(b3);
		
		b4 = new JButton("BALANCE");
		b4.setFont(new Font("Comic Sans MS",Font.BOLD,26));
		b4.setForeground(Color.blue);
		b4.setBounds(400,430,620,40);
		b4.addActionListener(this);
		b4.setLayout(null);
		p3.add(b4);
		
		p4 = new JPanel();
		p4.setSize(new Dimension(2000,350));
		p4.setBackground(Color.black);
		p4.setLayout(null);
		
		b5 = new JButton("BACK");
		b5.setFont(new Font("Comic Sans MS",Font.BOLD,20));
		b5.setForeground(Color.red);
		b5.setBounds(635,600,150,45);b5.setBackground(Color.black);
		b5.addActionListener(this);b5.setLayout(null);
		p4.add(b5);

        this.add(p1);		
        this.add(p2);
		this.add(p3);
		this.add(p4);
	}

		public void actionPerformed(ActionEvent ae)
		{
			
			
		    if(ae.getSource()==b4)
			{
				 Balance f = new Balance();
				this.setVisible(false);
				f.setVisible(true);
			}
			
			else if (ae.getSource()==b1)
			{
			      Payment f = new Payment();
				this.setVisible(false);
				f.setVisible(true);
			}
			 
			else if (ae.getSource()==b2)
			{
			    Page5 f = new Page5();
				this.setVisible(false);
				f.setVisible(true);
			}
			
			else if (ae.getSource()==b3)
			{
			      Recharge f = new Recharge();
				this.setVisible(false);
				f.setVisible(true);
			}
			else if (ae.getSource()==b5)
			{
			   Page2 f = new Page2();
				this.setVisible(false);
				f.setVisible(true); 
			}
			
		
		}


}






