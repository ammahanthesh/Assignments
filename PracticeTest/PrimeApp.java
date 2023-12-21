package PracticeTest;

import java.util.Scanner;

public class PrimeApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int c=0;
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				c++;
			}
		}
		if(c==2)
		{
			System.out.println("PRIME");
		}
		else
		{
			System.out.println("NOT PRIME");
		}
		/*if(Prime.isPrime(n))
		{
			System.out.println("PRIME");
		}
		else
		{
			System.out.println("NOT PRIME");
		}*/
	}
}