<%@ page language="java" contentType="text/html; charset=EUC-KR"
   pageEncoding="EUC-KR"%>
<% 

request.setCharacterEncoding("EUC-KR");%>
<%@ include file = "../test2/mainform7.jsp" %>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<center>
<script language="javaScript">
	function checkinput(admininput) {
		var admininput = eval("document.admininput")
		if (!admininput.a_id.value) {
			alert("아이디를 다시 입력하세요");
			return false;
		}
		if (!admininput.a_password.value) {
			alert("비밀번호를 다시 입력하세요");
			return false;
		}
	}
</script>
<form method="post" name = admininput action="adminProc.jsp"  onSubmit = "return checkinput(this.form)">

<table border=1 align = "center">
<tr>
  <td colspan=2 align="center">* 인트라넷 (관리자) 로그인 *</td>
</tr>
<tr>
  <td>아이디</td>
  <td><input type="text" name="a_id" size=20></td>
</tr>
<tr>
  <td>비밀번호</td>
  <td><input type="password" name="a_password" size=20></td>
</tr>
<tr>
  <td colspan=2 align=center>
    <input type="submit" value="확인">
    <input type="reset"  value="취소">
  </td>
</tr>
</table>
</form>
</center>
</body>
</html>