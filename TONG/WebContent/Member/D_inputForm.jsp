<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<% request.setCharacterEncoding("EUC-KR"); %>
<%@ page import="DATADB.bean.DAO"%>
<meta name="viewport" content="width=device-width, initial-scale=1">
<%@ include file = "../test2/mainform5.jsp" %>

<!DOCTYPE html>


<html>
<head>
<title>�����̳� ȸ������</title>
<script language="javaScript">
	function openD_confirmId(userinput) {
		if (userinput.d_id.value == "") {
			alert("���̵� �Է��ϼ���");
			return;
		}
		url = "D_confirmId.jsp?d_id=" + userinput.d_id.value;
		open(
				url,
				"confirm, toolbar=no,location=no,status=no,menubar=no,scrollbars=no,width=300,height=180");
	}

	function openD_confirmPw(userinput) {
		if (userinput.d_password.value != userinput.d_password1.value) {
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

		if (!userinput.d_id.value) { //id ���� ��� ������ �� �˶��� �︰��.
			alert("���̵� �Է��ϼ���");
			return false;
		}
		if (!userinput.d_password.value || !userinput.d_password1.value) { //pw�� pw1�� �� �ϳ� ���� ��� ������ �� �˶��� �︰��.
			alert("��й�ȣ �Է��ϼ���");
			return false;

		}
		if (!userinput.d_name.value) { //�̸� ���� ��� ������ �� �˶��� �︰��.
			alert("�̸��� �Է��ϼ���");
			return false;
		
		}
		
		if (!userinput.d_email.value || !userinput.domain.value) { //���Ͼ��̵� �������ּ� ���� ��� ������ �� �˶��� �︰��.
			alert("�̸����� �Է��ϼ���");
			return false;
		}
		
		if (userinput.d_sex.value == "") { //radio�� ���� üũ���� �ʴ� ��� �� �˶� �߻� �׷��� ������ �� �ۿ��� userinput.a.value == ""�� ��� �ۼ�
			alert("������ üũ�ϼ���");
			return false;
		}

		if (!userinput.d_birth.value) {
			alert("���������  �Է��ϼ���");
			return false;
		}

		if (!userinput.d_phone.value) { 
			alert("�ڵ�����ȣ�� �Է��ϼ���");
			return false;
		}
	}
</script>
<body>
	<form method="post" action="D_inputPro.jsp" name="userinput" onSubmit="return checkIt()">
	
				<center><h1>�����̳� ȸ������</h1></center>
			
			<center>
				<div data-role="content">

					<table>
						<tr>
							<td align="center" width=100>���̵�</td>
							<td colspan=1><input type="text" name="d_id" /></td>
							<td><input name="checkin_id" type="button" value="�ߺ�Ȯ��"
								onClick="openD_confirmId(this.form)"></td>
						</tr>

						<tr>
							<td align="center">��ȣ</td>
							<td colspan=3><input type="password" name="d_password" /></td>
						</tr>


						<tr>
							<td align="center">��ȣȮ��</td>
							<td colspan=1><input type="password" name="d_password1" /></td>
							<td><input type="button" name="pw" value="�ߺ�Ȯ��"
								OnClick="openD_confirmPw(this.form)" /></td>
						</tr>

						<tr>
							<td align="center">�̸�</td>
							<td colspan=3><input type="text" name="d_name" /></td>
						</tr>
						
						<tr>
							<td align="center">�г���</td>
							<td colspan=3><input type="text" name="d_nickname" /></td>
						</tr>


						<tr>
							<td align="center">�̸���</td>
							<td colspan=3><input type="text" name="d_email"></td>
						</tr>


							<td align="center">����</td>
							<td>
							<input type="radio" name="d_sex" id="radio-choice-1"
										value="man" checked="checked"/>man

									<input type="radio" name="d_sex" id="radio-choice-2"
										value="woman" />woman
							</td>
						</tr>

						<tr>
							<td align="center">�������</td>
							<td colspan=2><input type="text" name="d_birth">��)910111</td>
					
						</tr>
						<tr>
							<td align="center">�����̸�</td>
							<td colspan=3><input type="text" name="d_store" /></td>
						</tr>


						<tr>
							<td align="center">�ڵ���</td>
							<td colspan=3><input type="text" name="d_phone">- ���� �Է��ϼ���</td>
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
