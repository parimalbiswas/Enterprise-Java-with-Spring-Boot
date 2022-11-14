package IO_Files;

import java.io.File;

public class Nt5
{
	public static void main(String[] args)
	{
		File f1 = new File("F:\\Ntn");
		f1.mkdir();
		String data[] = f1.list();

		int count = 0;

		for (String filrInfor1 : data)
		{
			File f2 = new File(f1, filrInfor1);
			if (f2.isDirectory())
			{
				count++;
				System.out.println(filrInfor1);
			}

		}
		System.out.println("No is" + count);

	}
}
