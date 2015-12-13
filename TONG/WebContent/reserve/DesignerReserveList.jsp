
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "Style.DTO" %>
<%@ page import = "Style.rDAO" %>
<%@ page import = "java.util.List" %>
<%@ page import = "java.text.SimpleDateFormat" %>
<%@ include file ="../test2/mainform8.jsp" %>

<%
request.setCharacterEncoding("EUC-KR"); %>
<%
	try {
%>

<%
    int pageSize = 20;
    SimpleDateFormat sdf = 
        new SimpleDateFormat("yyyy-MM-dd HH:mm");
%>

<%
    String pageNum = request.getParameter("pageNum");
	String R_num = request.getParameter("r_num");
    if (pageNum == null) {
        pageNum = "1";
    }

    int currentPage = Integer.parseInt(pageNum);
    int startRow = (currentPage - 1) * pageSize + 1;
    int endRow = currentPage * pageSize;
    int count = 0;
    int number=0;
    

    List designerList = null;
    rDAO dbPro = rDAO.getInstance();
    count = dbPro.getReservationCount();
    if (count > 0) {
    	String designer = (String)session.getAttribute("d_id");
       designerList = dbPro.getDesignerList(designer);
    }

	number=count-(currentPage-1)*pageSize;
%>
<html>
<head>
<title>�Խ���</title>
<link href="style.css" rel="stylesheet" type="text/css">
</head>

<body>
<center><b>�۸��</b>
<table width="700">
<tr>
    <td align="right" >
    
    
    <%if(session.getAttribute("d_id")==null) {%>
    
    <a href="/JSP/member/main.jsp">�α���</a>
    <%}%>
    </td>
</table>

<%
    if (count == 0) {
%>
<table width="700" border="1" cellpadding="0" cellspacing="0">
<tr>
    <td align="center">
    �Խ��ǿ� ����� ���� �����ϴ�.
    </td>
</table>

<%  } else {    %>
<table border="1" width="700" cellpadding="0" cellspacing="0" align="center"> 
    <tr height="30" > 
      <td align="center"  width="50"  >�� ȣ</td> 
      <td align="center"  width="100" >������</td> 
      <td align="center"  width="100" >���� </td> 
      <td align="center"  width="100" >�����̳�</td> 
      <td align="center"  width="100" >��Ÿ��</td>
      <td align="center"  width="250" >���� ��¥</td> 


    </tr>
    
<%  
        for (int i = 0 ; i < designerList.size() ; i++) {
          DTO reservation = (DTO)designerList.get(i);
%>
   <tr height="30">
    <td align="center"  width="50" > <%=number++%></td>
    <td  width="250" >
	<%
	      int wid=0; 
	%>
           
      <a href="Reservation.jsp?r_num=<%=reservation.getR_num()%>&pageNum=<%=currentPage%>">
           <%=reservation.getR_name()%></a> 
           </td>
           <td align="center"  width="150"><%= reservation.getR_store()%></td>
           <td align="center"  width="150"><%= reservation.getR_designer()%></td>
           <td align="center"  width="150"><%= reservation.getR_style()%></td>
    <td align="center"  width="150"><%= reservation.getR_start()%>~<%=reservation.getR_end() %></td>
  </tr>
     <%}%>
</table>
<%}%>

<%
    if (count > 0) {
        int pageCount = count / pageSize + ( count % pageSize == 0 ? 0 : 1);
		 
        int startPage = (int)(currentPage/10)*10+1;
		int pageBlock=10;
        int endPage = startPage + pageBlock-1;
        if (endPage > pageCount) endPage = pageCount;
        
        if (startPage > 10) {    %>
        <a href="DesignerReserveList.jsp?pageNum=<%= startPage - 10 %>">[����]</a>
<%      }
        for (int i = startPage ; i <= endPage ; i++) {  %>
        <a href="DesignerReserveList.jsp?pageNum=<%= i %>">[<%= i %>]</a>
<%
        }
        if (endPage < pageCount) {  %>
        <a href="DesignerReserveList.jsp?pageNum=<%= startPage + 10 %>">[����]</a>
<%
        }
    }
%>
<% } catch (NullPointerException e) {
}
%>
</center>
</body>
</html>