package Week5;

public class Palindrome {
	public boolean palindrome(int arr[])
	{
		int i=0,j=arr.length-1;
		while(i<arr.length)
		{
			
			if(arr[i]!=arr[j])
			{
				return false;
			}
			i++;j--;
		}
		return true;
	}
}