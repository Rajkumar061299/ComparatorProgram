package program;

import java.util.Arrays;

public class FlattenAndSort {

	public static int[] flattenAndSort(int[][] array) {

	//	return Arrays.stream(array).flatMapToInt(num -> Arrays.stream(num)).sorted().toArray();

		return Arrays.stream(array).flatMapToInt(Arrays :: stream).sorted().toArray();
	}

	public static void main(String[] args) {

		System.out.println(flattenAndSort(
				new int[][] { { 111, 999 }, { 222 }, { 333 }, { 444 }, { 888 }, { 777 }, { 666 }, { 555 } }));

		System.out.println(flattenAndSort(new int[][] {}));
	}
}
