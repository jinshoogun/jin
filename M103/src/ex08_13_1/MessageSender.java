package ex08_13_1;

abstract class MessageSender { // Ŭ���� ��ü�� �߻�Ŭ������ ����
	String title; // ����
	String senderName; // �߼����̸�

	MessageSender(String title, String senderName) {
		this.title = title;
		this.senderName = senderName;
	}

	abstract void sendMessage(String recipient); 
	///�� �޼ҵ带 �������� ������ Ÿ�Ը� ���� �޼ҵ尡 �ִ��� üũ�ϴµ� sendMessage�� ������ �����Ϸ����� ������ �߻��˴ϴ�.(������ Ư�������Դϴ�)
	// �߻� �޼ҵ� - �޼����� �۽��Ѵ�.
}
// �߻� �޼ҵ� ������?
// ���� Ŭ�������� ��ӹ��� �߻�޼ҵ带 �ݵ�� �����ϵ��� ����� ���ؼ��̱� �����̴�.
// ���� Ŭ������ �޼ҵ带 ȣ���ϴ� ô�ϸ鼭 �����Ϸ��� üũ�� ��������ϰ� ���α׷��� ����ɶ��� ����Ŭ������ �޼ҵ尡 ȣ��ǵ��� �ϴ� ��!
