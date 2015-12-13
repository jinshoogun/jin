<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import ="ShopProduct.*" %>
<%@ page import ="java.util.List" %>
<%@ page import ="java.text.SimpleDateFormat" %>
<%@ include file = "../test2/mainform5.jsp" %>
<%
request.setCharacterEncoding("EUC-KR"); %>
	 <% 
   int pageSize = 30;
   
   String pageNum = request.getParameter("pageNum");

   if(pageNum == null){

      pageNum = "1";

   }

   

   int currentPage = Integer.parseInt(pageNum);

   int startRow = (currentPage - 1)*pageSize+1;

   int endRow = currentPage * pageSize;

   int count = 0;

   int number = 0;

   int row = 4;

   

   List articleList = null;

   DAO dbPro = DAO.getInstance();

   count = dbPro.getArticleCount();

   if(count>0){

      articleList = dbPro.getArticles(startRow, endRow);

   }

   count = dbPro.getArticleCount();

   

   number=count-(currentPage-1)*pageSize;

   %>
   <%
 try{
    
    %>
    
<center>

<FORM name="selectPro" method="post" action="selectPro.jsp" onsubmit="return writeSave()">
`





<table  width="700">

<tr>

    <td align="right" bgcolor="white">


   

   

   </td>

</table>

 

<%

   if(count==0){

%>

<table width="700">

<tr>

   <td align="center">

   게시판에 저장된 글이 없습니다.

   </td>
</tr>
</table>

<%}else{ %>

<table  align="center" border="1">


<%
   for(int a=0; a<articleList.size(); a++){
      
   
      DTO article = (DTO)articleList.get(a);
      

%>
<font color="red">모든 상품은 현재 오프라인에서 60% 할인가로 판매됩니다.</font>
   

<td align="center" width="200" height="200">
<img width="150" height="200" src="/TONG/ProductImage/<%=article.getS_image()%>"><Br>
상품명><%=article.getS_name() %><Br>
 <%=article.getS_price()%>원 
    </td>
   
      

<%                                                                                                                               
         if ((a + 1) > 1 && ((a + 1) % row) == 0) {//0보다 크면서 i%3으로 0일때 </tr>로 닫아서 줄넘기가된다.
               out.println("</tr><tr>");
            }
      %>
<%}%>
</table>

<%}%>

 



 
<table align="right">
<tr>


<td >
 <input  type="button" , name="login" value="사이트맵" onclick="javascript:window.location='../SiteMap/Sitemap.jsp'"> <%--사이트맵으로 이동 --%>
</td>
</tr>
</table>

</center>


 <%
 }catch(NullPointerException e){}
 %>
</html>
