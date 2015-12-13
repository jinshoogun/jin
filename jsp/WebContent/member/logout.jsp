<% 
	session.invalidate(); //세션을 모두 지우기 때문에 로그아웃?
	response.sendRedirect("main.jsp");
	%>