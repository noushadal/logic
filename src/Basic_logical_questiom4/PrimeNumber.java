package Basic_logical_questiom4;

import java.util.Scanner;

public class PrimeNumber 
{
	
	void meth1()
	{
	  Scanner sc=new Scanner(System.in);
	  
	  System.out.println("Enter any number");
	  
	  int h= sc.nextInt();
	  
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
			  System.out.println("number is prime number");
		  }
		  else
		  {
			  System.out.println("number is not prime number");
		  }
	  
	}
	public static void main(String[] args) 
	{
		
		PrimeNumber pn=new PrimeNumber();
		pn.meth1();
		
	}

}
