package IO_Files;

import java.io.File;
import java.io.IOException;

public class Ntn1
{
	public static void main(String[] args) throws IOException
	{
		File file = new File("qbc.txt");
		System.out.println(file.exists());

		file.createNewFile();

		System.out.println(file.exists());
	}

}
