public class Faculty
{
String Fac_Name;
int Fac_id;
double Fac_salary;
String Fac_sub;
Faculty(String n,int i,double s,String b)
{
Fac_Name=n;
Fac_id=i;
Fac_salary=s;
Fac_sub=b;
}
void display()
{
System.out.println("********Faculty Details*********");
System.out.println(Fac_Name+" "+Fac_id+" "+Fac_salary+" "+Fac_sub);
}
public static void main (String [] args)
{
Faculty f1 = new Faculty("Dinesh Jamthe",1234,70000,"Object Oriented Programming");
Faculty f2 = new Faculty("Sonum Meshram",5678,50000,"Computer Architecture");
Faculty f3 = new Faculty("Suple mam",9101,80000,"Mathematics-3");
f1.display();
f2.display();
f3.display();
}
}