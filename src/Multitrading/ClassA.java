package Multitrading;

public class ClassA  extends Thread

{
	
	String name=Thread.currentThread().getName();
	Integer Priority=Thread.currentThread().getPriority();
	
	
	public void run()
	{
		
		for(int i=1;i<=5;i++)
		{
			System.out.println(name+" has repated"+ Priority+"times");
		}
		
	}
	
	public static void main(String[] args) 
	{
		
		ClassA aobj=new ClassA();
		
		Thread t1=new Thread(aobj);
		Thread t2=new Thread(aobj);
		t1.setName("tom");
		t1.setPriority(5);
		t2.setName("jary");
		t2.setPriority(2);
		t1.start();t2.start();
		
	}

}
