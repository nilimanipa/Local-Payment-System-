package Support;

import java.io.*;
import java.util.Scanner;
public class UserSupport{
	public UserSupport(){}
	public void report ()throws Exception{
		Scanner sc = new Scanner(System.in);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(isr);
		
		String s="", temp; 
		File file = new File("UserSupport.txt");
		  
		
		file.createNewFile();
		  
		
		FileWriter writer = new FileWriter(file); 
		
		System.out.print("Enter Your Account ID: ");
			temp = bfr.readLine();
			s=s+temp+"\r\n";
		System.out.print("Enter Your Name: ");
			temp = bfr.readLine();
			s=s+temp+"\r\n";
		System.out.print("Enter Your Number: ");
			temp = bfr.readLine();
			s=s+temp+"\r\n";
		System.out.print("About Your problem Topic: ");
			temp = bfr.readLine();
			s=s+temp+"\r\n";
		System.out.print("Describe Your Problem: ");
			temp = bfr.readLine();
			s=s+temp+"\r\n";
			
		writer.write(s); 
		writer.flush();
		writer.close();
		System.out.println("==============================================================");
		System.out.println("||==========================Report==========================||");
		System.out.println("||                                                          ||");
		System.out.println("||             Thaks for your valueable report.             ||");
		System.out.println("||           Depending on your problem as soon as           ||");
		System.out.println("||            posible we will try to solve this.            ||");
		System.out.println("||                                                          ||");
		System.out.println("||                    Have a nice day.                      ||");
		System.out.println("||                                                          ||");
		System.out.println("|| 1.login page                                      0.Exit ||");
		System.out.println("||==========================================================||");
		System.out.println("==============================================================");
	}
	
	public void Help(){
		System.out.println("==============================================================");
		System.out.println("||===========================Help===========================||");
		System.out.println("||  Hotline:                                                ||");
		System.out.println("||     Counter 1 : +88018********                           ||");
		System.out.println("||     Counter 2 : +88017********                           ||");
		System.out.println("||  Note:                                                   ||");
		System.out.println("||     Customer Care Center Schedule: 10:00 AM to 04:00 PM. ||");
		System.out.println("||                                                          ||");
		System.out.println("||                                                          ||");
		System.out.println("||  Service Mail:                                           ||");
		System.out.println("||     VertualMoney.support@gmail.com                       ||");
		System.out.println("||                                                          ||");
		System.out.println("||  Press 1 to Report                                       ||");
		System.out.println("||                                                          ||");
		System.out.println("||                                                  0.Exit  ||");
		System.out.println("||==========================================================||");
		System.out.println("==============================================================");		
	}
	
}
