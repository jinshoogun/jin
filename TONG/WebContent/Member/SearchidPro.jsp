<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="DATADB.bean.*"%>

<html>
<head>
<title>아이디 찾기</title>
</head>

<%
	request.setCharacterEncoding("EUC-KR");
%>

<%
	String name = request.getParameter("m_name");
	String birth = request.getParameter("m_birth");

	DAO manager = DAO.getInstance();
	String id = manager.SearchId(name, birth);
	
	try {
%>
<body bgcolor="white">
	<center>
		<form method="post" action="main.jsp">
			<%
				if (id == null) {
			%>이름 또는 생년월일이 틀렸습니다
			
			<p>
				<input type="submit" value="메인으로">

				<%
					} else  {
				%>
				<%=name%>님의 아이디에는<b><%=id%></b>입니다
			<p>
				<input type="button" value="다시입력하기"
					onclick="javascript:window.location='SearchidForm.jsp'">
					<input type="button" value="확인"
					onclick="javascript:window.location='main.jsp'">
				<%
					}
				%>
			
		</form>
	</center>
</body>
<%
	} catch (Exception e) {
	}
%>
</html>




