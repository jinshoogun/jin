<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<html>




<body>
	<form name="myform" action="deletePro.jsp" method="post" Onsubmint ="return checkIt()">
		<table> <%-- ȸ�� Ż�� ������� �� ������ �ۼ��� �Ǹ� deletePro.jsp���Ϸ� ������ �ϰ� �ȴ�. ��, ��й�ȣ�� ���������̱� ������ post�� �����ϰ� �ȴ�.
		          Onsubmit�� �����ϱ� ���� main�� �ִ� checkIt()�޼ҵ带 �����Ͽ� �˻� �� �������ϰ� �ȴ�. --%>
			<tr>
				<td><b>ȸ�� Ż��</b></td>
			</tr>
			<tr>
				<td>��й�ȣ</td>
				<td><input type="password" name="pw"></td>
			</tr>
			<tr>
				<td><input type=submit value="ȸ��Ż��"> <%-- ��������� ������ ������ �ϰ� �ȴ�. --%>
				<input type="button" value="���"
					onclick="javascript:window.location='main.jsp'"></td>
			</tr>
		</table>
	</form>
</body>
</html>