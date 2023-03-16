package Basic_Logical_question5;

public class TrangleLoop
{
	
	void meth1()
	{
		int row=5;
		int number=1;
		
		for(int i=0;i<row;i++)
		{
			for(int j=i;j<row;j++)
			{
				System.out.print(number);
				
				
			}
			if(number==1)
			{
				number=0;
			}
			else if(number==0)
			{
				number=1;
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		
		TrangleLoop tl=new TrangleLoop();
		tl.meth1();
		
	}

}
