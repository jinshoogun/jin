<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

    
    <h2>b.jsp..~~~~</h2>
    
    <%--
String id = request.getParameter("id");
String view = "c.jsp";
if(id ==null){
	view = "a.jsp";
}

--%>
 <jsp:forward page = "c.jsp" >
   
    <jsp:param name = "id" value ="javajava" />
    </jsp:foward>
   