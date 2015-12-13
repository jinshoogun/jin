<%@ page language="java" contentType="text/html; charset=EUC-KR"
pageEncoding="EUC-KR"%>
<% 

request.setCharacterEncoding("EUC-KR");%>
<%@page import="DATADB.bean.DAO"%>
<%@ include file = "../test2/mainform5.jsp" %>


<jsp:useBean id="DTO" class ="DATADB.bean.DTO" />
<jsp:setProperty name="DTO" property ="*" />

<%--obj140.bean DAO의 파라미터 값을 불러들어온다. jsp에 get을 통해 사용하는 것이 아닌  usebean을 통해 가져와 java코드와 html 코드를 최대한 구분하기 위해서 사용하였다 --%>

<center><% DAO dao = new DAO();
   dao.insertMembership(DTO);//DAO에 insert 메소드 실행
   out.println("<h3>가입이 완료되셨습니다!.<h3/>"); //메소드 실행 뒤 결과문입니다.</br>
   out.println("<h3>3초후 메인으로 돌아갑니다.");
   %></center>
   
   <tr> 
   
          <center><input type="button" value="메인으로" onclick="window.location='../test2/mainform6.jsp'">
      </form><meta http-equiv="Refresh" content="3;url=../test2/mainform6.jsp" ></center>
    </td>
  </tr>
</table>
</body>
</html>

    