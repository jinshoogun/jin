<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="obj140.bean.DAO"%>
<html>
<head></head>
<%
	String id = (String) session.getAttribute("memId");
	String pw = request.getParameter("pw");

	DAO manager = DAO.getInstance();
	int check = manager.deleteMember(id, pw);
	// Ż�� ���� ���� id���� �ҷ��� ������� ������ �ϰ� �Ǹ� �����Ǳ� ������ id�� ��й�ȣ�� ������ͼ� �ӽ� ������ �ϰԵȴ�.
	if (check == 1) {
		session.invalidate();
		//check ==1�̸� Ż�� �Ǿ��� �����̱� ������ �α׾ƿ��� �ʿ��ϴ�. �׷��� �α׾ƿ������ �߰���Ų��.
%>


<body>
	<form method="post" action="main.jsp" name="userinput">
		<table>
			<tr>
				<td>ȸ�������� �����Ǿ����ϴ�.
					<meta http-equiv="Refresh" content="5;url=main.jsp">
				</td>
				<%-- �׸��� ������ �Ǿ��ٴ� ����� 5�ʵڿ��� main���� ���ư��� �ȴ�. --%>
			</tr>
			<tr>
				<td><input type="submit" value="Ȯ��"></td>
			</tr>
		</table>
	</form>
	<%
		} else {
	%>
	<script>
		alert("��й�ȣ�� ���� �ʽ��ϴ�.");
		history.go(-1);
	</script>
	<%--check != 1�� ���� ��й�ȣ�� Ʋ�� ����̴� �̰��� ����ȭ������ �ٽ� ���ư��Եȴ�. --%>
	<%
		}
	%>

</body>
</html>