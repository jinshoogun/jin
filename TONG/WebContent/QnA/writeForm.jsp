<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "DATADB.bean.DAO" %>
<%@ page import = "DATADB.bean.DTO" %>
    <%@ include file="../test2/mainform5.jsp"%>
<html>
<head>
<title>게시판</title>
<link href="style.css" rel="stylesheet" type="text/css">
<script language="JavaScript"></script>
</head>
<% 
  int q_num=0,q_ref=1,q_re_step=0,q_re_level=0;
  try{  						//   16 16 0 0 
    if(request.getParameter("q_num")!=null){
    	//num은 null은 새글 아니면 답글들
		q_num=Integer.parseInt(request.getParameter("q_num"));
		q_ref=Integer.parseInt(request.getParameter("q_ref"));
		q_re_step=Integer.parseInt(request.getParameter("q_re_step"));
		q_re_level=Integer.parseInt(request.getParameter("q_re_level"));
		
	}
  String id = (String)session.getAttribute("m_id");
  //getAttribute이 리턴값이 object로 받기 때문에 (String)으로 형 강제변환

%>
   
<body>  
<center><b>글쓰기</b>
<br>
<form method="post" name="writeform" action="writePro.jsp">
<input type="hidden" name="q_num" value="<%=q_num%>">
<%-- hidden은 단순히 화면 출력하지 않고 값을 넘기고 싶을때 사용한다. --%>
<input type="hidden" name="q_ref" value="<%=q_ref%>">
<input type="hidden" name="q_re_step" value="<%=q_re_step%>">
<input type="hidden" name="q_re_level" value="<%=q_re_level%>">

<table width="400" border="1" cellspacing="0" cellpadding="0"  align="center">
   <tr>
    <td align="right" colspan="2">
	    <a href="list.jsp"> 글목록</a> 
   </td>
   </tr>
   <tr>
   
    <td  width="70"  align="center">이 름</td>
    <td  width="330">
       <input type="hidden" name="q_writer" value="<%=id%>"><%=id%></td>
  </tr>
  <tr>
    <td  width="70"  align="center" >제 목</td>
    <td  width="330">
    <%if(request.getParameter("q_num")==null){%>
       <input type="text" size="40" maxlength="50" name="q_subject" ></td>
	<%}else{%>
	   <input type="text" size="40" maxlength="50" name="q_subject" value="[답변]">
	<%}%>
  </tr>
  <tr>
    <td  width="70"  align="center" >내 용</td>
    <td align="left" width="150" height = "350" colspan="3">
     <textarea name="q_content" rows="26" cols="70"></textarea> </td>
  </tr>
  <tr>
    <td  width="70"  align="center" >비밀번호</td>
    <td  width="330" >
     <input type="password" size="8" maxlength="12" name="q_password2"> 
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
