package ex18_05;
//BufferedInputStream 클래스를 이용하여 성능을 향상시키는 예

// 버퍼를 이요하여 바이트 입력 스트림의 성능을 향상시키는 클래스
// BufferedOutputStream 클래스의 출력버퍼는 512바이트로 기본 버퍼크기가 규정되어 있으며,
// BufferedInputStream 클래스의 입력 버퍼는 지정되어 있지 않지만 보통 2014바이트의 크기를 가진다.

import java.io.*;

public class BufferedInputExample1 {
	public static void main(String args[]) {
		if (args.length < 1) {
			System.out.println("Arguments 탭에서 output.txt를 입력하세요");
			return;
		}
		// 수정된 곳
		BufferedInputStream in = null;
		try {
			in = new BufferedInputStream(new FileInputStream(args[0]));
			// BufferedInputStream in2 = new BufferedInputStream(new
			// FileInputStream(args[0]), 1024);
			// 두번째 파라미터로 정수를 넘가주면 그 크기의 버퍼가 생성된다.
			byte arr[] = new byte[16];
			while (true) {
				// 버퍼크기 만큼 데이터를 한꺼번에 읽어온후 16바이트로 리턴
				int num = in.read(arr);
				if (num < 0)
					break;

				// 16진수 두자리 출력
				for (int cnt = 0; cnt < num; cnt++) {
					System.out.printf("%02X \n", arr[cnt]);
				}
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("파일이 존재하지 않습니다.");

		} catch (IOException ioe) {
			System.out.println("파일을 읽을 수가 없습니다.");

		} finally {
			try {
				in.close(); // 파일 종료

			} catch (Exception e) { // close메소드가 발생하는 예외처리
			}
		}
	}
}
