package star_patterns;

import java.util.Scanner;

public class Left_half_pyramid 
{
	Scanner sc=new Scanner(System.in);
	void operation()
	{
		System.out.println("enter rows :");
		int row=sc.nextInt();
		for(int i=1;i<=row;i++)
		{
			for(int j=i;j<=row;j++)
			{
				System.out.print("  ");
			}
			for(int k=1;k<=i;k++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args)
	{
		Left_half_pyramid rp=new Left_half_pyramid();
		rp.operation();
	}
}
