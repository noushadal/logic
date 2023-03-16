package Basic_logiccal_question;

import java.util.Scanner;

public class RevirseTrangleFixColumn 
{
	Scanner sc=new Scanner(System.in);
	void meth1()
	{
		
		System.out.println("enter row you want");
		int row=sc.nextInt();
		System.out.println("enter column you want");
		int col=sc.nextInt();
		int count=col;
		
		for(int i=row;i>=1;i--)
		{
			for(int j=1;j<=i;j++)
			{
				count++;
				System.out.print(count);
			}
			System.out.println();
			
		}
	
	}
	
	void meth2()
	{
		System.out.println("eneter number of row");
		int row=sc.nextInt();
		System.out.println("enetr number of to start data");
		
		int count=sc.nextInt();
		for(int i=row; i>=0;i--)
		{
			for(int j=1; j<=i;j++)
			{
				
				
				System.out.print(count);
				count++;
			}
			System.out.println();
			
		}
		
	}
	
	public static void main(String[] args) 
	{
		
		
		RevirseTrangleFixColumn rc=new RevirseTrangleFixColumn();
		//rc.meth1();
		rc.meth2();
		
	}

}
