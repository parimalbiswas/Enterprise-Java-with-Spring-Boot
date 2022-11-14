package FileRederWriter;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class F3
{

	public static void main(String[] args) throws IOException
	{
		BufferedWriter bw1 = new BufferedWriter(new FileWriter("F:\\\\Ntn\\\\info.txt"));
		bw1.write(75);
		bw1.write("\n");
		bw1.write("XXXXXXXX");

		bw1.flush();
		bw1.close();
	}
}
