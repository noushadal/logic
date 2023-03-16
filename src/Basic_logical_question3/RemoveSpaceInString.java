package Basic_logical_question3;

import java.nio.Buffer;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RemoveSpaceInString 
{
	
	void meth1()
	{
	String str=new String("java     is  java   awosome");
		
	
	Pattern pattern=Pattern.compile("java");
	Matcher matcher=pattern.matcher( str );
	if(matcher.find())
	{
		System.out.println( matcher.group()+matcher.regionStart()+" "+matcher.regionEnd()+matcher.groupCount());
	}
	
	
	}
	
	public static void main(String[] args)
	{
		
		
		RemoveSpaceInString rs=new RemoveSpaceInString();
		rs.meth1();
		
	}

}
