public class maximum
{
public static void main (String [] args)
{
int [] nums={10,20,30,40,50};
int max = nums[0];
for(int i=1;i<nums.length;i++)
{
	if(max<nums[i])
	{
		max=nums[i];
	}
}
System.out.println("The maximum number is=" +max);
}
}