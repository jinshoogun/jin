<%@ page language="java" contentType="text/html; charset=EUC-KR"
   pageEncoding="EUC-KR"%>
<% 

request.setCharacterEncoding("EUC-KR");%>
<%@ page import="adminDATADB.bean.DAO"%>
<%@ page import="adminDATADB.bean.DTO"%>
   <%
   		DAO dao = DAO.getInstance();
   		dao.insertAdmin();
 
   %>
   	<script>
   		alert("�����Ϸ�");
   		window.location="adminModify.jsp";
   	</script>