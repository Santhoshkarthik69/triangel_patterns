package star_patterns;
import java.util.*;
public class Right_half_pyramid 
{
	Scanner sc=new Scanner(System.in);
	void operation()
	{
		System.out.println("enter rows :");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		Right_half_pyramid rp=new Right_half_pyramid();
		rp.operation();
	}
}
