<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "DATA.bean.DAO" %>
<%@ page import = "DATA.bean.DTO" %>
<%@ page import = "java.text.SimpleDateFormat" %>
        <%@ include file="../test2/mainform5.jsp"%>
<%!
SimpleDateFormat sdf = 
new SimpleDateFormat("yyyy-MM-dd HH:mm");

public static int back(int s_num, int SavePage){
	//매게변수 num은  현재 패이지에 저장된 게시물의 갯수 
	int min = 1;
	   
	  if(min>s_num||s_num==min){
		  return min;
	  }else{
		  return s_num-1;
	  }
}

public static int forward(int s_num, int SavePage){
	int max =  SavePage;
	//매개변수 num 현재 패이지에 저장된 게시물의 갯수 
	if(s_num==max||s_num>max){
		return max;
	  }else{  
		  return s_num+1;
	  }
}
%>
<%

   int s_num = Integer.parseInt(request.getParameter("s_num"));
   String s_pageNum = request.getParameter("s_pageNum");
   int pageSave = Integer.parseInt(request.getParameter("pageSave"));
  
   try{
	     DAO dbPro = DAO.getInstance();
	     DTO article =  dbPro.getStyleNewsArticle(s_num);
%>

<html>
<head>
<title>게시판</title>
</head>
<body>  
<center><b>QnA 글내용 보기</b>
<br>
<form name="dd">
<table width="800" border="1" cellspacing="0" cellpadding="0"  align="center">  
  <tr height="30">
    <td align="center" width="200">글번호</td>
    <td align="center" width="200" align="center">
	     <%=article.getS_num()%></td>
    <td align="center" width="200">조회수</td>
    <td align="center" width="200" align="center">
	     <%=article.getS_readcount()%></td>
  </tr>
  <tr height="30">
    <td align="center" width="200">작성자</td>
    <td align="center" width="200" align="center">
	     <%=article.getS_writer()%></td>
    <td align="center" width="200" >작성일</td>
    <td align="center" width="200" align="center">
	     <%=sdf.format(article.getS_reg_date())%></td>
  </tr>
  <tr height="30">
    <td align="center" width="200">글제목</td>
    <td align="left" width="600" align="center" colspan="3">
	     <%=article.getS_subject()%></td>
  </tr>
  <tr>
    <td align="center" width="200">글내용</td>
    <td align="left" width="150" height = "350" colspan="3"><%=article.getS_content()%></textarea></td>
  </tr>
  <tr height="30">      
    <td colspan="4" align="right" > 
        <%if (session.getAttribute("a_id") !=null){
        	String id = (String)session.getAttribute("a_id");
        	if(id.equals(article.getS_writer()))
        	{
        	%>
	 
	  <input type="button" value="글수정" 
       onclick="document.location.href='updateForm.jsp?s_num=<%=article.getS_num()%>&s_pageNum=<%=s_pageNum%>'">
	   &nbsp;&nbsp;&nbsp;&nbsp;
	  
	  <input type="button" value="글삭제" 
       onclick="document.location.href='deleteForm.jsp?s_num=<%=article.getS_num()%>&s_pageNum=<%=s_pageNum%>'">
	   &nbsp;&nbsp;&nbsp;&nbsp;
   
    <input type="button" value="글목록" 
       onclick="document.location.href='list.jsp?s_pageNum=<%=s_pageNum%>'">

       
       <input type="button" value="이전글" onclick="document.location.href='content.jsp?s_num=<%=back(s_num,pageSave)%>&s_pageNum=<%=s_pageNum%>&pageSave=<%=pageSave%>'">
       <input type="button" value="다음글" onclick="document.location.href='content.jsp?s_num=<%=forward(s_num,pageSave)%>&s_pageNum=<%=s_pageNum%>&pageSave=<%=pageSave%>'">
      
       <%} if(!id.equals(article.getS_writer()))
        	{
        	%> 
	   
	   <input type="button" value="글목록" 
       onclick="document.location.href='list.jsp?s_pageNum=<%=s_pageNum%>'">

       
       <input type="button" value="이전글" onclick="document.location.href='content.jsp?s_num=<%=back(s_num,pageSave)%>&s_pageNum=<%=s_pageNum%>&pageSave=<%=pageSave%>'">
       <input type="button" value="다음글" onclick="document.location.href='content.jsp?s_num=<%=forward(s_num,pageSave)%>&s_pageNum=<%=s_pageNum%>&pageSave=<%=pageSave%>'">
       
       
       
       <%} }else if(session.getAttribute("a_id") ==null){ %>
       <input type="button" value="글목록" 
       onclick="document.location.href='list.jsp?s_pageNum=<%=s_pageNum%>'">
       
       <input type="button" value="이전글" onclick="document.location.href='content.jsp?s_num=<%=back(s_num,pageSave)%>&s_pageNum=<%=s_pageNum%>&pageSave=<%=pageSave%>'">
       <input type="button" value="다음글" onclick="document.location.href='content.jsp?s_num=<%=forward(s_num,pageSave)%>&s_pageNum=<%=s_pageNum%>&pageSave=<%=pageSave%>'">
    </td>
  </tr>
</table>    
<%} else {
	   
	   }
 }catch(Exception e){} 
 %>
</form>      
</body>
</html>      