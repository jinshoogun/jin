<%@ page contentType = "text/html; charset=euc-kr" %>
<%@ page import = "DATADB.bean.nDAO" %>
<%@ page import = "DATADB.bean.DTO" %>
<%@ page import = "java.text.SimpleDateFormat" %>
<html>
<head>
<title>�Խ���</title>
<link href="style.css" rel="stylesheet" type="text/css">
</head>

<%
   int n_num = Integer.parseInt(request.getParameter("n_num"));
   String pageNum = request.getParameter("pageNum");

   SimpleDateFormat sdf = 
        new SimpleDateFormat("yyyy-MM-dd HH:mm");

   try{
      nDAO dbPro = nDAO.getInstance();
      DTO article =  dbPro.getArticle(n_num);
  
	  int n_ref=article.getN_ref();
	  int n_re_step=article.getN_re_step();
	  int n_re_level=article.getN_re_level();
	  int back = (int)(n_num-1);
	  int forward = (int)(n_num+1);
%>
<body >  
<center><b>�۳��� ����</b>
<br>
<form>
<table width="500" border="1" cellspacing="0" cellpadding="0" align="center">  
  <tr height="30">
    <td align="center" width="125">�۹�ȣ</td>
    <td align="center" width="125" align="center">
	     <%=article.getN_num()%></td>
    <td align="center" width="125" >��ȸ��</td>
    <td align="center" width="125" align="center">
	     <%=article.getN_readcount()%></td>
  </tr>
  <tr height="30">
    <td align="center" width="125">�ۼ���</td>
    <td align="center" width="125" align="center">
	     <%=article.getN_writer()%></td>
    <td align="center" width="125"   >�ۼ���</td>
    <td align="center" width="125" align="center">
	     <%= sdf.format(article.getN_reg_date())%></td>
  </tr>
  <tr height="30">
    <td align="center" width="125"  >������</td>
    <td align="center" width="375" align="center" colspan="3">
	     <%=article.getN_subject()%></td>
  </tr>
  <tr>
    <td align="center" width="125"  >�۳���</td>
    <td align="left" width="375" colspan="3"><pre><%=article.getN_content()%></pre></td>
  </tr>
  <tr height="30">      
    <td colspan="4"   align="right" > 
    <%if(session.getAttribute("m_id")!=null) {%>
	    <%
	         String id = (String)session.getAttribute("m_id");
	         if(id.equals(article.getN_writer())){
	    %>
	  <input type="button" value="�ۼ���" 
       onclick="document.location.href='updateForm.jsp?n_num=<%=article.getN_num()%>&pageNum=<%=pageNum%>'">
      &nbsp;&nbsp;&nbsp;&nbsp;
     
     <input type="button" value="�ۻ���" 
       onclick="document.location.href='deleteForm.jsp?n_num=<%=article.getN_num()%>&pageNum=<%=pageNum%>'">
      &nbsp;&nbsp;&nbsp;&nbsp;
      
      <input type="button" value="��۾���" 
       onclick="document.location.href='writeForm.jsp?n_num=<%=n_num%>&n_ref=<%=n_ref%>&n_re_step=<%=n_re_step%>&n_re_level=<%=n_re_level%>'">
      &nbsp;&nbsp;&nbsp;&nbsp;
      
       <input type="button" value="�۸��" 
       onclick="document.location.href='notice.jsp?pageNum=<%=pageNum%>'">
   
      
       <%} if(!id.equals(article.getN_writer()))
           {
           %> 
      
       <input type="button" value="��۾���" 
       onclick="document.location.href='writeForm.jsp?n_num=<%=n_num%>&n_ref=<%=n_ref%>&n_re_step=<%=n_re_step%>&n_re_level=<%=n_re_level%>'">
      &nbsp;&nbsp;&nbsp;&nbsp;
      
      <input type="button" value="�۸��" 
       onclick="document.location.href='notice.jsp?pageNum=<%=pageNum%>'">
       
       <input type="button" value="������" onclick="document.location.href='content.jsp?n_num=<%=back%>&pageNum=<%=pageNum%>'">
       <input type="button" value="������" onclick="document.location.href='content.jsp?n_num=<%=forward%>&pageNum=<%=pageNum%>'">
       
       <%} }else if(session.getAttribute("m_id") ==null){ %>
       <input type="button" value="�۸��" 
       onclick="document.location.href='notice.jsp?pageNum=<%=pageNum%>'">
       
       <input type="button" value="������" onclick="document.location.href='content.jsp?n_num=<%=back%>&pageNum=<%=pageNum%>'">
       <input type="button" value="������" onclick="document.location.href='content.jsp?n_num=<%=forward%>&pageNum=<%=pageNum%>'">
    </td>
  </tr>
</table>    
<%} else {
      
      }
 }catch(Exception e){} 
 %>
</form>      
</body>
</html>      
