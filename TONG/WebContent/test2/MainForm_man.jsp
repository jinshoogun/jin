<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ include file="../test2/mainform5.jsp"%>
    <html>
    <% 
    %>
   <%
 try{
   if(session.getAttribute("m_id")==null){%>  <%-- ��α��� ȭ�� --%>
   
</br></br></br><center><FONT size="6" color="gray" face="Impact">��������������������������������
��Ÿ��</center></FONT>
      <center><a href="../test2/MainForm_man_area.jsp">
		<img src="../Image/jido.jpg" width="550" height="550" /></a>   <%-- ���� ����â���� �̵� --%>
		
		      <a href="../test2/MainForm_man_style.jsp">
		<img src="../Image/Style.jpg" width="550" height="550"/></a>  <%-- ��Ÿ�� ����â���� �̵� --%></center>	
  </tr>
 <%}else{%> <%-- �α��� ȭ�� --%>
</br></br></br><center><FONT size="6" color="gray" face="Impact">��������������������������������
��Ÿ��</center></FONT>
      <center><a href="../test2/MainForm_man_area.jsp">
		<img src="../Image/jido.jpg" width="550" height="550" /></a>   <%-- ���� ����â���� �̵� --%>		
	      <a href="../test2/MainForm_man_style.jsp">
		<img src="../Image/Style.jpg" width="550" height="550"/></a>  <%-- ��Ÿ�� ����â���� �̵� --%></center>
<%}
 }catch(NullPointerException e){}
 %>
</html>