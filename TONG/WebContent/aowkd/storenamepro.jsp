<%@ page language="java" contentType="text/html; charset=EUC-KR"
pageEncoding="EUC-KR"%>
<% 

request.setCharacterEncoding("EUC-KR");%>
<%@page import="DATADB.bean.DAO"%>
<%@ include file = "../test2/mainform5.jsp" %>


<jsp:useBean id="DTO" class ="DATADB.bean.DTO" />
<jsp:setProperty name="DTO" property ="*" />

<%--obj140.bean DAO�� �Ķ���� ���� �ҷ����´�. jsp�� get�� ���� ����ϴ� ���� �ƴ�  usebean�� ���� ������ java�ڵ�� html �ڵ带 �ִ��� �����ϱ� ���ؼ� ����Ͽ��� --%>

<center><% DAO dao = new DAO();
   dao.insertMembership(DTO);//DAO�� insert �޼ҵ� ����
   out.println("<h3>������ �Ϸ�Ǽ̽��ϴ�!.<h3/>"); //�޼ҵ� ���� �� ������Դϴ�.</br>
   out.println("<h3>3���� �������� ���ư��ϴ�.");
   %></center>
   
   <tr> 
   
          <center><input type="button" value="��������" onclick="window.location='../test2/mainform6.jsp'">
      </form><meta http-equiv="Refresh" content="3;url=../test2/mainform6.jsp" ></center>
    </td>
  </tr>
</table>
</body>
</html>

    