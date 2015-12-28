<%@ page language="java" contentType="text/html; charset=EUC-KR"
  pageEncoding="EUC-KR"%>
<% 

request.setCharacterEncoding("EUC-KR");%>
<%
session.removeAttribute("a_id");
%>
<script type="text/javascript">
  alert("로그아웃 되었습니다.");
  location.href="../test2/mainform6.jsp";
</script>