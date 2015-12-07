<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<% 

request.setCharacterEncoding("EUC-KR");%>

<html>
<head>
<title>아이디 찾기</title>
</head>
<body bgcolor="white">

	<form method="post" action="SearchidPro.jsp">
		<table cellspacing="1" cellpadding="1" width="260" border="1"
			align="center">

			<tr height="30">
				<td width="110" bgcolor="white" align="center">이름</td>
				<td width="150" bgcolor="white" align="center"><input
					type="text" name="m_name" size="18"></td>
			</tr>

			<tr height="30">
				<td width="100" align="center" bgcolor="white">생년월일</td>
				<td width="150" align="center" bgcolor="white"><input
					type="text" name="m_birth" size="7" maxlength="7">예)910111</td>
			</tr>
			
			<tr height="30">
				<td colspan="2" align="middle" bgcolor="white"><input
					type="button" value="메인으로"
					onclick="javascript:window.location='main.jsp'"> <input
					type="submit" value="찾기"></td>
			</tr>
		</table>
	</form>
</body>
</html>