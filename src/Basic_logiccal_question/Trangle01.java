package Basic_logiccal_question;

public class Trangle01
{
	void meth1()
	{
		int a=5;
		int b=1;
		
		for(int i=1;i<=a;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(b);
				
				
			}
			if(b==1)
			{
				b=0;
				
			}
			else if(b==0)
			{
				b=1;
			}
			System.out.println();
		}
		
	}
	public static void main(String[] args)
	{
		
		
		Trangle01 t=new Trangle01();
		t.meth1();
	}

}
