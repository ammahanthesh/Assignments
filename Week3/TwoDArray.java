package Week3;
import java.util.Scanner;
public class TwoDArray {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array Length");
		int n=scan.nextInt();
		int m=scan.nextInt();
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				System.out.println("Enter Array Elements of "+i+" and "+j);
				arr[i][j]=scan.nextInt();
			}
		}
		for(int i=0;i<n;i++)
		{
			int sum=0;
			for(int j=0;j<m;j++)
			{
				sum+=arr[i][j];
			}
			System.out.println("Row "+(i+1)+" : "+sum+" ");
		}
	}
}