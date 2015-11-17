<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
// admin/auth.jsp 로그인 여부 검사
String s_admin_id=""; //로그인 한 사용자 id, session 변수
String s_admin_mlevel="";
if (session.getAttribute("s_admin_id")!=null){ // 로그인 한 경우
  s_admin_id=(String)session.getAttribute("s_admin_id");
  s_admin_mlevel=(String)session.getAttribute("s_admin_mlevel");
}
else{ // 로그인하지 않은 경우
  s_admin_id="guest";   //손님 아이디 
  s_admin_mlevel="E1"; // 비회원. guest 그룹
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