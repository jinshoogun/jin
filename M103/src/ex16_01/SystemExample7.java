package ex16_01;
// �ý��� ������Ƽ�� ��� ������ ����ϴ� ���α׷�
import java.util.Properties;
public class SystemExample7 {
	public static void main(String args[]) {
		// �ý��� ������Ƽ�� ��� ������
		Properties props = System.getProperties();
		// ������ �ý��� ������Ƽ�� �����.
		props.list(System.out); //props ��ü�� �ִ� ��� ������Ƽ���� System.out���� ����մϴ�
	}

}
