<% 
	session.invalidate(); 
	response.sendRedirect("main.jsp");
	%>
	
	<%-- 이 과정에서 세션을 종료가 되기 때문에 서버와 로그인 관계가 끊기게 되어집니다. 그리고 main.jsp로  이전의 request값이 없이 전달을 하게 됩니다.--%>