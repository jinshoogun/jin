package test.mvc.action;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class MainAction implements CommandAction {
	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException {
		try {
			HttpSession session = request.getSession();
			if (session.getAttribute("memId") != null) {
				String id = (String) session.getAttribute("memId");
				request.setAttribute("id", id);
			} else {
				request.setAttribute("id", null);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return "/member1/main.jsp";
	}

}
