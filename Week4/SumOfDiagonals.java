package Week4;

import java.util.Scanner;

public class SumOfDiagonals {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[][]=new int[n][n];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				arr[i][j]=scan.nextInt();
			}
		}
		int r=0;
		int k=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				if(i==j)
				{
					r+=arr[i][j];
				}
				if(i+j==n-1)
				{
					k+=arr[i][j];
				}
			}
		}
	}
}