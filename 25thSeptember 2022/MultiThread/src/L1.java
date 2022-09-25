
public class L1
{

	public static void main(String[] args)
	{
		System.out.println("Hi");
		Thread thread = Thread.currentThread();
		// 3 thing will give --> name,priority, which method currently running
		// Main thread default priority 5
		System.out.println(thread);

		String nameString = thread.currentThread().getName();
		System.out.println(nameString);

		thread.setName("Naj");
		thread.setPriority(4);
		System.out.println(thread);

		System.out.println("Hwllow");

	}

}
