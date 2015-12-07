<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<% 

request.setCharacterEncoding("EUC-KR");%>
<%@ page import="adminDATADB.bean.DAO"%>
<%@ page import="adminDATADB.bean.DTO"%>
   <% 
	   int d_num = Integer.parseInt(request.getParameter("d_num"));
   	
   		DAO dao = DAO.getInstance();
   		dao.DeleteDesigner(d_num);
   %>
   	<script>
   		alert("삭제완료");
   		window.location="designerModify.jsp";
   	</script>