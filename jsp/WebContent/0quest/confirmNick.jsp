<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="obj140.bean.DAO"%>


<html>

<%request.setCharacterEncoding("euc-kr");%>
	
<% String nick = request.getParameter("nick");
	DAO manager = DAO.getInstance();
	int check = manager.confirmNick(nick);%>
		<%-- nick ���� DAO���� �Ķ���Ͱ��� �ҷ��´�. DAO���� getInstance���� ���̵� �Է��� �� �ִ� ������ ������ش�. confirmNick �޼ҵ带 ���� ���� ������� check���ٰ�
	�־��ش�. --%>

<body>
<script language="Javascript">
 function setnick(){
 	opener.document.userinput.nick.value="<%=nick%>";
	self.close();
	}
//setnick �޼ҵ忡���� �ڽ��� �ҷ��� opener���������ٰ� id���� �־��ش�. �׸��� �ڽ��� �������� ���Ḧ �Ѵ�.
</script>
	<%
		if (check == 1) {
			//�� if���� check==1�� �޼��� ��� �г����� �˻��� �Ǳ� ������ unique�� �����Ǿ� �ֱ� ������ �ߺ� ����� �Ұ����ϴ�.
	%>
	
	<table>
		<tr>
			<td height="39"><%=nick%>��(��) �̹� ������� �г����Դϴ�.</td>
			<%-- �׷��� ������ �� �г��� ������̶�� ������ �ϰ� �ִ�. --%>
		</tr>
	</table>
	<form name="checkForm" method="post" action="confirmNick.jsp"> <%-- �׸��� �ٽ� �ڽ� jsp�� �ٽ� ������ ��Ų��.
	 �ߺ� ���θ� üũ�ϱ� ���� ���ϴ� �г��� �˻��� �� �ִ� ����� �ִ�.--%>
		<table>
			<tr>
				<td>�ٸ� �г����� �����ϼ���<p>
						<input type="text" size="10" minlength="12" name="nick"> <input
							type="submit" value="�г��� �ߺ�Ȯ��">
				</td>
			</tr>
		</table>
	</form>
	<%
		} else {
			//else�� check != 1�� ����̱� ������ �г����� �˻��� ���� �ʴ´�. �׷��� ������ �� �г��� ����� �����ϴ�.
	%>
	<table width="300" border="1">
		<tr>
			<td align="center"> 
				<p>�Է��Ͻ� <%=nick%>(��)�� ����Ͻ� �� �ִ� �г����Դϴ�.</p>
				<%-- �׷��� ������ �� �г����� ��밡���̶�� ������ �ϰ� �ִ�. --%>
			<input type="button" value="�ݱ�" onclick="setnick()">
			<%-- ��Ŭ������ setnick()�޼ҵ�� ������ �ϰ� �ִ�. --%>
			</td>
		</tr>
	</table>
	<%
		}
	%>
</body>
</html>


