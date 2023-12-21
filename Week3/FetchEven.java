package Week3;

import java.util.Scanner;

public class FetchEven {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Array Length");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter Array Elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.print("Even Numbers are: ");
		for(int i=1;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.print(arr[i]+" ");
			}
		}
	}

}
