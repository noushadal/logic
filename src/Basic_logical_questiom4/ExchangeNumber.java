package Basic_logical_questiom4;

public class ExchangeNumber
{
	
	void meth1()
	{
		int x=100;
		int y=50;
		
		x=x+y;
		y=x-y;
		x=y-x;
		System.out.println("x value"+x);
		System.out.println("y value"+y);
	}
	public static void main(String[] args) 
	{
		
		ExchangeNumber ex=new ExchangeNumber();
		ex.meth1();
		
	}

}
