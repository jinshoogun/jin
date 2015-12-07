<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@page import="obj140.bean.DAO"%>

<% request.setCharacterEncoding("euc-kr");%>

<jsp:useBean id= "dto" class ="obj140.bean.DTO" />
<jsp:setProperty name= "dto" property ="*" />

<%-- obj140.bean DAO의 파라미터 값을 불러들어온다. jsp에 get을 통해 사용하는 것이 아닌  usebean을 통해 가져와 java코드와 html 코드를 최대한 구분하기 위해서 사용하였다 --%>

<% DAO dao = new DAO();
   dao.insert(dto);//DAO에 insert 메소드 실행
   out.println("<h3>가입이 완료되셨습니다!.<h3/>"); //메소드 실행 뒤 결과문입니다.
   %>
   
   <tr> 
      <td colspan="2" align="center"> 
          <input type="button" name="confirm" value="확인" onclick="javascript:window.location='main.jsp'">
          <%-- 가입을 하였다는 결과를 보고 확인은 main.jsp로 보내집니다. --%>
      </td>
	

    
