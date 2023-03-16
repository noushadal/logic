package Basic_logical_question3;

import java.util.Scanner;

public class PrimeNumber 
{
	
	Scanner sc=new Scanner(System.in);
	
	
	void meth1()
	{
		System.out.println("enter  number you want check");
		
		int h =sc.nextInt();
		
		
		int count=0;
		
		
		for(int i=1;i<=h;i++)
		{
			if(h%i==0)
			{
				count++;
			}
			
			
			
			
		}
		if(count==2)
		{
			System.out.println("the given number "+h+"is prime number");
		}
		else
		{
			System.out.println("number is not prime number");
		}
		
	}
	public static void main(String[] args) 
	{
		
		PrimeNumber  pn=new PrimeNumber();
		pn.meth1();
		
	}

}
