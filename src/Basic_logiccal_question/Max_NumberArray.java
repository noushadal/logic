package Basic_logiccal_question;

public class Max_NumberArray 
{
	
	
	
	void meth1()
	{
		int arr[] = {20,30,1,23,90};
		
		int max=arr[0];
		
		
		
		for(int i=0; i<arr.length;i++)
		{
			if(arr[i]>max)
			{
			System.out.println("the max number is::"+arr[i]);
			}
		}
	}
	
	
	public static void main(String[] args) 
	{
		
		Max_NumberArray mx=new Max_NumberArray();
		mx.meth1();
		
	}

}
