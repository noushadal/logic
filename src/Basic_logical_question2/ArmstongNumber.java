package Basic_logical_question2;

import java.util.Scanner;

public class ArmstongNumber 
{
	
	Scanner sc=new Scanner(System.in);
	
	
	void meth1()
	{
		System.out.println("enter any number");
		
		int arm = 0, rem=0;
		
	int a=sc.nextInt();
	int b ;
	b=a;
	
	
	while(a>0)
	{
		rem=a%10;
		arm=rem*rem*rem+arm;
		
		a=a/10;
}
	if(b==arm)
	{
		System.out.println("given number is armstong number");
	}
		
	else
	{
		System.out.println("it is not armstong number");
	}
	}
	public static void main(String[] args) 
	{
		ArmstongNumber an=new ArmstongNumber();
		an.meth1();
	}

}
