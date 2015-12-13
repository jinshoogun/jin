package ex12_01;

//printStackTrace메소드 사용예

public class ExceptionExample7 {
	public static void main(String args[]) {
		try {
			int arr[] = new int[0];
			System.out.println("합계" + getTotal(arr));
			System.out.println("평균" + getAverage(arr));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	static double getAverage(int arr[]) throws Exception { // 에러시 날 호출했던 곳 (try-catch문으로!)
		if (arr.length == 0)
			throw new Exception("getAverage() : 비어있는 배열입니다.");
		return getTotal(arr) / arr.length;

	}

	static int getTotal(int arr[]) throws Exception { // 에러시 날 호출했던 곳 (try-catch문으로!)
		if (arr.length == 0)
			throw new Exception("getTotal() : 비어있는 배열입니다.");
		int total = 0;
		for (int num : arr)
			total += num;
		return total;
	}
}
