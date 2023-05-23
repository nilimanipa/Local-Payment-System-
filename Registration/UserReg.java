package Registration;
import java.io.*;
import java.util.Scanner;

public class UserReg
{	
	public UserReg(){}
	
	public void TakeInfo()throws Exception{
	
		Scanner sc = new Scanner(System.in);
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader bfr = new BufferedReader(isr);
		
		String s="", temp; 
		File file = new File("UserRejInfo.txt");
		  
		file.createNewFile();
		  
		FileWriter writer = new FileWriter(file,true); 
		
		System.out.print("Enter Your Name: ");
			temp = bfr.readLine();
			s=s+temp+"\r\n";
		System.out.print("Enter Your Number: ");
			temp = bfr.readLine();
			s=s+temp+"\r\n";
		System.out.print("Enter Your Address: ");
			temp = bfr.readLine();
			s=s+temp+"\r\n";
		System.out.print("Enter Your NID Number: ");
			temp = bfr.readLine();
			s=s+temp+"\r\n";
		System.out.print("Enter Your Password: ");
			temp = bfr.readLine();
			s=s+temp+"\r\n";
		System.out.println("Before confirm Pls cheak all the Informations are correct/Not.");
		System.out.println("If any of your information is wrong Press N/n to register again.");
		System.out.println("if all information is correct To confirm Your registration Press Y/y .");
		
		
		char ch1 ;
		ch1=sc.next().charAt(0);
		if(ch1 =='Y' || ch1 =='y' ){
			writer.write(s); 
			writer.flush();
			writer.close();
			
			System.out.println("==============================================================");
			System.out.println("||=======================registration=======================||");
			System.out.println("||                                                          ||");
			System.out.println("||             Your Information has been register.          ||");
			System.out.println("||           your accont will active within 24 hour.        ||");
			System.out.println("||             we will send you a confirm massage           ||");
			System.out.println("||                                                          ||");
			System.out.println("||                     Have a nice day.                     ||");
			System.out.println("||                                                          ||");
			System.out.println("||                                                   0.Exit ||");
			System.out.println("||==========================================================||");
			System.out.println("==============================================================");
			
			
			
		}
		else if(ch1=='N' || ch1=='n'){
			System.out.println("Take Information Again.");
		}
	
		
	}
}