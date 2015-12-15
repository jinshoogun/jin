package test.action;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts2.interceptor.ServletRequestAware;

public class HelloAction implements ServletRequestAware{
private DTO dto;

	private HttpServletRequest request;
	public String execute() { // 자바의 main 메소오오오드 
		String id = request.getParameter("id");
		System.out.println(id);
		//test 메소오드를 호출하고 싶을 경우? web.xml action name="hello" class="test.action.HelloAction" method ="test">를 추가 작업 실시하면 됩니다.
		return "success"; // return을 넣어야 되고 기본값 success로 되어야 합니다.
		// 경로값 미작성 struts.xml에서 작성
		// return 이름을 바꾸고 싶을 경우? web.xml <result name = "ok">를 추가 작업 실시하면 됩니다.
	}
	public void setServletRequest(HttpServletRequest arg0){
		this.request= arg0;
	}
}
