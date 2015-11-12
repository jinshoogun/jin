<%@ page contentType="text/html; charset=euc-kr" %>
<%@ page import = "DATADB.bean.DAO" %>


<% request.setCharacterEncoding("euc-kr"); %>

<jsp:useBean id="membership" class="DATADB.bean.DTO" >
   <jsp:setProperty name="membership" property="*" />
</jsp:useBean>

<%
	
	DAO manager = DAO.getInstance();
	manager.insertMembership(membership);

  response.sendRedirect("loginForm.jsp");
  %>