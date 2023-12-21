package Week5;

public class DiagonalMax {
	static void max(int arr[][])
	{
		int k=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(i==j)
				{
					if(arr[i][j]>k)
					{
						k=arr[i][j];
					}
				}
			}
		}
		System.out.println(k);
	}

}
