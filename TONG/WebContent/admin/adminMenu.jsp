<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="auth.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>adminLmenu.jsp</title>
<link rel="stylesheet" type="text/css" href="../css/mystyle.css">
</head>
<body>
 <center> 
 <img src="../images/hanbit_logo.gif">
 <br/>
 <table width=150>
  <tr>
    <td align=center><strong>관 / 리 / 자 / 메 / 뉴</strong></td>
  </tr>
  <tr>
    <td height=3 bgcolor=#808080></td>
  </tr>
  <tr>
    <td align="right"><a href="adminLogout.jsp" target="_top">로그아웃</a></td>
  </tr>
  <tr>
    <td height=1 bgcolor=#808080></td>
  </tr>
  <tr>
    <td><a href="bbs/bbs_fra.jsp" target="sub">■ 게시판관리</a></td>
  </tr>
  <tr>
    <td height=1 bgcolor=#808080></td>
  </tr>
  <tr>
    <td><a href="mem/mem_fra.jsp" target="sub">■ 회원관리</a></td>
  </tr>
  <tr>
    <td height=1 bgcolor=#808080></td>
  </tr>
  <tr>
    <td><a href="notice/notice_fra.jsp" target="sub">■ 공지사항관리</a></td>
  </tr>
  <tr>
    <td height=1 bgcolor=#808080></td>
  </tr>
  </table>
</center>  
</body>
</html>