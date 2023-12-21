package Week5;

import java.util.Scanner;

public class PalindromeApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		Palindrome palindrome=new Palindrome();
		boolean res=palindrome.palindrome(arr);
		System.out.println(res);
	}

}
