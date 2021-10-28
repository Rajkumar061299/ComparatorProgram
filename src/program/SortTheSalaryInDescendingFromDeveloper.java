package program;

import java.util.Comparator;
import java.util.List;

public class SortTheSalaryInDescendingFromDeveloper {

	public static void main(String[] args) {

		List<Developer> list = Developer.getDevelopers();

//		Comparator<Developer> comparator = (d1, d2) -> d1.getSalary().compareTo(d2.getSalary());
		
		/*
		 * Comparator<Developer> comparator = Comparator.comparing(d -> d.getSalary());
		 * 
		 * list.sort(comparator.reversed());
		 */
		
		Comparator<Developer> comparator = Comparator.
				comparing(Developer :: getSalary, (s1, s2) -> s2.compareTo(s1));

		list.sort(comparator);
		list.forEach(System.out::println);

	}

}
