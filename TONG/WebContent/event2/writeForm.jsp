<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="../test2/noticemainform.jsp"  %>
<html>
<head>
<title>게시판</title>
<link href="style.css" rel="stylesheet" type="text/css">
<script language="JavaScript" src="script.js"></script>

<%if(session.getAttribute("m_id") == null) {%>
     <script type="text/javascript">
          alert("로그인후 글쓰기 가능");
          window.location="/TONG/Member/main.jsp";
     </script>
<%}%>
</head>

<% 
  int e_num=0,e_ref=1,e_re_step=0,e_re_level=0;
  try{  
    if(request.getParameter("e_num")!=null){
	e_num=Integer.parseInt(request.getParameter("e_num"));
	e_ref=Integer.parseInt(request.getParameter("e_ref"));
	e_re_step=Integer.parseInt(request.getParameter("e_re_step"));
	e_re_level=Integer.parseInt(request.getParameter("e_re_level"));
	}
    String id = (String)session.getAttribute("m_id");
%>
   
<body  >  
<center><b>글쓰기</b>
<br>
<form method="post" name="writeform" action="writePro.jsp" onsubmit="return writeSave()">
<input type="hidden" name="e_num" value="<%=e_num%>">
<input type="hidden" name="e_ref" value="<%=e_ref%>">
<input type="hidden" name="e_re_step" value="<%=e_re_step%>">
<input type="hidden" name="e_re_level" value="<%=e_re_level%>">

<table width="400" border="1" cellspacing="0" cellpadding="0"    align="center">
   <tr>
    <td align="right" colspan="2"  >
	    <a href="event.jsp"> 글목록</a> 
   </td>
   </tr>
   <tr>
    <td  width="70"    align="center">이 름</td>
    <td  width="330">
       <input type="text" name="e_writer" value="<%=id%>"></td>
  </tr>
  
  <%if(request.getParameter("e_num")==null){%>
  <tr>
    <td  width="70"    align="center" >제 목</td>
    <td  width="330">
       <input type="text" size="40" maxlength="50" name="e_subject"></td>
  </tr>
  <tr>
    <td  width="70"    align="center" >내 용</td>
    <td  width="330" >
     <textarea name="e_content" rows="13" cols="40"></textarea> </td>
  </tr>
  <tr>
    <td  width="70"    align="center" >비밀번호</td>
    <td  width="330">
       <input type="text" size="40" maxlength="50" name="e_password"></td>
  </tr>
  <%}else{%>
    <tr>
    <td  width="70"    align="center" >덧 글</td>
    <td  width="330">
       <input type="text" size="40" maxlength="50" name="e_subject"></td>
  </tr>
  
  <%}%> 
  
  
<tr>      
 <td colspan=2   align="center"> 
 
 <%if(request.getParameter("e_num")==null){%>
  <input type="submit" value="글쓰기" >
  <%}else{%>
  <input type="button" name="reply" value="덧글쓰기" onclick="writePro.jsp">
  <%} %>  
  
  <input type="reset" value="다시작성">
 
</td></tr></table>    
 <%
  }catch(Exception e){}
%>     
</form>      
</body>
</html>