<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
       <%@ include file="../test2/mainform5.jsp"%>
    <html>
    <% 
    %>
   <%
 try{
   if(session.getAttribute("m_Id")==null){%>  <%-- 비로그인 화면 --%>
   
</br></br></br><center><FONT size="6" color="gray" face="Impact">강남　　　　　　　　　　　　　　
강북</center></FONT>

      <center><a href="Style.jsp">
		<img src="../Image/gangnam.png" width="550" /></a>   <%-- 강남 선택창으로 이동 --%>
		
		      <a href="Style.jsp">
		<img src="../Image/gangbook.png" width="550"/></a></center>  <%-- 강북 선택창으로 이동 --%>
		
  </tr>

 <%}else{%> <%-- 로그인 화면 --%>
 
 </br></br></br><center><FONT size="6" color="gray" face="Impact">강남　　　　　　　　　　　　　
강북</center></FONT>
 <a href="Style.jsp">
		<center><img src="../Image/gangnam.png" width="550" /></a>   <%-- 강남 선택창으로 이동 --%>
		
		      <a href="Style.jsp">
		<img src="../Image/gangbook.png" width="550"/></a></center>  <%-- 강북 선택창으로 이동 --%>
		

</tr>

<%}
 }catch(NullPointerException e){}
 %>
</html>