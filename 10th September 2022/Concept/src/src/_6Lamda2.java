package src;

//Marker(empty), Functional(One method), Normal 
//--> 3 type of Interface
interface Computer1
{
	void show(int num);
}

interface Computer2
{
	int show2(int num1, int num2);
}

public class _6Lamda2
{

	public static void main(String[] args)
	{
		// In lamda case dont create $1 file by JVM
		Computer1 c111 = (int num) -> System.out.println("In Show " + num);
		c111.show(116);

//		Computer1 c2 = new Computer1()
//		{
//
//			@Override
//			public void show()
//			{
//				sou
//
//			}
//		};

		Computer1 computer1 = num -> System.out.println("In Show 1 variable" + num);
		computer1.show(5);

		Computer2 computer2 = (num1, num2) -> num1 + num2;
		System.out.println(computer2.show2(2, 5));

		Computer2 computer3 = (num1, num2) ->
		{
			int res = num1 + num2;
			return res;
		};
		System.out.println(computer3.show2(2, 4));
	}

}
