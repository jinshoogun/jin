<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>

    <h2>Hello Servlet result => view</h2>
    <font size = "6">
    memId : ${memId}<br /> <%--request.getAttribute("msg"); --%>
    memId : ${memId}<br />
    memId : ${requestScope.memId}<br /> <%--request.getAttribute("msg"); --%>
    memId : ${sessionScope.memId}<br />
    </font>
    <%-- request와 session 구분시 사용하나 session일때 필수적으로 사용할 수 있도록 한다. --%>
    
    