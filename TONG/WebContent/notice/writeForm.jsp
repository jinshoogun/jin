<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<html>
<head>
<title>게시판</title>
<%@ include file="../test2/noticemainform.jsp"  %>
<link href="style.css" rel="stylesheet" type="text/css">
<script language="JavaScript" src="script.js"></script>

<%if(session.getAttribute("a_id") == null) {%>
     <script type="text/javascript">
          alert("로그인후 글쓰기 가능");
          window.location="../test2/mainform6.jsp";
     </script>
<%}%>
</head>

<% 
  int n_num=0,n_ref=1,n_re_step=0,n_re_level=0;
  try{  
    if(request.getParameter("n_num")!=null){
	n_num=Integer.parseInt(request.getParameter("n_num"));
	n_ref=Integer.parseInt(request.getParameter("n_ref"));
	n_re_step=Integer.parseInt(request.getParameter("n_re_step"));
	n_re_level=Integer.parseInt(request.getParameter("n_re_level"));
	}
    String id = (String)session.getAttribute("a_id");
%>
   
<body  >  
<center><b>글쓰기</b>
<br>
<form method="post" name="writeform" action="writePro.jsp" onsubmit="return writeSave()">
<input type="hidden" name="n_num" value="<%=n_num%>">
<input type="hidden" name="n_ref" value="<%=n_ref%>">
<input type="hidden" name="n_re_step" value="<%=n_re_step%>">
<input type="hidden" name="n_re_level" value="<%=n_re_level%>">

<table width="550" border="1" cellspacing="0" cellpadding="0" align="center">
   <tr>
    <td align="right" colspan="2"  >
	    <a href="notice.jsp"> 글목록</a> 
   </td>
   </tr>
   <tr>
    <td  width="80"    align="center">이 름</td>
    <td  width="470">
       <input type="text" width="480" name="n_writer" value="<%=id%>"></td>
  </tr>
  <tr>
    <td  width="80"    align="center" >제 목</td>
    <td  width="470">
    <%if(request.getParameter("n_num")==null){%>
       <input type="text" size="75" maxlength="75" name="n_subject"></td>
	<%}else{%>
	   <input type="text" size="75" maxlength="75" name="n_subject" value="[답변]"></td>
	<%}%>
  </tr>
  <tr>
    <td  width="70"  align="center" >내 용</td>
    <td align="left" width="150" height = "350" colspan="3">
     <textarea name="n_content" rows="26" cols="75"></textarea> </td>
  </tr>
  <tr>
    <td  width="80"   align="center" >비밀번호</td>
    <td  width="470">
     <input type="password" size="10" maxlength="20" name="n_password"> 
	 </td>
  </tr>
<tr>      
 <td colspan=2   align="center"> 
  <input type="submit" value="글쓰기" >  
  <input type="reset" value="다시작성">
 
</td></tr></table>    
 <%
  }catch(Exception e){}
%>     
</form>      
</body>
</html>      
