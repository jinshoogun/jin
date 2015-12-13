package Q10_14;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Q5 {
	public static void main(String[] args) {

		Set hs = new HashSet();
		Random r = new Random();

		do {
		hs.add(r.nextInt(45) + 1);
		
		} while (hs.size() < 6);
		System.out.println(hs);
	}
}
