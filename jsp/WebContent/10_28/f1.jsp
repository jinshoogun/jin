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

<%--request.getRemoteAddr();  �̰��� IPv6�� ���´� �׷��� �츮������ IPv4�� ����Ƿ� 

request.getRemoteAddr() �� ��û ���� 0:0:0:0:0:0:0:1 

������ ���� ������ ��� 
127.0.0.1 �� ���� ipv4 �� ��Ģ���� ���� ���� ��� 
tomcat �� ��Ĺ��ġ���/bin/catalina.bat �� java_opt ���� ������ ���� ������ �մϴ�. 

if [ -z "$LOGGING_MANAGER" ]; then
  LOGGING_MANAGER="-Djava.util.logging.manager=org.apache.juli.ClassLoaderLogManager"
fi

# Uncomment the following line to make the umask available when using the
# org.apache.catalina.security.SecurityListener
#JAVA_OPTS="$JAVA_OPTS -Dorg.apache.catalina.security.SecurityListener.UMASK=`umask`"
JAVA_OPTS=%JAVA_OPTS% -Djava.net.preferIPv4Stack=true

# ----- Execute The Requested Command -----------------------------------------


���ϴ� ���� Ȯ���� �� �� �ֽ��ϴ�. 
eclipse �� ��� ������ ������ ������ �մϴ�. 

run -> run Configurations �� ���� ���ڸ� �߰� �մϴ�. 
-Djava.net.preferIPv4Stack=true--%>

<h2>Request���� ��ü ���� 2</h2>
������ ������ : <%=server%><p>
������ ������ ��Ʈ ��ȣ : <%=port%><p>
Ŭ���̾�Ʈ�� IP : <%=clientIp%><p>
���� �������� method��� : <%=methodType%><p>
��û�� ���� �������� ��� (URL) : <%=url%><p>
��û�� ���� �������� ��� (URI) : <%=uri%><p>
 �����ø����̼��ǿ����� ���ؽ�Ʈ ��� : <%=contextPath%><p>
 
 <%--<p>�� ���� ������� ���˴ϴ� <p></p>�� �ѹ���!!--%>

