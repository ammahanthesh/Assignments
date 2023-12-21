package Week2;

public class ReverseNum {
	static void reverseNum(int n) {
		while(n>0)
		{
			int b=n%10;
			System.out.print(b);
			n=n/10;
		}
	}

}
