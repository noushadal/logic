package DSAImp;

public class ReverseAllString_word 
{
	
static	StringBuffer s=new StringBuffer("position 1 no. @ durga is this");
	
	public static void main(String[] args) 
	{
		
		System.out.println(s);
		
		//w =start index of a particular word
		//j= last index of a particular word
		int i=0, j=0, w=0;
		
		while(i<s.length())
		{
			if(i==0)
				w=0;
			if(s.charAt(i)==' '||i==s.length()-1)
			{
				j=i;
				if(i==s.length()-1)
					j=i;
				else
					j--;
				swap(w,j);
				w=i+1;
			}
			i++;
		}
		swap(0,s.length()-1);
		System.out.println(s);
		
	}
	
	static void swap(int i, int j)
	{
		while(i<j)
		{
			 char ch=s.charAt(i);
			 
			 s.setCharAt(i, s.charAt(j));
			
			 s.setCharAt(i, ch);
			 i++;
			 j--;
		}
	}

}
