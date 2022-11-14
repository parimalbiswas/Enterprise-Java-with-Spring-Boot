package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog1 implements Serializable
{
	static transient int i = 10;
	transient final int j = 20;

	public Dog1()
	{
		i++;
		System.out.println("Constreactoir called........");
	}
}

public class Ser2
{
	public static void main(String[] args) throws ClassNotFoundException, IOException
	{
		Dog1 dog1 = new Dog1();

		System.out.println("Serialization Started");
		FileOutputStream fos1 = new FileOutputStream("F:\\cuma.ser");
		ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
		oos1.writeObject(dog1);

		System.out.println("Serialization Ende");

		System.out.println("DSerialization Started");
		FileInputStream fos2 = new FileInputStream("F:\\cuma.ser");
		ObjectInputStream oos2 = new ObjectInputStream(fos2);
		Dog1 d1 = (Dog1) oos2.readObject();

		System.out.println("DeSerialization Ende");

		System.out.println(d1.i + "===" + d1.j);

	}
}
