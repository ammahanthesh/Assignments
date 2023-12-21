package Week1;
import java.util.Scanner;
public class ArrayChar {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s1=scan.nextLine();
		for(int i=0;i<s1.length();i++)
		{
			System.out.println(s1.charAt(i));
		}
	}
}