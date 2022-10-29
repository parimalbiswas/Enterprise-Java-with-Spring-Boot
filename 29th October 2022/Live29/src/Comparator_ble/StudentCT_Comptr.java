package Comparator_ble;

import java.util.Comparator;

public class StudentCT_Comptr implements Comparator<StudentCT>
{

	@Override
	public int compare(StudentCT o1, StudentCT o2)
	{
		// TODO Auto-generated method stub
		if (o1.age > o2.age)
		{
			return +1;
		}
		else if (o1.age < o2.age)
		{
			return -1;
		}
		else
		{
			return 0;
		}
	}

}
