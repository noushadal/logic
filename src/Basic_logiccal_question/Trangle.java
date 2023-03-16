package Basic_logiccal_question;

import java.util.Scanner;

public class Trangle 
{
	Scanner sc=new Scanner(System.in);
	void meth1()
	{  
		
		System.out.println("eneter loop up to number");
	int a	=sc.nextInt();
	
	int count=0;
	
	for(int i=1;i<=a;i++)
	{
		for(int j=1;j<=i;j++)
		{
			count++;
			System.out.print(count);
		}
		System.out.println();
	}
	
	
	
	
		
		
	}
	public static void main(String[] args) 
	{
		
		Trangle ta=new Trangle();
		
		
		ta.meth1();
	//System.out.println(ta.meth1());
		
	}

}
