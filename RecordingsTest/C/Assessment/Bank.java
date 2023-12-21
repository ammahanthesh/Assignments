package R.C.Assessment;

public class Bank 
{
	String bname;
	String acname;
	String actype;
	
	public Bank(String bname, String acname, String actype) 
	{
		this.bname=bname;
		this.acname=acname;
		this.actype=actype;
	}
	
	public void display() 
	{
		System.out.println("Account Details: ");
		System.out.println("Bank Name: "+bname);
		System.out.println("Account Holder: "+acname);
		System.out.println("Account Type: "+actype);
		System.out.println(bname+" account is successfully created");
	}

}
