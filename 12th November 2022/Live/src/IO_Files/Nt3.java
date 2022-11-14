package IO_Files;

import java.io.File;
import java.io.IOException;

public class Nt3
{

	public static void main(String[] args) throws IOException
	{
		File file = new File("F:\\IPL_Team");
		file.mkdir();

//		file.createNewFile();

		File file2 = new File("F:\\IPL_Team", "Demo.txt");

		file2.createNewFile();

		System.out.println(file2.exists());

	}

}
