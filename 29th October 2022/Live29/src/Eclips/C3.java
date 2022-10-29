package Eclips;

class Demo<T extends Number>
{

}

//class Sample<T implements X>  // Invalid
//{
//	
//}

//class Twist<T super X>  // Invalid
//{
//	
//}

class Trial<T extends Runnable>
{

}

public class C3
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
//		Demo<String> d1 = new Demo<String>(); // Invalid
		Demo<Integer> d2 = new Demo<Integer>();
		Demo<Double> d3 = new Demo<Double>();
		Demo<Number> d4 = new Demo<Number>();

		Trial<Runnable> t1 = new Trial<Runnable>();
		Trial<Thread> t2 = new Trial<Thread>();
//		Trial<String> t3 = new Trial<String>();// Invalid
	}

}
