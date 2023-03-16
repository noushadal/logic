package Basic_logical_question3;

import java.util.Scanner;

public class ArmstongNumber 
{
	
	
	Scanner sc=new Scanner(System.in);
	
	
	
	void meth1()
	{
		System.out.println("enter number");
		  int c=sc.nextInt();
		
		 int arm=0;
		 int rem=0;
		 
		 int a;
		 
		 a=c;
		 while(c>0)
		 {
			 rem=c%10;
			 arm=rem*rem*rem+arm;
			 c=c/10;
		 }
		 
		 if(arm==a)
		 {
			 System.out.println("number is armstong number"+arm);
		 }
		 else
		 {
			 System.out.println("number is not armstong number");
		 }
		 
				 
	}
	public static void main(String[] args) 
	{
		
		ArmstongNumber an=new ArmstongNumber();
		
		an.meth1();
		
	}

}
