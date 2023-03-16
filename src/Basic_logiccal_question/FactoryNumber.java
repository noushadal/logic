package Basic_logiccal_question;

import java.util.Scanner;

public class FactoryNumber 
{
	
	Scanner sc=new Scanner(System.in);
	
	
	void meth1()
	{
		
		System.out.println("Enter number want to check factory number");
		int num   =sc.nextInt();
		
		for(int i=1; i<=num; i++)
		{
			if(num% i==0)
			{
				System.out.println("the given factory  number is::"+i);
			}
		}
		
	}
	public static void main(String[] args) 
	{
		
		FactoryNumber fn=new FactoryNumber();
		fn.meth1();
		System.out.println("java is awosome");
		
	}

}
