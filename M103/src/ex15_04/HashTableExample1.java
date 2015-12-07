package ex15_04;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

// Hashtable - ����ȭ ���� �ַ������ ���(����� ���� ����)
// null���� Key������ ������� �ʴ´�.
//  ��ĳ������ �������  Map�� �����ϸ� ������� �޼ҵ常 ����� �� �־� ���������� ������ ��ҵȴ�.
//  ht.keys()�� ������ ���Ѵ�.
//  2. Data�� ������ �� Key, Value�� ���ÿ� �����Ѵ�. ��, Key���� �ߺ����� �ʴ´�.
//  3. �� �ϳ��� null key, �������� null�� ���

public class HashTableExample1 {
	public static void main(String args[]) {

		// Map ht = new Hashtable(); //��ĳ����(��ӵ� �޼ҿ������常 ��� �����ϴ�.)
		//��ĳ�������� �����ϸ� �ڽ�(Hashtable)�� �ִ� keys()�޼ҵ带 ����� �� ���� ���� �߻�
		Hashtable ht = new Hashtable ();
		
		//�콬 ���̺�  (Ű/ �����͸� �Է��Ѵ�.)
		//�޼ҵ忡 ����
		
		ht.put("����", "StrawBerry");
		ht.put("���", "Apple");
		ht.put("����", "Grape");
		ht.put("�޷�", 10);
		//ht.put(null, 10);
		
		//�콬 ���̺��� ���� Ű�� ���� ��´�.
		Object obj = ht.get("����");
		//�ش� Ű�� �ƴ� ��� get�޼ҿ����带 ���� �����ϰ� ��ȯ���� Object���̴�.
		//������ String������ ���� ����Ѵ�. 
		//Ű�� �˶��� ����ϴ� ���
		
		System.out.println("������ �� -> " + obj);
		System.out.println("������ �� -> " + obj.toString());
		
		String Val = (String)ht.get("����");// �ٿ� ĳ����
	  //String val = (String)ht.get("�޷�"); //���� : �������� ���������� ���� �Ұ���

		
		if(Val != null){
			System.out.println("���� -> " + Val);	
		}
		
		//��ĳ�������� �����ϸ� �ڽ�(Hashtable)�� �ִ� key()�޼ҵ带 ����� �� ���� ���� �߻�

		Enumeration Enum = ht.keys();
		//�ذ��� : Hashtable ht = new Hashtable();
		// ��� Ű�� ���������� �������� �޼ҼҼҿ�������
		
		
		while (Enum.hasMoreElements()){ //Ű�� � �͵��� �ִ��� ���� ���Ҷ�, ������ ���� ���Ҷ�
			Object k = Enum.nextElement(); // Ű�� ���ؿ´�.
			Object v = ht.get(k); //Ű�� �ش��ϴ� ���� �����´�.
			System.out.println(k + " : " + v);
		}

		
	}

}
