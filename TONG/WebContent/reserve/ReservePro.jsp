<%@ page contentType="text/html;charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ page import = "Style.rDAO" %>
<%@ page import = "java.sql.Timestamp" %>

<% request.setCharacterEncoding("EUC-KR");%>

<jsp:useBean id="reservation" scope="page" class="Style.DTO">
   <jsp:setProperty name="reservation" property="*"/>
</jsp:useBean>
 
<%
    reservation.setR_reg_date(new Timestamp(System.currentTimeMillis()) );

    rDAO dbPro = rDAO.getInstance();
    dbPro.insertReservation(reservation);

    response.sendRedirect("../reserve/MyReserveList.jsp");
%>
