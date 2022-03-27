package course.the2nd;

import java.util.stream.IntStream;

public class Task2AnotherSolution {
	public static void main(String[] args) {
//		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
//		Optional<Integer> total = list.stream().parallel().reduce((v1, v2) -> v1 + v2);

		System.out.println(IntStream.rangeClosed(1,10).sum());
//		System.out.println("１から10の合計" + ":" + total.get());

	}
}
