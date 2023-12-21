package Week1;
import java.util.Scanner;
public class ModifiedArray {
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
		System.out.print("Modified Array: ");
		for(int i=0;i<n;i++)
		{
			if(arr[i]>0)
			{
				System.out.print(arr[i]+" ");
			}
			else
			{
				System.out.print("0"+" ");
			}
		}
	}

}
