class HDFCBank
{
  int accountno;
  String accountholder;
  HDFCBank(int a,String b)
  {
 accountno=a;
  accountholder=b;
  }
	  void display()
	  {
System.out.print("account details");
System.out.print(accountno+" "+accountholder );
  }
public static void main(String [] args)
{
  HDFCBank h1= new HDFCBank(123455,"sakshi");
  h1.display();
}
}

