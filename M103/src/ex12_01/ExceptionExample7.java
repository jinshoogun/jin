package ex12_01;

//printStackTrace�޼ҵ� ��뿹

public class ExceptionExample7 {
	public static void main(String args[]) {
		try {
			int arr[] = new int[0];
			System.out.println("�հ�" + getTotal(arr));
			System.out.println("���" + getAverage(arr));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static double getAverage(int arr[]) throws Exception { // ������ �� ȣ���ߴ� �� (try-catch������!)
		if (arr.length == 0)
			throw new Exception("getAverage() : ����ִ� �迭�Դϴ�.");
		return getTotal(arr) / arr.length;

	}

	static int getTotal(int arr[]) throws Exception { // ������ �� ȣ���ߴ� �� (try-catch������!)
		if (arr.length == 0)
			throw new Exception("getTotal() : ����ִ� �迭�Դϴ�.");
		int total = 0;
		for (int num : arr)
			total += num;
		return total;
	}
}
