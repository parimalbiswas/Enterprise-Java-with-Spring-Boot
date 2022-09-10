
@FunctionalInterface
interface AlphaIF
{
	void betaIF();
}

public class AnnonimousInterface
{

	public static void main(String[] args)
	{
		AlphaIF a11 = new AlphaIF()
		{

			@Override
			public void betaIF()
			{
				System.out.println("Beta Implimentation");

			}
		};
		a11.betaIF();

	}

}
