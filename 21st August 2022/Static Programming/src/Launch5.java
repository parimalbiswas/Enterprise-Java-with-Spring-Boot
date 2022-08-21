class Jio {
	private int age;
	private String name;

	static int count;

	Jio() {
		count++;
	}

	Jio(int age) {
		this.age = age;
		count++;
	}

	Jio(int age, String name) {
		this.age = age;
		this.name = name;
		count++;
	}

}

public class Launch5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jio j1 = new Jio();
		Jio j2 = new Jio(20);
		Jio j3 = new Jio(20, "jajhjkdhfdh");

		System.out.println(Jio.count);

	}

}
