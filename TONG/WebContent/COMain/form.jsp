<%@ page language="java" contentType="text/html; charset=EUC-KR"

    pageEncoding="EUC-KR"%>

<%@ page import = "Style.*"%>

<%@ page import = "java.util.List"%>

<%@ page import = "java.text.SimpleDateFormat"%>

 

 

<%!

	int pageSize = 10;

%>

<%

	String pageNum = request.getParameter("pageNum");

	if(pageNum == null){

		pageNum = "1";

	}

	

	int currentPage = Integer.parseInt(pageNum);

	int startRow = (currentPage - 1)*pageSize+1;

	int endRow = currentPage * pageSize;

	int count = 0;

	int number = 0;

	

	

	List articleList = null;

	DAO dbPro = DAO.getInstance();

	count = dbPro.getArticleCount();

	if(count>0){

		articleList = dbPro.getArticles(startRow, endRow);

	}

	

	number=count-(currentPage-1)*pageSize;

%>

 

<title>��ȭ ����</title>

<body>

<center><b>��ȭ���(��ü ��ȭ �� :<%=count%>)</b>

 

<table  width="700">

<tr>

	 <td align="right" bgcolor="white">


	

	

	</td>

</table>

 

<%

	if(count==0){

%>

<table width="700">

<tr>

	<td align="center">

	�Խ��ǿ� ����� ���� �����ϴ�.

	</td>

</table>

<%}else{ %>

<table border="1" width="700" align="center">

<%

 

	for(int i=0; i<articleList.size(); i++){

		DTO article = (DTO)articleList.get(i);


%>

<tr algin="center">
<tr>
<%=article.getStyle_Storename() %> �̿�� (<%=article.getStyle_Area()%>)
</tr>
<tr>
<img src="/TONG/DesignerImage/<%=article.getStyle_Photo()%>">
</tr>
<tr>
<%=article.getStyle_Sex()%><%=article.getStyle_Style()%>����
</tr>
<tr>
���� : <%=article.getStyle_Price() %> ��
</tr>


		<%}%>

</table>

<%}%>

 

<%

	if(count>0){

		int pageCount = count/pageSize+(count%pageSize == 0 ? 0:1);

		

		int startPage = (int)(currentPage/10)*10+1;

		int pageBlock=10;

		int endPage = startPage + pageBlock-1;

		if(endPage>pageCount) endPage=pageCount;

		

		if(startPage>10){	%>

		<a href="movieForm.jsp?pageNum=<%=startPage-10%>">[����]</a>

		

<%		}

		for(int i = startPage; i<=endPage; i++){ %>

		<a href="movieForm.jsp?pageNum=<%= i %>">[<%= i %>]</a>

		

<%		

		}

		if(endPage < pageCount){  %>

		<a href="movieForm.jsp?pageNum=<%= startPage + 10 %>">[����]</a>

		

<%

		}

	}

%>

 

</center>

</body>
