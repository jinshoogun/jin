<%@ page language="java" contentType="text/html; charset=EUC-KR"
  pageEncoding="EUC-KR"%>
<% 

request.setCharacterEncoding("EUC-KR");%>
<%
session.removeAttribute("a_id");
%>
<script type="text/javascript">
  alert("�α׾ƿ� �Ǿ����ϴ�.");
  location.href="../test2/mainform6.jsp";
</script>