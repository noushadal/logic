package Basic_logiccal_question;

public class ReverseString 
{
	
	void meth1()
	{
		
		String s="Noushad";
		
		for(int i=s.length()-1; i>=s.length()-7;i--)
		{
			System.out.println(s.charAt(i));
		}
		
	}
	public static void main(String[] args) 
	{
		
		ReverseString rr=new ReverseString();
		rr.meth1();
		
	}

}
