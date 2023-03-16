package Basic_logiccal_question;

public class practise 
{
	
	void metha()
	{
		int a=7;
		int c=1;
		
		for(int i=a;i>1;i--)
		{
			for(int j=1;j<i;j++)
			{
				System.out.print(c);
			}
			
		if(c==1)
		{
			c=0;
			
		}
		else if(c==0)
		{
			c=1;
		}
		System.out.println();
		}
		
	
		
	}
	public static void main(String[] args) 
	{
		
		
		practise p=new practise();
		p.metha();
		
	}

}
