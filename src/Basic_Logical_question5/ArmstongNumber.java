package Basic_Logical_question5;

import java.util.Scanner;

public class ArmstongNumber 
{
	
	
	void meth1()
	{
		int arm = 0;
		int rem=0;
		int c;
		
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter any number");
		
	int a=sc.nextInt();
	
	    c=a;
	    System.out.println(a+" "+c);
	
	
	while(a>0)
	{
		rem=a%10;
		
	arm=rem*rem*rem+arm;
	a=a/10;
	
}
	System.out.println(c);
	
	if(c==arm)
	{
		System.out.println("the number is armstong number");
	}
	
	else {
		System.out.println("the number is not armstong number");
	}
	}
	public static void main(String[] args)
	{
		
		ArmstongNumber an=new ArmstongNumber();
		
		an.meth1();
		
	}

}
