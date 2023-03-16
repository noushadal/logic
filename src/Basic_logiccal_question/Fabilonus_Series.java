package Basic_logiccal_question;

import java.util.Scanner;

public class Fabilonus_Series 
{
	
	Scanner sc=new Scanner(System.in);
	
	void meth1()
	{
		
		int a=0,b=0,c=1;
		
		System.out.println("enter any number");
		 int j  =sc.nextInt();
		 
		 for(int i=0;i<=j;i++)
		 {
			 a=b;
			 b=c;
			 c=a+b;
			 System.out.println(c);
		 }
		
	}
	public static void main(String[] args) 
	{
		
		Fabilonus_Series fs=new Fabilonus_Series();
		fs.meth1();
		
	}

}
