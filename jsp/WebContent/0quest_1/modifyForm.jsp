<%@ page contentType="text/html;charset=euc-kr" %>
<%@ page import = "obj140.bean.*" %>

<html>
<head>


<%
    String id = (String)session.getAttribute("memId");
   
    DAO manager = DAO.getInstance();
    DTO c = manager.getMember(id);
// memid�� ���� ������ ����ǰ� ���������� ������ �� �ִ� ������ getInstance�� ���� ������ �մϴ�.
// �̶� getmMember���� id�� ���� c�����ٰ� ������ �ϰ� �ȴ�.
	try{
%>

<body>
<form method="post" action="modifyPro.jsp" name="userinput" onsubmit="return checkIt()">
<%-- �� ���� modifyPro.jsp���ٰ� ������ ������. �׸��� userinput���� ���Ͻ��Ͽ� ������ �� �ְ��ϸ� ����, q1�� �ִ� checkIt()�޼ҵ带 ������ �ϱ� ���� Ȯ���� �ϰ� �˻��� �ڿ� ������ �Ǿ�����.--%>
  <table width="600" border="1" cellspacing="0" cellpadding="3"  align="center">
    <tr> 
      <td colspan="2" height="39"  align="center">
	     <font size="+1" ><b>ȸ�� ��������</b></font></td>
    </tr>
    <tr>
      <td colspan="2" class="normal" align="center">ȸ���� ������ �����մϴ�.</td>
    </tr>
     <tr> 
      <td width="200"><b>���̵� �Է�</b></td>
      <td width="400">&nbsp;</td>
    <tr>  

    <tr> 
      <td  width="200"> ����� ID</td>
      <td  width="400"><%=c.getId()%></td>
    </tr> <%-- DTO�� �ִ� getId���� �ҷ����´�.  --%>
    
     <tr> 
      <td width="200"> ��й�ȣ</td>
      <td width="400"> 
        <input type="password" name="pw" size="10" minlength="6" value="<%=c.getPw()%>">
      </td> <%-- DTO�� �ִ� getPw��(���)�� �ҷ����´�. ��, input���� ������ �����ϰ� ���������.  --%>
    <tr>  
    <tr> 
      <td  width="200"><b>�������� �Է�</b></td>
      <td width="400">&nbsp;</td>
    <tr>  
    <tr> 
      <td   width="200">����� �̸�</td>
      <td  width="400"> 
        <%=c.getNa()%> <%-- DTO�� �ִ� getNa��(�̸�)�� �ҷ����´�. ��, input���� ������ �����ϰ� ���������.  --%>
      </td>
    </tr>
        <tr> 
      <td  width="200">����</td>
      <td  width="400"> 
        <%=c.getA()%> <%-- DTO�� �ִ� getA���� �ҷ����´�.  --%>
      </td>
    </tr>
    <tr> 
      <td width="200">�ּ�</td>
      <td width="400"> 
        <input type="text" name = "add" size ="40" minlength = "10" value="<%=c.getAdd()%>">
      </td> <%-- DTO�� �ִ� getAdd(�ּ� )���� �ҷ����´�. ��, input���� ������ �����ϰ� ���������.--%>
    </tr>
   <tr> 
      <td width="200">E-Mail</td>
      <td width="400">
          <input type="text" name="email" size="40" maxlength="30" value="<%=c.getEmail()%>">	
      </td> <%-- DTO�� �ִ� getEmail(�̸���)���� �ҷ����´�. ��, input���� ������ �����ϰ� ���������.--%>
      <tr> 
      <td width="200">��ȭ��ȣ</td>
      <td width="400">
          <input type="text" name="phone" size="40" maxlength="30" value="<%=c.getPhone()%>">	
      </td>  <%-- DTO�� �ִ� getPhone(��ȭ��ȣ)���� �ҷ����´�. ��, input���� ������ �����ϰ� ���������.--%>
    </tr>
       <tr> 
      <td width="200">�̸��� ���� ����</td>
      <td width="400">
       <%=c.getB()%> �����Դϴ�.
      <input type="radio" name="b" value="����" />Y <input type="radio" name="b" value="����" />N</td>
    </tr> <%-- DTO�� �ִ� getB(�̸��� ����)���� �ҷ����´�. ��, input����  B���� ���õǾ� ������ �����ϰ� ���������.--%>
    <tr> 
      <td width="200">�г��Ӽ���</td>
      <td width="400"> 
          <input type="text" name="nick" size="60" maxlength="50" value="<%=c.getNick()%>">
      </td><%-- DTO�� �ִ� getNick(�г���)���� �ҷ����´�. ��, input���� ������ �����ϰ� ���������.--%>
    </tr>   
      <td width="200">�Ұ���</td>
      <td width="400"> 
          <input type="text" name="intru" size="60" maxlength="2000" value="<%=c.getIntru()%>">
      </td> <%-- DTO�� �ִ� getIntru(�Ұ���)���� �ҷ����´�. ��, input���� ������ �����ϰ� ���������.--%>
    </tr>      
    <tr> 
      <td> 
       <input type="submit" name="modify" value="��   ��" > <%-- �� ���������� ����� submit�� ���� modifyPro.jsp���� ��������.--%>
       <input type="button" value="��  ��" onclick="javascript:window.location='main.jsp'">      
      </td> <%-- ��ҹ�ư�� ���� main.jsp���� �̵��� �ϰԵȴ�.--%>
    </tr>
  </table>
</form>
</body>
<%}catch(Exception e){}%>
</html>