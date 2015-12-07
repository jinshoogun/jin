<%@ page contentType = "text/html; charset=euc-kr" pageEncoding="EUC-KR"%>
<% 

request.setCharacterEncoding("EUC-KR");%>
<%@ page import = "DATADB2.bean.eDAO" %>
<%@ page import = "DATADB2.bean.DTO" %>
<%@ page import = "java.text.SimpleDateFormat" %>
<html>
<head>
<title>게시판</title>
<link href="style.css" rel="stylesheet" type="text/css">
</head>



<%
   int e_num = Integer.parseInt(request.getParameter("e_num"));
   String pageNum = request.getParameter("pageNum");

   SimpleDateFormat sdf = 
        new SimpleDateFormat("yyyy-MM-dd HH:mm");

   try{
      eDAO dbPro = eDAO.getInstance();
      DTO article =  dbPro.getArticle(e_num);
		
      
	  int e_ref=article.getE_ref();
	  int e_re_step=article.getE_re_step();
	  int e_re_level=article.getE_re_level();
	  int back = (int)(e_num-1);
	  int forward = (int)(e_num+1);
%>
<body >  
<center><b>글내용 보기</b>
<br>
<form>
<table width="500" border="1" cellspacing="0" cellpadding="0" align="center">  
  <tr height="30">
    <td align="center" width="125">글번호</td>
    <td align="center" width="125" align="center">
	     <%=article.getE_num()%></td>
    <td align="center" width="125" >조회수</td>
    <td align="center" width="125" align="center">
	     <%=article.getE_readcount()%></td>
  </tr>
  <tr height="30">
    <td align="center" width="125">작성자</td>
    <td align="center" width="125" align="center">
	     <%=article.getE_writer()%></td>
    <td align="center" width="125"   >작성일</td>
    <td align="center" width="125" align="center">
	     <%= sdf.format(article.getE_reg_date())%></td>
  </tr>
  <tr height="30">
    <td align="center" width="125"  >글제목</td>
    <td align="center" width="375" align="center" colspan="3">
	     <%=article.getE_subject()%></td>
  </tr>
  <tr>
    <td align="center" width="125"  >글내용</td>
    <td align="left" width="375" colspan="3"><pre><%=article.getE_content()%></pre></td>
  </tr>
  
  
  <tr height="30">      
    <td colspan="4"   align="right" > 
    <%if(session.getAttribute("a_id")!=null) {%>
	    <%
	         String id = (String)session.getAttribute("a_id");
	         if(id.equals(article.getE_writer())){
	    %>
	  <input type="button" value="글수정" 
       onclick="document.location.href='updateForm.jsp?e_num=<%=article.getE_num()%>&pageNum=<%=pageNum%>'">
      &nbsp;&nbsp;&nbsp;&nbsp;
     
     <input type="button" value="글삭제" 
       onclick="document.location.href='deleteForm.jsp?e_num=<%=article.getE_num()%>&pageNum=<%=pageNum%>'">
      &nbsp;&nbsp;&nbsp;&nbsp;

       <input type="button" value="글목록" 
       onclick="document.location.href='event.jsp?pageNum=<%=pageNum%>'">
       
       <%if(back != 0){ %>
        <input type="button" value="이전글" onclick="document.location.href='content.jsp?e_num=<%=back%>&pageNum=<%=pageNum%>'">
        <%} %>
      
       <input type="button" value="다음글" onclick="document.location.href='content.jsp?e_num=<%=forward%>&pageNum=<%=pageNum%>'">
      
       
   <%} }else{%>
   
   
      <input type="button" value="글목록" 
       onclick="document.location.href='event.jsp?pageNum=<%=pageNum%>'">
        <%if(back != 0){ %>
       <input type="button" value="이전글" onclick="document.location.href='content.jsp?e_num=<%=back%>&pageNum=<%=pageNum%>'">
       <%} %>
        
       <input type="button" value="다음글" onclick="document.location.href='content.jsp?e_num=<%=forward%>&pageNum=<%=pageNum%>'">
      
      
      <%}
     }catch(Exception e){} 
 %>
</form>      
</body>
</html>      
