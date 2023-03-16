package Basic_logiccal_question;

import java.util.Scanner;

public class Plaindrom 
{  
	
	Scanner sc=new Scanner(System.in);
	
	void meth1()
	{
		
		System.out.println("enter any name");
		String s=sc.next();
	
		
	   String r="";
	   for(int i=s.length()-1;i>=0;i--)
	   {
		   r=r+s.charAt(i);
		   
	   }
	   System.out.println(r);
	   if(r.equals(s))
	   {
		   System.out.println("given string is palindrom string");
	   }
		
	}
	public static void main(String[] args) 
	{
		
		Plaindrom pm=new Plaindrom();
		pm.meth1();
		
	}

}
