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

<!-- dateStyle, timeStyle 같은 경우 
full =  2015년 12월 8일 화요일 오후 5시 39분 05초 KST , 
long = 2015년 12월 8일 (화) 오후 5시 39분 46초 , 
MEDIUM = 2015. 12. 8 오후 5:40:01,  
SHORT = 15. 12. 8 오후 5:40 , 
default = 2015. 12. 8 오후 5:40:43 가 있으뮤  -->

<!-- type는 both 날짜 시간 둘다보여주고
time 시간만 보여쥼, date 날짜를 보여줌  -->