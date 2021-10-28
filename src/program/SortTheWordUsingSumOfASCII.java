package program;

import java.util.Arrays;
import java.util.Comparator;

public class SortTheWordUsingSumOfASCII {

	static final Comparator<String> comparator = Comparator.comparing((String s) -> s.chars().sum())
			;

	public static String[] ASCIIbetize1(String str) {

		Arrays.stream(str.split(" ")).sorted(comparator).distinct().forEach(System.out::println);
		return Arrays.stream(str.split(" ")).sorted(comparator).distinct().toArray(String[]::new);
	}


	public static void main(String[] args) {

		System.out.println(ASCIIbetize1("raj ram ramesh reka rekaa "));
	}
}
