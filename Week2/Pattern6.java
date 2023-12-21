package Week2;
import java.util.Scanner;
public class Pattern6 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter");
		int n=scan.nextInt();
		int count=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				if(count<=9)
				{
					System.out.print("0"+count+" ");
					count++;
				}
				else
				{
					System.out.print(count+" ");
					count++;
				}
			}
			System.out.println();
		}
	}
}