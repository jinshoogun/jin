<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<% 

request.setCharacterEncoding("EUC-KR");%>

<html>
<head>
<title>��й�ȣ ã��</title>
</head>
<body bcolor="white">

	<form method="post" action="SearchpwPro.jsp">
		<table cellspacing="1" cellpadding="1" width="260" border="1"
			align="center">

			<tr height="30">
				<td width="110" bgcolor="white" align="center">���̵�</td>
				<td width="150" bgcolor="white" align="center"><input
					type="text" name="m_id" size="18"></td>
			</tr>
			<tr height="30">
				<td width="110" bgcolor="white" align="center">�������</td>
				<td width="150" bgcolor="white" align="center"><input
					type="text" name="m_birth" size="7" maxlength="7">��)910111
				</td>
			</tr>

			<tr height="30">
				<td colspan="2" align="middle" bgcolor="white"><input
					type="button" value="����"
					onclick="javascript:window.location='main.jsp'"> <input
					type="submit" value="ã��"></td>
			</tr>
		</table>
	</form>
</body>
</html>