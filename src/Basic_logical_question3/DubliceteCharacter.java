package Basic_logical_question3;

public class DubliceteCharacter 
{
	
	int count=0;
	
	void meth1()
	{
		
		
		String str="popo";
		char[] chars=str.toCharArray();
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<str.length();j++)
			{
				if(chars[i]==chars[j])
				{
					System.out.println(chars[j]);
					
					
					
					count++;
					break;
				}
			}
		}
	}
	
	
	public static void main(String[] args)
	{
		
		DubliceteCharacter dc=new DubliceteCharacter();
		
		
		dc.meth1();
		
	}

}
