package test.mvc.action;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import ch11.logon.LogonDBBean;
import ch11.logon.LogonDataBean;

public class ModifyFromAction implements CommandAction {
	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException {

	    try {
	    	request.setCharacterEncoding("euc-kr");
			HttpSession session = request.getSession();
		    String id = (String)session.getAttribute("memId");
		    
		    LogonDBBean manager = LogonDBBean.getInstance();
		    LogonDataBean c = manager.getMember(id);
			   request.setAttribute("id", c.getId());
			   request.setAttribute("passwd", c.getPasswd());
			   request.setAttribute("name", c.getName());
			   request.setAttribute("Jumin1", c.getJumin1());
			   request.setAttribute("Jumin2", c.getJumin2());
			   request.setAttribute("Email", c.getEmail());
			   request.setAttribute("blog", c.getBlog());
			 
		} catch (Exception e) {

			e.printStackTrace();
		}
		
		
		
		
		
		return "/member1/modifyFrom.jsp";
	}


}
