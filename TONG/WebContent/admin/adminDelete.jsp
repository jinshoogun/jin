<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="ADMIN.DATADB.bean.DAO"%>
<%@ page import="ADMIN.DATADB.bean.DTO"%>
   <%
	   int a_num = Integer.parseInt(request.getParameter("a_num"));
   	
   		DAO dao = DAO.getInstance();
   		dao.DeleteAdmin(a_num);
   %>
   	<script>
   		alert("삭제완료");
   		window.location="AdminModify.jsp";
   	</script>