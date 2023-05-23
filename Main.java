import Registration.*;
import Support.*;
import UserLogin.*;
import AdminLogin.*;
import Account.*;

import java.util.*;
import java.util.Scanner;
import java.io.*;


public class Main{
	public static void cls(){
		try{
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
		}catch(Exception e){System.out.println(e);}
	}
	static{cls();}
	
	
	public static void main(String[] args)throws Exception{
		String centerAlignForTitle= new String("                       ");
		String centerAlineForInput= new String("                       ");
	
	MAIN:
	while(true){
	Scanner sc = new Scanner(System.in);
	System.out.println("==============================================================");
	System.out.println("||=========================Main page========================||");
	System.out.println("||                                                          ||");
	System.out.println("||                                                          ||");
	System.out.println("||                          1.login                         ||");
	System.out.println("||                      2.Create account                    ||");
	System.out.println("||                                                          ||");
	System.out.println("|| 3.help/support                                    0.Exit ||");
	System.out.println("||==========================================================||");
	System.out.println("==============================================================");
		Scanner sc5 = new Scanner(System.in);
		char lt1 = sc5.next().charAt(0);
			cls();
			if(lt1<'0' && lt1>'2' && lt1>='a' && lt1<='z'){System.out.println(centerAlignForTitle+"Invalid Input");
			continue MAIN;}
		
		switch(lt1){
			
		case '1':
		System.out.println("==============================================================");
		System.out.println("||========================Login page========================||");
		System.out.println("||                                                          ||");
		System.out.println("||                                                          ||");
		System.out.println("||                          1.Admin                         ||");
		System.out.println("||                       2.User login                       ||");
		System.out.println("||                                                          ||");
		System.out.println("||                                                   0.Exit ||");
		System.out.println("||==========================================================||");
		System.out.println("==============================================================");
		Scanner sc4 = new Scanner(System.in);
			char R4= sc4.next().charAt(0);
			switch(R4)
			{	
				case '0':
				/*call the Main page.    */
				break;
				
				case '1':
				break;
				
				case '2':
				System.out.print(" Account ID : ");
				String AccId = sc.nextLine();
				System.out.print(" Password : ");
				String AccPass= sc.nextLine();

				UserLogin UsLo = new UserLogin(AccId,AccPass);
				
				PROFILE:
				while(true){
				Scanner sc6 = new Scanner(System.in);
					char R6= sc6.next().charAt(0);
				switch(R6)
				{
					case '0':
					break PROFILE;
					
					case '1':
					UserAccount ua = new UserAccount();
					ua.showbalance();
					break;
					
					case '2':
					break;
					
					case '3':
					break;
					
					case '4':
					break;
					
					case '5':
					
					break;
				}
				}
				break;
			}
		
		break;
		
		case '2':
		System.out.println("Give all the expected information correctly.");
		UserReg ur = new UserReg();
		ur.TakeInfo();
			Scanner sc3 = new Scanner(System.in);
			char R3= sc3.next().charAt(0);
			switch(R3)
			{	
				case '0':
				/*call the login page.    */
				break;
			}cls();
		break;
		
		case '3':
		UserSupport us = new UserSupport();
		us.Help();
		
			Scanner sc1 = new Scanner(System.in);
			char R1= sc1.next().charAt(0);
			switch(R1)
			{
				case '1':
					us.report();
					Scanner sc2 = new Scanner(System.in);
					char R2=sc2.next().charAt(0);
					switch(R2){
					case '0':
					break;
					
					case '1':
					System.out.println("log in form");
					break;
					} 
				break;
				
				case '0':
				/*call the login page.    */
				break;
			}
		break;
		
		default :
		System.out.println("           You enter unexpected Number. try again.");
		System.out.println("");
	
		case '0':
		break;
	
		}
	
	
	}
}
}
