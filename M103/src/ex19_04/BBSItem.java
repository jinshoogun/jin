package ex19_04;
//transient Ű���� : ����ȭ���� ���� ��ų �ʵ带 ǥ���ϴ� Ű����
// ������� : ObjectOutputExample3.java -> ObjectInputExample3

public class BBSItem implements java.io.Serializable { //�Խù� Ŭ����
	static int itemNum = 0; // �Խù��� �� - ���� �ʵ�� ����ȭ ����� ���� �ʽ��ϴ�.
	String writer; // �۾��� : �ν��Ͻ� �ʵ�� ����ȭ ����� �˴ϴ�.
	transient String passwd; // �н����� - transient Ű���� ���� �ν��Ͻ� �ʵ�� ����ȭ ����� ���� �ʽ��ϴ�.
	String title;   // ���� - �ν��Ͻ� �ʵ�� ����ȭ ����� �˴ϴ�.
    String content; // ����  - �ν��Ͻ� �ʵ�� ����ȭ ����� �˴ϴ�.
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
}
