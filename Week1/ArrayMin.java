package Week1;
import java.util.Scanner;
public class ArrayMin {
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
		int min=arr[0];
		for(int i=0;i<n;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}	
		}
		System.out.println("Minimum Element is: "+min);	
	}
}