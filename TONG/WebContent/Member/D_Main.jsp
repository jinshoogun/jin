<%@ page contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<% 

request.setCharacterEncoding("EUC-KR");%>

<html>
<head>
<title>�����̳� ���� �Դϴ�.</title>

</head>
<%
	try {
		if (session.getAttribute("d_id") == null)
		//null- �α����� �ȵǾ�����
		{
%>
<script language="javascript">
	function focusIt() {
		document.inform.d_id.focus(); //���繮��(document.)���ִ� inform�� ã�ƶ�. FOCUS=Ŀ��
	}

	function checkIt() {
		D_inputForm = eval("document.inform");
		if (!D_inputForm.d_id.value) {
			alert("���̵� �Է��ϼ���..");
			D_inputForm.d_id.focus();
			return false;
		}
		if (!D_inputForm.d_password.value) {
			alert("�н����带 �Է��ϼ���..");
			D_inputForm.d_password.focus();
			return false;
		}
	}
</script>
</head>
<img  src="C:\Users\�ҿ�\Desktop\JAVA\TONG\WebContent\Image\Tong1.jpg" width="150"
		height="100">
<body onLoad="focusIt();" bgcolor="white">
	<%
		// <body onLoad="�Լ���();"> �ش� �Լ��� �θ���.
	%>
	<table width=500 cellpadding="0" cellspacing="0" align="center"
		border="2">
		<tr>
			<td width="300" bgcolor=#FFA2A2 height="20">&nbsp;</td>

			<form name="inform" method="post" action="LoginPro.jsp"
				onSubmit="return checkIt();">
				<%
					// infotm�̸������� <form>����, loginPro.jsp ���̵� (�Ӽ� onSubmit�� <form>�� ����Ǳ��� �ش��Լ��� �����Ѵ�)
				%>

				<td bgcolor=#F15F5F width="100" align="right">���̵�</td>
				<td width="100" bgcolor=#FFDDDD><input type="text" name="d_id"
					size="15" maxlength="10"></td>
		</tr>
		<tr>
			<td rowspan="2" bgcolor=#FFE8FF width="300">�����̳� LOGIN</td>
			<td bgcolor=#C3ED60 width="100" align="right">�н�����</td>
			<td width="100" bgcolor=#5CD1E5><input type="password"
				name="d_password" size="15" maxlength="10"></td>
		</tr>
		<tr>
			<td colspan="3" bgcolor="silver" align="center"><input
				type="submit" name="Submit" value="�α���"> <input
				type="button" value="ȸ������"
				onclick="javascript:window.location='AllinputForm.jsp'">
				<input type="button" value="���̵�ã��"
					onclick="javascript:window.location='SearchidForm.jsp'">
					<input type="button" value="��й�ȣã��"
					onclick="javascript:window.location='SearchpwForm.jsp'"></td>
			</form>
		</tr>
	</table>
	<%
		} else { //�α����� �Ǿ�����
	%>
	<table width=500 cellpadding="0" cellspacing="0" align="center"
		border="1">
		<tr>
			<td width="300" bgcolor="silver" height="20">�������</td>

			<td rowspan="3" bgcolor="silver" align="center"><%=session.getAttribute("d_id")%>�����̳ʴ�
				<br> ȯ���մϴ�!
				<form method="post" action="D_logout.jsp">
					<input type="submit" value="�α׾ƿ�"> <input type="button"
						value="ȸ����������"
						onclick="javascript:window.location='D_modifyForm.jsp'">

				</form></td>
		</tr>
		<tr>
			<td rowspan="2" bgcolor="white" width="300">�Ӹ����Դϴ�.</td>
		</tr>
	</table>
	<br>
	<%
		}
		} catch (NullPointerException e) {
		}
	%>
</body>
</html>
