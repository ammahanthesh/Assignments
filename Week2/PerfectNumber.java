package Week2;
import java.util.Scanner;
public class PerfectNumber {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number to check the perfect number");
		int n=scan.nextInt();
		int c=0;
		for(int i=1;i<=n;i++) 
		{
			if(n%i==0)
			{
				c+=i;
			}
		}
		if(c==n)
		{
			System.out.println(n+" is a perfect number");
		}
		else
		{
			System.out.println(n+" is not a perfect number");
		}	
	}
}