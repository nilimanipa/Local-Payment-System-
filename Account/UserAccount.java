package Account;
public class UserAccount
{
	private String UseName;
	private String AccId;
	private String MobNumber;
	private String UseAddress;
	private String UseNid;
    private String AccPass;
    private int AccBala;
	
	public UserAccount(){}
	
	public UserAccount(String UseName,String AccId,String MobNumber,String UseAddress,String UseNid, String AccPass,int AccBala){
		this.UseName=UseName;
		this.AccId=AccId;
		this.MobNumber=MobNumber;
		this.UseAddress=UseAddress;
		this.UseNid=UseNid;
		this.AccPass=AccPass;
		this.AccBala=AccBala;
	}
	public void setUseName(String UseName){this.UseName=UseName;}
	public void setAccId(String AccId){this.AccId=AccId;}
	public void setMobNumber(String MobNumber){this.MobNumber=MobNumber;}
	public void setUseAddress(String UseAddress){this.UseAddress=UseAddress;}
	public void setUseNid(String UseNid){this.UseNid=UseNid;}
	public void setAccPass(String AccPass){this.AccPass=AccPass;}
	public void setAccBala(int AccBala){this.AccBala = AccBala;}
	
	public String getUseName(){return UseName;}
	public String getAccId(){return AccId;}
	public String getMobNumber(){return MobNumber;}
	public String getUseAddress(){return UseAddress;}
	public String getUseNid(){return UseNid;}
	public String getAccPass(){return AccPass;}
	public int getAccBala(){return AccBala;}
	
	/*public int deposite(int amount){
		AccBala +=amount;
		System.out.println("Your deposite amount : "+amount);
		System.out.println("Balance : "+AccBala);
		return AccBala;
	}
	public int withdraw(int amount){
		AccBala -=amount;
		System.out.println("Your withdraw amount : "+amount);
		System.out.println("Balance : "+AccBala);
		return AccBala;
	}*/
	public void showInfo()
	{
		System.out.println("User Name      : " + UseName);
		System.out.println("Account ID     : " + AccId);
		System.out.println("Monbile number : " + MobNumber);
		System.out.println("Address        : " + UseAddress);
		System.out.println("User NID       : " + UseNid);
	}
	
	public void showbalance(){
		System.out.println("Welcome "+UseName);
		System.out.println("Your carrent Balance : " + AccBala);
	}
}
