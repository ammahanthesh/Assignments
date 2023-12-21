package Week5;

import java.util.Scanner;

public class DiagonalMaxApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[][]=new int[n][n];
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				arr[i][j]=scan.nextInt();
			}
		}
		DiagonalMax.max(arr);

	}
}
