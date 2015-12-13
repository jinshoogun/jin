package ex17_07;
//파이를 계산하는 쓰레드
public class CalcThread extends Thread {
	SharedArea sharedArea;
	public void run() {
		double total = 0.0;
		// 파이를 계산하는 부분
		
		for (int cnt = 1; cnt <100000000; cnt +=2)
			if (cnt /2%2  ==0)
				total += 1.0 /cnt;
		
			else
				total -= 1.0 /cnt;
		
		//계산 결과를 공유영역에 저장
		sharedArea.result = total *4;
		sharedArea.isReady = true; //계산이 끝날때 true를 결정됨 그전에는 false()
		//SharedArea 객체의 isReady 필드값을 true로 설정
	}
}

