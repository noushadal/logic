package Basic_logical_questiom4;

import java.util.Scanner;

public class FabilousSeries
{
	void meth1()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter number");
		
		int h=sc.nextInt();
		int a=0,b=0;
		int c=1;
		
		for(int i=0;i<=h;i++)
		{
			
			a=b;
			b=c;
			c=a+b;
			System.out.println(c);
			
		}
	}
	public static void main(String[] args)
	{
		FabilousSeries fs=new FabilousSeries();
		fs.meth1();
		
	}

}
