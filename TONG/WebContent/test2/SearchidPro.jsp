<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="DATADB.bean.*"%>
    <%@ include file="../test2/mainform5.jsp"%>
<html>
<head>
<title>���̵� ã��</title>
</head>

<%
	request.setCharacterEncoding("euc-kr");
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
		<form method="post" action="mainform6.jsp">
			<%
				if (id == null) {
			%>�̸� �Ǵ� ��������� Ʋ�Ƚ��ϴ�
			
			<p>
				<input type="submit" value="��������" onclick="javascript:window.location='mainform6.jsp'">

				<%
					} else  {
				%>
				<%=name%>���� ���̵��<b><%=id%></b>�Դϴ�
			<p>
				<input type="button" value="�ٽ��Է��ϱ�"
					onclick="javascript:window.location='SearchidForm.jsp'">
					<input type="button" value="Ȯ��"
					onclick="javascript:window.location='mainform6.jsp'">
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




