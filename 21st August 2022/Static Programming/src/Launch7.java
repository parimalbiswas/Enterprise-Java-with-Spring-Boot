class Jio1 {
	private int age;
	private String name;

	static int count;
//We will create a non static block. Every time new object created in main class. mean constractor call will happen.
//	 many time non static block will run.
	{
		count++;
	}

	// We canot write every consttractor if we forgot to one constractor then bug
	// will be genarated.
	Jio1() {
//		count++; 
	}

	Jio1(int age) {
		this.age = age;
//		count++;
	}

	Jio1(int age, String name) {
		this.age = age;
		this.name = name;
//		count++;
	}

}

public class Launch7 {

	public static void main(String[] args) {
		Jio1 j1 = new Jio1();
		Jio1 j2 = new Jio1(20);
		Jio1 j3 = new Jio1(20, "jajhjkdhfdh");

		System.out.println(Jio1.count);

	}

}
