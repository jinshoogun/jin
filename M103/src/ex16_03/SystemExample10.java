package ex16_03;

//�迭 ������ ��
public class SystemExample10 {
	public static void main(String args[]) {
		char arr1[] = { '��', '��', '��', '��', '��', '��', '��', '��', '��', 'ī', 'Ÿ', '��', '��' };
		char arr2[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K' };
		// System.arrcopy(�����迭, �����׸� ������ġ, ������ �迭, ������ �׸� ������ġ, ������ �׸��� ��)

		System.arraycopy(arr1, 10, arr2, 2, 3);
		// arr1[10]~arr1[12]�� ���� arr2[2]~arr2[4]�� ����

		for (char ch : arr2)
			System.out.println(ch);
	}

}
