<%@ page contentType="text/html;charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import="DATADB.bean.DAO"%>


<html>
<head>
<title>�ߺ�Ȯ��</title>
<link href="style.css" rel="stylesheet" type="text/css">

<% request.setCharacterEncoding("EUC-KR"); %>

<%

  String id = request.getParameter("m_id");
  DAO membership = DAO.getInstance();
  int check = membership.ConfirmId(id);  // check������ �����ϰ�.DAO confirmId�Լ����� ���� ����� ������
  
  %>

<body bgcolor="white">
	<%
  if (check ==1 ) { //confirmId�Լ����� 1�� ��ȯ�ϸ� �ش� ���̵� �ִ°��̿��� ������ �ٸ����̵� �����ϵ����Ѵ�.
  %>
	<table width="200" border="0" cellspacing="0" cellpadding="5">
		<tr bgcolor="white">
			<td height="39"><%=id%>�̹� ������� ���̵� �Դϴ�.</td>
		</tr>
	</table>
	<form name="checkForm" method="post" action="ConfirmId.jsp">
		<table width="100" border="0" cellspacing="0" cellpadding="5">
			<tr>
				<td bgcolor="white" align="center"><P>�ٸ����̵� �����ϼ���.</P> <input
					type="text" size="10" maxlength="12" name="m_id"> <input
					type="submit" value="ID�ߺ�Ȯ��"></td>
			</tr>
		</table>
	</form>

	<% }else  //���̵� ������ , �ش� ���̵� ����ϵ��� ��
              // onclick="setid()" ��ư �Ӽ� ���
	{  %>
	<table width="200" border="0" cellspacing="0" cellpadding="5">
		<tr bgcolor="white">
			<td align="center">
				<p>
					�Է��Ͻ�
					<%=id%>
					�� ����ϽǼ� �ִ� ID�Դϴ�.
				</p> <input type="button" value="�ݱ�" onclick="setM_id()">
			</td>
		</tr>
	</table>

	<% } %>


</body>
</html>
<script language="javascript">
 
    function setM_id()  <% //setid()�Լ� , �ڹٽ�ũ��Ʈ�� opener �޼ҵ� 
                         // opener.document.������.�ʵ����.value="<%=id>%";
                         //�˾�â�� ������ �ٽ� �θ�â���� ��� ���� �����ٶ� ����Ѵ�.
                            
                            %>
   {
	  opener.document.userinput.m_id.value="<%=id%>";
		self.close();  //�ڱ��ڽ� â�� �ݴ´�.
	}

	
</script>


<
