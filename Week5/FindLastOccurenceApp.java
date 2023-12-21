package Week5;

import java.util.Scanner;

public class FindLastOccurenceApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		int key=scan.nextInt();
		FindLastOccurence.occurence(arr,key);
	}

}
