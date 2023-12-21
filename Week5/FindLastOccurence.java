package Week5;

public class FindLastOccurence {
	static void occurence(int arr[], int key)
	{
		int k=-1;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==key)
			{
				k=i;
			}
		}
		System.out.println(k);
	}

}
