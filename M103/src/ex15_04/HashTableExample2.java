package ex15_04;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;



public class HashTableExample2 {
	public static void main(String args[]) {

		Hashtable<String, String> ht = new Hashtable <String, String> ();

		
		ht.put("����", "StrawBerry");
		ht.put("���", "Apple");
		ht.put("����", "Grape");

		Object obj = ht.get("����");

		System.out.println("������ �� -> " + obj);
		System.out.println("������ �� -> " + obj.toString());
		
		//�ؽ� ���̺��� ���� Ű�� �̿��ؼ� ��´�.
		String Val = (String)ht.get("����");
		
		if(Val != null){
			System.out.println("���� -> " + Val);	
		}
		
		// �콬 ���̺��� Ű ��ҵ鿡 ���� Enumeration ��ü ��ȯ
		Enumeration <String> Enum = ht.keys();
		while (Enum.hasMoreElements()){ //���ʸ��� ����ؼ� �Ʒ��� ���� �����ص� �ȴ�.
		// String k = (String)Enum.nextElement(); 
			String k = Enum.nextElement(); 
			String v = ht.get(k); //���ʸ��� ����ؼ� �Ʒ��� ���� �����ص� �ȴ�.
        // String v = (String)Enum.nextElement(); 	
			System.out.println(k + " : " + v);
		}
	}
}
