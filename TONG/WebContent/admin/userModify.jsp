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
	String num = request.getParameter("m_num");
    String pageNum = request.getParameter("m_pageNum");
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
		skey = "m_id";
		sval = "";
	}
	int currentPage = Integer.parseInt(pageNum);
	int startNum = (currentPage - 1) * pageSize + 1;
	int endNum = currentPage * pageSize;

	int count = 0;
	List userList = null;
	DAO dbPro = DAO.getInstance();
	count = (dbPro.getUserlistCount(sqry));
	if (count > 0) {
		userList = dbPro.getUserlists(startNum, endNum, sqry);
	}
%>
<center>
	<b>일반회원 정보입니다. (일반회원 계정:<%=count%>)
	</b>

	<%
		if (count == 0) {
	%>
	<table width="600" border="1" cellpadding="0" cellspacing="0">
		<tr>
			<td align="center">회원이 없습니다.</td>
	</table>

	<%
		} else {
	%>
	<table border="1" width="900" cellpadding="0" cellspacing="0">
		<tr height="30" align="center">
			<td width="100">가입번호</td>
			<td width="100">ID</td>
			<td width="100">이름</td>
			<td width="150">이메일 </td>
			<td width="100">전화번호</td>
			<td width="150">가입일</td>
			<td width="100">수 정</td>
			<td width="100">삭 제</td>
		</tr>
		<%
			for (int i = 0; i < userList.size(); i++) {
					DTO user = (DTO) userList.get(i);
		%>
		<tr height="30">
			<td align="center" width="100"><%=user.getM_num()%></td>
			<td align="center" width="100"><%=user.getM_id()%></td>
			<td align="center" width="150"><%=user.getM_name()%></td>
			<td align="center" width="100"><%=user.getM_email()%></td>
			<td align="center" width="100"><%=user.getM_phone()%></td>
			<td align="center" width="150"><%=sdf.format(user.getM_reg())%></td>
			<td align="center"><input type="button" value="정보 수정"
				onclick="document.location.href='userModifyFrom.jsp?m_num=<%=user.getM_num()%>'"></td>
			<td align="center"><input type="button" value="계정 삭제"
				onclick="window.location='userDelete.jsp?m_num=<%=user.getM_num()%>'" /></td>
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
	alert("검색어가 입력되지 않았습니다");
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
        <a href="userModify.jsp?m_pageNum=<%= startPage - 15 %>">[이전]</a>
<%      }
        for (int i = startPage ; i <= endPage ; i++) {  %>
        <a href="userModify.jsp?m_pageNum=<%= i %>">[<%= i %>]</a>
<%
        }
        if (endPage < pageCount) {  %>
        <a href="userModify.jsp?m_pageNum=<%= startPage + 10 %>">[다음]</a>
<%
        }
    }
%>
	<form method="get" action="userModify.jsp" name="searchForm" onSubmit="return chkSch(this);">
	<table>
		<tr>
		<td align="right">
		<select name="skey">
			<OPTION value="m_id" <%=(skey.equals("m_id"))?"selected":""%>>아이디</OPTION>
			<OPTION value="m_name" <%=(skey.equals("m_name"))?"selected":""%>>이름</OPTION>
		</select>
		<input type=text name="sval" value="<%=sval%>">
		<input type=submit value="검색">
		<%=(!sval.equals(""))?"<a href=\"userModify.jsp\">원래대로</a>":""%>
		    <td align="right"><input type="button" value="이전"
				onclick="window.location='main.jsp'"></td>
		</tr>
	</table>
	
	