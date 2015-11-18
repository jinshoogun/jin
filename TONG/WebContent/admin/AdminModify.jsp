<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="ADMIN.DATADB.bean.DAO"%>
<%@ page import="ADMIN.DATADB.bean.DTO"%>
<%@ page import="java.util.List"%>
<html>
<head>
<script>


function checkIt(){
	var re = confirm("계정을 삭제하겠습니까?");
	if (re){
		alert("계정이 삭제되었습니다."); 
		
	  } 
	  else {
	  alert("계정삭제가 취소 되었습니다.");
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
			<td align="center"><input type="button" value="정보 수정" onclick="document.location.href='AdminModifyFrom.jsp?q_num=<%=admin.getA_num()%>'"></td>
			<td align="center"><input type="button" value="계정 삭제" onclick="window.location='adminDelete.jsp?a_num=<%=admin.getA_num()%>'" /></td>
		</tr>

		<%
			}
			}
		%>
		
		
		
		