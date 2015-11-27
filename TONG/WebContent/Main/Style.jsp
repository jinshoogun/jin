
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ page import = "Style.*"%>

<%@ page import = "java.util.List"%>

<%@ page import = "java.text.SimpleDateFormat"%>
    
	<% 
		request.setCharacterEncoding("euc-kr");
	int pageSize = 10;
	
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
	<%
 try{
	 
	 
	 
   if(session.getAttribute("memId")==null){%>  <%-- 비로그인 화면 --%>
	<center>	
<table>
<tr>
<center>
<a href="../Main/MainForm.jsp">			<%-- 머리통 클릭시 메인페이지로 돌아가기 --%>
<img src="../Image/Tong1.PNG" width="400" height="100"/></a>  <%--머리통 그림 --%>
</center>
</tr>


<tr>
	<td>
		<a href="../Main/Company.jsp">
		<img src="../Image/main1.png" width="300 " height="100"/> <%-- 회사소개로 이동 --%>
		</a>
	</td>
	
	<td>
		<a href="../Main/loginform.jsp">
		<img src="../Image/main2.png" width="300" height="100"/> <%-- 로그인 창으로 이동 --%>
		</a>
	</td>
	
	<td>
		<a href="../Main/Style.jsp">
		<img src="../Image/main3.png" width="300" height="120"/> <%-- 스타일 페이지로 이동 --%>
		</a>
	</td>
	
	<td>
		<a href="../Main/News&EventsMain.jsp">
		<img src="../Image/main4.png" width="300" height="100"/><%-- 뉴스&이벤트 페이지로 이동 --%>
		</a>
	</td>
	
	<td>
	<a href="../Main/GOGACCENTER.jsp">
		<img src="../Image/main5.png" width="300" height="100"/> <%-- 고객센터로 이동 --%>
		</a>
	</td>
</tr>
<tr>
</tr>
</table>
</center>

<center>
<table>
	<tr >
		<td  >
		<SELECT>
  		<OPTION>성별을 고르시오</OPTION>
  		<OPTION>남자</OPTION>
  		<OPTION>여자</OPTION>
  		</SELECT>
  		</td>
		<td>
		<SELECT>
  		<OPTION>지역을 선택하시오</OPTION>
  		<OPTION>강남</OPTION>
  		<OPTION>강북</OPTION>
		</SELECT>
		</td>
		<td>
		<SELECT>
  		<OPTION>스타일을 선택하시오</OPTION>
  		<OPTION>커트</OPTION>
  		<OPTION>파마</OPTION>
  		<OPTION>염색</OPTION>
  		<OPTION>매직</OPTION>
  		</SELECT>
		</td>
		<td>
		<SELECT>
  		<OPTION>기타사항을 고르시오</OPTION>
  		<OPTION>조회순</OPTION>
  		<OPTION>후기순</OPTION>
  		<OPTION>평점순</OPTION>
		</SELECT>
		</td>
		<td>
		<input type="button" , name="SELECT" value="검색" onclick="javascript:window.location='sitemap.jsp'">
		</td>	
	</tr>
</table>
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

<table  align="center">

<%
	for(int i=0; i<articleList.size(); i++){

		DTO article = (DTO)articleList.get(i);
%>
	
<tr ><td align="center" width="150"><%=article.getStyle_Storename() %> 미용실</td></tr>
<tr><td align="center" width="150"><img width="50" height="50" src="/TONG/DesignerImage/<%=article.getStyle_Photo()%>"></td></tr>
<tr><td align="center" width="50"><%=article.getStyle_Sex()%> <%=article.getStyle_Style()%> 전문</td></tr>	
	<td align="center" width="50"> 
    
    <a href="Style.jsp?num=<%=article.getNum()%>&pageNum=<%=currentPage%>">
     
    <%=article.getStyle_Myself()%>
    </a>
    </td>

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

		<a href="style.jsp?pageNum=<%=startPage-10%>">[이전]</a>

		

<%		}

		for(int i = startPage; i<=endPage; i++){ %>

		<a href="style.jsp?pageNum=<%= i %>">[<%= i %>]</a>

		

<%		

		}

		if(endPage < pageCount){  %>

		<a href="movieForm.jsp?pageNum=<%= startPage + 10 %>">[다음]</a>

		

<%

		}

	}

%>

 
<table align="right">
<tr>
<td>
<input  type="button" , name="designer_update" value="디자이너 등록" onclick="javascript:window.location='designer_update.jsp'"> <%--디자이너 등록 으로 이동 --%>
</td>

<td >
 <input  type="button" , name="login" value="사이트맵" onclick="javascript:window.location='sitemap.jsp'"> <%--사이트맵으로 이동 --%>
</td>
</tr>
</table>

</center>

 <%}else{%> <%-- 로그인 화면 --%>
 
 <center>	
<table>
<tr>
<center>
<a href="../Main/MainForm.jsp">			<%-- 머리통 클릭시 메인페이지로 돌아가기 --%>
<img src="../Image/Tong1.PNG" width="400" height="100"/></a>  <%--머리통 그림 --%>
</center>
</tr>


<tr>
	<td>
		<a href="../Main/Company.jsp">
		<img src="../Image/main1.png" width="300 " height="100"/> <%-- 회사소개로 이동 --%>
		</a>
	</td>
	
	<td>
		<a href="../Main/loginform.jsp">
		<img src="../Image/main2.png" width="300" height="100"/> <%-- 로그인 창으로 이동 --%>
		</a>
	</td>
	
	<td>
		<a href="../Main/Style.jsp">
		<img src="../Image/main3.png" width="300" height="120"/> <%-- 스타일 페이지로 이동 --%>
		</a>
	</td>
	
	<td>
		<a href="../Main/News&EventsMain.jsp">
		<img src="../Image/main4.png" width="300" height="100"/><%-- 뉴스&이벤트 페이지로 이동 --%>
		</a>
	</td>
	
	<td>
	<a href="../Main/GOGACCENTER.jsp">
		<img src="../Image/main5.png" width="300" height="100"/> <%-- 고객센터로 이동 --%>
		</a>
	</td>
</tr>
<tr>
</tr>
</table>
</center>

<center>
<table>
	<tr >
		<td  >
		<SELECT>
  		<OPTION>성별을 고르시오</OPTION>
  		<OPTION>남자</OPTION>
  		<OPTION>여자</OPTION>
  		</SELECT>
  		</td>
		<td>
		<SELECT>
  		<OPTION>지역을 선택하시오</OPTION>
  		<OPTION>강남</OPTION>
  		<OPTION>강북</OPTION>
		</SELECT>
		</td>
		<td>
		<SELECT>
  		<OPTION>스타일을 선택하시오</OPTION>
  		<OPTION>커트</OPTION>
  		<OPTION>파마</OPTION>
  		<OPTION>염색</OPTION>
  		<OPTION>매직</OPTION>
  		</SELECT>
		</td>
		<td>
		<SELECT>
  		<OPTION>기타사항을 고르시오</OPTION>
  		<OPTION>조회순</OPTION>
  		<OPTION>후기순</OPTION>
  		<OPTION>평점순</OPTION>
		</SELECT>
		</td>
		<td>
		<input type="button" , name="SELECT" value="검색" onclick="javascript:window.location='sitemap.jsp'">
		</td>	
	</tr>
</table>

<table align="right">
<tr>
<td>
<input  type="button" , name="designer_update" value="디자이너 등록" onclick="javascript:window.location='designer_update.jsp'"> <%--디자이너 등록 으로 이동 --%>
</td>
<td >
 <input  type="button" , name="login" value="사이트맵" onclick="javascript:window.location='sitemap.jsp'"> <%--사이트맵으로 이동 --%>
</td>

</tr>
</table>
</center>
 <%}
 }catch(NullPointerException e){}
 %>
</html>