package ex08_09;

abstract class MessageSender { // Ŭ���� ��ü�� �߻�Ŭ������ ����
	String title; // ����
	String senderName; // �߼����̸�

	MessageSender(String title, String senderName) {
		this.title = title;
		this.senderName = senderName;
	}

	abstract void sendMessage(String recipient);
	// �߻� �޼ҵ� - �޼����� �۽��Ѵ�.
}
// �߻� �޼ҵ� ������?
// ���� Ŭ�������� ��ӹ��� �߻�޼ҵ带 �ݵ�� �����ϵ��� ����� ���ؼ��̱� �����̴�.