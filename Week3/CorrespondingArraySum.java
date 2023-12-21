package Week3;
import java.util.Scanner;
public class CorrespondingArraySum {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array Length");
		int n=scan.nextInt();
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		int arrSum[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr1[i]=scan.nextInt();
		}
		for(int j=0;j<n;j++)
		{
			arr2[j]=scan.nextInt();
		}
		for(int k=0;k<n;k++)
		{
			arrSum[k]=arr1[k]+arr2[k];
		}
		for(int k=0;k<n;k++)
		{
			System.out.print(arrSum[k]+" ");
		}
	}
}