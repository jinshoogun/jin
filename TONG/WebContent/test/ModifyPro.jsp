<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>r"%>
<%@ page import="DATADB.bean.DAO"%>
<%@ page import="DATADB.bean.DTO" %>


<%
	request.setCharacterEncoding("euc-kr");
%>

<jsp:useBean id="membership" class="DATADB.bean.DTO">
	<jsp:setProperty name="membership" property="*" />
</jsp:useBean>

<%
   // <modifyForm.jsp> ���� "����" ��ư�� ������ ����Ǵ� pro �ҽ��̴�.

    String id = (String)session.getAttribute("m_id");
	membership.setM_id(id);

	DAO manager = DAO.getInstance();
   	manager.updateMembership(membership);  //ȸ���������� �޼��� , updateMember()�޼��带 ����ؼ� �����Ѵ�.
%>


<table width="270" border="0" cellspacing="0" cellpadding="5" align="center">
 <tr bgcolor="white">
 <td height="39" align="center">
  <font size="+1"><b>ȸ�������� �����Ǿ����ϴ�.</b></font></td>
  </tr>
  <tr>
  <td bgcolor="white" align="center">
  <p>�Է��Ͻ� ������ ������ �Ϸ�Ǿ����ϴ�.  </p>
  </td>
  </tr>
  <tr>
  <td bcolor="white" align="center">
  <form>
  <input type="button" value="��������" onclick="window.location='main.jsp'">
  </form>
  </td>
  </tr>
  </table>
  </body>
  </html>
  