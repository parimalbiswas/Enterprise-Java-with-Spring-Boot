//one abstract method present in class --> Functional Interface
//annonimous inner class --> Lamda Expration

// If one abstract method then we can use lamda exp only
//implimentation of funtional interface called -- Lamda Expreatinmn

@FunctionalInterface
interface Demo
{
	void display();
}

class Alpha implements Demo
{
	public void display()
	{
		System.out.println("I have give body");
	}
}

public class Launch1
{

	public static void main(String[] args)
	{
		Demo demo = new Alpha();
		demo.display();
	}

}
