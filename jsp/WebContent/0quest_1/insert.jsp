<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@page import="obj140.bean.DAO"%>

<% request.setCharacterEncoding("euc-kr");%>

<jsp:useBean id= "dto" class ="obj140.bean.DTO" />
<jsp:setProperty name= "dto" property ="*" />

<%-- obj140.bean DAO�� �Ķ���� ���� �ҷ����´�. jsp�� get�� ���� ����ϴ� ���� �ƴ�  usebean�� ���� ������ java�ڵ�� html �ڵ带 �ִ��� �����ϱ� ���ؼ� ����Ͽ��� --%>

<% DAO dao = new DAO();
   dao.insert(dto);//DAO�� insert �޼ҵ� ����
   out.println("<h3>������ �Ϸ�Ǽ̽��ϴ�!.<h3/>"); //�޼ҵ� ���� �� ������Դϴ�.
   %>
   
   <tr> 
      <td colspan="2" align="center"> 
          <input type="button" name="confirm" value="Ȯ��" onclick="javascript:window.location='main.jsp'">
          <%-- ������ �Ͽ��ٴ� ����� ���� Ȯ���� main.jsp�� �������ϴ�. --%>
      </td>
	

    
