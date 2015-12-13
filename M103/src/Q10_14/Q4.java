package Q10_14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Q4 {
	public static void main(String args[]) {
		HashSet<Integer> set = new HashSet<Integer>();
		Random r = new Random();
		while (set.size() < 6) {

			set.add(r.nextInt(45) + 1);

		}
		Iterator<Integer> iterator = set.iterator();
		for (int i = 0; i < set.size(); i++) {
			int a = (int) iterator.next();
			System.out.println(a);
		}
	}
}
