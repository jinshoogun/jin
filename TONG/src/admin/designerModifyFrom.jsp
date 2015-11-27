<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="adminDATADB.bean.DAO"%>
<%@ page import="adminDATADB.bean.DTO"%>
<%

	
    String num = request.getParameter("d_num");
    DAO manager = DAO.getInstance();
    DTO dto = manager.updateGetDesigner(num);
    
   
	try{
%>
<body>
<form method="post" action="designerModifyPro.jsp" name="designer">
  <table width="700" border="1" cellspacing="0" cellpadding="3"  align="center">
    <tr> 
      <td colspan="2" height="39"  align="center">
	     <font size="+1" ><b>디자이너 계정 정보수정</b></font></td>
    </tr>
    <tr>
      <td colspan="2" align="center">디자이너 계정의 정보를 수정합니다.</td>
    </tr>
     <tr> 
      <td width="200"><b>비밀번호 입력</b></td>
      <td width="500">&nbsp;</td>
       <input type="hidden" name="d_num" size="10" value="<%=dto.getD_num()%>">
    <tr>  
    <tr> 
      <td  width="200"> 사용자 ID</td>
      <td  width="500"><%=dto.getD_id()%></td>
    </tr>
     <tr> 
      <td width="200"> 비밀번호</td>
      <td width="500"> 
        <input type="password" name="d_password" size="10" value="<%=dto.getD_password()%>">
      </td>
    <tr>  
    <tr> 
      <td  width="200"><b>개인정보 입력</b></td>
      <td width="500">&nbsp;</td>
    <tr>  
    <tr> 
      <td  width="200">사용자 이름</td>
      <td  width="500"> 
        <%=dto.getD_name()%>
      </td>
    </tr>
   <tr> 
      <td width="200">E-Mail</td>
      <td width="500">
          <input type="text" name="d_email" size="40" maxlength="30" value="<%=dto.getD_email()%>">	
      </td>
      <tr> 
      <td width="200">전화번호</td>
      <td width="500">
          <input type="text" name="d_phone" size="40" maxlength="30" value="<%=dto.getD_phone()%>">	
      </td>
    </tr>
    <tr> 
      <td width="200">생일</td>
      <td width="500">
          <input type="text" name="d_birth" size="40" maxlength="30" value="<%=dto.getD_birth()%>">	
      </td>
    </tr>
    <tr> 
      <td  width="200"><b>매장정보 입력</b></td>
      <td width="500">&nbsp;</td>
      </tr>
      <td width="200">매장명</td>
      <td width="500">
          <input type="text" name="d_store" size="40" maxlength="30" value="<%=dto.getD_store()%>">	
      </td>
      <tr> 
      <td width="200">닉네임</td>
      <td width="500">
          <input type="text" name="d_nickname" size="40" maxlength="30" value="<%=dto.getD_nickname()%>">	
      </td>
    </tr> 
      <td colspan="2"> 
       <input type="submit" name="modify" value="수   정" >
       <input type="button" value="취  소" onclick="javascript:window.location='designerModify.jsp'">      
      </td>
    </tr>
  </table>
</form>
</body>
<%}catch(Exception e){}%>
</html>