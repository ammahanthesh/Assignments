package Week4;

import java.util.Scanner;

public class AntiBorderElements {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int rows=scan.nextInt();
		int columns=scan.nextInt();
		int arr[][]=new int[rows][columns];
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<columns;j++)
			{
				arr[i][j]=scan.nextInt();
			}
		}
		rows=arr.length;
		columns=arr[0].length;
		for(int i=0;i<rows;i++)
		{
			System.out.print(arr[i][0]+" ");
		}
		for(int j=1;j<columns;j++)
		{
			System.out.print(arr[rows-1][j]+" ");
		}
		for(int i=rows-2;i>=0;i--)
		{
			System.out.print(arr[i][columns-1]+" ");
		}
		for(int j=columns-2;j>0;j--)
		{
			System.out.print(arr[0][j]+" ");
		}
	}

}
