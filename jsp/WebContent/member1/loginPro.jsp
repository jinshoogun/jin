<%@ page contentType="text/html;charset=euc-kr"%>
<%@ page import="ch11.logon.LogonDBBean"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:if test="${check==1}">
	<c:redirect url="/main.do"></c:redirect>
</c:if>
<c:if test="${check==0}">
	<script>
		alert("��й�ȣ�� ���� �ʽ��ϴ�.");
		history.go(-1);
	</script>
</c:if>
<c:if test="${check==-1}">
	<script>
		alert("���̵� ���� �ʽ��ϴ�.");
		history.go(-1);
	</script>
</c:if>