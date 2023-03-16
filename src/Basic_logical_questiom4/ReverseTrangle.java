package Basic_logical_questiom4;

public class ReverseTrangle
{
	
	void meth1()
	{
		int row=5;
		
		int count=1;
		
		for(int i=row; i>=0;i--)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(count);
			}
			System.out.println();
			
		}
	}
	public static void main(String[] args) 
	{
		
		ReverseTrangle rt=new ReverseTrangle();
		rt.meth1();
		
	}

}
