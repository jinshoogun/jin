<%@ page contentType="text/html;charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import="DATADB.bean.DAO"%>
<% request.setCharacterEncoding("EUC-KR"); %>
<html>
<head>
<title>ȸ��Ż��</title>

</head>

<%
	String id = (String)session.getAttribute("d_id");
	String pw = request.getParameter("d_password");

	DAO designer = DAO.getInstance();
	int check = designer.deleteDesigner(id, pw);

	if (check == 1) { // DAO.java ���� equals �Լ��� ���� ���Ͽ� �����ϸ� 1�� ��ȯ�Ѵ�.
		session.invalidate(); //1�� ��ȯ�޾Ҵٸ� �ش������� ��� ����� invalidate()�Լ� ��� ,��� ���� ������ �����Ѵ�. 
%>
<body bgcolor="white">
	<form method="post" action="D_Main.jsp" name="insert">  
		<table width="270" border="0" cellspacing="0" cellpadding="5"
			align="center">
			<tr bgcolor="white">
				<td height="39" align="center"><font size="+1"><b>ȸ��������
							�����Ǿ����ϴ�.</b></font></td>

			</tr>
			<tr bgcolor="white">
				<td align="center">
					<p>�������� ������ �Ǻ���</p>
					<meta http-equiv="Refresh" content="5;url=D_Main.jsp">
				</td>
			</tr>
			<tr bgcolor="white">
				<td align="center"><input type="submit" value="Ȯ��"></td>
			</tr>
		</table>
	</form>

	<%
		} else {
	%>
	<script>
		alert("��й�ȣ�� ���� �ʽ��ϴ�.");
		history.go(-1);  //history�� ��� -1�� �ڷΰ���
		                 //�ڹٽ�ũ��Ʈ���� history��ü
		                 //-����ڰ� �������� ���� �̵��� �������� ����ص� ��ü
		                 //-3���� �޼��尡 �ִ� 1. histroy.forward();
		                 //               2. history.back();
		                 //               3. history.go(����);
	</script>

	<%
		}
	%>

</body>
</html>