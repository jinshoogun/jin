<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="adminDATADB.bean.DAO"%>
<%@ page import="adminDATADB.bean.DTO"%>
<%

	
    String num = request.getParameter("m_num");
    DAO manager = DAO.getInstance();
    DTO dto = manager.updateGetUser(num);
    
	try{
%>
<body>
<form method="post" action="userModifyPro.jsp" name="user">
  <table width="700" border="1" cellspacing="0" cellpadding="3"  align="center">
    <tr> 
      <td colspan="2" height="39"  align="center">
	     <font size="+1" ><b>일반 계정 정보수정</b></font></td>
    </tr>
    <tr>
      <td colspan="2" align="center">유져 계정의 정보를 수정합니다.</td>
    </tr>
     <tr> 
      <td width="200"><b>비밀번호 입력</b></td>
      <td width="500">&nbsp;</td>
       <input type="hidden" name="m_num" size="10" value="<%=dto.getM_num()%>">
    <tr>  
    <tr> 
      <td  width="200"> 사용자 ID</td>
      <td  width="500"><%=dto.getM_id()%></td>
    </tr>
     <tr> 
      <td width="200"> 비밀번호</td>
      <td width="500"> 
        <input type="password" name="m_password" size="10" value="<%=dto.getM_password()%>">
      </td>
    <tr>  
    <tr> 
      <td  width="200"><b>개인정보 입력</b></td>
      <td width="500">&nbsp;</td>
    <tr>  
    <tr> 
      <td  width="200">사용자 이름</td>
      <td  width="500"> 
        <%=dto.getM_name()%>
      </td>
    </tr>
   <tr> 
      <td width="200">E-Mail</td>
      <td width="500">
          <input type="text" name="m_email" size="40" maxlength="30" value="<%=dto.getM_email()%>">	
      </td>
      <tr> 
      <td width="200">전화번호</td>
      <td width="500">
          <input type="text" name="m_phone" size="40" maxlength="30" value="<%=dto.getM_phone()%>">	
      </td>
    </tr>
    <tr> 
      <td width="200">생일</td>
      <td width="500">
          <input type="text" name="m_birth" size="40" maxlength="30" value="<%=dto.getM_birth()%>">	
      </td>
    </tr>
      <td colspan="2"> 
       <input type="submit" name="modify" value="수   정" >
       <input type="button" value="취  소" onclick="javascript:window.location='userModify.jsp'">      
      </td>
    </tr>
  </table>
</form>
</body>
<%}catch(Exception e){}%>
</html>