package test.mvc.action;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ModifyFromAction implements CommandAction {
	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		return "/member1/modifyFrom.jsp";
	}


}
