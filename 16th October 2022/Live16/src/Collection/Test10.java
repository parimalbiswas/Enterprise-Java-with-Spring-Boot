package Collection;

import java.util.Hashtable;
import java.util.Objects;

class Temp111
{
	int i;

	public Temp111(int i)
	{
		super();
		this.i = i;
	}

	@Override
	public int hashCode()
	{
		return Objects.hash(i);
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Temp111 other = (Temp111) obj;
		return i == other.i;
	}

	@Override
	public String toString()
	{
		return "Temp111 [i=" + i + "]";
	}

}

public class Test10
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		Hashtable ht1 = new Hashtable<>();
		ht1.put(new Temp111(5), "A");
		ht1.put(new Temp111(2), "N");
		ht1.put(new Temp111(4), "G");
		ht1.put(new Temp111(2), "L");
		ht1.put(new Temp111(7), "Y");
		ht1.put(new Temp111(5), "R");
		ht1.put(new Temp111(23), "E");

		System.out.println(ht1);

	}

}
