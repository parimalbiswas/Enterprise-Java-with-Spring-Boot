package Comparator_ble;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

class Student implements Comparable<Student>
{
	int age;
	String name;
	String tech;

	public Student(int age, String name, String tech)
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

	@Override
	public int compareTo(Student that)
	{

//		return this.age - that.age;   // Age sort
//		return that.age - this.age;

		return this.name.compareTo(that.name); // name sort
	}

}

public class Main1
{

	public static void main(String[] args)
	{

		List<Integer> al2 = Arrays.asList(5, 10);
		System.out.println(al2);

		System.out.println("---------------");

		List<Student> al1 = new ArrayList<>();
		al1.add(new Student(21, "nagesh", "Java"));
		al1.add(new Student(20, "Haswani", "JS"));
		al1.add(new Student(18, "Souvik", "BloackChain"));
		al1.add(new Student(28, "Sundari", "C"));

		System.out.println(al1);

		Collections.sort(al1);

		System.out.println(al1);

	}

}
