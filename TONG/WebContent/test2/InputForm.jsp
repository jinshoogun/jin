<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="DATADB.bean.DAO"%>
<meta name="viewport" content="width=device-width, initial-scale=1">
        <%@ include file="../test2/mainform5.jsp"%>
<!DOCTYPE html>
<% request.setCharacterEncoding("utf-8"); %>

<html>
<head>
<title>ȸ������</title>
<script language="javaScript">
	function openConfirmId(userinput) {
		if (userinput.m_id.value == "") {
			alert("���̵� �Է��ϼ���");
			return;
		}
		url = "ConfirmId.jsp?m_id=" + userinput.m_id.value;
		open(
				url,
				"confirm, toolbar=no,location=no,status=no,menubar=no,scrollbars=no,width=300,height=180");
	}

	function openConfirmpw(userinput) {
		if (userinput.m_password.value != userinput.m_password1.value) {
			alert("��й�ȣ�� �ٸ��ϴ� �ٽ� �Է����ּ���.");
			return false;
		} else {
			alert("����밡�ɢ�");
			return;
		}
	}
	function checkIt() { //���̺� �ִ� form���� function���� ������ �ǽ��ϰ� �Ǹ� ���Ǹ� ������. �׸��� checkIt������ �ǽ��Ѵ�.
		var userinput = eval("document.userinput") //var�� ������ ���ؼ� �ӽ������� �����ϴ� ������ �ִ� ���� �ǹ��ϴµ�, userinput���ٰ� ���� ������ userinput�̶� ���̺� ������ �ҷ����δ�.
		// �׸��� eval�� ���� ���� �� ���ڿ����� �ڵ�� �ν��� �� �� �ִ�.

		if (!userinput.m_id.value) { //id ���� ��� ������ �� �˶��� �︰��.
			alert("���̵� �Է��ϼ���");
			return false;
		}
		if (!userinput.m_password.value || !userinput.m_password1.value) { //pw�� pw1�� �� �ϳ� ���� ��� ������ �� �˶��� �︰��.
			alert("��й�ȣ �Է��ϼ���");
			return false;

		}
		if (!userinput.m_name.value) { //�̸� ���� ��� ������ �� �˶��� �︰��.
			alert("�̸��� �Է��ϼ���");
			return false;
		
		}
		
		if (!userinput.m_email.value || !userinput.domain.value) { //���Ͼ��̵� �������ּ� ���� ��� ������ �� �˶��� �︰��.
			alert("�̸����� �Է��ϼ���");
			return false;
		}
		
		if (userinput.m_sex.value == "") { //radio�� ���� üũ���� �ʴ� ��� �� �˶� �߻� �׷��� ������ �� �ۿ��� userinput.a.value == ""�� ��� �ۼ�
			alert("������ üũ�ϼ���");
			return false;
		}

		if (!userinput.m_birth.value) {
			alert("���������  �Է��ϼ���");
			return false;
		}

		if (!userinput.m_phone.value) { 
			alert("�ڵ�����ȣ�� �Է��ϼ���");
			return false;
		}
	}
</script>
<body>
	<form method="post" action="InputPro.jsp" name="userinput" onSubmit="return checkIt()">
		<div data-theme="c" data-role="page">
			<div data-role="header">
				<h1>ȸ������</h1>
			</div>
			<center>
				<div data-role="content">

					<table width=60%>
						<tr>
							<td align="center" width=100>���̵�</td>
							<td colspan=1><input type="text" name="m_id" /></td>
							<td><input name="checkin_id" type="button" value="�ߺ�Ȯ��"
								onClick="openConfirmId(this.form)"></td>
						</tr>

						<tr>
							<td align="center">��ȣ</td>
							<td colspan=3><input type="password" name="m_password" /></td>
						</tr>


						<tr>
							<td align="center">��ȣȮ��</td>
							<td colspan=1><input type="password" name="m_password1" /></td>
							<td><input type="button" name="pw" value="�ߺ�Ȯ��"
								OnClick="openConfirmpw(this.form)" /></td>
						</tr>

						<tr>
							<td align="center">�̸�</td>
							<td colspan=3><input type="text" name="m_name" /></td>
						</tr>


						<tr>
							<td align="center">�̸���</td>
							<td colspan=3><input type="text" name="m_email"></td>
						</tr>

						<tr>
							<td align="center">����</td>
							<td colspan='3'>
								<fieldset data-role="controlgroup">
									<input type="radio" name="m_sex" id="radio-choice-1"
										value="man" checked="checked" /> <label for="radio-choice-1">man</label>

									<input type="radio" name="m_sex" id="radio-choice-2"
										value="woman" /> <label for="radio-choice-2">woman</label>
								</fieldset>
							</td>
						</tr>

						<tr>
							<td align="center">�������</td>
							<td colspan=2><input type="text" name="m_birth">��)910111</td>
					
						</tr>


						<tr>
							<td align="center">�ڵ���</td>
							<td colspan=3><input type="text" name="m_phone">- ���� �Է��ϼ���</td>
						</tr>
                  </table></div>
                  
                  
                  <table>
                  						<tr>
							<td colspan="1">
								<div align="center">
									<input name="confirm" type="submit" value="ȸ������">
									</div>
								<td colspan="1">
								<div align="center">	
									<input name="cancel" type="button" value="���" 
										onclick="javascript:window.location='../test2/mainform6.jsp'">
								</div>

							</td>
						</tr>
						</center>
					</table>
	</form>


</body>

</head>
</html>
