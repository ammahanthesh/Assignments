package Week4;
import java.util.Scanner;
public class ArrayRowSum {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		int arr[][]=new int[n][m];
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<m;j++)
			{
				arr[i][j]=scan.nextInt();
			}
		}
		System.out.println("Row Sums:");

		for(int i=0;i<n;i++)
		{
			int sum=0;
			for(int j=0;j<m;j++)
			{
				sum+=arr[i][j];
			}
			System.out.println("Row "+(i+1)+" Sum: "+sum);
		}
	}
}