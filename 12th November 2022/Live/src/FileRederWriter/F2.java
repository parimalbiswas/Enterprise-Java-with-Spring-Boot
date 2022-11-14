package FileRederWriter;

import java.io.FileReader;
import java.io.IOException;

public class F2
{
	public static void main(String[] args) throws IOException
	{
		FileReader fr1 = new FileReader("F:\\Ntn\\info.txt");
		int i = fr1.read();

		char[] c = new char[10];

		while (i != -1)
		{
			System.out.println((char) i);
			i = fr1.read();
		}

		fr1.close();

	}
}
