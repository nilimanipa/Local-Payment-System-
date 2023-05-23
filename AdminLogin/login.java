package AdminLogin;
import java.io.File;
import java.util.Scanner;
public class login {
	String centerAlign= new String("           ");
	Register reg;
	public static String AccId = "";
	public static String AccPass = "";
	private String ph = "";
	private String ps = "";
	private String bl = "";
	public static boolean security;
	public static int balance=;
	
	public login(){}
	public login(String phone,String bankAcc,String pass){
		this.phone=phone;
		this.bankAcc=bankAcc;
		this.pass=pass;
	}
	public void setPhone(String phone){this.phone=phone;}
	public void setBankAcc(String bankAcc){this.bankAcc=bankAcc;}
	public void setPass(String pass){this.pass=pass;}
	public boolean getSecurity(){return security;}
	public int getBalance(){return balance;}
	public void checkDetails(){
		//String p = reg.getPhoneNumber();
		//String b = reg.getBankAccountNumber();
		//String pa = reg.getPassword();
		
		try{
			File file = new File("user.txt");
			Scanner scanner = new Scanner(file);

			while(scanner.hasNext()){
				 ph = scanner.next();
				 bn = scanner.next();
				 ps = scanner.next();
				 bl = scanner.next();
				balance = Integer.parseInt(bl);
			}
			scanner.close();
		}catch(Exception e){System.out.println(e);}
		security=false;
		if(!phone.equals(ph) || !bankAcc.equals(bn) || !pass.equals(ps) ){System.out.println(centerAlign+"Wrong input. Try again!\n");}
		else{
			System.out.println(centerAlign+"Login Successful\n");
					security=true;
		}
		}

}
