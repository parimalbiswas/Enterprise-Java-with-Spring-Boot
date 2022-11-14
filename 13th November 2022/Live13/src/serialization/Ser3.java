package serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Dog3 implements Serializable
{
	Cat3 cat3 = new Cat3();
}

class Cat3 implements Serializable
{
	Rat3 rat3 = new Rat3();
}

class Rat3 implements Serializable
{
	int i = 10;
}

public class Ser3
{
	public static void main(String[] args) throws ClassNotFoundException, IOException
	{
		Dog3 dog3 = new Dog3();

		System.out.println("Serialization Started");
		FileOutputStream fos1 = new FileOutputStream("F:\\cuma.ser");
		ObjectOutputStream oos1 = new ObjectOutputStream(fos1);
		oos1.writeObject(dog3);

		System.out.println("Serialization Ende");

		System.out.println("DSerialization Started");
		FileInputStream fos2 = new FileInputStream("F:\\cuma.ser");
		ObjectInputStream oos2 = new ObjectInputStream(fos2);
		Dog3 d1 = (Dog3) oos2.readObject();

		System.out.println("DeSerialization Ende");

		System.out.println(d1.cat3.rat3.i);

	}
}
