package program;

import java.util.Arrays;

public class WhoLikesIt {

	public static final String like = " like this";

	public static String likesIt(String... names) {

		/*
		 * [] --> "no one likes this" ["Peter"] --> "Peter likes this" ["Jacob", "Alex"]
		 * --> "Jacob and Alex like this" ["Max", "John", "Mark"] -->
		 * "Max, John and Mark like this" ["Alex", "Jacob", "Mark", "Max"] -->
		 * "Alex, Jacob and 2 others like this"
		 */
		if (names.length == 0)
			return "no one likes this";
		if (names.length == 1)
			return names[0] + " likes this";
		if (names.length == 2)
			return names[0] + " and " + names[1] + like;
		if(names.length == 3)
			return names[0] + ", " + names[1] + " and " + names[2] + like;
		else {
			return names[0] + ", " + names[1] + " and "+ Integer.toString(names.length-2) +" others" + like;
		}
	}
		
	public static void main(String[] args) {

		System.out.println(likesIt("raj", "ram", "ramesh"));
	}

}
