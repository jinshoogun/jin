<%@ page contentType="text/html;charset=euc-kr" %>
<%@ page import = "ch11.logon.LogonDBBean" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<c:if test = "${check==1}">
		<c:redirect url ="main.do"></c:redirect>
</c:if>	
