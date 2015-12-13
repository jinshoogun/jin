<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ page import = "Style.DAO"%>
    <%@ page import = "Style.DTO"%>

<%@ page import = "java.util.List"%>
<%@ include file="../test2/mainform8.jsp"  %>
    
   <%
      request.setCharacterEncoding("EUC-KR");
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

   

   List StorenameList = null;

   DAO dbPro = DAO.getInstance();

   count = dbPro.getStoreCount();

   if(count>0){

      StorenameList = dbPro.getstorename(startRow, endRow);

   }

   count = dbPro.getStoreCount();

   

   number=count-(currentPage-1)*pageSize;

   %>
   <%
 try{
    
  %>
    <a href="Style.jsp">스타일</a>
    <a href="MyReserveList.jsp">예약확인</a>
   
   
<table>
<tr>


<center>
<%

   if(count==0){

%>

<table width="500">

<tr>

   <td align="center">

   게시판에 저장된 글이 없습니다.

   </td>

</table>

<%}else{ %>

<table  align="center" border="1">


<%
   for(int a=0; a<StorenameList.size(); a++){
      
   
      DTO article = (DTO)StorenameList.get(a);
      

%>



<td align="center" width="200" height="250"><a href="../test2/rest2.jsp">


<%=article.getStorename()%> 미용실<br>

    </td>
    
    <td input="button" name="storename" value=<%=article.getStorename()%>> </td>

</script>
<%                                                                                                                               
         if ((a + 1) > 1 && ((a + 1) % row) == 0) {//0보다 크면서 i%3으로 0일때 </tr>로 닫아서 줄넘기가된다.
               out.println("</tr><tr>");
            }
      %>
<%}%>
</table>

<%}%>

 
</center>

 <%
 }catch(NullPointerException e){}
 %>
</html>