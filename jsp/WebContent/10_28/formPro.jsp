<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

    
    <%request.setCharacterEncoding("euc-kr"); %>
    <jsp:useBean class = "test.bean.DTO" id ="dto" /> 
    <jsp:setProperty name = "dto" property = "id" /> 
    <%--property에 *넣으면 객체와 property간 매칭을 시켜서 자동으로 넣는다. --%>
    <jsp:setProperty name = "dto" property = "pw" />
    <jsp:setProperty name = "dto" property = "age" />
    <jsp:setProperty name = "dto" property = "name" />
    
 
    <%-- 객체를 생성하는 태그 usebean  
    DTO dto = new DTO();
    dto.setId(request.getParameter("id"));
     같은 뜻--%>
    
    <font size ="6">
    id : <jsp:getProperty name = "dto" property = "id" /> <br /> <%-- property에 *넣으면 안됩니다. --%>
    pw : <jsp:getProperty name = "dto" property = "pw" /> <br />
    name : <jsp:getProperty name = "dto" property = "name" /> <br />
    age : <jsp:getProperty name = "dto" property = "age" /> <br />
</font>