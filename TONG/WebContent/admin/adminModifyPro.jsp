<%@ page contentType="text/html;charset=euc-kr" %>
<%@ page import="adminDATADB.bean.DAO"%>
<%@ page import="adminDATADB.bean.DTO"%>


<% request.setCharacterEncoding("euc-kr");%>

<jsp:useBean id="admin" class="adminDATADB.bean.DTO">
<jsp:setProperty name="admin" property="*" />
</jsp:useBean>
 
<%
String a_num = (String)session.getAttribute("a_num");
admin.setA_num(a_num);

DAO manager = DAO.getInstance();
manager.updateAdmin(admin);
 %>
 
<link href="style.css" rel="stylesheet" type="text/css">

<table width="500" border="0" cellspacing="0" cellpadding="5" align="center">
  <tr> 
    <td height="39"  align="center">
	  <font size="+1" ><b>ȸ�������� �����Ǿ����ϴ�.</b></font></td>
  </tr>
  <tr>
    <td align="center"> 
      <p>�Է��Ͻ� ������ ������ �Ϸ�Ǿ����ϴ�.</p>
    </td>
  </tr>
  <tr>
    <td align="center"> 5���Ŀ� �������� �̵��մϴ�.</td>
    </tr>
    <tr><td align="center">
      <form>
	    <input type="button" value="��������" onclick="window.location='adminModify.jsp'">
      </form><meta http-equiv="Refresh" content="5;url=adminModify.jsp" >
    </td>
  </tr>
</table>
</body>
</html>
