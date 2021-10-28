package program;

import java.util.List;

public class SortTheNameInDeveloper {

	public static void main(String[] args) {
		
		List<Developer> list = Developer.getDevelopers();
		
		list.sort((d1, d2) -> d1.getName().compareTo(d2.getName()));
		
		list.forEach(System.out :: println);
		
		

	}

}
