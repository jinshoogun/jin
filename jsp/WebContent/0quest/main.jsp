<%@ page  contentType="text/html; charset=euc-kr"%>
<%
try{
if(session.getAttribute("memId")==null){
	   %> <%-- ���ǿ����ϴµ� memId�� ������ ������ �մϴ�. else������ ������ null������ �α׾ƿ� ������ ��� ������ ȭ���� �ǹ��մϴ�. --%>

  <table width=750  align="center" border="1" >
      <tr>
       <td width="500"  height="30">
       &nbsp;
       </td>
   
       <form name="inform" method="get" action="loginPro.jsp"> 
        <%-- �� ���� inform�̶�� �̸��� ���Ƽ� post�� ���̵� ��й�ȣ�� �������� �ʰ�  loginPro.jsp���� �Ѱ� �ݴϴ�.  --%>

        <td width="100" align="center">���̵�</td>
        <td width="100" >
            <input type="text" name="id" size="15" maxlength="10"></td>
      </tr>
      <tr > 
         <td rowspan="2" width="500" align="center">�α����ϼ���!</td>
         <td width="200" align="center">�н�����</td>
         <td width="200" bgcolor=>
            <input type="password" name="pw" size="15" maxlength="10"></td>
       </tr>
       <tr>
          <td colspan="3" align="center">
            <input type="submit" name="Submit" value="�α���"> <%-- �Էµ� ����� submit�� ���� loginPro���� �����մϴ�. --%>
            <input type="button"  value="ȸ������" onclick="javascript:window.location='q1.jsp'">
            <%-- submit�� �̹� �α��ι�ư�� ���Ǿ��� ������ onclick�� ���� q1.jsp�� ������ �ϰ� �˴ϴ�. --%>
          </td></form></tr></table>
     <%}else{%> <%-- x = -1�� ��� ���� �ް� �Ǹ� �α��� ���·� ������ �˴ϴ�. --%>
       <table width=500 align="center" border="1" >
         <tr>
           <td width="300"  height="20">�ȳ��ϼ���!</td>

           <td rowspan="3" align="center">
             <%=session.getAttribute("memId")%>���� <br>
             �湮�ϼ̽��ϴ� <%-- ����� ���̵�� �湮�̵Ǿ��ٴ� ������� ������ �˴ϴ�. --%>
             <form  method="post" action="logout.jsp">  <%-- logout.jsp�� memId���� �Ѿ�� �˴ϴ�. --%>
             <input type="submit"  value="�α׾ƿ�" >
             <input type="button" value="ȸ����������" onclick="javascript:window.location='modify.jsp'" >
             </form> <%-- ȸ�������� �ٲٱ� ���� onclick�� ���� modify.jsp ���Ϸ� ������ �Ǿ����ϴ�. --%>
         </td>
        </tr>
       <tr > 
         <td rowspan="2" width="300" >�����������Դϴ�</td>
      </tr>
     </table>
     <br>
 <%}
 }catch(NullPointerException e){}
 %> <%-- ���� �߻��� ���� ����ó�� �ǽ� --%>
 </body>
</html>
