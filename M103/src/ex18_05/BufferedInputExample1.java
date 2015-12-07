package ex18_05;
//BufferedInputStream Ŭ������ �̿��Ͽ� ������ ����Ű�� ��

// ���۸� �̿��Ͽ� ����Ʈ �Է� ��Ʈ���� ������ ����Ű�� Ŭ����
// BufferedOutputStream Ŭ������ ��¹��۴� 512����Ʈ�� �⺻ ����ũ�Ⱑ �����Ǿ� ������,
// BufferedInputStream Ŭ������ �Է� ���۴� �����Ǿ� ���� ������ ���� 2014����Ʈ�� ũ�⸦ ������.

import java.io.*;

public class BufferedInputExample1 {
	public static void main(String args[]) {
		if (args.length < 1) {
			System.out.println("Arguments �ǿ��� output.txt�� �Է��ϼ���");
			return;
		}
		// ������ ��
		BufferedInputStream in = null;
		try {
			in = new BufferedInputStream(new FileInputStream(args[0]));
			// BufferedInputStream in2 = new BufferedInputStream(new
			// FileInputStream(args[0]), 1024);
			// �ι�° �Ķ���ͷ� ������ �Ѱ��ָ� �� ũ���� ���۰� �����ȴ�.
			byte arr[] = new byte[16];
			while (true) {
				// ����ũ�� ��ŭ �����͸� �Ѳ����� �о���� 16����Ʈ�� ����
				int num = in.read(arr);
				if (num < 0)
					break;

				// 16���� ���ڸ� ���
				for (int cnt = 0; cnt < num; cnt++) {
					System.out.printf("%02X \n", arr[cnt]);
				}
			}
		} catch (FileNotFoundException fnfe) {
			System.out.println("������ �������� �ʽ��ϴ�.");

		} catch (IOException ioe) {
			System.out.println("������ ���� ���� �����ϴ�.");

		} finally {
			try {
				in.close(); // ���� ����

			} catch (Exception e) { // close�޼ҵ尡 �߻��ϴ� ����ó��
			}
		}
	}
}
