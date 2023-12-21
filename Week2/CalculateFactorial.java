package Week2;

import java.util.Scanner;

public class CalculateFactorial {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter");
		int n=scan.nextInt();
		int c=1;
		for(int i=1;i<=n;i++)
		{
			c*=i;
		}
		System.out.println("Factorial of "+n+" is "+c);
	}

}
