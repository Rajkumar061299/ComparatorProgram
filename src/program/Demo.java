package program;

import java.util.Arrays;

// [1,-2,3,-4,5]

public class Demo {

	private static int[] solution(int[] arr) {

		Arrays.stream(arr).map(num -> num * -1).forEach(System.out :: println);
		
		return Arrays.stream(arr).map(num -> num * -1).toArray();

	}

	public static void main(String[] args) {

		solution(new int[] { 1, -2, 3, -4, 5 });
	}
}
