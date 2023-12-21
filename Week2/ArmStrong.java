package Week2;
import java.util.Scanner;
public class ArmStrong {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		if(Arm.isArmStrong(num)) 
		{
			System.out.println(num+" is Armstrong number");
		}
		else
		{
			System.out.println(num+" is not Armstrong number");
		}
	}
}