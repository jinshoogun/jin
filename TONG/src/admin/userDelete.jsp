<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="adminDATADB.bean.DAO"%>
<%@ page import="adminDATADB.bean.DTO"%>
   <%
	   int m_num = Integer.parseInt(request.getParameter("m_num"));
   	
   		DAO dao = DAO.getInstance();
   		dao.DeleteUser(m_num);
   %>
   	<script>
   		alert("�����Ϸ�");
   		window.location="userModify.jsp";
   	</script>