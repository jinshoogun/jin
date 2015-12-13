<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import ="DATADB.bean.*" %>

<html>
<head><title>비밀번호 찾기</title></head>

<% request.setCharacterEncoding("EUC-KR"); %>

<% String id= request.getParameter("m_id");
String birth=request.getParameter("m_birth");

DAO manager = DAO.getInstance();
String pw = manager.SearchPw(id,birth);

try
{
%>

<body bgcolor="white" >
<center>
<form method="post" action="main.jsp" >

<%if(pw == null) { %>아이디 또는 생년월일이 틀렸습니다.<p>
<input type="submit" value="메인으로">

<%}else{ %>
<%=id%>님에 비밀번호는  <b><%=pw%></b>입니다 .<p>





<input type="button" value="다시 입력하기 " onclick="javascript:window.location='SearchpwForm.jsp'">
<input type="button" value="로그인"
					onclick="javascript:window.location='main.jsp'">

<%} %>
</form></center></body>
<% }catch (Exception e) {} %>
</html>