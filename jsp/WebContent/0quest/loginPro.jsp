<%@ page contentType="text/html;charset=euc-kr" %>
<%@ page import = "obj140.bean.DAO" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<% request.setCharacterEncoding("euc-kr");%>

<c:if test="${check == 1}"> 
	<c:redirect url = "/main.do"/>
	</c:if>
	
	<c:if test ="${check != 1}">
	 <script>
	  alert("�ٽ� �Է��ϼ���.");
	  history.go(-1);
	  </script>
	</c:if>

