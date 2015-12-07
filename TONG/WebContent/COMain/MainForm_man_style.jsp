<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <html>
    <% 
		request.setCharacterEncoding("euc-kr");
    %>
   <%
 try{
   if(session.getAttribute("memId")==null){%>  <%-- 비로그인 화면 --%>
   
<center>	
<table>
<tr>
<center>
<a href="../Main/MainForm.jsp">			<%-- 머리통 클릭시 메인페이지로 돌아가기 --%>
<img src="../Image/Tong1.PNG" width="400" height="100"/></a>  <%--머리통 그림 --%>
</center>
</tr>


<tr>
	<td>
		<a href="../Main/Company.jsp">
		<img src="../Image/main1.png" width="300 " height="100"/> <%-- 회사소개로 이동 --%>
		</a>
	</td>
	
	<td>
		<a href="../Main/loginform.jsp">
		<img src="../Image/main2.png" width="300" height="100"/> <%-- 로그인 창으로 이동 --%>
		</a>
	</td>
	
	<td>
		<a href="../Main/Style.jsp">
		<img src="../Image/main3.png" width="300" height="120"/> <%-- 스타일 페이지로 이동 --%>
		</a>
	</td>
	
	<td>
		<a href="../Main/News&EventsMain.jsp">
		<img src="../Image/main4.png" width="300" height="100"/><%-- 뉴스&이벤트 페이지로 이동 --%>
		</a>
	</td>
	
	<td>
	<a href="../Main/GOGACCENTER.jsp">
		<img src="../Image/main5.png" width="300" height="100"/> <%-- 고객센터로 이동 --%>
		</a>
	</td>
</tr>
<tr>
</tr>
</table>

<table  >
<tr>
</tr>
<tr>
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
 
</table>
<table align="right">
<tr>
<td >
 <input  type="button" , name="login" value="사이트맵" onclick="javascript:window.location='sitemap.jsp'"> <%--사이트맵으로 이동 --%>
</td>
</tr>
</table>
</center>
 <%}else{%> <%-- 로그인 화면 --%>
 
 <center>	
<table>
<tr>
<center>
<a href="../Main/MainForm.jsp">			<%-- 머리통 클릭시 메인페이지로 돌아가기 --%>
<img src="../Image/Tong1.PNG" width="400" height="100"/></a>  <%--머리통 그림 --%>
</center>
</tr>


<tr>
	<td>
		<a href="../Main/Company.jsp">
		<img src="../Image/main1.png" width="400" height="100"/> <%-- 회사소개로 이동 --%>
		</a>
	</td>
	
	<td>
		<a href="../Main/Myservice.jsp">
		<img src="../Image/main2.png" width="400" height="100"/> <%-- My서비스 창으로 이동 --%>
		</a>
	</td>
	
	<td>
		<a href="../Main/Style.jsp">
		<img src="../Image/main3.png" width="400" height="100"/> <%-- 스타일 페이지로 이동 --%>
		</a>
	</td>
	
	<td>
		<a href="../Main/News&EventsMain.jsp">
		<img src="../Image/main4.png" width="400" height="100"/><%-- 뉴스&이벤트 페이지로 이동 --%>
		</a>
	</td>
	
	<td>
	<a href="../Main/GOGACCENTER.jsp">
		<img src="../Image/main5.png" width="400" height="100"/> <%-- 고객센터로 이동 --%>
		</a>
	</td>
</tr>
<tr>
</tr>
</table>

<table  >
<tr>
</tr>
<tr>
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
 
</table>
<table align="right">
<tr>
<td >
 <input  type="button" , name="login" value="사이트맵" onclick="javascript:window.location='sitemap.jsp'"> <%--사이트맵으로 이동 --%>
</td>
</tr>
</table>
</center>
<%}
 }catch(NullPointerException e){}
 %>
</html>