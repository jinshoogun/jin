<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
// adminLogout.jsp
session.removeAttribute("s_admin_id");
session.removeAttribute("s_admin_mlevel");
%>
<script type="text/javascript">
  alert("������������ �α׾ƿ�!!");
  location.href="adminLogin.jsp";
</script>