package program;

import java.util.Comparator;
import java.util.List;

public class SortTheAgeInDeveloper {

	public static void main(String[] args) {

		List<Developer> list = Developer.getDevelopers();

		//list.sort((d1, d2) -> d1.getAge() - d2.getAge());
		
		list.sort(Comparator.comparingInt(Developer :: getAge));
		
		list.forEach(System.out::println);

	}
}
