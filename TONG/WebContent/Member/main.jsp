<%@ page contentType="text/html; charset=euc-kr"%>

<html>
<head>
<title>�����Դϴ�..</title>

</head>
<%
	try {
		if (session.getAttribute("m_id") == null)
		//null- �α����� �ȵǾ�����
		{
%>
<script language="javascript">
	function focusIt() {
		document.inform.m_id.focus(); //���繮��(document.)���ִ� inform�� ã�ƶ�. FOCUS=Ŀ��
	}

	function checkIt() {
		InputForm = eval("document.inform");
		if (!InputForm.m_id.value) {
			alert("���̵� �Է��ϼ���..");
			InputForm.m_id.focus();
			return false;
		}
		if (!InputForm.m_password.value) {
			alert("���̵� �Է��ϼ���..");
			InputForm.m_password.focus();
			return false;
		}
	}
</script>
</head>

<body onLoad="focusIt();" bgcolor="white">
	<%
		// <body onLoad="�Լ���();"> �ش� �Լ��� �θ���.
	%>
	<table width=500 cellpadding="10" cellspacing="0" align="center"
		border="1">
		<tr>
			<td width="300" bgcolor=#FFA2A2 height="20">&nbsp;</td>

			<form name="inform" method="post" action="LoginPro.jsp"
				onSubmit="return checkIt();">
				<%
					// infotm�̸������� <form>����, loginPro.jsp ���̵� (�Ӽ� onSubmit�� <form>�� ����Ǳ��� �ش��Լ��� �����Ѵ�)
				%>

				<td bgcolor=#F15F5F width="100" align="right">���̵�</td>
				<td width="100" bgcolor=#FFDDDD><input type="text" name="m_id"
					size="15" maxlength="10"></td>
		</tr>
		<tr>
			<td rowspan="2" bgcolor=#FFE8FF width="300">�Ӹ��� �α��� ----></td>
			<td bgcolor=#C3ED60 width="100" align="right">�н�����</td>
			<td width="100" bgcolor=#5CD1E5><input type="password"
				name="m_password" size="15" maxlength="10"></td>
		</tr>
		<tr>
			<td colspan="3" bgcolor="silver" align="center"><input
				type="submit" name="Submit" value="�α���"> <input
				type="button" value="ȸ������"
				onclick="javascript:window.location='InputForm.jsp'"></td>
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

			<td rowspan="3" bgcolor="silver" align="center"><%=session.getAttribute("m_id")%>����
				<br> �湮�ϼ̽��ϴ�
				<form method="post" action="Logout.jsp">
					<input type="submit" value="�α׾ƿ�"> <input type="button"
						value="ȸ����������"
						onclick="javascript:window.location='ModifyForm.jsp'">

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
