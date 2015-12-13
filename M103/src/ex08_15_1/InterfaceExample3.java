package ex08_15_1;

public class InterfaceExample3 {
	public static void main(String args[]) {
		Lendable arr[] = new Lendable[3]; //인터페이스 타입의 배열
		// 배열에 여러타입의 객체 주소 저장
		arr[0] = new SeparateVolume("883ㅇ", "푸코의 전자", "에코");
		arr[1] = new SeparateVolume("609.2", "서양미술사", "곰브리치");
		arr[2] = new AppCDInfo("02-17", "XML을 위한 자바 프로그래밍");
		checkOutAll(arr, "윤지해", "20060315");
		arr[0].checkIn();

	} static void checkOutAll(Lendable arr[], String borrower, String date) {
		for (int cnt = 0; cnt < arr.length; cnt++) {
			arr[cnt].checkOut(borrower, date);

		}
		}
      static void checkInAll(Lendable arr[], String borrower, String date) {
				for (int cnt = 0; cnt < arr.length; cnt++) {
					arr[cnt].checkIn();
				}
	}
}
