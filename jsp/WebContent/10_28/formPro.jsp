<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

    
    <%request.setCharacterEncoding("euc-kr"); %>
    <jsp:useBean class = "test.bean.DTO" id ="dto" /> 
    <jsp:setProperty name = "dto" property = "id" /> 
    <%--property�� *������ ��ü�� property�� ��Ī�� ���Ѽ� �ڵ����� �ִ´�. --%>
    <jsp:setProperty name = "dto" property = "pw" />
    <jsp:setProperty name = "dto" property = "age" />
    <jsp:setProperty name = "dto" property = "name" />
    
 
    <%-- ��ü�� �����ϴ� �±� usebean  
    DTO dto = new DTO();
    dto.setId(request.getParameter("id"));
     ���� ��--%>
    
    <font size ="6">
    id : <jsp:getProperty name = "dto" property = "id" /> <br /> <%-- property�� *������ �ȵ˴ϴ�. --%>
    pw : <jsp:getProperty name = "dto" property = "pw" /> <br />
    name : <jsp:getProperty name = "dto" property = "name" /> <br />
    age : <jsp:getProperty name = "dto" property = "age" /> <br />
</font>