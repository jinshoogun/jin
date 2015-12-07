<%@page import="java.text.SimpleDateFormat"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import ="obj416.bean.DTO" %>
<%@ page import ="obj416.bean.DAO" %>
<%@ page import = "java.util.List" %>

<%! int pageSize = 10; // �� ȭ�鿡 ������ ���� ���� 15���� ���ϰ� �ִ�.
     SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd HH:mm");
     // ���� �ð��� �����ϴ� ��¥�ε� XXXX�� XX�� XX�� XX�� XX������ �����ش�.
     %>

<% String pageNum = request.getParameter("pageNum");
// pageNum�� ���� ������ ������ �ɴϴ�.
if (pageNum == null) {
	pageNum = "1";
	// pageNum�� �⺻���� ��� pageNum = 1�� ���Ե˴ϴ�. 
	// ó�� ������ ���ӽ� �⺻������ �Ǳ� ������ 1�������� ȭ���� �߰� �˴ϴ�. 
}
int currentPage = Integer.parseInt(pageNum);
// pageNum�� �Ķ���Ͱ��� �ҷ������� String���� �Ǿ�� �ϱ� ������ Integer�� �ҷ����̰� ���Ŀ�
// currentPage���ٰ� ���� �ֽ��ϴ�.
int startRow = (currentPage - 1) * pageSize + 1;
// startRow�� �������������� ������ ���� ���ϱ� ���ؼ� ���Ǵ� ���ε�, ù��°�� ���� ������ ���� ���� ���ϴ� ���̴�.
int endRow = currentPage * pageSize;
// endRow�� ������������ ���� ������ ���� �����ֱ� ���ؼ� ���� ���̴�.
int count = 0;
int number = 0;
// count, number �⺻�� ��¡
List articleList = null;
// articleList ������ List�� ���� �⺻���� ��� �ִ�.
DAO daoPro = DAO.getInstance();
//DAO Ŭ������ getInstance �޼ҵ带 �����Ͽ� �ӽ� ������ ������ ���Ѵ�. �׸��� daoPro�� ���ϰ��ִ�.
count = daoPro.getArticleCount();
//daoPro ���� getArticleCount(�� �Ѱ���)�޼ҵ带 ���� ���ϰ� count�� ���� ���մϴ�. 
if (count > 0){
	articleList = daoPro.getArticles(startRow, endRow);
}
// count�� 1�̻��� ��� ù��°�۰� ���������� �����ش�.
number = count - (currentPage-1)* pageSize;
// number�� �� �������� ���� �۹�ȣ�� ���ϴ� ���̴�.
%>     
<html>
<body>
<center><b>�۸�� (��ü �� : <%=count%>)</b> <%--���� ���� ��ü����� ����ϱ� ���ؼ� count�� �ҷ����� �ִ�.--%>
<table width = "700">
<tr>
 <tr>
    <td align="right">
    <%if (session.getAttribute("menId") !=null){%> 
    <a href="writeForm.jsp">�۾���</a>
    <%} else {%>
    <a href="/jsp/0quest/main.jsp">�α���</a>
    <%}%>
    </td>
