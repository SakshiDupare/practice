public class Student1
{
	int Stu_id;
	String Stu_Name;
	int Stu_rollno;
	Student1(int i,String n,int r)
	{
		Stu_id=i;
		Stu_Name=n;
		Stu_rollno=r;
	}
	void display()
	{
		System.out.println("******Student Details*******");
		System.out.println(+Stu_id+" "+Stu_Name+" "+Stu_rollno);
	}
	public static void main (String [] args)
	{
		Student1 s1 = new Student1 (22030018,"SAKSHI",121);
		Student1 s2 = new Student1 (22030022,"SAMIKSHA",111);
		s1.display();
		s2.display();
	}
}
		
		
		
		