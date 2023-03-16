package Basic_Logical_question5;

public class CharacterRepated 
{
	
	void meth1()
	{
	String str="javaj";
	int count=0;
	
	
	char[]  chars=str.toCharArray();
	
	for(int i=0;i<=str.length()-1;i++)
	{
		for(int j=i+1; j<=str.length()-1;j++)
		{
			if(chars[i]==chars[j])
			{
				System.out.print(chars[j]);
				count++;
				break;
				
			}
			System.out.println();
		}
	}

}
	public static void main(String[] args) 
	{
		
		CharacterRepated cr=new CharacterRepated();
		
		
		cr.meth1();
		
	}
	

}
