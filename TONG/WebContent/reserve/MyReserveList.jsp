
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "Style.DTO" %>
<%@ page import = "Style.rDAO" %>
<%@ page import = "java.util.List" %>
<%@ page import = "java.text.SimpleDateFormat" %>
<%@ include file ="../test2/mainform5.jsp" %>

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

    List reservationList = null;
    rDAO dbPro = rDAO.getInstance();
    count = dbPro.getReservationCount();
    if (count > 0) {
    	String name = (String)session.getAttribute("m_id");
        reservationList = dbPro.getMyList(name);
    }

	number=count-(currentPage-1)*pageSize;
%>
<html>
<head>
<title>게시판</title>
<link href="style.css" rel="stylesheet" type="text/css">
</head>

<body>
<center><b>글목록(전체 글:<%=count%>)</b>
<table width="700">
<tr>
    <td align="right" >
    
    
    <%if(session.getAttribute("m_id")!=null) {%>
    <a href="StyleForm.jsp">목록</a>
    <%} else { %>
    <a href="/JSP/member/main.jsp">로그인</a>
    <%}%>
    </td>
</table>

<%
    if (count == 0) {
%>
<table width="700" border="1" cellpadding="0" cellspacing="0">
<tr>
    <td align="center">
    게시판에 저장된 글이 없습니다.
    </td>
</table>

<%  } else {    %>
<table border="1" width="700" cellpadding="0" cellspacing="0" align="center"> 
    <tr height="30" > 
      <td align="center"  width="50"  >번 호</td> 
      <td align="center"  width="100" >예약자</td> 
      <td align="center"  width="100" >매장 </td> 
      <td align="center"  width="100" >디자이너</td> 
      <td align="center"  width="100" >스타일</td>
      <td align="center"  width="250" >예약 날짜</td>  
    </tr>
<%  
        for (int i = 0 ; i < reservationList.size() ; i++) {
          DTO reservation = (DTO)reservationList.get(i);
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
        <a href="MyReserveList.jsp?pageNum=<%= startPage - 10 %>">[이전]</a>
<%      }
        for (int i = startPage ; i <= endPage ; i++) {  %>
        <a href="MyReserveList.jsp?pageNum=<%= i %>">[<%= i %>]</a>
<%
        }
        if (endPage < pageCount) {  %>
        <a href="MyReserveList.jsp?pageNum=<%= startPage + 10 %>">[다음]</a>
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