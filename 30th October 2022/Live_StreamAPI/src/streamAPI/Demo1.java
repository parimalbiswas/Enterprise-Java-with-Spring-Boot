package streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class Demo1
{

	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(5, 2, 1, 8, 0, 4);

		Stream<Integer> stream = list.stream();

		System.out.println(stream);

		stream.forEach(e1 -> System.out.println(e1));

		System.out.println("----------------");

		Stream<Integer> stream1 = list.stream();

		Consumer<Integer> consumer = new Consumer<Integer>()
		{

			@Override
			public void accept(Integer t)
			{
				System.out.println(t);

			}
		};

		stream1.forEach(consumer);

		System.out.println("----------------");

		Stream<Integer> stream2 = list.stream();

		stream2.forEach(n -> System.out.println(n));

		////////////////////////////////////////////////////////
//		Stream<Integer> stream = list.stream();

//		stream.forEach(s -> System.out.println(s));
//		stream.forEach(s -> System.out.println(s)); // Can't use used stream again
	}
}
