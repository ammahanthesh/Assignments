package Week2;
public class Arm {
	static boolean isArmStrong(int number) {
		int originalNumber=number;
		int sum=0;
		int numDigits=String.valueOf(number).length();
		while(number>0)
		{
			int digit=number%10;
			sum+=Math.pow(digit, numDigits);
			number/=10;
		}
		return sum==originalNumber;
	
//	public static void main(String[] args) {
//		int n=123;
//		System.out.println(String.valueOf(n).length());
//	
	}
}