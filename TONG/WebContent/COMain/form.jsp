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

 

<title>영화 정보</title>

<body>

<center><b>영화목록(전체 영화 수 :<%=count%>)</b>

 

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

	게시판에 저장된 글이 없습니다.

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
<%=article.getStyle_Storename() %> 미용실 (<%=article.getStyle_Area()%>)
</tr>
<tr>
<img src="/TONG/DesignerImage/<%=article.getStyle_Photo()%>">
</tr>
<tr>
<%=article.getStyle_Sex()%><%=article.getStyle_Style()%>전문
</tr>
<tr>
가격 : <%=article.getStyle_Price() %> 원
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

		<a href="movieForm.jsp?pageNum=<%=startPage-10%>">[이전]</a>

		

<%		}

		for(int i = startPage; i<=endPage; i++){ %>

		<a href="movieForm.jsp?pageNum=<%= i %>">[<%= i %>]</a>

		

<%		

		}

		if(endPage < pageCount){  %>

		<a href="movieForm.jsp?pageNum=<%= startPage + 10 %>">[다음]</a>

		

<%

		}

	}

%>

 

</center>

</body>
