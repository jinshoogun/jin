<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
// admin/auth.jsp �α��� ���� �˻�
String s_admin_id=""; //�α��� �� ����� id, session ����
String s_admin_mlevel="";
if (session.getAttribute("s_admin_id")!=null){ // �α��� �� ���
  s_admin_id=(String)session.getAttribute("s_admin_id");
  s_admin_mlevel=(String)session.getAttribute("s_admin_mlevel");
}
else{ // �α������� ���� ���
  s_admin_id="guest";   //�մ� ���̵� 
  s_admin_mlevel="E1"; // ��ȸ��. guest �׷�
  String root=request.getContextPath(); // /myweb
  //response.sendRedirect(root+"/admin/adminLogin.jsp");
%>
  <!DOCTYPE html>
  <html>
  <head>
  <meta charset="UTF-8">
 <script type="text/javascript">
   function jump_to() {
     window.top.location.href="<%=root %>"+"/admin/adminLogin.jsp";
   }
 </script>
  </head>
  <body onload='javascript:jump_to()'></body>
  </html>
<%  
}
%>