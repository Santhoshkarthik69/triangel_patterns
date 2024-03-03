package star_patterns;

import java.util.Scanner;

public class Inverted_right_half_pyrmid
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
			System.out.print("* ");
		}
		System.out.println();
	}
}

	public static void main(String atrgs[])
	{
		Inverted_right_half_pyrmid irhp=new Inverted_right_half_pyrmid();
		irhp.operation();
	}

}
