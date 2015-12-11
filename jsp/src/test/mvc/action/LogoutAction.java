package test.mvc.action;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class LogoutAction implements CommandAction {
	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		try {
			HttpSession session = request.getSession();
			session.invalidate();
		} catch (Exception e) {
			e.printStackTrace();
		}

		return "/member1/logout.jsp";
	}
}
