import java.util.*;
public class Factorial
{
  public static void main (String [] args)
  {
	  //Find factorial of the number
	  int num;
	  int fact=1;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter the number:");
	num=s.nextInt();
	for(; num>=1;num--)
	{
	fact=fact*num;
	}
	System.out.println("The factorial of "+num+" is ="+fact);
  }
}
		
	