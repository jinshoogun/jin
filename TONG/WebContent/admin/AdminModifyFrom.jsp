<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="ADMIN.DATADB.bean.DAO"%>
<%@ page import="ADMIN.DATADB.bean.DTO"%>
<%
    String a_num = request.getParameter("a_num");
    System.out.println(a_num);
    
    int num = Integer.parseInt(a_num);
    DAO manager = DAO.getInstance();
    DTO c = manager.updateGetAdmin(num);
    System.out.println(num);
	try{
%>
<body>
<form method="post" action="AdminModifyPro.jsp" name="userinput" onsubmit="return checkIt()">
  <table width="600" border="1" cellspacing="0" cellpadding="3"  align="center">
    <tr> 
      <td colspan="2" height="39"  align="center">
	     <font size="+1" ><b>������ ���� ��������</b></font></td>
    </tr>
    <tr>
      <td colspan="2" class="normal" align="center">������ ������ ������ �����մϴ�.</td>
    </tr>
     <tr> 
      <td width="200"><b>���̵� �Է�</b></td>
      <td width="400">&nbsp;</td>
    <tr>  

    <tr> 
      <td  width="200"> ����� ID</td>
      <td  width="400"><%=c.getA_id()%></td>
    </tr>
     <tr> 
      <td width="200"> ��й�ȣ</td>
      <td width="400"> 
        <input type="password" name="password" size="10" minlength="6" value="<%=c.getA_password()%>">
      </td>
    <tr>  
    <tr> 
      <td  width="200"><b>�������� �Է�</b></td>
      <td width="400">&nbsp;</td>
    <tr>  
    <tr> 
      <td  width="200">����� �̸�</td>
      <td  width="400"> 
        <%=c.getA_name()%>
      </td>
    </tr>
   <tr> 
      <td width="200">E-Mail</td>
      <td width="400">
          <input type="text" name="email" size="40" maxlength="30" value="<%=c.getA_email()%>">	
      </td>
      <tr> 
      <td width="200">��ȭ��ȣ</td>
      <td width="400">
          <input type="text" name="phone" size="40" maxlength="30" value="<%=c.getA_phone()%>">	
      </td>
    </tr>
      <td> 
       <input type="submit" name="modify" value="��   ��" >
       <input type="button" value="��  ��" onclick="javascript:window.location='main.jsp'">      
      </td>
    </tr>
  </table>
</form>
</body>
<%}catch(Exception e){}%>
</html>