package FileRederWriter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class F4
{
	public static void main(String[] args) throws IOException
	{
		BufferedReader br1 = new BufferedReader(new FileReader("info.txt"));

		String lineString = br1.readLine();

		while (lineString != null)
		{

		}

	}
}
