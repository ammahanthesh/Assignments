package Week2;
import java.util.Scanner;
public class EvenOdd {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a Number");
		int n=scan.nextInt();
		if(n%2!=0 || (n>=6 && n<=20))
		{
			System.out.println("Weird");
		}
		else
		{
			System.out.println("Not Weird");
		}
	}
}