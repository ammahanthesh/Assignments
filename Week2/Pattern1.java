package Week2;

import java.util.Scanner;

public class Pattern1 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=scan.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1 || i==n || j==1 || j==n)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print("_");
				}
			}
			System.out.println();
		}
	}

}
