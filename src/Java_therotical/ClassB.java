package Java_therotical;

public class ClassB extends ClassA implements InterfaceA,InterfaceB
{
	@Override
	public void meth1() 
	{
		System.out.println("meth1 of ClassA");
		
	}
	
	void meth3()
	{
		System.out.println("meth3 of classB");
	}
	
	

	
	public static void main(String[] args)
	{
		
		ClassA aobj=new ClassB();//has a relationship
		
		aobj.meth1();
		aobj.meth2();
		
		ClassB bobj=new ClassB();
		bobj.meth3();
		bobj.methi();
		bobj.methIB();
	}

	@Override
	public void methIB() 
	{
		System.out.println("interface IB methad");
		
	}

	@Override
	public void methi() 
	{
		System.out.println("interface Ia methad");
		
	}

	
}
