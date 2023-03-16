package Basic_logical_questiom4;

public class trangle
{
	int intc=1;
	
	void meth1()
	{
		int row=5;
		
		int count=1;
		
		
		for(int i=0;i<row;i++)
		{
			
			for(int j=0;j<=i;j++)
			{
				System.out.print(count);
				count++;
			}
			if(count==1)
			{
				count=0;
			}
			else if(count==0)
			{
				count=1;
			}
			System.out.println();
		}
	
		
		
	}
	public static void main(String[] args) 
	{
		trangle tt=new trangle();
		tt.meth1();
	}
	{
		
	}

}
