package test.mvc.action;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public interface SuperAction {
	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException; 
}

