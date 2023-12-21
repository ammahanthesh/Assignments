package PracticeTest;

import java.util.Scanner;

public class PrintPrimeApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Range to print Prime numbers");
		int n=scan.nextInt();
		for(int i=3;i<=n;i++)
		{
			int res=PrintPrime.prime(n);
			if(res!=0)
			{
				System.out.println(res);
			}
		}

	}

}