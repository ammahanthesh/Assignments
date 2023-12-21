package Week2;

import java.util.Scanner;

public class Pattern5 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter");
		int n=scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n-i-1;j++)
			{
				System.out.print("_");
			}
			for(int j=1;j<=n-i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
