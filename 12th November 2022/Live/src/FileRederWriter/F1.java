package FileRederWriter;

import java.io.FileWriter;
import java.io.IOException;

public class F1
{
	public static void main(String[] args) throws IOException
	{
		FileWriter fw1 = new FileWriter("F:\\\\Ntn\\info.txt", true);
		fw1.write(73);
		fw1.write("Java\nTech55\n");

		char ch[] =
		{ 'a', 'b', 'c' };
		fw1.write(ch);

		fw1.flush();
		fw1.close();

	}

}