</table> <%-- �۾��⸦ html��ũ�� �����Ѵ�.  --%>

 <%
 
 if (count == 0){
//count���� 0�� ���� ���� ������ ���� ������ �Խ��ǿ� ���� ���ٰ� ����� �ǰ� �ִ�.
 %>
<table width = "700" border = "1">
<tr>
<td align = "center">
�Խ��ǿ� ����� ���� �����ϴ�.
</td>
</table>
<% } else { %> <%--count != 0�ΰ��� �Խ����� ���� �ֱ� ������ �� ȭ������ �����ְ� �ִ�. --%>
<table  border = "1" width = "700" align = "center">
 <tr>
  <td align = "center" width = "50">��ȣ</td>
  <td align = "center" width = "250">��  ��</td>
  <td align = "center" width = "100">�ۼ���</td>
  <td align = "center" width = "150">�ۼ���</td>
  <td align = "center" width = "50">��   ȸ</td>
  <td align = "center" width = "100">IP</td> 
  </tr>
<%

for (int i = 0; i < articleList.size(); i++) {
	 DTO article =  (DTO)articleList.get(i);
	// articleList ���ؼ� ���� startRow endRow������ �۵���
	// for���� ���ؼ� ��� �׸��� ��ϵ���  ���δ� ������ �´�. 
%>
<tr height = "30">
<td align = "center" width = "50"> <%=number--%></td>
<td width = "250">
<% int wid = 0; //wid �⺻�� ����
  if (article.getRe_level()>0){ //Re_level�� ������ �ƴ� ������ ��쿡 0�� �ƴѵ�, �� ���� �����̳� ������ ���� ��츦 �ǹ��Ѵ�.
	wid= 5*(article.getRe_level()); //������ ������ ���� ���� �������� x5�� �Ͽ� ��ܽ� ���� ������Ű��, �ؿ� wid�����ٰ� ���� �ִ´�.
	%>
	  <img src="images/level.gif" width="<%=wid%>" height="16">
	  <img src="images/re.gif">
	<%}else{%>
	  <img src="images/level.gif" width="<%=wid%>" height="16">
	<%}%>
 <a href = "content.jsp?num=<%=article.getNum()%>&pageNum=<%=currentPage%>"><%=article.getSubject()%></a></td>
 <%-- �Խñۿ� ����� HTML �ּ��ε� �̶� content.jsp�� �Խñ��� ��ȣ�� �Խñ��� ��� ������ �ִ����� ���Ͽ� ��ũ�� ������.
  �̷� ���� Ŭ���� �Խñ۳����� �������� ���̴�. DB�� ������ ������ �´�. --%>
 <td align = "center" width = "100">
  <a href = "mailto:<%=article.getEmail()%>"><%=article.getWriter()%></a></td>
 <td align = "center" width = "150"><%=sdf.format(article.getReg_date())%></td> 
 <td align = "center" width = "50"><%=article.getReadcount()%></td>
 <td align = "center" width = "100"><%=article.getIp()%></td>
</tr> <%-- �� ��ũ�� ������ ������ ���ؼ� �ۼ��Ǵ� ���ε� �����ּҷ� ��������. �׸��� �ۼ���, �ۼ���, ���� Ƚ��, IP���� ��������.--%>
    <%}%>
</table>
<%}%>



<% if (count > 0){
	int pageCount = count / pageSize + (count % pageSize == 0 ? 0 : 1);
	//pageCount�� �� �Խñۿ��� pageSize��ŭ ���� �� + �� �Խñۿ��� pageSize���� ������ �������� 0�� �ƴ� ���� +1�ϰ� �ƴ� ��� ���� ���� ���´�.
	int startPage = (int)(currentPage/10)*10+1;
	//������������ ó�� ��� �������� �����ִ°ǵ� ���� ���������� -10�� �����ϱ� ���� ���� ����ϰ� �ִ�.
	int pageBlock =10; //page������ 10���� ���ϰ� �ִ�.
	int endPage = startPage + pageBlock - 1;
	// ���� ���������� 10�����Ͽ� �������� �����ϰ� �ִ�.
	if (endPage > pageCount) endPage = pageCount;
	// ���������������� ������������ �� ������� pageCount������ endPage�� ����.
	if (startPage > 10) { %>
	<a href = "list.jsp?pageNum=<%=startPage - 10 %>">[����]</a>
	<%-- startPage�� 10 �̻��� ��� ��ũ�� ���� startpage- 10���� �̵��ϴ� ��, �������������� �ҷ����δ�. --%>
<%} for (int i = startPage; i <=endPage; i++) { %>
    <a href = "list.jsp?pageNum=<%=i%>">[<%=i%>]</a>
<%} //ó���������� ������ �������� ó������������ ������ ȭ�鿡 �� 1,2,3,4�� ��ũ�� �Ǵ�.
// for���� ���� pagesize�� ���� ��ŭ�� �������� ���� �� �ְ� ��ũ�� �����.
if (endPage < pageCount) { %>
<a href = "list.jsp?pageNum=<%=startPage + 10%>">[����]</a>
<%}
// 10�� ���� ������ ��ȣ���� pageCount 10���� ���� �������� �ø������� �Ѿ��.
}%>

</center>
</body>
</html>





