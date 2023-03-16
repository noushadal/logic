package DSAImp;

public class ReverseWord3 
{
	
	static void reverse(char[]str, int start, int end)
	{
		char temp;
		
		while(start<=end)
		{
			temp=str[start];
			str[start]=str[end];
			
			str[end]=temp;
			start++;
			end--;
		}
	}
	
	static char[] reverseWord(char[]  s)
	{
		int start=0;
		for(int end=0; end<s.length;end++)
		{
			//checking space in string
			if(s[end] ==' ')
			{
				reverse(s, start, end);
				start= end + 1;
				
			}
		}
		
		//reverse the last character
		reverse(s, start, s.length-1);
		
		//reverse hole string
		reverse(s, 0, s.length-1);
		
		return s;
		
	}
	public static void main(String[] args) 
	{
		
		String s="java is me ";
		char[] q=reverseWord(s.toCharArray());
		System.out.println(q);
		
	}

}
