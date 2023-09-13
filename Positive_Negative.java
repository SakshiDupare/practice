import java.util.*;
public class Positive_Negative
{
	public static void main(String [] args)
	{
		int num;
		//IDENTIY WHETHER THE ENTERED NUMBER IS POSITIVE OR NOT
		Scanner s = new Scanner (System.in);
	    System.out.println("Enter the number:");
		num = s.nextInt();
		if(num>0)
		{
			System.out.println("num:"+num+" is POSITIVE number.");
		}
		else
		{
			System.out.println("num="+num+" is NEGATIVE number.");
		}
	}
}