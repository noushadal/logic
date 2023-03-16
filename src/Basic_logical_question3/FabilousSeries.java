package Basic_logical_question3;

import java.util.Scanner;

public class FabilousSeries 
{
	
	Scanner sc=new Scanner(System.in);
	
	void meth1()
	{
		 int a=0;
		 int b=0;
		 int c=1;
		 
		 System.out.println("enter any number");
		 
		int h =sc.nextInt();
		
		for(int i=0;i<=h;i++)
		{
			a=b;
			b=c;
			c=a+b;
			System.out.print(c);
		}
	}
	
	public static void main(String[] args)
	{
		
		FabilousSeries fs=new FabilousSeries();
		fs.meth1();
		
	}

}
