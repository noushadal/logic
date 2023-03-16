package Basic_Logical_question5;

import java.util.Scanner;

public class PrimeNumber 
{
	
	void meth1()
	{
		Scanner sc=new Scanner(System.in);
		
		
		System.out.println("enter any number");
		int a=sc.nextInt();
		
		int count=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				count++;
				
			}
			
		}
		if(count==2)
		{
			System.out.println("the number is prime number");
		}
		else {
			System.out.println("number is not prime");
		}
		
	
	
	
	}
	public static void main(String[] args) 
	{
		
		PrimeNumber pn=new PrimeNumber();
		
		
		pn.meth1();
		
	}

}
