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
			alert("���̵� �ٽ� �Է��ϼ���");
			return false;
		}
		if (!admininput.a_password.value) {
			alert("��й�ȣ�� �ٽ� �Է��ϼ���");
			return false;
		}
	}
</script>
<form method="post" name = admininput action="adminProc.jsp"  onSubmit = "return checkinput(this.form)">

<table border=1 align = "center">
<tr>
  <td colspan=2 align="center">* ��Ʈ��� (������) �α��� *</td>
</tr>
<tr>
  <td>���̵�</td>
  <td><input type="text" name="a_id" size=20></td>
</tr>
<tr>
  <td>��й�ȣ</td>
  <td><input type="password" name="a_password" size=20></td>
</tr>
<tr>
  <td colspan=2 align=center>
    <input type="submit" value="Ȯ��">
    <input type="reset"  value="���">
  </td>
</tr>
</table>
</form>
</center>
</body>
</html>