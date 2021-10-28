package program;

import java.util.Arrays;
import java.util.List;

public class SortTheNumberBasedOnUnitDigit {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(25, 18, 91, 44, 56, 21, 441, 991, 331);

		list.sort((n1, n2) -> {
			int r1 = n1 % 10;
			int r2 = n2 % 10;

			if (r1 == r2) {
				n1 /= 10;
				n2 /= 10;
				return n1 - n2;
			}
			return (r1) - (r2);
		});

		list.forEach(System.out::println);
	}

}
