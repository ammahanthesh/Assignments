package Week1;
import java.util.Scanner;
public class LCM {
	public static void main(String[] args) {
		System.out.println("Enter two numbers");
		Scanner scan=new Scanner(System.in);
		int n1=scan.nextInt();
		int n2=scan.nextInt();
		int a=n1;
		int b=n2;
		while(n2!=0)
		{
			int rem=n1%n2;
			n1=n2;
			n2=rem;
		}
		int gcd=n1;
		System.out.println(gcd);
		int lcm=(a*b)/gcd;
		System.out.println(lcm);
	}
}