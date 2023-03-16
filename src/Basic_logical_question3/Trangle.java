package Basic_logical_question3;

public class Trangle 
{
	
	
	void meth1()
	{
		int row=5;
		int column= 1;
		
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(column);
				
			}
			if(column==1)
			{
				column=0;
			}
			
			else if(column==0)
			{
				column=1;
			}
			
			
			System.out.println();
		}
		
	}
	public static void main(String[] args)
	{
		
		Trangle tl=new Trangle();
		
		tl.meth1();
		
	}

}
