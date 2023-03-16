package Basic_logical_questiom4;

import java.util.Scanner;

public class ArsmstongNumber 
{
	
	Scanner sc=new Scanner(System.in);
	
	void meth1()
	{
		
		System.out.println("enter any number");
		int a=sc.nextInt();
		
	int	arm=0;
	int	rem=0;
	
	int c=a;
	
	while(a>0)
	{
		rem=a%10;
		
		arm=rem*rem*rem+arm;
		
		a=a/10;
		
	}
	if(c==arm)
	{
		System.out.println("the number is armstong number");
	}
	else
	{
		System.out.println("number is not armstong number");
	}
		
	}
	public static void main(String[] args)
	{
		
		ArsmstongNumber as=new ArsmstongNumber();
		as.meth1();
		
	}

}
