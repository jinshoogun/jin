<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    <%@ page import = "Style.*"%>
<%@ include file="../test2/mainform5.jsp"%>
<%@ page import = "java.util.List"%>
<%@ page import = "java.text.SimpleDateFormat"%>
    
	<% 
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

	int row = 4;

	

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
	 
	 
	 
   if(session.getAttribute("m_Id")==null){%>  <%-- ��α��� ȭ�� --%>

<center>
<table>
	<tr >
		<td  >
		<SELECT>
  		<OPTION>������ ���ÿ�</OPTION>
  		<OPTION>����</OPTION>
  		<OPTION>����</OPTION>
  		</SELECT>
  		</td>
		<td>
		<SELECT>
  		<OPTION>������ �����Ͻÿ�</OPTION>
  		<OPTION>����</OPTION>
  		<OPTION>����</OPTION>
		</SELECT>
		</td>
		<td>
		<SELECT>
  		<OPTION>��Ÿ���� �����Ͻÿ�</OPTION>
  		<OPTION>ĿƮ</OPTION>
  		<OPTION>�ĸ�</OPTION>
  		<OPTION>����</OPTION>
  		<OPTION>����</OPTION>
  		</SELECT>
		</td>
		<td>
		<SELECT>
  		<OPTION>��Ÿ������ ���ÿ�</OPTION>
  		<OPTION>��ȸ��</OPTION>
  		<OPTION>�ı��</OPTION>
  		<OPTION>������</OPTION>
		</SELECT>
		</td>
		<td>
		<input type="button" , name="SELECT" value="�˻�" onclick="javascript:window.location='sitemap.jsp'">
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

	�Խ��ǿ� ����� ���� �����ϴ�.

	</td>

</table>

<%}else{ %>

<table  align="center" border="1">



<%
   for(int a=0; a<articleList.size(); a++){
      
   
      DTO article = (DTO)articleList.get(a);
      

%>
   

<td align="center" width="300" height="300"><%=article.getStyle_Storename() %> �̿��               <br>

<a href="content.jsp?num=<%=article.getNum()%>&pageNum=<%=currentPage%>">
<img width="250" height="150" src="/TONG/DesignerImage/<%=article.getStyle_Photo()%>">  </a>  <br>
<%=article.getStyle_Sex()%> <%=article.getStyle_Style()%> ����                     <br>
 <%=article.getStyle_Myself()%> 
    </td>
   
      

<%                                                                                                                               
         if ((a + 1) > 1 && ((a + 1) % row) == 0) {//0���� ũ�鼭 i%3���� 0�϶� </tr>�� �ݾƼ� �ٳѱⰡ�ȴ�.
               out.println("</tr><tr>");
            }
      %>
<%}%>

<%}%>

 

<%

	if(count>0){

		int pageCount = count/pageSize+(count%pageSize == 0 ? 0:1);

		

		int startPage = (int)(currentPage/10)*10+1;

		int pageBlock=10;

		int endPage = startPage + pageBlock-1;

		if(endPage>pageCount) endPage=pageCount;

		

		if(startPage>10){	%>

		<a href="style.jsp?pageNum=<%=startPage-10%>">[����]</a>

		

<%		}

		for(int i = startPage; i<=endPage; i++){ %>

		<a href="style.jsp?pageNum=<%= i %>"></a>

		

<%		

		}

		if(endPage < pageCount){  %>

		<a href="movieForm.jsp?pageNum=<%= startPage + 10 %>">[����]</a>

		

<%

		}

	}

%>

 
<table align="right">
<tr>
<td>
<input  type="button" , name="designer_update" value="�����̳� ���" onclick="javascript:window.location='designer_update.jsp'"> <%--�����̳� ��� ���� �̵� --%>
</td>

<td >
 <input  type="button" , name="login" value="����Ʈ��" onclick="javascript:window.location='sitemap.jsp'"> <%--����Ʈ������ �̵� --%>
</td>
</tr>
</table>

</center>

 <%}else{%> <%-- �α��� ȭ�� --%>
 
 <center>	
<table>
<tr>
<center>
<a href="../Main/MainForm.jsp">			<%-- �Ӹ��� Ŭ���� ������������ ���ư��� --%>
<img src="../Image/Tong1.PNG" width="400" height="100"/></a>  <%--�Ӹ��� �׸� --%>
</center>
</tr>


<tr>
	<td>
		<a href="../Main/Company.jsp">
		<img src="../Image/main1.png" width="300 " height="100"/> <%-- ȸ��Ұ��� �̵� --%>
		</a>
	</td>
	
	<td>
		<a href="../Main/loginform.jsp">
		<img src="../Image/main2.png" width="300" height="100"/> <%-- �α��� â���� �̵� --%>
		</a>
	</td>
	
	<td>
		<a href="../Main/Style.jsp">
		<img src="../Image/main3.png" width="300" height="120"/> <%-- ��Ÿ�� �������� �̵� --%>
		</a>
	</td>
	
	<td>
		<a href="../Main/News&EventsMain.jsp">
		<img src="../Image/main4.png" width="300" height="100"/><%-- ����&�̺�Ʈ �������� �̵� --%>
		</a>
	</td>
	
	<td>
	<a href="../Main/GOGACCENTER.jsp">
		<img src="../Image/main5.png" width="300" height="100"/> <%-- �����ͷ� �̵� --%>
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
  		<OPTION>������ ���ÿ�</OPTION>
  		<OPTION>����</OPTION>
  		<OPTION>����</OPTION>
  		</SELECT>
  		</td>
		<td>
		<SELECT>
  		<OPTION>������ �����Ͻÿ�</OPTION>
  		<OPTION>����</OPTION>
  		<OPTION>����</OPTION>
		</SELECT>
		</td>
		<td>
		<SELECT>
  		<OPTION>��Ÿ���� �����Ͻÿ�</OPTION>
  		<OPTION>ĿƮ</OPTION>
  		<OPTION>�ĸ�</OPTION>
  		<OPTION>����</OPTION>
  		<OPTION>����</OPTION>
  		</SELECT>
		</td>
		<td>
		<SELECT>
  		<OPTION>��Ÿ������ ���ÿ�</OPTION>
  		<OPTION>��ȸ��</OPTION>
  		<OPTION>�ı��</OPTION>
  		<OPTION>������</OPTION>
		</SELECT>
		</td>
		<td>
		<input type="button" , name="SELECT" value="�˻�" onclick="javascript:window.location='sitemap.jsp'">
		</td>	
	</tr>
</table>

<table align="right">
<tr>
<td>
<input  type="button" , name="designer_update" value="�����̳� ���" onclick="javascript:window.location='designer_update.jsp'"> <%--�����̳� ��� ���� �̵� --%>
</td>
<td >
 <input  type="button" , name="login" value="����Ʈ��" onclick="javascript:window.location='sitemap.jsp'"> <%--����Ʈ������ �̵� --%>
</td>

</tr>
</table>
</center>
 <%}
 }catch(NullPointerException e){}
 %>
</html>