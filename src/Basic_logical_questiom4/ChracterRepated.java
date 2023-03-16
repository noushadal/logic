package Basic_logical_questiom4;

public class ChracterRepated 
{
	
	void meth1()
	{
		
		int count=0;
		String str="nnuuuyt";
		
		char[]  chars=str.toCharArray();
		
		for(int i=0;i<=str.length()-1;i++)
		{
			for(int  j=i+1;j<str.length();j++)
			{
				if(chars[i]==chars[j])
				{
					System.out.println("the repated character is::"+chars[j]);
					count++;
					break;
					
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		 ChracterRepated cr=new  ChracterRepated();
		 cr.meth1();
		
		
		
	}

}
