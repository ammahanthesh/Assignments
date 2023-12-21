package Week3;
import java.util.Scanner;
import java.util.Arrays;
public class FetchMaxMin {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the Array Length");
		int n=scan.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Maximum Element: "+arr[n-1]);
		System.out.println("Minimum Element: "+arr[0]);
	}
}