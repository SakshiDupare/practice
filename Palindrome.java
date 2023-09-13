public class Palindrome
{
	public static void main (String [] srgs)
	{
		int n=1234;
		int rev=n;
		int reverse=0;
		while(n>0)
		{
			int remainder =num%10;
			reverse=(reverse*10)+remainder;
			n=n/10;
		}
		if(n==rev)
		{
			System.out.println("The given number is Palindrome" +rev);
		}
		else
		{
			System.out.println("The given number is not Palindrome number" +rev);
		}
	}
}