<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "DATADB2.bean.eDAO" %>
<%@ page import = "DATADB2.bean.DTO" %>
<%@ page import = "java.util.List" %>
<%@ page import = "java.text.SimpleDateFormat" %>
<%@ include file="../test2/noticemainform.jsp"  %>
<html>
<head>
<title>게시판</title>
<link href="style.css" rel="stylesheet" type="text/css">
</head>

<%
	
int pageSize = 10;
	
   int e_num = Integer.parseInt(request.getParameter("e_num"));
  

   SimpleDateFormat sdf = 
        new SimpleDateFormat("yyyy-MM-dd HH:mm");
   
   String id;
   
   String pageNum = request.getParameter("pageNum");
   if (pageNum == null) {
       pageNum = "1";
   }

   int currentPage = Integer.parseInt(pageNum);
   int startRow = (currentPage - 1) * pageSize + 1;
   int endRow = currentPage * pageSize;
   int count = 0;
   int number=0;
   
   
   List articleList = null;
   List commentList = null;
   
   eDAO dbPro = eDAO.getInstance();
   count = dbPro.getcommentCount();
  
   
   if (count > 0) {
       articleList = dbPro.getComment(startRow , endRow);
   }
   number=count-(currentPage-1)*pageSize;
   try{
      
      DTO article =  dbPro.getArticle(e_num);
      DTO go = dbPro.e_comment(5);
      DTO cmte	=dbPro.getComment(e_num);
      
     int e_ref=article.getE_ref();
     int e_re_step=article.getE_re_step();
     int e_re_level=article.getE_re_level();
     int back = (int)(e_num-1);
     int forward = (int)(e_num+1);
%>
<body >  
<center><b>글내용 보기</b>
<br>
<form action="commentPro.jsp">

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
    <%if(session.getAttribute("m_id")!=null) {%>
       <%
            id = (String)session.getAttribute("m_id");
            if(id.equals("admin")){
       %>
     <input type="button" value="글수정" 
       onclick="document.location.href='updateForm.jsp?e_num=<%=article.getE_num()%>&pageNum=<%=pageNum%>'">
      &nbsp;&nbsp;&nbsp;&nbsp;
     
     <input type="button" value="글삭제" 
       onclick="document.location.href='deleteForm.jsp?e_num=<%=article.getE_num()%>&pageNum=<%=pageNum%>'">
      &nbsp;&nbsp;&nbsp;&nbsp;
      
      <input type="button" value="답글쓰기" 
       onclick="document.location.href='writeForm.jsp?e_num=<%=e_num%>&e_ref=<%=e_ref%>&e_re_step=<%=e_re_step%>&e_re_level=<%=e_re_level%>'">
      &nbsp;&nbsp;&nbsp;&nbsp;
      
       <input type="button" value="글목록" 
       onclick="document.location.href='event.jsp?pageNum=<%=pageNum%>'">
   
       <%} if(!id.equals(article.getE_writer()))
           {
           %>
      
       <input type="button" value="답글쓰기" 
       onclick="document.location.href='writeForm.jsp?e_num=<%=e_num%>&e_ref=<%=e_ref%>&e_re_step=<%=e_re_step%>&e_re_level=<%=e_re_level%>'">
      &nbsp;&nbsp;&nbsp;&nbsp;
      
      <input type="button" value="글목록" 
       onclick="document.location.href='event.jsp?pageNum=<%=pageNum%>'">
       
       <input type="button" value="이전글" onclick="document.location.href='content.jp?e_num=<%=back%>&pageNum=<%=pageNum%>'">
       <input type="button" value="다음글" onclick="document.location.href='content.jp?e_num=<%=forward%>&pageNum=<%=pageNum%>'">
       
       <%} }else if(session.getAttribute("m_id") ==null){ %>
       <input type="button" value="글목록" 
       onclick="document.location.href='event.jsp?pageNum=<%=pageNum%>'">
       
       <input type="button" value="이전글" onclick="document.location.href='content.jp?n_num=<%=back%>&pageNum=<%=pageNum%>'">
       <input type="button" value="다음글" onclick="document.location.href='content.jp?n_num=<%=forward%>&pageNum=<%=pageNum%>'">
       
    </td>
  </tr>
  
</table>   

<%} else {
      
      }%>
      

		
		
		
		
		
		   <%if(session.getAttribute("m_id")!=null) {%>
		
		
		<tr>
       <Td rowspan="2" align="center"> <%=session.getAttribute("m_id")%>
       <input type="hidden" name="cmte_writer" value="<%=session.getAttribute("m_id") %>" >
       </Td>
       <td>
       <textarea name="cmte_content" cols="50" row="3" ></textarea>
       </td>
       </tr>
       <Tr>
       <td>
       <input type="submit" name="register" value="등록 ">
      <input type="reset" value="Reset">
       </td>
       </Tr>
      
		<% } %>

		<Tr>
			<td>
			<input type="text"  value="<%=go.getCmte_writer()%>">
		
			</td>
			<td colspan="2">
				<input type="text"  value="<%=go.getCmte_content()%>">
			</td>
			<td >
				<input type="text"  value="<%=sdf.format(go.getCmte_reg_date())%>">
			</td>
			
		</Tr>
		<% 
			for(int i=0; i < commentList.size(); i++){
				DTO comment = (DTO)commentList.get(i);
		
		%>
			<tr>
			<Td>
			<%=comment.getCmte_writer() %>
				확인 3
			</Td>
			<td colspan="2">
			<%=comment.getCmte_content()%>
				확인 4
			</td>
			<td>
			<%=sdf.format(comment.getCmte_reg_date())%>
			</td>
			</tr>
		
		
		
		<Tr>
		<td>
		확인 5
		</td>
		<td>
		확인 6
		</td>
		<td>
				확인 2
			</td>
		<td>
				확인 2
			</td>
		</Tr>
		
		</table>
		
      
<%}}catch(Exception e){} 
 %>
</form>      
</body>
</html>