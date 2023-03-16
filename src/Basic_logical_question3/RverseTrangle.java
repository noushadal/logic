package Basic_logical_question3;

public class RverseTrangle
{
	
	void meth1()
	{
		int row=6;
		
		int count=79;
		
		for(int i=row;i>=0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(count);
				count--;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		
		
		RverseTrangle rv=new RverseTrangle();
		rv.meth1();
		
	}

}
