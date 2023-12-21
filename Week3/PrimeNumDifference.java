package Week3;
import java.util.Scanner;
public class PrimeNumDifference {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter Array Length");
		int n=scan.nextInt();
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		System.out.println("Enter "+arr1.length+" Array Elements");
		for(int i=0;i<arr1.length;i++)
		{
			arr1[i]=scan.nextInt();
		}
		System.out.println("Enter "+arr2.length+" Array Elements");
		for(int j=0;j<arr2.length;j++)
		{
			arr2[j]=scan.nextInt();
		}
		
		int sumOfPrime1=calculateSumofPrime(arr1);
		int sumOfPrime2=calculateSumofPrime(arr2);
		
		int difference=sumOfPrime1-sumOfPrime2;
		System.out.println("Difference of sum of prime Numbers "+difference);
		
	}
	static boolean isPrime(int n) 
	{
		if(n<=1)
		{
			return false;
		}
		for(int i=2;i*i<=n;i++)
		{
			if(n%i==0)
			{
				return false;
			}
		}
		return true;
	}
	static int calculateSumofPrime(int arr[]) {
		int c=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(isPrime(arr[i]))
			{
				c+=arr[i];
			}
		}
		return c;
	}
}