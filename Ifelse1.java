import java.util.*;
public class Ifelse1
{
	public static void main (String [] args)
	{
		int num;
		Scanner s1 = new Scanner (System.in);
		System.out.println("Enter the number:");
		num=s1.nextInt();
		if(num%2==0)
		{
			System.out.println("The given number is Even.");
		}
		else
		{
			System.out.println("The given number is Odd.");
		}
	}
}
		
		