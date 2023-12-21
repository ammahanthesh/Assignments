package Week5;

public class MaximumProduct {
	int product(int arr[])
	{
		int mp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]*arr[j]>mp)
				{
					mp=arr[i]*arr[j];
				}
			}
		}
		return mp;
	}

}
