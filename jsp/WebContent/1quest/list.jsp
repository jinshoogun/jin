<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import ="obj416.bean.DTO" %>
<%@ page import ="obj416.bean.DAO" %>
<%@ page import = "java.util.List" %>

<%! int pageSize = 10; // 한 화면에 보여줄 글의 갯수 15개로 정하고 있다.
     SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd HH:mm");
     // 현재 시각을 제공하는 날짜인데 XXXX년 XX월 XX일 XX시 XX분으로 보여준다.
     %>

<% String pageNum = request.getParameter("pageNum");
// pageNum에 대한 정보를 가지고 옵니다.
if (pageNum == null) {
	pageNum = "1";
	// pageNum가 기본값인 경우 pageNum = 1로 대입됩니다. 
	// 처음 페이지 접속시 기본값으로 되기 때문에 1페이지가 화면을 뜨게 됩니다. 
}
int currentPage = Integer.parseInt(pageNum);
// pageNum을 파라미터값을 불러오려면 String으로 되어야 하기 때문에 Integer로 불러들이고 이후에
// currentPage에다가 값을 넣습니다.
int startRow = (currentPage - 1) * pageSize + 1;
// startRow는 현재페이지에서 보여줄 글을 정하기 위해서 사용되는 값인데, 첫번째로 나올 글으로 나올 값을 구하는 것이다.
int endRow = currentPage * pageSize;
// endRow는 현페이지에서 나올 마지막 글을 보여주기 위해서 나온 값이다.
int count = 0;
int number = 0;
// count, number 기본값 설징
List articleList = null;
// articleList 변수를 List를 통해 기본값을 잡고 있다.
DAO daoPro = DAO.getInstance();
//DAO 클래스에 getInstance 메소드를 수행하여 임시 저장할 공간을 구한다. 그리고 daoPro로 정하고있다.
count = daoPro.getArticleCount();
//daoPro 값을 getArticleCount(글 총갯수)메소드를 통해 구하고 count의 값을 구합니다. 
if (count > 0){
	articleList = daoPro.getArticles(startRow, endRow);
}
// count가 1이상인 경우 첫번째글과 마지막글을 보여준다.
number = count - (currentPage-1)* pageSize;
// number는 그 페이지에 나올 글번호를 구하는 값이다.
%>     
<html>
<body>
<center><b>글목록 (전체 글 : <%=count%>)</b> <%--현재 글의 전체목록을 사용하기 위해서 count를 불려오고 있다.--%>
<table width = "700">
<tr>
 <tr>
    <td align="right">
    <%if (session.getAttribute("menId") !=null){%> 
    <a href="writeForm.jsp">글쓰기</a>
    <%} else {%>
    <a href="/jsp/0quest/main.jsp">로그인</a>
    <%}%>
    </td>
