package ex07_02;

public class ObjectExample1 {
	public static void main(String args[]){
		StringBuffer obj;
		obj = new StringBuffer("Hey, Java");
		obj.deleteCharAt(1); // �ι�° �迭 ���� ����
		obj.deleteCharAt(1);
		obj.insert(1, 'i'); // �ι�° �迭�� �̸��߰�
		System.out.println(obj);
	}

}
