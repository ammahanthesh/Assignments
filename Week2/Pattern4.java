package Week2;

import java.util.Scanner;

public class Pattern4 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=scan.nextInt();
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=2*i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
