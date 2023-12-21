package R.C.Assessment;

import java.util.Scanner;

public class BankApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String bname=scan.next();
		String acname=scan.next();
		String actype=scan.next();
		if(bname.equals("SBI"))
		{
			SBI sbi=new SBI(bname, acname, actype);
			sbi.display();
		}
		else if(bname.equals("ICICI"))
		{
			ICICI icici=new ICICI(bname, acname, actype);
			icici.display();
		}
		else
		{
			HDFC hdfc=new HDFC(bname, acname, actype);
			hdfc.display();
		}
	}

}
