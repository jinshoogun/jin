<%@ page contentType="text/html;charset=euc-kr"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:if test="${memId!=null}">
	<c:redirect url="main.jsp"></c:redirect>
</c:if>
<c:if test="${memId==null}">
	<script>
		alert("다시 입력 하세요.");
		history.go(-1);
	</script>
</c:if>