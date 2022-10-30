package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Demo2
{
	public static void main(String[] args)
	{

		List<Integer> list = Arrays.asList(5, 2, 1, 8, 3, 4);

//		Predicate<Integer> predicate = new Predicate<Integer>()
//		{
//
//			@Override
//			public boolean test(Integer t)
//			{
//				// TODO Auto-generated method stub
//				return t % 2 == 1;
//				
//			}
//		};

		Stream<Integer> stream1 = list.stream();

		Stream<Integer> stream2 = stream1.filter(n -> n % 2 == 1);

		Stream<Integer> stream3 = stream2.map(n -> n * 2);

		int result = stream3.reduce(0, (a, b) -> a + b);

		System.out.println(result);

//		stream3.forEach(s -> System.out.println(s));

	}
}
