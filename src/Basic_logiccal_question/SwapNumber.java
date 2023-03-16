package Basic_logiccal_question;

public class SwapNumber 
{
	
	void meth1()
	{
		int x=20;
		int y=30;
		x=x+y;
		y=x-y;
		x=x-y;
		System.out.println("x value is::"+x);
		System.out.println("y value is::"+y);
	}
	public static void main(String[] args) 
	{
		
		SwapNumber sn=new SwapNumber();
		sn.meth1();
		
	}

}
