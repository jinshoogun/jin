<%@page import="javafx.scene.control.Alert"%>
<%@ page contentType = "text/html; charset=euc-kr" %>
<%@ page import = "DATADB.bean.DAO" %>
<%@ page import = "DATADB.bean.DTO" %>
<%!
public static int back(int q_num, int SavePage){
	//매게변수 num은  현재 패이지에 저장된 게시물의 갯수 
	int min = 1;
	   
	  if(min>q_num||q_num==min){
		  return min;
	  }else{
		  return q_num-1;
	  }
}

public static int forward(int q_num, int SavePage){
	int max =  SavePage;
	//매개변수 num 현재 패이지에 저장된 게시물의 갯수 
	if(q_num==max||q_num>max){
		return max;
	  }else{  
		  return q_num+1;
	  }
}
%>
<%
   int q_num = Integer.parseInt(request.getParameter("q_num"));
   String q_pageNum = request.getParameter("q_pageNum");
//   int pageSave = Integer.parseInt(request.getParameter("pageSave"));
	int pageSave = Integer.parseInt(request.getParameter("pageSave"));
   System.out.println("pageSave = "+pageSave);
   
   
   try{
	     DAO dbPro = DAO.getInstance();
	     DTO article =  dbPro.getArticle(q_num);
	  int q_ref=article.getQ_ref();
	  int q_re_step=article.getQ_re_step();
	  int q_re_level=article.getQ_re_level();
%>

<html>
<head>
<title>게시판</title>
</head>




<body>  
<center><b>글내용 보기</b>
<br>
<form name="dd">
<table width="800" border="1" cellspacing="0" cellpadding="0"  align="center">  
  <tr height="30">
    <td align="center" width="200">글번호</td>
    <td align="center" width="200" align="center">
	     <%=article.getQ_num()%></td>
    <td align="center" width="200">조회수</td>
    <td align="center" width="200" align="center">
	     <%=article.getQ_readcount()%></td>
  </tr>
  <tr height="30">
    <td align="center" width="200">작성자</td>
    <td align="center" width="200" align="center">
	     <%=article.getQ_writer()%></td>
    <td align="center" width="200" >작성일</td>
    <td align="center" width="200" align="center">
	     <%=article.getQ_reg_date()%></td>
  </tr>
  <tr height="30">
    <td align="center" width="200">글제목</td>
    <td align="left" width="600" align="center" colspan="3">
	     <%=article.getQ_subject()%></td>
  </tr>
  <tr>
    <td align="center" width="200">글내용</td>
    <td align="left" width="600" height = "500" colspan="3"><textarea rows="95%" cols="95%" readonly><%=article.getQ_content()%></textarea></td>
  </tr>
  <tr height="30">      
    <td colspan="4" align="right" > 
        <%if (session.getAttribute("m_id") !=null){
        	String id = (String)session.getAttribute("m_id");
        	if(id.equals(article.getQ_writer()))
        	{
        	%>
	 
	  <input type="button" value="글수정" 
       onclick="document.location.href='updateForm.jsp?q_num=<%=article.getQ_num()%>&q_pageNum=<%=q_pageNum%>'">
	   &nbsp;&nbsp;&nbsp;&nbsp;
	  
	  <input type="button" value="글삭제" 
       onclick="document.location.href='deleteForm.jsp?q_num=<%=article.getQ_num()%>&q_pageNum=<%=q_pageNum%>'">
	   &nbsp;&nbsp;&nbsp;&nbsp;
      
      <input type="button" value="답글쓰기" 
       onclick="document.location.href='writeForm.jsp?q_num=<%=q_num%>&q_ref=<%=q_ref%>&q_re_step=<%=q_re_step%>&q_re_level=<%=q_re_level%>'">
	   &nbsp;&nbsp;&nbsp;&nbsp;
       
   
      
       <%} if(!id.equals(article.getQ_writer()))
        	{
        	%> 
      
       <input type="button" value="답글쓰기" 
       onclick="document.location.href='writeForm.jsp?q_num=<%=q_num%>&q_ref=<%=q_ref%>&q_re_step=<%=q_re_step%>&q_re_level=<%=q_re_level%>'">
	   &nbsp;&nbsp;&nbsp;&nbsp;
	   
	   <input type="button" value="글목록" 
       onclick="document.location.href='list.jsp?q_pageNum=<%=q_pageNum%>'">

       
       <input type="button" value="이전글" onclick="document.location.href='content.jsp?q_num=<%=back(q_num,pageSave)%>&q_pageNum=<%=q_pageNum%>&pageSave=<%=pageSave%>'">
       <input type="button" value="다음글" onclick="document.location.href='content.jsp?q_num=<%=forward(q_num,pageSave)%>&q_pageNum=<%=q_pageNum%>&pageSave=<%=pageSave%>'">
       
       
       
       <%} }else if(session.getAttribute("m_id") ==null){ %>
       <input type="button" value="글목록" 
       onclick="document.location.href='list.jsp?q_pageNum=<%=q_pageNum%>'">
       
       <input type="button" value="이전글" onclick="document.location.href='content.jsp?q_num=<%=back(q_num,pageSave)%>&q_pageNum=<%=q_pageNum%>&pageSave=<%=pageSave%>'">
       <input type="button" value="다음글" onclick="document.location.href='content.jsp?q_num=<%=forward(q_num,pageSave)%>&q_pageNum=<%=q_pageNum%>&pageSave=<%=pageSave%>'">
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
