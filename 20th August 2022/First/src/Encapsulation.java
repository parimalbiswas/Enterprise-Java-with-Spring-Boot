//Encapsulation mean security (Pen example)

class Books
{
	private int pageNumber;

	public void setPageNum(int x) // Setter
	{
		if (x > 0)
		{
			pageNumber = x;
		}
		else
		{
			System.out.println("Invalid Entry to my proparty");
		}
	}

	public int getPageNumber() // getter
	{
		return pageNumber;
	}
}

public class Encapsulation
{

	public static void main(String[] args)
	{
		Books b1 = new Books();
//		b1.pageNumber = 100; // Equal to mean right to left
		b1.setPageNum(-100);
		System.out.println(b1.getPageNumber());
	}

}
