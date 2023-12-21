package NonPremitiveArray;
import java.util.Scanner;
public class StudentApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);


		/*Student s1=new Student(1,"Manthi",97);
		Student s2=new Student(2,"Pavan",85);
		Student s3=new Student(3,"Ashwath",57);
		Student arr[]=new Student[3];
		arr[0]=s1;
		arr[1]=s2;
		arr[2]=s3;
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i].id+" "+arr[i].name+" "+arr[i].marks);
		}*/


		/*Scanner scan=new Scanner(System.in);
		System.out.println("How many objects you want to create");
		int noo=scan.nextInt();
		Student arr[]=new Student[noo];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter id");
			int id=scan.nextInt();
			System.out.println("Enter name");
			String name=scan.next();
			System.out.println("Enter marks");
			int marks=scan.nextInt();
			arr[i]=new Student(id,name,marks);
		}
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println(arr[i].id+" "+arr[i].name+" "+arr[i].marks);
		}
		System.out.println("==================================================================");
		System.out.println("Enter student name to search");
		String nameKey=scan.next();
		boolean flag=false;
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i].name.equals(nameKey))
			{
				System.out.println("Student is Found ");
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println("Student is not found");
		}
		System.out.println("==================================================================");
		System.out.println("Enter TRUE if you want to sort the array otherwise enter FALSE");
		boolean choice=scan.nextBoolean();
		if(choice==true)
		{
			for(int i=0;i<=arr.length-2;i++)
			{
				for(int j=0;j<=arr.length-i-2;j++)
				{
					if(arr[j].id>arr[j+1].id)
					{
						Student temp;
						temp=arr[j];
						arr[j]=arr[j+1];
						arr[j+1]=temp;
					}
				}
			}
			System.out.println("Sorted Array is: ");
			for(int i=0;i<=arr.length-1;i++)
			{
				System.out.print(arr[i].id+" "+arr[i].name+" "+arr[i].marks+"|");
			}
		}
		System.out.println("==================================================================");
		System.out.println("Enter id to search");
		int idKey=scan.nextInt();
		flag=false;
		int low=0;
		int high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			if(arr[mid].id==idKey)
			{
				System.out.println("Student id is found & the name is "+arr[mid].name);
				flag=true;
				break;
			}
			else if(idKey>arr[mid].id)
			{
				low=mid+1;
				high=high;
			}
			else
			{
				high=mid-1;
				low=low;
			}
		}
		if(flag==false)
		{
			System.out.println("Id is not found");
		}
		System.out.println("==================================================================");
		System.out.println("Rate the application out of 10 Star");
		int noofstars=scan.nextInt();
		System.out.println("Thanks for rating us with ");
		for(int i=1;i<=noofstars;i++)
		{
			System.out.print("*");
		}*/


		System.out.println("How many objects you want to create");
		int noo=scan.nextInt();
		Student arr[]=new Student[noo];
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.println("Enter ID");
			int id=scan.nextInt();
			System.out.println("Enter Name");
			String name=scan.next();
			System.out.println("Enter marks");
			int marks=scan.nextInt();
			arr[i]=new Student(id, name, marks);
		}
		
		
		StudentSearchSort.studentArrayPrint(arr);
		System.out.println();
		System.out.println("Enter name to search");
		String nameKey=scan.next();
		boolean res=StudentSearchSort.studentLinearSearch(arr, nameKey);
		if(!res)
		{
			System.out.println("Student not found");
		}
		System.out.println();


		System.out.println("Enter true if you wish to sort else enter false");
		boolean choice=scan.nextBoolean();
		if(choice)////////////////////chandru
		{
			StudentSearchSort.studentBubbleSort(arr);
		}
		StudentSearchSort.studentArrayPrint(arr);
		System.out.println();


		System.out.println("Enter Id to search");
		int idKey=scan.nextInt();
		res=StudentSearchSort.studentBinarySearch(arr, idKey);
		if(!res)
		{
			System.out.println("Student not found");
		}


		System.out.println("Rate The Application....out of 10");
		int noofstars=scan.nextInt();
		System.out.println("Thanks For Rating Us With ");
		StudentSearchSort.studentAppRatingPrint(noofstars);
	}
}