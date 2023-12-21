package NonPremitiveArray;

public class Student 
{
	int id;
	String name;
	int marks;
	
	void study()
	{
		System.out.println(name+" is studying");
	}
	
	public Student(int id, String name, int marks)
	{
		this.id=id;
		this.name=name;
		this.marks=marks;
	}
}