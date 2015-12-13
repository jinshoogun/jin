<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <html>

   <%
 try{
   if(session.getAttribute("m_id")==null){%>  <%-- 비로그인 화면 --%>
   

       <a href="Style.jsp">
		<img src="../Image/perm.png" width="550" /></a>   <%-- 파마 선택창으로 이동 --%>
		
		      <a href="Style.jsp">
		<img src="../Image/cut.png" width="550"/></a>  <%-- 컷 선택창으로 이동 --%>
		
  </tr>
  <tr>
       <a href="Style.jsp">
		<img src="../Image/dye.png" width="550" /></a>   <%-- 스타일 선택창으로 이동 --%>
		
		      <a href="Style.jsp">
		<img src="../Image/magic.png" width="550"/></a>  <%-- 매직 선택창으로 이동 --%>
		
  </tr>
 

 <%}else{%> <%-- 로그인 화면 --%>
 
       <a href="Style.jsp">
		<img src="../Image/perm.png" width="550" /></a>   <%-- 파마 선택창으로 이동 --%>
		
		      <a href="Style.jsp">
		<img src="../Image/cut.png" width="550"/></a>  <%-- 컷 선택창으로 이동 --%>
		
  </tr>
  <tr>
       <a href="Style.jsp">
		<img src="../Image/dye.png" width="550" /></a>   <%-- 스타일 선택창으로 이동 --%>
		
		      <a href="Style.jsp">
		<img src="../Image/magic.png" width="550"/></a>  <%-- 매직 선택창으로 이동 --%>
		
  </tr>
 
<%}
 }catch(NullPointerException e){}
 %>
</html>