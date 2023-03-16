package Basic_logiccal_question;

import java.util.Scanner;

public class primeNumber 
{
	
	Scanner sc=new Scanner(System.in);
	
	void meth1()
	{
		
		System.out.println("enter any avlue");
		  int s=sc.nextInt();
		
		int count=0;
		for(int i=1; i<=s;i++)
		{
			if(s%i==0)
			{
				count++;
				
			}
		}
		if(count==2)
		{
			System.out.println("the number is prime number");
		}
		else
		{
			System.out.println("the not prime numbet");
		}
		
	}
	public static void main(String[] args) 
	{
		
		primeNumber pn=new primeNumber();
		pn.meth1();
		
	}

}
