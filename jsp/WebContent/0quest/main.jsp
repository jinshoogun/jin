<%@ page  contentType="text/html; charset=euc-kr"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:if test="${session.getAttribute("memId")==null}">
  <table width=750  align="center" border="1" >
      <tr>
       <td width="500"  height="30">
       &nbsp;
       </td>
   
       <form name="inform" method="post" action="loginPro.do"> 
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
            <input type="button"  value="ȸ������" onclick="javascript:location.href='q1.do'"/>
            <%-- submit�� �̹� �α��ι�ư�� ���Ǿ��� ������ onclick�� ���� q1.jsp�� ������ �ϰ� �˴ϴ�. --%>
          </td></form></tr></table></c:if>
    <c:if test="${session.getAttribute("memId")!=null}"> <%-- x = -1�� ��� ���� �ް� �Ǹ� �α��� ���·� ������ �˴ϴ�. --%>
       <table width=500 align="center" border="1" >
         <tr>
           <td width="300"  height="20">�ȳ��ϼ���!</td>
           <td rowspan="3" align="center">
            "${session.getAttribute("memId")}" ���� <br>
             �湮�ϼ̽��ϴ� <%-- ����� ���̵�� �湮�̵Ǿ��ٴ� ������� ������ �˴ϴ�. --%>
             <form  method="post" action="logout.do">  <%-- logout.jsp�� memId���� �Ѿ�� �˴ϴ�. --%>
             <input type="submit"  value="�α׾ƿ�" >
             <input type="button" value="ȸ����������" onclick="javascript:location.href='modify.do'"/ >
             </form> <%-- ȸ�������� �ٲٱ� ���� onclick�� ���� modify.jsp ���Ϸ� ������ �Ǿ����ϴ�. --%>
         </td>
        </tr>
       <tr> 
         <td rowspan="2" width="300" >�����������Դϴ�</td>
      </tr>
     </table>
     </c:if>
     <br>
 </body>
</html>
