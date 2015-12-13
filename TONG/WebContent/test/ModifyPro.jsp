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
   // <modifyForm.jsp> 에서 "수정" 버튼을 누르면 실행되는 pro 소스이다.

    String id = (String)session.getAttribute("m_id");
	membership.setM_id(id);

	DAO manager = DAO.getInstance();
   	manager.updateMembership(membership);  //회원정보수정 메서드 , updateMember()메서드를 사용해서 수정한다.
%>


<table width="270" border="0" cellspacing="0" cellpadding="5" align="center">
 <tr bgcolor="white">
 <td height="39" align="center">
  <font size="+1"><b>회원정보가 수정되었습니다.</b></font></td>
  </tr>
  <tr>
  <td bgcolor="white" align="center">
  <p>입력하신 내용대로 수정이 완료되었습니다.  </p>
  </td>
  </tr>
  <tr>
  <td bcolor="white" align="center">
  <form>
  <input type="button" value="메인으로" onclick="window.location='main.jsp'">
  </form>
  </td>
  </tr>
  </table>
  </body>
  </html>
  