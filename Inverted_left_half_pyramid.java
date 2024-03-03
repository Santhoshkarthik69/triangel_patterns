package star_patterns;

import java.util.Scanner;

public class Inverted_left_half_pyramid 
{
Scanner sc=new Scanner(System.in);
void operation()
{
	System.out.println("enter row :");
	int row=sc.nextInt();
	for(int i=1;i<=row;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print("  ");
		}
		for(int  k=i;k<=row;k++)
		{
			System.out.print("* ");
		}
		System.out.println();
	}
}

	public static void main(String[] args) 
	{
		Inverted_left_half_pyramid ilhp=new Inverted_left_half_pyramid ();
		ilhp.operation();

	}

}
