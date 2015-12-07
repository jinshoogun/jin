<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="../test2/mainform5.jsp"%>
    <html>
    <% 
    %>
   <%
 try{
   if(session.getAttribute("m_id")==null){%>  <%-- 비로그인 화면 --%>
   
</br></br></br><center><FONT size="6" color="gray" face="Impact">지역　　　　　　　　　　　　　　
스타일</center></FONT>
      <center><a href="../test2/MainForm_man_area.jsp">
		<img src="../Image/jido.jpg" width="550" height="550" /></a>   <%-- 지역 선택창으로 이동 --%>
		
		      <a href="../test2/MainForm_man_style.jsp">
		<img src="../Image/Style.jpg" width="550" height="550"/></a>  <%-- 스타일 선택창으로 이동 --%></center>	
  </tr>
 <%}else{%> <%-- 로그인 화면 --%>
</br></br></br><center><FONT size="6" color="gray" face="Impact">지역　　　　　　　　　　　　　　
스타일</center></FONT>
      <center><a href="../test2/MainForm_man_area.jsp">
		<img src="../Image/jido.jpg" width="550" height="550" /></a>   <%-- 지역 선택창으로 이동 --%>		
	      <a href="../test2/MainForm_man_style.jsp">
		<img src="../Image/Style.jpg" width="550" height="550"/></a>  <%-- 스타일 선택창으로 이동 --%></center>
<%}
 }catch(NullPointerException e){}
 %>
</html>