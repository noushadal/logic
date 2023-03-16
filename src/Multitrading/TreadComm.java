package Multitrading;

public class TreadComm 
{
	
	int amount=1000;
	
	synchronized void withdrow(int amount) throws InterruptedException
	{
		int am = 0;
		if(amount<this.amount)
		{
			System.out.println("amount debited sucessfuly");
		am=this.amount-amount;
		}
		else
		{
			System.out.println("infufficiant balance  waith some time");
			wait();
			
			System.out.println(amount);
			
		
			am=amount-this.amount;
			
			
			
		}
		System.out.println("avialabe balance is::"+ am);
	}
    
	
	synchronized void deposit(int amount)
	{
		int am=0;
		if(amount>this.amount)
		{
			 am=this.amount+amount;
			 System.out.println("deposit amount ::"+am);
			 
			 notifyAll();
			
		}
	}
	
	public static void main(String[] args) 
	{
		
		TreadComm th=new TreadComm();
		new Thread(){
			
			public void run()
			{
				try {
					th.withdrow(12000);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			
		}.start();
		new Thread()
		{
			public void run()
			{
				th.deposit(5000);
			}
		}.start();
		
	}
}
