package Week3;
import java.util.Scanner;
public class ChaaracterCheck {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a character length");
		int n=scan.nextInt();
		System.out.println("Enter a character");
		char arr[]=new char[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=scan.next().charAt(0);
		}
		char key=scan.next().charAt(0);
		boolean isPresent=false;
		for(int i=0;i<n;i++)
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