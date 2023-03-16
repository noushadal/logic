package Basic_logical_question2;

import java.util.Scanner;

public class primeNumber
{
	
	Scanner sc=new Scanner(System.in);
	
	void meth1() 
	{
		System.out.println("enter any number");
		
	int a	=sc.nextInt();
	
	int count=0;
	
	for(int i=1; i<=a;i++)
	{
	if(a%i==0)
	{
		count++;
		
	}
	}
	if(count==2)
	{
		System.out.println("given Number is Prime Number::"+a);
	}
	else
	{
		System.out.println("number is not prime number");
	}
	
		
	
	}
	public static void main(String[] args) 
	{
		
		primeNumber pn=new primeNumber();
		pn.meth1();
		
	}
	

}
