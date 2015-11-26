<%@ page contentType="text/html;charset=euc-kr" %>
<%@ page import="adminDATADB.bean.DAO"%>
<%@ page import="adminDATADB.bean.DTO"%>


<% request.setCharacterEncoding("euc-kr");%>

<jsp:useBean id="user" class="adminDATADB.bean.DTO">
<jsp:setProperty name="user" property="*" />
</jsp:useBean>

<%
/* admin.setA_password(request.getParameter("a_password"));
admin.setA_birth(request.getParameter("a_birth"));
admin.setA_email(request.getParameter("a_email"));
admin.setA_phone(request.getParameter("a_phone")); */



String m_num = request.getParameter("m_num");
user.setM_num(m_num);

DAO manager = DAO.getInstance();
manager.updateUser(user);



%>



<table width="500" border="0" cellspacing="0" cellpadding="5" align="center">
  <tr> 
    <td height="39"  align="center">
	  <font size="+1" ><b>회원정보가 수정되었습니다.</b></font></td>
  </tr>
  <tr>
    <td align="center"> 
      <p>입력하신 내용대로 수정이 완료되었습니다.</p>
    </td>
  </tr>
  <tr>
    <td align="center"> 5초후에 메인으로 이동합니다.</td>
    </tr>
    <tr><td align="center">
      <form>
	    <input type="button" value="메인으로" onclick="window.location='userModify.jsp'">
      </form><meta http-equiv="Refresh" content="5;url=userModify.jsp" >
    </td>
  </tr>
</table>
</body>
</html>
