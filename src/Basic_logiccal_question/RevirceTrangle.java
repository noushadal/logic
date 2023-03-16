package Basic_logiccal_question;

import java.util.Scanner;

public class RevirceTrangle
{
	
	
	Scanner sc=new Scanner(System.in);
	
	void meth1()
	{
		
		System.out.println("enter number you want to start ");
		int count=sc.nextInt();
		System.out.println("enter row you want in loop");
		
		int row=sc.nextInt();
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				
				System.out.print(count);
				count--;
			}
			System.out.println();
		}
		
	}
	
	
	void meth2()
	{
		System.out.println("reverse tarngle  +enter number you want to strt  tarngle");
	int x	=sc.nextInt();
	
	System.out.println("enter number you want row");
	int row=sc.nextInt();
	
	for(int i=1;i<=row;i++)
	{
		for(int j=1;j<=i;j++)
		{
			System.out.print(x);
			x--;
		}
		System.out.println();
		
	}
		
		
	}

	public static void main(String[] args) 
	{
		RevirceTrangle rt=new RevirceTrangle();
		//rt.meth1();
		rt.meth2();

	}

}
