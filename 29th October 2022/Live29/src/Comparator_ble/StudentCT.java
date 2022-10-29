package Comparator_ble;

public class StudentCT
{
	int age;
	String name;
	String tech;

	public StudentCT(int age, String name, String tech)
	{
		super();
		this.age = age;
		this.name = name;
		this.tech = tech;
	}

	@Override
	public String toString()
	{
		return "Student [age=" + age + ", name=" + name + ", tech=" + tech + "]";
	}

}
