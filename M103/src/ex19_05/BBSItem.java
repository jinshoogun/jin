package ex19_05;
// �⺻���� ����ȭ ����  Ŭ���� Ÿ���� �ʵ�� ��� ����ȭ �����մϴ�.
// Object�� java.io.Serializable �������̽��� �������� �ʱ� ������ ����ȭ ���� Ŭ������ �ƴմϴ�.

public class BBSItem implements java.io.Serializable { //�Խù� Ŭ����
	static int itemNum = 0; // �Խù��� �� - ���� �ʵ�� ����ȭ ����� ���� �ʽ��ϴ�. ����ȭ �Ǵµ� ������ �ǰŴ� ���� �߻� X
	String writer; // �۾��� : �ν��Ͻ� �ʵ�� ����ȭ ����� �˴ϴ�.
	transient String passwd; // �н����� - transient Ű���� ���� �ν��Ͻ� �ʵ�� ����ȭ ����� ���� �ʽ��ϴ�.����ȭ �Ǵµ� ������ �ǰŴ� ���� �߻� X
	String title;   // ���� - �ν��Ͻ� �ʵ�� ����ȭ ����� �˴ϴ�.
    String content; // ����  - �ν��Ͻ� �ʵ�� ����ȭ ����� �˴ϴ�.
    Object addAttachment; // ÷������ - ����ȭ ����� �ƴմϴ�. (����ȭ��ü�� ���� �����Ƿ� ���� �߻�!)
    BBSItem(String wrier, String passwd, String title, String content){
    	 this.writer = wrier;
    	 this.passwd = passwd;
    	 this.title = title;
    	 this.content = content;
    	 itemNum++;
     }
     void modifyContent(String content, String passwd) {
    	 if (!passwd.equals(this.passwd))
    		 return;
    	 this.content = content;
     }
     void addAttachment(Object addAttachment) {
    	 this.addAttachment = addAttachment;
     }

}
