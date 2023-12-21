package Week3;

import java.util.Scanner;

public class IntegerCheck {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array Length");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter Array Elements");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.next().charAt(0);
		}
		System.out.println("Enter a Key to search");
		int key=scan.next().charAt(0);
		boolean isPresent=false;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				isPresent=true;
				break;
			}
		}
		System.out.println(isPresent);
	}

}
