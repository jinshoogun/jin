<%@ page language="java" contentType="text/html; charset=EUC-KR"
   pageEncoding="EUC-KR"%>
       <table width=500 height="250" align="center" border="1">
         <tr>
           <td width="300" height="20">�ȳ��ϼ���!</td>
           <td align="center">
             <%=session.getAttribute("a_id")%>���� <br> 
             �湮�ϼ̽��ϴ� <br/></td>
             </tr>
             <tr>
             <td width="600" >������ �������Դϴ�</td>
             <td align="center">
             <form  method="post" action="adminLoginout.jsp">
             <input type="button" value="���ΰ���"  onclick="javascript:window.location='../test2/mainform7.jsp'" ><br></br>
             <input type="button" value="��ǰ���"  onclick="javascript:window.location='../Product/ProductForm.jsp'" ><br></br>
             <input type="submit"  value="�α׾ƿ�" ><br>
             <br/><input type="button" value="�����̳� ���� ���� �� Ż��"  onclick="javascript:window.location='designerModify.jsp'" ><br>
              <br/><input type="button" value="������ �߰�, ����, ����" onclick="javascript:window.location='adminModify.jsp'" ><br>
              <br/><input type="button" value="ȸ������ ���� �� Ż��"  onclick="javascript:window.location='userModify.jsp'" ><br>
            	 <BR><input type="button" value="���� ���� Ȯ��"  onclick="javascript:window.location='../reserve/AdminReserveList.jsp'" ><br>
  

             </form> 
         </td>
        </tr>
       <tr> 
         <td></td>
       </tr>
     </table>
     <br>
 </body>
</html>
