package test.action;

public class HelloAction {
	private String msg;
	public void setMsg(String msg){
		this.msg = msg;
	}
	public String execute() { // �ڹ��� main �޼ҿ������� 
		//test �޼ҿ��带 ȣ���ϰ� ���� ���? web.xml action name="hello" class="test.action.HelloAction" method ="test">�� �߰� �۾� �ǽ��ϸ� �˴ϴ�.
		//System.out.println("execute"); - ��Ʈ�ѷ��� ���ư��� ������ ���ͼ��͸� ������ �� �����̴�
		System.out.println("execute");
		return "success"; // return�� �־�� �ǰ� �⺻�� success�� �Ǿ�� �մϴ�.
		// ��ΰ� ���ۼ� struts.xml���� �ۼ�
		// return �̸��� �ٲٰ� ���� ���? web.xml <result name = "ok">�� �߰� �۾� �ǽ��ϸ� �˴ϴ�.
	}
	public String getMsg(){
	 return msg;	
	}
	public int getNum(){
		return 100;
	}
}
