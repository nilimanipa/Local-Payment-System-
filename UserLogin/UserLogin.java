package UserLogin;

import Account.*;
import java.util.Scanner;

public class UserLogin
{
	public static boolean security;
	public UserLogin(){}
	
	public UserLogin(String AccId,String AccPass)throws Exception{
	if ( AccId.equals("A1850477967") && AccPass.equals("arafat22")){
		
		security=true;
		if (security==true){
		Scanner sc = new Scanner(System.in);
		System.out.println("==============================================================");
		System.out.println("||=========================Profile==========================||");
		System.out.println("||                                                          ||");
		System.out.println("||                        1.Balance                         ||");
		System.out.println("||                        2.Payment                         ||");
		System.out.println("||                        3.Transaction                     ||");
		System.out.println("||                        4.Recharge                        ||");
		System.out.println("||                        5.Profile                         ||");
		System.out.println("||                                                   0.Exit ||");
		System.out.println("||==========================================================||");
		System.out.println("==============================================================");
		}
	}
	else if ( AccId.equals("A1850477967") && AccPass.equals("arafat22")){
		UserAccount a = new UserAccount("Arafat Hossen","A1850477967","01850477967","Halisohor,Ctg","585858585858","arafat22",8000);
	}
	else{
		System.out.println("Your account ID, password is incorrect.");
		System.out.println("Pls Try again.");
	}
	}
	
	
	
}