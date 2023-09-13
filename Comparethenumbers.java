public class Comparethenumbers
{
	public static void main(String [] args)
	{
		//Finding the largest of three numbers
		int a=10,b=20,c=30;
		if(a>b && a>c)
		{
			System.out.printf("The greatest number is =" +a);
		}
		else if(b>a && b>c)
		{
			System.out.println("The greatest number is =" +b);
		}
		else
		{
			System.out.println("The greatest number is =" +c);
		}
	}
}