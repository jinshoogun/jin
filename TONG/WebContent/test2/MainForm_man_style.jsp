<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <html>

   <%
 try{
   if(session.getAttribute("m_id")==null){%>  <%-- ��α��� ȭ�� --%>
   

       <a href="Style.jsp">
		<img src="../Image/perm.png" width="550" /></a>   <%-- �ĸ� ����â���� �̵� --%>
		
		      <a href="Style.jsp">
		<img src="../Image/cut.png" width="550"/></a>  <%-- �� ����â���� �̵� --%>
		
  </tr>
  <tr>
       <a href="Style.jsp">
		<img src="../Image/dye.png" width="550" /></a>   <%-- ��Ÿ�� ����â���� �̵� --%>
		
		      <a href="Style.jsp">
		<img src="../Image/magic.png" width="550"/></a>  <%-- ���� ����â���� �̵� --%>
		
  </tr>
 

 <%}else{%> <%-- �α��� ȭ�� --%>
 
       <a href="Style.jsp">
		<img src="../Image/perm.png" width="550" /></a>   <%-- �ĸ� ����â���� �̵� --%>
		
		      <a href="Style.jsp">
		<img src="../Image/cut.png" width="550"/></a>  <%-- �� ����â���� �̵� --%>
		
  </tr>
  <tr>
       <a href="Style.jsp">
		<img src="../Image/dye.png" width="550" /></a>   <%-- ��Ÿ�� ����â���� �̵� --%>
		
		      <a href="Style.jsp">
		<img src="../Image/magic.png" width="550"/></a>  <%-- ���� ����â���� �̵� --%>
		
  </tr>
 
<%}
 }catch(NullPointerException e){}
 %>
</html>