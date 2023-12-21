package Week3;

import java.util.Scanner;

public class DivisibleBy5 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array Length");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter "+n+" Array Elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(arr[i]%5==0)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}

}
