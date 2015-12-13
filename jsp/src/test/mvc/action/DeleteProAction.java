package test.mvc.action;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ch11.logon.LogonDBBean;

public class DeleteProAction implements SuperAction {
	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException {

		try {
			request.setCharacterEncoding("euc-kr");
			
			HttpSession session = request.getSession();
			
			String id = (String) session.getAttribute("memId");
			String passwd = request.getParameter("passwd");
			
			LogonDBBean manager = LogonDBBean.getInstance();
			int check = manager.deleteMember(id, passwd);

			if (check == 1) {
				session.invalidate();

			}
			request.setAttribute("check", check);

		} catch (Exception e) {
			e.printStackTrace();
		}
		return "/member1/deletePro.jsp";
	}
}
