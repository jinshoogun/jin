package test.mvc.action;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//��û �Ķ���ͷ� ��ɾ �����ϴ� ����� ���� �������̽�
public interface CommandAction {
	public String execute(HttpServletRequest request, HttpServletResponse response) throws ServletException; 
}
