<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
       <%@ include file="../test2/mainform5.jsp"%>
    <html>
    <% 
    %>
   <%
 try{
   if(session.getAttribute("m_Id")==null){%>  <%-- ��α��� ȭ�� --%>
   
</br></br></br><center><FONT size="6" color="gray" face="Impact">��������������������������������
����</center></FONT>

      <center><a href="Style.jsp">
		<img src="../Image/gangnam.png" width="550" /></a>   <%-- ���� ����â���� �̵� --%>
		
		      <a href="Style.jsp">
		<img src="../Image/gangbook.png" width="550"/></a></center>  <%-- ���� ����â���� �̵� --%>
		
  </tr>

 <%}else{%> <%-- �α��� ȭ�� --%>
 
 </br></br></br><center><FONT size="6" color="gray" face="Impact">������������������������������
����</center></FONT>
 <a href="Style.jsp">
		<center><img src="../Image/gangnam.png" width="550" /></a>   <%-- ���� ����â���� �̵� --%>
		
		      <a href="Style.jsp">
		<img src="../Image/gangbook.png" width="550"/></a></center>  <%-- ���� ����â���� �̵� --%>
		

</tr>

<%}
 }catch(NullPointerException e){}
 %>
</html>