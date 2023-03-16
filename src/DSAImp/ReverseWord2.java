package DSAImp;

public class ReverseWord2 
{
	
	//function to reverse string
	static void reverse(char str[], int start,int end)
	{
		
		char tem;
		while(start<=end)
		{
			tem=str[start];
			str[start]=str[end];
			
			str[end]=tem;
			
			start++;
			end--;
		}
		
	}
	
	//function to reverse word
	
	static char[] reverseword(char[] s)
	{
		int start=0;
		//int end=0;
		for(int end=0;end<s.length;end++)
		{
			//s[start,end-1];
			
			if(s[end]== ' ')
			{
				reverse(s,start,end);
				start=end+1;
			}
		}
		//erverse last word
		reverse(s, start, s.length-1);
		
		//reverse entaire string
		reverse(s, 0, s.length-1);
		
		return s;
		
	}
	public static void main(String[] args)
	{
		
		String s="i like you";
		char[] q=reverseword(s.toCharArray());
		System.out.println(q);
		
	}
	

}
