<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="ADMIN.DATADB.bean.DAO"%>
<%@ page import="ADMIN.DATADB.bean.DTO"%>
<%@ page import="java.util.List"%>
<html>
<head>
<script>


function checkIt(){
	var re = confirm("������ �����ϰڽ��ϱ�?");
	if (re){
		alert("������ �����Ǿ����ϴ�."); 
		
	  } 
	  else {
	  alert("���������� ��� �Ǿ����ϴ�.");
	    }
	}
	  </script>
<%
	int numSize = 15;
	String a_num = request.getParameter("a_num");

	if (a_num == null) {
		a_num = "1";
	}
	int currentNum = Integer.parseInt(a_num);
	int startNum = (currentNum - 1) * numSize + 1;
	int endNum = currentNum * numSize;

	int count = 0;
	List adminList = null;
	DAO dbPro = DAO.getInstance();
	count = (dbPro.getAdminlistCount()) - 1;
	if (count > 0) {
		adminList = dbPro.getAdminlists(startNum, endNum);
	}
%>
<center>
	<b>������ �����Դϴ�. (��ü ������ ����:<%=count%>)
	</b>

	<%
		if (count == 0) {
	%>
	<table width="600" border="1" cellpadding="0" cellspacing="0">
		<tr>
			<td align="center">������ ������ �����ϴ�.</td>
	</table>

	<%
		} else {
	%>
	<table border="1" width="600" cellpadding="0" cellspacing="0">
		<tr height="30">
			<td align="center" width="150">�� ȣ</td>
			<td align="center" width="150">I D</td>
			<td align="center" width="150">�� ��</td>
			<td align="center" width="150">�� ��</td>
			<td align="center" width="150">�� ��</td>
		</tr>

		<%

			for (int i = 0; i < adminList.size(); i++) {
					DTO admin = (DTO) adminList.get(i);
		%>
		<tr height="30">
			<td align="center" width="100"><%=admin.getA_num()%></td>
			<td align="center" width="100"><%=admin.getA_id()%></td>
			<td align="center" width="150"><%=admin.getA_name()%></td>
			<td align="center"><input type="button" value="���� ����" onclick="document.location.href='AdminModifyFrom.jsp?q_num=<%=admin.getA_num()%>'"></td>
			<td align="center"><input type="button" value="���� ����" onclick="window.location='adminDelete.jsp?a_num=<%=admin.getA_num()%>'" /></td>
		</tr>

		<%
			}
			}
		%>
		
		
		
		