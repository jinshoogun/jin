package Q10_14;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;

public class Q2 {
	public static void main(String[] args) {
		HashSet<Integer> set = new HashSet<Integer>();
		Random r = new Random();

		for (int i = 0; i < 6; i++)
			set.add(r.nextInt(45) + 1);

		int i = 0;
		Iterator<Integer> itorator = set.iterator();
		while (itorator.hasNext()) {
			System.out.printf("set  = %d %d\n", ++i, itorator.next());
		}
		System.out.println("set Size = " + set.size());
	}
}
