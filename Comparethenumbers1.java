import java.util.*;
public class Comparethenumbers1
{
	public static void main(String [] args)
	{
		//Finding the largest of three numbers
		int a,b,c;
		Scanner s = new Scanner (System.in);
		System.out.println("enter the three numbers:");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
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