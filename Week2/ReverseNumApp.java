package Week2;

import java.util.Scanner;

public class ReverseNumApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		System.out.print("Reversed Number is:");
		ReverseNum.reverseNum(n);
	}
}