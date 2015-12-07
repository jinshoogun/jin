<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
String server = request.getServerName();
int port = request.getServerPort();
String clientIp = request.getRemoteAddr(); 
String methodType = request.getMethod();
String url = new String(request.getRequestURL());
String uri = request.getRequestURI();
String contextPath = request.getContextPath();

%>

<%--request.getRemoteAddr();  이경우는 IPv6로 나온다 그러나 우리눈에는 IPv4가 쉬우므로 

request.getRemoteAddr() 의 요청 값이 0:0:0:0:0:0:0:1 

다음과 같이 나오는 경우 
127.0.0.1 과 같이 ipv4 의 규칙으로 보고 싶은 경우 
tomcat 의 톰캣설치경로/bin/catalina.bat 의 java_opt 값을 다음과 같이 수정을 합니다. 

if [ -z "$LOGGING_MANAGER" ]; then
  LOGGING_MANAGER="-Djava.util.logging.manager=org.apache.juli.ClassLoaderLogManager"
fi

# Uncomment the following line to make the umask available when using the
# org.apache.catalina.security.SecurityListener
#JAVA_OPTS="$JAVA_OPTS -Dorg.apache.catalina.security.SecurityListener.UMASK=`umask`"
JAVA_OPTS=%JAVA_OPTS% -Djava.net.preferIPv4Stack=true

# ----- Execute The Requested Command -----------------------------------------


원하는 값을 확인을 할 수 있습니다. 
eclipse 의 경우 다음의 정보를 수정을 합니다. 

run -> run Configurations 에 다음 문자를 추가 합니다. 
-Djava.net.preferIPv4Stack=true--%>

<h2>Request내장 객체 예제 2</h2>
접속한 서버명 : <%=server%><p>
접속한 서버의 포트 번호 : <%=port%><p>
클라이언트의 IP : <%=clientIp%><p>
현재 페이지의 method방식 : <%=methodType%><p>
요청한 현재 페이지의 경로 (URL) : <%=url%><p>
요청한 현재 페이지의 경로 (URI) : <%=uri%><p>
 웹어플리케이션의에서의 컨텍스트 경로 : <%=contextPath%><p>
 
 <%--<p>는 문단 나누기로 사용됩니다 <p></p>는 한문단!!--%>

