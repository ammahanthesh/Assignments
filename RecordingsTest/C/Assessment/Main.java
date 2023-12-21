package R.C.Assessment;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		FactorsCalculator fc=new FactorsCalculator(n);
		int res=fc.calculateFactors();
		System.out.println("Factors of "+n+" is "+res);
	}
}
