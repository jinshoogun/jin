<%@ page contentType="text/html; charset=EUC-KR"%><%-- JSP �ڵ� --%>%> 
<%@ language="java" contentType="text/html; charset=EUC-KR" %>

	<%-- �����ϰ� �ִ� �������� (WEB MINE TYPE) ������ �ȵ����� ��� ������ �����ϰڴٴ� ����  ex) image/jpg ���� �߿� jpg�� �����ϰڴ�! --%>
        <%@  extends="java.util.Date"%>
	<%-- ��� ��� (�ڵ����� ��ӵǹǷ� �ۼ����ص� �ǹ�) --%>
         <%@ import="java.util.Date"
         session="true"%>
	<%-- ����(��������)�� ��Ű(�ǽ�����)�� ���ÿ� ����ϰ� �ִ�.((�⺻ ���� �񿬰� ���⼺ - ��û�� ������ OFF����) �񵿱�� ������ ó��(F5���� �ǽð� �����ϴ°�)???) �α��� ���¸� Ȯ���Ѵ�?(��� ��뿩�θ� ���� true, false), �⺻�� true, �������� --%>
         <%@ buffer="8kb"%>
	<%--ȭ���� �ѹ��� ��Ÿ���� ��(����, �⺻������ ������ - 9��Ʈ�� A4�� ���� ���� ä�� �� ����) ���������� ���� ����--%>
        <%@  autoFlush="true"%>
	<%-- ���� ũ�Ⱑ �� �� ��� �߰����� �ƴ��� ���� (false�ϸ� ���� �����÷ε� �������� �ʰ��� ���� �߻�)--%>
        <%@  isThreadSafe="true"%>
	<%--������ ������ ��û��  ������� �����ϴ� ��(�⺻���� ������)--%>
        <%@  pageEncoding="EUC-KR"%>
	<%-- ������� ����(EUC-KR UTF-8 - ���� ǥ�� iso-8859-1 - ��ȸǥ��) --%>
        <%@  errorPage="/error/error.jsp"%>
	<%-- ���������� �㶧 �����ϴ� �������� ���� --%> 
        <%@  isErrorPage="false"%><%-- ������������� �����Ѵ�(����ó���� ���ݴ� ������ �����ϴ�)--%> 


<%--page�κ��� �߸��ۼ��� ����� ���� ���� --%><%-- HTML �ڵ� ���δ�!!! ���� ���� --%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<h1>Hello ...!!</h1>

</body>
</html>