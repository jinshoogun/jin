<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%--응답해주는 결과를 한글로 처리(요청은 생략됨) --%>
>

<h2>전달된 parameter 처리!!</h2>

<%
	request.setCharacterEncoding("euc-kr"); //post 형식에서 한글 지원하기 위한 방법, 맨처음에다가 지정해줘야 합니다.
	//파라미터를 보낼때는 무조건 String 형으로 보내줘야 합니다. 
	//int는 당연히 안보내지므로 Integer.parseInt로 바꿔야되쥬?
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2 = Integer.parseInt(request.getParameter("num2"));
%>

<font size="6"> 값 = <%=num1 + num2%>
</font>