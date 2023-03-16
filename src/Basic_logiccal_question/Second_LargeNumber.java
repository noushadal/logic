package Basic_logiccal_question;

public class Second_LargeNumber 
{
	
	void meth1()
	{
		int arr[]= {30,20,10,878,76};
		int large=0 ,slarge=0;
		
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]>large)
			{
				large=slarge;
				large=arr[i];
			}
			else if(arr[i]>slarge)
			{
				slarge=arr[i];
			}
		}
		System.out.println("large number::"+large);
		System.out.println("second large number::"+slarge);
		
		
	}
	public static void main(String[] args)
	{
		
		Second_LargeNumber sl=new Second_LargeNumber();
		sl.meth1();
		
	}

}
