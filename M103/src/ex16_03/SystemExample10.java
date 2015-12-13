package ex16_03;

//배열 복사의 예
public class SystemExample10 {
	public static void main(String args[]) {
		char arr1[] = { '가', '나', '다', '라', '마', '바', '아', '자', '차', '카', '타', '파', '하' };
		char arr2[] = { 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K' };
		// System.arrcopy(원본배열, 원본항목 시작위치, 복사대상 배열, 복사대상 항목 시작위치, 복사할 항목의 수)

		System.arraycopy(arr1, 10, arr2, 2, 3);
		// arr1[10]~arr1[12]의 값을 arr2[2]~arr2[4]에 복사

		for (char ch : arr2)
			System.out.println(ch);
	}

}
