<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
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