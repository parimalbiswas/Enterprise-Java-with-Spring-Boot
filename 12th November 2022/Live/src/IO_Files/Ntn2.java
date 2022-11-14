package IO_Files;

import java.io.File;

public class Ntn2
{
	public static void main(String[] args)
	{
		File file = new File("tempmkdir");
		System.out.println(file.exists());

		file.mkdir();

		System.out.println(file.exists());

		File file2 = new File("tempmkdir", "abc.txt");
		System.out.println(file2.exists());

		file2.mkdir();

		System.out.println(file2.exists());
	}

}
