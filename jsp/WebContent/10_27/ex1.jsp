<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

    <h2>표현식 예제1 - 배열의 내용 출력</h2>>
    <%
    String str[] = {"JSP가", "정말", "재미","있다."};
    %>
    
    <table border="1" width = "250">
    
    <tr><td>배열의 첨자</td><td>배열의 내용</td></tr>
    
    <% for (int i =0; i<str.length; i++){ %>
    <tr>
    <td><%=i%></td><td><%=str[i]%></td>
    </tr>
    <%}%>
    </table>