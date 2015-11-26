<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="adminDATADB.bean.DAO"%>
<%@ page import="adminDATADB.bean.DTO"%>
<%@ page import="java.util.List"%>
<%@ page import = "java.text.SimpleDateFormat" %>
<html>
<head>
<%

	int pageSize = 15;
SimpleDateFormat sdf = 
new SimpleDateFormat("yyyy-MM-dd HH:mm");
	String num = request.getParameter("d_num");
    String pageNum = request.getParameter("d_pageNum");
	String pageReturn = "";

    if (pageNum == null) {
        pageNum = "1";
    }

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
		skey = "d_id";
		sval = "";
	}
	int currentPage = Integer.parseInt(pageNum);
	int startNum = (currentPage - 1) * pageSize + 1;
	int endNum = currentPage * pageSize;

	int count = 0;
	List designerList = null;
	DAO dbPro = DAO.getInstance();
	count = (dbPro.getDesignerlistCount(sqry));
	if (count > 0) {
		designerList = dbPro.getDesignerlists(startNum, endNum, sqry);
	}
%>
<center>
	<b>�����̳� ȸ�� �����Դϴ�. (�����̳� ȸ�� ����:<%=count%>)
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
	<table border="1" width="850" cellpadding="0" cellspacing="0">
		<tr height="30" align="center">
			<td width="100">���Թ�ȣ</td>
			<td width="100">ID</td>
			<td width="100">����</td>
			<td width="100">�г���</td>
			<td width="100">�̸�</td>
			<td width="150">������</td>
			<td width="100">�� ��</td>
			<td width="100">�� ��</td>
		</tr>
		<%
			for (int i = 0; i < designerList.size(); i++) {
					DTO designer = (DTO) designerList.get(i);
		%>
		<tr height="30">
			<td align="center" width="100"><%=designer.getD_num()%></td>
			<td align="center" width="100"><%=designer.getD_id()%></td>
			<td align="center" width="100"><%=designer.getD_store()%></td>
			<td align="center" width="100"><%=designer.getD_nickname()%></td>
			<td align="center" width="100"><%=designer.getD_name()%></td>
			<td align="center" width="150"><%=sdf.format(designer.getD_date())%></td>
			<td align="center"><input type="button" value="���� ����"
				onclick="document.location.href='designerModifyFrom.jsp?d_num=<%=designer.getD_num()%>'"></td>
			<td align="center"><input type="button" value="���� ����"
				onclick="window.location='designerDelete.jsp?d_num=<%=designer.getD_num()%>'" /></td>
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
	alert("�˻�� �Էµ��� �ʾҽ��ϴ�");
	form.sval.focus();
	return false;
}

</script>
<%
    if (count > 0) {
        int pageCount = count / pageSize + ( count % pageSize == 0 ? 0 : 1);
		 
        int startPage = (int)(currentPage/15)*15+1;
		int pageBlock=15;
        int endPage = startPage + pageBlock-1;
        if (endPage > pageCount) endPage = pageCount;
        
        if (startPage > 15) {    %>
        <a href="designerModify.jsp?d_pageNum=<%= startPage - 15 %>">[����]</a>
<%      }
        for (int i = startPage ; i <= endPage ; i++) {  %>
        <a href="designerModify.jsp?d_pageNum=<%= i %>">[<%= i %>]</a>
<%
        }
        if (endPage < pageCount) {  %>
        <a href="designerModify.jsp?d_pageNum=<%= startPage + 10 %>">[����]</a>
<%
        }
    }
%>
	<form method="get" action="designerModify.jsp" name="searchForm" onSubmit="return chkSch(this);">
	<table>
		<tr>
		<td align="right">
		<select name="skey">
			<OPTION value="d_id" <%=(skey.equals("d_id"))?"selected":""%>>���̵�</OPTION>
			<OPTION value="d_store" <%=(skey.equals("d_store"))?"selected":""%>>����</OPTION>
			<OPTION value="d_nickname" <%=(skey.equals("d_nickname"))?"selected":""%>>�г���</OPTION>
			<OPTION value="d_name" <%=(skey.equals("d_name"))?"selected":""%>>�̸�</OPTION>
		</select>
		<input type=text name="sval" value="<%=sval%>">
		<input type=submit value="�˻�">
		<%=(!sval.equals(""))?"<a href=\"designerModify.jsp\">�������</a>":""%>
		    <td align="right"><input type="button" value="����"
				onclick="window.location='main.jsp'"></td>
		</tr>
	</table>
	
	