<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<% 

request.setCharacterEncoding("EUC-KR");%>
    <html>
    <% 
		request.setCharacterEncoding("euc-kr");
    %>
   <%
 try{
   if(session.getAttribute("memId")==null){%>  <%-- ��α��� ȭ�� --%>
   
<center>	
<table>
<tr>
<center>
<a href="../Main/MainForm.jsp">			<%-- �Ӹ��� Ŭ���� ������������ ���ư��� --%>
<img src="../Image/Tong1.jpg" width="400" height="100"/></a>  <%--�Ӹ��� �׸� --%>
</center>
</tr>


<tr>
	<td>
		<a href="../Member/Company.jsp">
		<img src="../Image/main1.png" width="300" height="100"/> <%-- ȸ��Ұ��� �̵� --%>
		</a>
	</td>
	
	<td>
		<a href="../Member/LoginForm.jsp">
		<img src="../Image/main2.png" width="300" height="100"/> <%-- �α��� â���� �̵� --%>
		</a>
	</td>
	
	<td>
		<a href="../Main/Style.jsp">
		<img src="../Image/main3.png" width="300" height="120"/> <%-- ��Ÿ�� �������� �̵� --%>
		</a>
	</td>
	
	<td>
		<a href="../Main/News&EventsMain.jsp">
		<img src="../Image/main4.png" width="300" height="100"/><%-- ����&�̺�Ʈ �������� �̵� --%>
		</a>
	</td>
	
	<td>
	<a href="../Main/GOGACCENTER.jsp">
		<img src="../Image/main5.png" width="300" height="100"/> <%-- �����ͷ� �̵� --%>
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
      <a href="MainForm1">
		<img src="../Image/man.png" width="550" /></a>   <%-- ���ڼ���â���� �̵� --%>
		
		      <a href="MainForm2">
		<img src="../Image/woman.png" width="550"/></a>  <%-- ���� ����â���� �̵� --%>
		
  </tr>
</table>
<table align="right">
<tr>
<td >
 <input  type="button" , name="login" value="����Ʈ��" onclick="javascript:window.location='Sitemap.jsp'"> <%--����Ʈ������ �̵� --%>
</td>
</tr>
</table>
</center>
 <%}else{%> <%-- �α��� ȭ�� --%>
 
 <center>	
<table>
<tr>
<center>
<a href="../Main/MainForm.jsp">			<%-- �Ӹ��� Ŭ���� ������������ ���ư��� --%>
<img src="../Image/Tong1.jpg" width="400" height="100"/></a>  <%--�Ӹ��� �׸� --%>
</center>
</tr>


<tr>
	<td>
		<a href="../Main/Company.jsp">
		<img src="../Image/main1.png" width="400" height="100"/> <%-- ȸ��Ұ��� �̵� --%>
		</a>
	</td>
	
	<td>
		<a href="../Main/LoginForm.jsp">
		<img src="../Image/main2.png" width="400" height="100"/> <%-- My���� â���� �̵� --%>
		</a>
	</td>
	
	<td>
		<a href="../Main/Style.jsp">
		<img src="../Image/main3.png" width="400" height="100"/> <%-- ��Ÿ�� �������� �̵� --%>
		</a>
	</td>
	
	<td>
		<a href="../Main/News&EventsMain.jsp">
		<img src="../Image/main4.png" width="400" height="100"/><%-- ����&�̺�Ʈ �������� �̵� --%>
		</a>
	</td>
	
	<td>
	<a href="../Main/GOGACCENTER.jsp">
		<img src="../Image/main5.png" width="400" height="100"/> <%-- �����ͷ� �̵� --%>
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
      <a href="MainForm1">
		<img src="../Image/man.png" width="750" /></a>   <%-- ���ڼ���â���� �̵� --%>
		
		      <a href="MainForm2">
		<img src="../Image/woman.png" width="750"/></a>  <%-- ���� ����â���� �̵� --%>
		
  </tr>
</table>
<table align="right">
<tr>
<td >
 <input  type="button" , name="login" value="����Ʈ��" onclick="javascript:window.location='Sitemap.jsp'"> <%--����Ʈ������ �̵� --%>
</td>
</tr>
</table>
</center>
<%}
 }catch(NullPointerException e){}
 %>
</html>