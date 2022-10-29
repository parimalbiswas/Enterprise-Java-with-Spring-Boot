package Eclips;

class Gen<T>
{
//	Account<Savings> acc1 = new Account<Gold>();
//	Account<Savings> acc1 = new Account<Gold>();

	T obj;

	public Gen(T obj)
	{
		this.obj = obj;
	}

	public void show()
	{
		System.out.println("Welcome --> " + obj.getClass().getName());
	}

	public T getObj()
	{
		return obj;
	}

}

public class C2
{

	public static void main(String[] args)
	{
		Gen<Integer> g1 = new Gen<Integer>(10);
		g1.show();
		System.out.println(g1.getObj());

		System.out.println("-----------");

		Gen<String> g2 = new Gen<String>("Kar");
		g2.show();
		System.out.println(g2.getObj());
	}
}
