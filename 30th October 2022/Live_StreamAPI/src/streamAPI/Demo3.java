package streamAPI;

import java.util.Arrays;
import java.util.List;

public class Demo3
{
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(5, 2, 1, 8, 3, 4);

		int res = list.stream().filter(n -> n % 2 == 1).map(n -> n * 2).reduce(0, (a, b) -> a + b);

		System.out.println(res);

		System.out.println("----------------------------");

		List<Integer> list1 = Arrays.asList(5, 2, 1, 8, 3, 4);

		int res1 = list1.parallelStream().filter(n -> n % 2 == 1).map(n -> n * 2).reduce(0, (a, b) -> a + b);

		System.out.println(res1);

	}
}
