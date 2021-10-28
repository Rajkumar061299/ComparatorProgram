package program;

import java.util.Map;
import java.util.TreeMap;

public class Keypad {

	public static int presses(String phrase) {
		
		if(phrase==null) return 0;
		if(phrase.length()==0) return 0;
		if(phrase.equals("")) return 0;
		Map<Character, Integer> hashmap = new TreeMap<>();

		hashmap.put(' ', 1);
		hashmap.put('*', 1);
		hashmap.put('#', 1);
		int j = 0;
		for (int i = 'A'; i <= 'R'; i++) {

			hashmap.put((char) i, ++j);
			if (j == 3)
				j = 0;
		}

		hashmap.put('S', 4);
		hashmap.put('T', 1);
		hashmap.put('U', 2);
		hashmap.put('V', 3);
		hashmap.put('W', 1);
		hashmap.put('X', 2);
		hashmap.put('Y', 3);
		hashmap.put('Z', 4);

		int sum = 0;
		char[] array = phrase.toCharArray();

		for (int i = 0; i < array.length; i++) {
			if (Character.isAlphabetic(array[i]))
				sum += hashmap.get(array[i]);
			else {
				if(Character.getNumericValue(array[i])==0) sum+=2;
				else {
				sum += 4;
				}
			}
		}
		return sum;
	}
	
	  static String[] keys = {"1", "ABC2", "DEF3", "GHI4", "JKL5", "MNO6", "PQRS7", "TUV8", "WXYZ9", "*", " 0", "#"};
	  
	  public static int presses1(String phrase) {
	    int nPresses = 0;
	    
	    for (char c : phrase.toUpperCase().toCharArray())
	      for (String s : keys)
	          nPresses += s.indexOf(c) + 1;
	    return nPresses;
	  }

	public static void main(String[] args) {

		System.out.println(
		presses("WHERE DO U WANT 2 MEET L8R"));
	}

}
