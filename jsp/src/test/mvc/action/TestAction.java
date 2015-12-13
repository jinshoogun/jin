package test.mvc.action;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class TestAction implements SuperAction{
	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException {
  	  String id = request.getParameter("id");
  	  String pw = request.getParameter("pw");
  	  //DAO
  	  HttpSession session = request.getSession(); 
  	  request.setAttribute("memId", "1");
  	  session.setAttribute("memId", "2");
  	  request.setAttribute("pw", pw);
  	  return "/12_07/test.jsp";
	}
}