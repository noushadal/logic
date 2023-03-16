package Basic_logiccal_question;

public class Trangle01_reverse 
{
	
	void meth1()
	{
		
		int a=10;
		int c=1;
		for(int i=a;i>=1;i--)
		{
			
			for(int j=1; j<=i;j++)
			{
				System.out.print(c);
				
			}
			System.out.println();
			if(c==1)
			{
				c=0;
			}
			else if(c==0)
			{
				c=1;
			}
		}
		
	}
	
	public static void main(String[] args) 
	{
		
		Trangle01_reverse tt=new Trangle01_reverse();
		tt.meth1();
		
	}

}
