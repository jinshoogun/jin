<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:set var ="now" value ="<%=new java.util.Date()%>" />
Korea KST:
<fmt:formatDate value = "${now}" type = "both" dateStyle ="full" timeStyle ="full"/>
<br>
UK GMT :
<fmt:timeZone value ="GMT">
<fmt:formatDate value = "${now}" type = "both" dateStyle ="full" timeStyle ="full"/>
</fmt:timeZone>
</body>
</html>

<!-- dateStyle, timeStyle ���� ��� 
full =  2015�� 12�� 8�� ȭ���� ���� 5�� 39�� 05�� KST , 
long = 2015�� 12�� 8�� (ȭ) ���� 5�� 39�� 46�� , 
MEDIUM = 2015. 12. 8 ���� 5:40:01,  
SHORT = 15. 12. 8 ���� 5:40 , 
default = 2015. 12. 8 ���� 5:40:43 �� ������  -->

<!-- type�� both ��¥ �ð� �Ѵٺ����ְ�
time �ð��� ������, date ��¥�� ������  -->