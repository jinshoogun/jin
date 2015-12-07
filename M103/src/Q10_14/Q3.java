package Q10_14;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Q3 {
		public static void main(String[] args) {
			Set s = new HashSet();
			Random r = new Random();
			int n;
			
			while(true){
				n = r.nextInt(45)+1;
				s.add(n);
				if(s.size() == 6){
					System.out.println(s);
					break;
				}
			}
		}
	}

