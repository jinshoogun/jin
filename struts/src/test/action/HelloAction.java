package test.action;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;

public class HelloAction implements ServletRequestAware{
private DTO dto;

	private HttpServletRequest request;
	public String execute() { // �ڹ��� main �޼ҿ������� 
		String id = request.getParameter("id");
		System.out.println(id);
		//test �޼ҿ��带 ȣ���ϰ� ���� ���? web.xml action name="hello" class="test.action.HelloAction" method ="test">�� �߰� �۾� �ǽ��ϸ� �˴ϴ�.
		return "success"; // return�� �־�� �ǰ� �⺻�� success�� �Ǿ�� �մϴ�.
		// ��ΰ� ���ۼ� struts.xml���� �ۼ�
		// return �̸��� �ٲٰ� ���� ���? web.xml <result name = "ok">�� �߰� �۾� �ǽ��ϸ� �˴ϴ�.
	}
	public void setServletRequest(HttpServletRequest arg0){
		this.request= arg0;
	}
}
