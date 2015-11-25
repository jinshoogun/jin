<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="adminDATADB.bean.DAO"%>
<%@ page import="adminDATADB.bean.DTO"%>
<%@ page import="java.util.List"%>
<html>
<head>
<%
	int numSize = 15;
	String num = request.getParameter("m_num");
	String pageReturn = "";

	if (num == null) {
		num = "1";
	}
	String skey = request.getParameter("skey");
	String sval = request.getParameter("sval");
	String sqry = "";
	if (skey != null && sval != null){
		pageReturn = "&skey="+skey+"&sval="+sval;
		sqry = " where "+skey+" like '%"+sval+"%' ";
	}else{
		skey = "writer";
		sval = "";
	}
	int currentpage = Integer.parseInt(num);
	int startNum = (currentpage - 1) * numSize + 1;
	int endNum = currentpage * numSize;

	int count = 0;
	List userList = null;
	DAO dbPro = DAO.getInstance();
	count = (dbPro.getUserlistCount(sqry));
	if (count > 0) {
		userList = dbPro.getUserlists(startNum, endNum, sqry);
	}
%>
<center>
	<b>�Ϲ�ȸ�� �����Դϴ�. (�Ϲ�ȸ�� ����:<%=count%>)
	</b>

	<%
		if (count == 0) {
	%>
	<table width="600" border="1" cellpadding="0" cellspacing="0">
		<tr>
			<td align="center">ȸ���� �����ϴ�.</td>
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
			for (int i = 0; i < userList.size(); i++) {
					DTO user = (DTO) userList.get(i);
		%>
		<tr height="30">
			<td align="center" width="100"><%=user.getM_num()%></td>
			<td align="center" width="100"><%=user.getM_id()%></td>
			<td align="center" width="150"><%=user.getM_name()%></td>
			<td align="center"><input type="button" value="���� ����"
				onclick="document.location.href='adminModifyFrom.jsp?m_num=<%=user.getM_num()%>'"></td>
			<td align="center"><input type="button" value="���� ����"
				onclick="window.location='adminDelete.jsp?m_num=<%=user.getM_num()%>'" /></td>
		</tr>

		<%
			}
			}
		%>
	</table>
	<script language="JavaScript">
function chkSch(form){
	if(form.sval.value){
		return true;
	}
	alert("�˻��϶��?");
	form.sval.focus();
	return false;
}
</script>
	<form method="get" action="list.jsp" name="searchForm" onSubmit="return chkSch(this);">
	<table>
		<tr>
		<td align="right">
		<select name="skey">
			<OPTION value="m_id" <%=(skey.equals("m_id"))?"selected":""%>>���̵�</OPTION>
			<OPTION value="m_name" <%=(skey.equals("m_name"))?"selected":""%>>�̸�</OPTION>
		</select>
		<input type=text name="sval" value="<%=sval%>">
		<input type=submit value="�˻�">
		<%=(!sval.equals(""))?"<a href=\"list.jsp\">�������</a>":""%>
		    <td align="right"><input type="button" value="����"
				onclick="window.location='main.jsp'"></td>
		</tr>
	</table>