package test.mvc.action;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteProAction implements SuperAction{
	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException {
	return "/12_07/form.jsp";
	}

}
