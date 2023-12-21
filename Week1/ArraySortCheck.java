package Week1;
import java.util.Scanner;
public class ArraySortCheck {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array Length");
		int n=scan.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter Array Elements");
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		int c=1;
		for(int i=0;i<n-1;i++)
		{
			if(arr[i]<arr[i+1])
			{
				c++;
			}
		}
		if(c==arr.length)
		{
			System.out.println("Array is sorted");
		}
		else
		{
			System.out.println("Array is not sorted");
		}
	}
}