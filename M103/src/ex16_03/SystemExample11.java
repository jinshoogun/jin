package ex16_03;

//currentTimeMillis 사용예
// 시스템 시계로부터 현재의 시간을 불러오는 메소소소소오드
public class SystemExample11 {
	public static void main(String args[]) {
		long time1 = System.currentTimeMillis(); // 현재 시간 측정

		double total = 0.0;
		for (int cnt = 1; cnt < 1000000000; cnt += 2)
			if (cnt / 2 % 2 == 0)
				total += 1.0 / cnt;
			else
				total -= 1.0 / cnt;
		double pi = total * 4;
		
		long time2 = System.currentTimeMillis(); //현재시간 측정
		System.out.println("result = " + pi);
		System.out.printf("계산에 %d ms가 소요되었습니다. \n", time2 -time1);
		
	}
}
