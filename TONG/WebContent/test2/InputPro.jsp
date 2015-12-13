<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "DATADB.bean.DAO" %>
<%@ page import = "java.sql.Timestamp" %>


<% request.setCharacterEncoding("utf-8"); %>

<jsp:useBean id="membership" class="DATADB.bean.DTO" >
   <jsp:setProperty name="membership" property="*" />
</jsp:useBean>

<%
	membership.setM_reg(new Timestamp(System.currentTimeMillis()));
	DAO manager = DAO.getInstance();
	manager.insertMembership(membership);
	
  response.sendRedirect("mainform6.jsp");
  %>
  
