<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="obj140.bean.DAO"%>


<html>

<%request.setCharacterEncoding("euc-kr");%>
	
<% String id = request.getParameter("id");
	DAO manager = DAO.getInstance();
	int check = manager.confirmId(id);%>
	<%-- id���� DAO���� �Ķ���Ͱ��� �ҷ��´�. DAO���� getInstance���� ���̵� �Է��� �� �ִ� ������ ������ش�. confirmId �޼ҵ带 ���� ���� ������� check���ٰ�
	�־��ش�. --%>
<body>
<script language="Javascript">
 function setid(){
 	opener.document.userinput.id.value="<%=id%>";
	self.close();
	}
 //setid �޼ҵ忡���� �ڽ��� �ҷ��� opener���������ٰ� id���� �־��ش�. �׸��� �ڽ��� �������� ���Ḧ �Ѵ�.
</script>
	<%
		if (check == 1) {
			//�� if���� check==1�� �޼��� ��� ���̵� �˻��� �Ǳ� ������ primary key�� �ɷ��ֱ� ������ �ߺ� ����� �Ұ����ϴ�.
	%>
	<table width="300" border="1">
		<tr>
			<td height="39"><%=id%>�̹� ������� ���̵��Դϴ�.</td>
			<%-- �׷��� ������ �� ���̵�� ������̶�� ������ �ϰ� �ִ�. --%>
		</tr>
	</table>
	<form name="checkForm" method="post" action="confirmId.jsp"><%-- �׸��� �ٽ� �ڽ� jsp�� �ٽ� ������ ��Ų��. 
	 �ߺ� ���θ� üũ�ϱ� ���� ���ϴ� ���̵� �˻��� �� �ִ� ����� �ִ�.--%>
		<table width="300" border="1">
			<tr>
				<td>�ٸ� ���̵� �����ϼ���<p>
						<input type="text" size="10" minlength="12" name="id"> <input
							type="submit" value="ID�ߺ�Ȯ��">
				</td>
			</tr>
		</table>
	</form>
	<%
		} else {
			//else�� check != 1�� ����̱� ������ ���̵� �˻��� ���� �ʴ´�. �׷��� ������ �� ���̵�� ����� �����ϴ�.
	%>
	<table width="300" border="1">
		<tr>
			<td align="center"> 
				<p>�Է��Ͻ� <%=id%>�� ����Ͻ� �� �ִ� ���̵��Դϴ�.</p>
				<%-- �׷��� ������ �� ���̵�� ��밡���̶�� ������ �ϰ� �ִ�. --%>
			<input type="button" value="�ݱ�" onclick="setid()">
			<%-- ��Ŭ������ setid()�޼ҵ�� ������ �ϰ� �ִ�. --%>
			</td>
		</tr>
	</table>
	<%
		}
	%>
</body>
</html>


