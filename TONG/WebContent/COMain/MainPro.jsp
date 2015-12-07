<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

<%@ page import = "Style.DAO" %>

<% request.setCharacterEncoding("EUC-KR");%>

<jsp:useBean id="article" scope="page" class="Style.DTO">
   <jsp:setProperty name="article" property="*"/>
</jsp:useBean>

<%
System.out.println(request.getParameter("gender1"));
if(request.getParameter("gender")!=null){
	int gender = Integer.parseInt(request.getParameter("gender"));	

	System.out.print(gender);
	session.setAttribute("gender", gender);
}

	
%>

<%



/* DAO dbPro = DAO.getInstance();
dbPro.MainChoose(article); */

//response.sendRedirect("MainForm.jsp");

%>
<script>

location.href="MainForm.jsp";
</script>