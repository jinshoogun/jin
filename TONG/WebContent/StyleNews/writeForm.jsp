<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "DATA.bean.DAO" %>
<%@ page import = "DATA.bean.DTO" %>
        <%@ include file="../test2/mainform5.jsp"%>
<html>
<head>
<title>게시판</title>
<link href="style.css" rel="stylesheet" type="text/css">
<script language="JavaScript"></script>
</head>
<% 
  int s_num=0,s_ref=1,s_re_step=0,s_re_level=0;
  try{  						//   16 16 0 0 
    if(request.getParameter("s_num")!=null){
    	//num은 null은 새글 아니면 답글들
		s_num=Integer.parseInt(request.getParameter("s_num"));
	}
  String id = (String)session.getAttribute("a_id");

%>
   
<body>  
<center><b>글쓰기</b>
<br>
<form method="post" name="writeform" action="writePro.jsp">
<input type="hidden" name="s_num" value="<%=s_num%>">

<table width="400" border="1" cellspacing="0" cellpadding="0"  align="center">
   <tr>
    <td align="right" colspan="2">
	    <a href="list.jsp"> 글목록</a> 
   </td>
   </tr>
   <tr>
    <td  width="70"  align="center">이 름</td>
    <td  width="330">
       <input type="hidden" name="s_writer" value="<%=id%>"><%=id%></td>
  </tr>
  <tr>
    <td  width="70"  align="center">제 목</td>
    <td  width="330">
       <input type="text" size="40" maxlength="50" name="s_subject" ></td>
  </tr>
  <tr>
    <td  width="70"  align="center" >내 용</td>
    <td align="left" width="150" height = "350" colspan="3">
     <textarea name="s_content" rows="26" cols="70"></textarea></td>
  </tr>
  <tr>
    <td  width="70"  align="center" >비밀번호</td>
    <td  width="330" >
     <input type="password" size="8" maxlength="12" name="s_password"> 
	 </td>
  </tr>
<tr>      
 <td colspan=2  align="center"> 
  <input type="submit" value="글쓰기" >  
  <input type="reset" value="다시작성">
  <input type="button" value="목록보기" OnClick="window.location='list.jsp'">
</td>
</tr>
</table>  
 <%
  }catch(Exception e){
	  
  }
  
%>     
</form>      
</body>
</html>      