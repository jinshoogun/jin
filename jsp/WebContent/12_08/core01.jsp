<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<c:set var="id" value="korea" />
<!-- setAttribute ("id", "korea")같으뮤 -->
${id}




<c:if test="${id != null}">
--${id} <br />
</c:if>
<c:if test="${id == null}">
--${id} <br />
</c:if>





<c:choose>
	<c:when test="${10>0}">
10000
</c:when>
	<c:when test="${5>0}">
5555555
</c:when>
	<c:otherwise>
000000
</c:otherwise>
</c:choose>
<br />






<c:forEach var="a" begin="2" end="9" step="1">
	<c:forEach var="b" begin="1" end="9" step="1">

${a} x ${b} = ${a*b}<br />
	</c:forEach>
</c:forEach>






<c:forTokens var= "aa" items = "a,b,c,d,f,g" delims =",">
<!-- delims은 구분점! Tokenizer를 생각하시면 되뮤 -->
${aa}<br/>
</c:forTokens>





<c:url var = "a" value = "test.jsp">
<c:param name = "id" value = "java" />
<c:param name = "pw" value = "1234" />
</c:url>

<a href = "${a}">test</a>



<c:import var ="aa" url = "/12_07/form.jsp" />
${aa}


