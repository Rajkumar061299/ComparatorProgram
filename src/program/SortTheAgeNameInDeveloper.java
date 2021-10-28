package program;

import java.util.Comparator;
import java.util.List;

public class SortTheAgeNameInDeveloper {

	public static void main(String[] args) {

		List<Developer> list = Developer.getDevelopers();

		list.sort(

				Comparator.comparingInt(Developer::getAge)

						.thenComparing(Developer::getName)

		);

		list.forEach(System.out::println);

	}

}
