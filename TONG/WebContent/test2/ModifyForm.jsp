<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="DATADB.bean.DAO"%>
<%@ page import="DATADB.bean.DTO"%>
<%@ include file="../test2/mainform5.jsp"%>
<html>
<head>
<title>ȸ����������</title>
<%
if (session.getAttribute("m_id") ==null){
%>
<script type = "text/javascript">
alert("�α��� �� ����");
window.location = "../test2/mainform6.jsp"
</script>
<%} else{ %>

<% String id = (String)session.getAttribute("m_id");
 DAO membership = DAO.getInstance();
 DTO d= membership.getMembership(id);  /// getMember �Լ�
 
 try{
 %>


	<form method="post" action="ModifyPro.jsp" name="insert"
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
				<td width="400"><%=d.getM_name() %></td>    <%//get�޼��带 �̿��Ͽ�, ���̵� �ش��ϴ� ������ ������ %>
			</tr>
			
			<tr>
			<td width="200">��й�ȣ</td>
			<td width="400">
			<input type="password" name="m_password" size="10" maxlength="10" value="<%=d.getM_password()%>">
			</td>
			</tr>
			                      <%// value="<%d.getPw()"  
			                        // ������ ������ �����Ϸ��� text������ ����� value ���� �ָ��!!
			                        // value�� get �Լ��� �Է��� ������ ��
			                      
			                      %>
			<tr>
			<td width="200">E-MAIL</td>
			<td width="400">
			
			<%if(d.getM_email()==null){ %>
			<input type="text" name="m_email" size="40" maxlength="30" >
			 <%}else{ %>
			 <input type="text" name="m_email" size="40" maxlength="30" value="<%=d.getM_email() %>">
			 <%} %>
			 </td>
			 </tr>
			 
			 <tr>
			 <td colspan="2" align="center" bgcolor="white">
			 <input type="submit" name="modify" value="����">
			 <input type="button" value="���" onclick="javascript:window.location='../test2/mainform6.jsp'">
			 </td>
			 </tr>
			 </table>
			 </form>
			 </body>
			 <%}catch(Exception e){} %>
			 </html>
			<% }%>
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			