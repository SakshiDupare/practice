class Employee
{
	int empid;
	String empname;
	double salary;
	Employee(int id,String n,double s)
	{
		empid=id;
		empname=n;
		salary=s;
	}
	 void display()
	{
		System.out.println("-------Employee Details-------");
		System.out.println(+empid+" "+empname+" "+salary);
	}
	public static void main(String [] args)
	{
		Employee e1 = new Employee(12123,"SAKSHI",25000);
		Employee e2 = new Employee(12245,"TANU",30000);
		e1.display();
		e2.display();
	}
}
		
	
