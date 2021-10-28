package program;

import java.util.stream.IntStream;

public class KidoCount {

    public static int[] displayTheOddValue(int n) {
    	
    	System.out.println(Math.cbrt(135440716410000L));
    	return IntStream.rangeClosed(0,n)
    		.filter(num -> num%2 ==1).toArray();
		

    }

    public static void main(String[] args) {
		System.out.println(
    	displayTheOddValue(10));
	}
}
