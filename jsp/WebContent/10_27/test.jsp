<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%--�������ִ� ����� �ѱ۷� ó��(��û�� ������) --%>
>

<h2>���޵� parameter ó��!!</h2>

<%
	request.setCharacterEncoding("euc-kr"); //post ���Ŀ��� �ѱ� �����ϱ� ���� ���, ��ó�����ٰ� ��������� �մϴ�.
	//�Ķ���͸� �������� ������ String ������ ������� �մϴ�. 
	//int�� �翬�� �Ⱥ������Ƿ� Integer.parseInt�� �ٲ�ߵ���?
	int num1 = Integer.parseInt(request.getParameter("num1"));
	int num2 = Integer.parseInt(request.getParameter("num2"));
%>

<font size="6"> �� = <%=num1 + num2%>
</font>