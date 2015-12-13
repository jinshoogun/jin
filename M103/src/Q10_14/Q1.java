package Q10_14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Q1 {
	public static void main(String args[]) {
		HashSet lotto = new HashSet();
		Random r = new Random();
		
		int size = 0;
		System.out.println("인생의 번호는?");
		
		while (size < 6) {
			lotto.add(r.nextInt(45) + 1);
			size = lotto.size();
		}
		
		Iterator iterator = lotto.iterator();
		while (iterator.hasNext()) {
			Object str = iterator.next();
			System.out.println(str);
		}
	}
}