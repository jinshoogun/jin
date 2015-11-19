<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="adminDATADB.bean.DAO"%>
<%@ page import="adminDATADB.bean.DTO"%>
<%@ page import="java.util.List"%>
<html>
<head>
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
	<b>관리자 정보입니다. (전체 관리자 계정:<%=count%>)
	</b>

	<%
		if (count == 0) {
	%>
	<table width="600" border="1" cellpadding="0" cellspacing="0">
		<tr>
			<td align="center">관리자 계정이 없습니다.</td>
	</table>

	<%
		} else {
	%>
	<table border="1" width="600" cellpadding="0" cellspacing="0">
		<tr height="30">
			<td align="center" width="150">번 호</td>
			<td align="center" width="150">I D</td>
			<td align="center" width="150">이 름</td>
			<td align="center" width="150">추 가</td>
			<td align="center" width="150">삭 제</td>
		</tr>
		<%
			for (int i = 0; i < adminList.size(); i++) {
					DTO admin = (DTO) adminList.get(i);
		%>
		<tr height="30">
			<td align="center" width="100"><%=admin.getA_num()%></td>
			<td align="center" width="100"><%=admin.getA_id()%></td>
			<td align="center" width="150"><%=admin.getA_name()%></td>
			<td align="center"><input type="button" value="정보 수정"
				onclick="document.location.href='adminModifyFrom.jsp?a_num=<%=admin.getA_num()%>'"></td>
			<td align="center"><input type="button" value="계정 삭제"
				onclick="window.location='adminDelete.jsp?a_num=<%=admin.getA_num()%>'" /></td>
		</tr>

		<%
			}
			}
		%>
	</table>
	<table>
		<tr>
			<td align="right"><input type="button" value="추가"
				onclick="window.location='adminAdd.jsp'"></td>
		    <td align="right"><input type="button" value="이전"
				onclick="window.location='main.jsp'"></td>
		</tr>
	</table>