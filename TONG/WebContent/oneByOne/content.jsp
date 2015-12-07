<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "DATA.bean.DAO" %>
<%@ page import = "DATA.bean.DTO" %>
<%@ page import = "java.text.SimpleDateFormat" %>
    <%@ include file="../test2/mainform5.jsp"%>
    <%
request.setCharacterEncoding("EUC-KR"); %>
<html>
<head>
<title>�Խ���</title>
</head>

<%
SimpleDateFormat sdf = 
new SimpleDateFormat("yyyy-MM-dd HH:mm");

   int o_num = Integer.parseInt(request.getParameter("o_num"));
   String o_pageNum = request.getParameter("o_pageNum");
   
   try{
        DAO dbPro = DAO.getInstance();
        DTO article =  dbPro.getOnebyOneArticle(o_num);
     int o_ref=article.getO_ref();
     int o_re_step=article.getO_re_step();
     int o_re_level=article.getO_re_level();
     int back = (int)(o_num - 1);
     int forward = (int)(o_num + 1);

%>
<body>  
<center><b>�۳��� ����</b>
<br>
<form>
<table width="800" border="1" cellspacing="0" cellpadding="0"  align="center">  
  <tr height="30">
    <td align="center" width="200">�۹�ȣ</td>
    <td align="center" width="200" align="center">
        <%=article.getO_num()%></td>
    <td align="center" width="200">��ȸ��</td>
    <td align="center" width="200" align="center">
        <%=article.getO_readcount()%></td>
  </tr>
  <tr height="30">
    <td align="center" width="200">�ۼ���</td>
    <td align="center" width="200" align="center">
        <%=article.getO_writer()%></td>
    <td align="center" width="200" >�ۼ���</td>
    <td align="center" width="200" align="center">
        <%=sdf.format(article.getO_reg_date())%></td>
  </tr>
  <tr height="30">
    <td align="center" width="200">������</td>
    <td align="left" width="600" align="center" colspan="3">
        <%=article.getO_subject()%></td>
  </tr>
  <tr>
    <td align="center" width="200">�۳���</td>
    <td align="left" width="600" height = "500" colspan="3"><textarea rows="95%" cols="95%" readonly><%=article.getO_content()%></textarea></td>
  </tr>
  <tr height="30">      
    <td colspan="4" align="right" > 
     <% String id = (String)session.getAttribute("m_id");
           %>
    
     <input type="button" value="�ۼ���" 
       onclick="document.location.href='updateForm.jsp?o_num=<%=article.getO_num()%>&o_pageNum=<%=o_pageNum%>'">
      &nbsp;&nbsp;&nbsp;&nbsp;
     
     <input type="button" value="�ۻ���" 
       onclick="document.location.href='deleteForm.jsp?o_num=<%=article.getO_num()%>&o_pageNum=<%=o_pageNum%>'">
      &nbsp;&nbsp;&nbsp;&nbsp;
      
       <input type="button" value="������" onclick="document.location.href='content.jsp?o_num=<%=back%>&o_pageNum=<%=o_pageNum%>'">
       <input type="button" value="������" onclick="document.location.href='content.jsp?o_num=<%=forward%>&o_pageNum=<%=o_pageNum%>'">
       <input type="button" value="���" onclick="document.location.href='list.jsp?o_pageNum=<%=o_pageNum%>'">
       
    </td>
  </tr>
</table>    
<%}catch(Exception e){}%>
</form>      
</body>
</html>      