<%@ page language="java" contentType="text/html; charset=EUC-KR"
  pageEncoding="EUC-KR"%>
<% 

request.setCharacterEncoding("EUC-KR");%>

<%@ page import="DATADB.bean.DAO"%>
<%@ page import="DATADB.bean.DTO"%>


<html>
<head>
<title>ȸ����������</title>
<link href="style.css" rel="stylesheet" type="text/css">

<% String id= (String)session.getAttribute("d_id");

 DAO designer = DAO.getInstance();
 DTO d= designer.getDesigner(id);  /// getMember �Լ�
 
 try{
 %>

<body bgcolor="white">
	<form method="post" action="D_modifyPro.jsp" name="insert"
		onsubmit="return checkIt()">
		<table width="600" border="1" cellspacing="0" align="center">
			<tr>
				<td colspan="2" height="39" bgcolor="white" align="center"><font
					size="+1"><b>ȸ����������</b></font></td>

			</tr>
			<tr>
				<td colspan="2" class="normal" align="center">ȸ�������������մϴ�.</td>
			</tr>
			<tr>
				<td width="200" bgcolor="white"><b>���̵��Է�</b></td>
				<td width="400" bgcolor="white">&nbsp;</td>
			</tr>

			<tr>
				<td width="200">������̸�</td>
				<td width="400"><%=d.getD_name() %></td>    <%//get�޼��带 �̿��Ͽ�, ���̵� �ش��ϴ� ������ ������ %>
			</tr>
			
			<tr>
			<td width="200">��й�ȣ</td>
			<td width="400">
			<input type="password" name="d_password" size="10" maxlength="10" value="<%=d.getD_password()%>">
			</td>
			</tr>
			                      <%// value="<%d.getPw()"  
			                        // ������ ������ �����Ϸ��� text������ ����� value ���� �ָ��!!
			                        // value�� get �Լ��� �Է��� ������ ��
			                      
			                      %>
			<tr>
			<td width="200">E-MAIL</td>
			<td width="400">
			
			<%if(d.getD_email()==null){ %>
			<input type="text" name="d_email" size="40" maxlength="30" >
			 <%}else{ %>
			 <input type="text" name="d_email" size="40" maxlength="30" value="<%=d.getD_email() %>">
			 <%} %>
			 </td>
			 </tr>
			 
			 <tr>
			 <td colspan="2" align="center" bgcolor="white">
			 <input type="submit" name="modify" value="����">
			 <input type="button" value="���" onclick="javascript:window.location='D_main.jsp'">
			 <input type="button" value="Ż��" onclick="javascript:window.location='D_deleteForm.jsp'">
			 </td>
			 </tr>
			 </table>
			 </form>
			 </body>
			 <%}catch(Exception e){} %>
			 </html>
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			