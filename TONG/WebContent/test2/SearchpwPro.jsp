<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import ="DATADB.bean.*" %>
    <%@ include file="../test2/mainform5.jsp"%>
<html>
<head><title>��й�ȣ ã��</title></head>

<% request.setCharacterEncoding("euc-kr"); %>

<% String id= request.getParameter("m_id");
String birth=request.getParameter("m_birth");

DAO manager = DAO.getInstance();
String pw = manager.SearchPw(id,birth);

try
{
%>

<body bgcolor="white" >
<center>
<form method="post" action="mainform6.jsp" >

<%if(pw == null) { %>���̵� �Ǵ� ��������� Ʋ�Ƚ��ϴ�.<p>
<input type="submit" value="��������">

<%}else{ %>
<%=id%>�Կ� ��й�ȣ��  <b><%=pw%></b>�Դϴ� .<p>





<input type="button" value="�ٽ� �Է��ϱ� " onclick="javascript:window.location='SearchpwForm.jsp'">
<input type="button" value="�α���"
					onclick="javascript:window.location='mainform6.jsp'">

<%} %>
</form></center></body>
<% }catch (Exception e) {} %>
</html>