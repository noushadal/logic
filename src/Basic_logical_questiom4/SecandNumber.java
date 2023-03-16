package Basic_logical_questiom4;

public class SecandNumber
{
	
	void meth1()
	{
		
		int arr[]= {25,30,98,100,55};
		
		int higNumber=0;
		int secNumber=0;
		
		for(int i=0;i<=arr.length-1;i++)
		{
			if(arr[i]>higNumber)
			{
				higNumber=secNumber;
				higNumber=arr[i];
			}
			else if(arr[i]>secNumber)
			{
				secNumber=arr[i];
			}
		}
		System.out.println("highest Number::"+higNumber);
		System.out.println("sec higthest number:"+secNumber);
		
		
	}
	public static void main(String[] args) 
	{
		
		SecandNumber sn=new SecandNumber();
		sn.meth1();
		
	}

}