</table> <%-- 글쓰기를 html링크로 전달한다.  --%>

 <%
 
 if (count == 0){
//count값이 0인 경우는 글의 갯수가 없기 때문에 게시판에 글이 없다고 출력이 되고 있다.
 %>
<table width = "700" border = "1">
<tr>
<td align = "center">
게시판에 저장된 글이 없습니다.
</td>
</table>
<% } else { %> <%--count != 0인경우는 게시판의 글이 있기 때문에 본 화면으로 보여주고 있다. --%>
<table  border = "1" width = "700" align = "center">
 <tr>
  <td align = "center" width = "50">번호</td>
  <td align = "center" width = "250">제  목</td>
  <td align = "center" width = "100">작성자</td>
  <td align = "center" width = "150">작성일</td>
  <td align = "center" width = "50">조   회</td>
  <td align = "center" width = "100">IP</td> 
  </tr>
<%

for (int i = 0; i < articleList.size(); i++) {
	 DTO article =  (DTO)articleList.get(i);
	// articleList 통해서 정한 startRow endRow사이의 글들을
	// for문을 통해서 모든 항목의 목록들을  전부다 가지고 온다. 
%>
<tr height = "30">
<td align = "center" width = "50"> <%=number--%></td>
<td width = "250">
<% int wid = 0; //wid 기본값 지정
  if (article.getRe_level()>0){ //Re_level은 본글이 아닌 덧글인 경우에 0이 아닌데, 위 경우는 덧글이나 덧덧글 등의 경우를 의미한다.
	wid= 5*(article.getRe_level()); //덧글의 레벨에 따라 값이 정해지고 x5로 하여 계단식 글을 실현시키며, 밑에 wid값에다가 집어 넣는다.
	%>
	  <img src="images/level.gif" width="<%=wid%>" height="16">
	  <img src="images/re.gif">
	<%}else{%>
	  <img src="images/level.gif" width="<%=wid%>" height="16">
	<%}%>
 <a href = "content.jsp?num=<%=article.getNum()%>&pageNum=<%=currentPage%>"><%=article.getSubject()%></a></td>
 <%-- 게시글에 연결된 HTML 주소인데 이때 content.jsp에 게시글의 번호와 게시글이 어디서 범위에 있는지를 정하여 링크로 보낸다.
  이로 통해 클릭시 게시글내용이 보여지는 것이다. DB에 제목을 가지고 온다. --%>
 <td align = "center" width = "100">
  <a href = "mailto:<%=article.getEmail()%>"><%=article.getWriter()%></a></td>
 <td align = "center" width = "150"><%=sdf.format(article.getReg_date())%></td> 
 <td align = "center" width = "50"><%=article.getReadcount()%></td>
 <td align = "center" width = "100"><%=article.getIp()%></td>
</tr> <%-- 본 링크는 메일을 보내기 위해서 작성되는 곳인데 메일주소로 보내진다. 그리고 작성자, 작성일, 읽은 횟수, IP순을 보여진다.--%>
    <%}%>
</table>
<%}%>



<% if (count > 0){
	int pageCount = count / pageSize + (count % pageSize == 0 ? 0 : 1);
	//pageCount는 총 게시글에서 pageSize만큼 나온 몫 + 총 게시글에서 pageSize에서 나오는 나머지가 0이 아닌 경우는 +1하고 아닌 경우 몫의 값만 나온다.
	int startPage = (int)(currentPage/10)*10+1;
	//시작페이지는 처음 띄울 페이지를 보여주는건데 현재 페이지에서 -10을 구현하기 위해 값을 사용하고 있다.
	int pageBlock =10; //page간격을 10으로 정하고 있다.
	int endPage = startPage + pageBlock - 1;
	// 시작 페이지에서 10증가하여 페이지를 구현하고 있다.
	if (endPage > pageCount) endPage = pageCount;
	// 마지막글페이지가 총페이지보다 더 많을경우 pageCount값으로 endPage로 들어간다.
	if (startPage > 10) { %>
	<a href = "list.jsp?pageNum=<%=startPage - 10 %>">[이전]</a>
	<%-- startPage가 10 이상인 경우 링크로 통해 startpage- 10으로 이동하는 즉, 이전페이지들을 불러들인다. --%>
<%} for (int i = startPage; i <=endPage; i++) { %>
    <a href = "list.jsp?pageNum=<%=i%>">[<%=i%>]</a>
<%} //처음페이지가 마지막 페이지가 처음페이지보다 많으면 화면에 각 1,2,3,4로 링크를 건다.
// for문을 통해 pagesize별 나눈 몫만큼의 페이지를 보일 수 있게 링크를 만든다.
if (endPage < pageCount) { %>
<a href = "list.jsp?pageNum=<%=startPage + 10%>">[다음]</a>
<%}
// 10씩 나눈 마지막 번호보다 pageCount 10으로 나눈 페이지의 올림값으로 넘어간다.
}%>

</center>
</body>
</html>





