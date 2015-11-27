<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
<head>
</head>
<body>
<center>
<form method="post" action="adminProc.jsp">
<table border=1>
<tr>
  <td colspan=2 align=center>* 인트라넷 (관리자) 로그인 *</td>
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