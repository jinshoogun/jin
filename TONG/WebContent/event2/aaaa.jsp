<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "DATADB2.bean.eDAO" %>
<%@ page import = "DATADB2.bean.DTO" %>
<%@ page import = "java.util.List" %>
<%@ page import = "java.text.SimpleDateFormat" %>
<%@ include file="../test2/noticemainform.jsp"  %>

<%!
    int pageSize = 10;
    SimpleDateFormat sdf = 
        new SimpleDateFormat("yyyy-MM-dd HH:mm");
%>

<%
    String pageNum = request.getParameter("pageNum");
    if (pageNum == null) {
        pageNum = "1";
    }

    int currentPage = Integer.parseInt(pageNum);
    int startRow = (currentPage - 1) * pageSize + 1;
    int endRow = currentPage * pageSize;
    int count = 0;
    int number=0;

    List commentList = null;
    
    List articleList = null;
    eDAO dbPro = eDAO.getInstance();
    count = dbPro.getcommentCount();
    if (count > 0) {
    	commentList = dbPro.getComment(startRow, endRow);
    }

	number=count-(currentPage-1)*pageSize;
%>
<html>
<head>
<title>�Խ���</title>
<link href="style.css" rel="stylesheet" type="text/css">
</head>

<body>
<center><b>�۸��(��ü ��:<%=count%>)</b>




<table border="1" width="700" cellpadding="0" cellspacing="0" align="center"> 
    <tr height="30"> 
      <td align="center"  width="50"  >�� ȣ</td> 
      <td align="center"  width="250" >��   ��</td> 
      <td align="center"  width="100" >�ۼ���</td>
      <td align="center"  width="150" >�ۼ���</td> 
      <td align="center"  width="50" >�� ȸ</td> 
      <td align="center"  width="100" >IP</td>    
    </tr>
<%  
        for (int i = 0 ; i < articleList.size() ; i++) {
          DTO article = (DTO)articleList.get(i);
%>
<tr>
<td>
<%=article.getCmte_writer() %>
</td>
<td>
<%=article.getCmte_content() %>
</td>
<Td>
<%=sdf.format(article.getCmte_reg_date())%>
</Td>
</tr>
</table>
<%}%>

</center>
</body>
</html>