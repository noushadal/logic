package Basic_logical_question3;

public class Palindrom 
{
	
	
	
	
	void meth1()
	{
		
		String s="pop";
		String r=" ";
		for(int i=s.length()-1;i>=0;i--)
		{
			r=s.charAt(i)+r;
			
			
			
		}
		System.out.println(r);
		System.out.println(s);
		
		if(r.equals(r))
		{
			System.out.println("string is prelindrom");
		}
		else {
			System.out.println("string not pelindrom");
		}
	}
	public static void main(String[] args) 
	{
		
		
		Palindrom p=new Palindrom();
		p.meth1();
		
	}

}
