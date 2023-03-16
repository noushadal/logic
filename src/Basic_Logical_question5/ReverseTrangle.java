package Basic_Logical_question5;

public class ReverseTrangle
{
	
	void meth1()
	{
		int row=5;
		int number=1;
		
		for(int i =row;i>0;i--)
		{
			for(int j=i;j<=row;j++)
			{
				System.out.print(number);
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
