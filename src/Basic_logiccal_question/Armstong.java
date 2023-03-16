package Basic_logiccal_question;

import java.util.Scanner;

public class Armstong 
{
	
	Scanner sc=new Scanner(System.in);
	
	void meth1()
	
	{
		System.out.println("enter any number");
		int s=sc.nextInt();
		
		int n;
		n=s;
		int arm=0;
		
		while(s>0)
		{
			int f=s%10;
			arm=f*f*f+arm;
			s=s/10;
			
		}
		if(n==arm)
		{
			System.out.println("number is arm number");
		}
		else {
			System.out.println("number not  arm number");
		}
		
	}
	public static void main(String[] args) 
	{
		Armstong as=new Armstong();
		
		as.meth1();
		
	}

}
