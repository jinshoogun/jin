<%@ page contentType = "text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import = "Style.rDAO" %>
<%@ page import = "Style.DTO" %>
<%@ page import = "java.text.SimpleDateFormat" %>
<%
request.setCharacterEncoding("EUC-KR"); %>
<html>
<head>
<title>����</title>
<link href="style.css" rel="stylesheet" type="text/css">
</head>

<%
   int r_num = Integer.parseInt(request.getParameter("r_num"));
   String pageNum = request.getParameter("pageNum");

   SimpleDateFormat sdf = 
        new SimpleDateFormat("yyyy-MM-dd HH:mm");

   try{
      rDAO dbPro = rDAO.getInstance();
      DTO reservation =  dbPro.getReservation(r_num);
  
	 
	  int back = (int)(r_num-1);
	  int forward = (int)(r_num+1);
%>
<body >  
<center><b>���� ���� ����</b>
<br>
<form>
<table width="500" border="1" cellspacing="0" cellpadding="0" align="center">  
  <tr height="30">
    <td align="center" width="125">���� ��ȣ</td>
    <td align="center" width="125" align="center">
	     <%=reservation.getR_num()%></td>
	     
    <td align="center" width="125" >������</td>
    <td align="center" width="125" align="center">
	     <%=reservation.getR_name()%></td>
  </tr>
  <tr height="30">
    <td align="center" width="125">��</td>
    <td align="center" width="125" align="center">
	     <%=reservation.getR_store()%></td>
    <td align="center" width="125"   >�����̳�</td>
    <td align="center" width="125" align="center">
	     <%=reservation.getR_designer()%></td>
  </tr>
  <tr height="30">
    <td align="center" width="125"  >��Ÿ��</td>
    <td align="center" width="375" align="center" colspan="3">
	     <%=reservation.getR_style()%></td>
  </tr>
  <tr>
    <td align="center" width="125"  >���� ��¥</td>
    <td align="left" width="375" colspan="3"><%=reservation.getR_date()%>-<%=reservation.getR_start()%>�� -<%=reservation.getR_end()%>��</td>
  </tr>
  <tr height="30">
    <td align="center" width="125"  >�ü� ���</td>
    <td align="center" width="375" align="center" colspan="3">
	     <%=reservation.getR_cost()%></td>
  </tr>
  
  
  <tr height="30">      
    <td colspan="4"   align="right" > 
    <%if(session.getAttribute("m_id")!=null) {%>
	    <%
	         String id = (String)session.getAttribute("m_id");
	         if(id.equals(reservation.getR_name())){
	    %>
    
      
       <input type="button" value="�۸��" 
       onclick="document.location.href='../test2/mainform6.jsp?pageNum=<%=pageNum%>'">

</table>    
<%}}
 }catch(Exception e){} 
 %>
</form>      
</body>
</html>      
