package Week1;

import java.util.Scanner;

public class DigitSumCalculator {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int c=0;
		while(n>0)
		{
			int b=n%10;
			c=c+b;
			n=n/10;
		}
		System.out.println(c);
}
}