package ex15_10;

import java.util.HashSet;
import java.util.Iterator;

// �ߺ��� ������ ����
public class SetExample1 {
	public static void main(String args[]){
		HashSet<String> set = new HashSet<String>();
		set.add("�ڹ�");
		set.add("īǪġ��");
		set.add("����������");
		set.add("�ڹ�");
		
		System.out.println("����� �������� �� = " + set.size());
		Iterator<String> iterator = set.iterator();
		while(iterator.hasNext()) {
			String str = iterator.next();
			System.out.println(str);
			
		}
	}
}
