package Week5;

import java.util.Scanner;

public class MaximumProductApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		MaximumProduct mp=new MaximumProduct();
		int res=mp.product(arr);
		System.out.println(res);
	}

}
