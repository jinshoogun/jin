<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>

    <h2>ǥ���� ����1 - �迭�� ���� ���</h2>>
    <%
    String str[] = {"JSP��", "����", "���","�ִ�."};
    %>
    
    <table border="1" width = "250">
    
    <tr><td>�迭�� ÷��</td><td>�迭�� ����</td></tr>
    
    <% for (int i =0; i<str.length; i++){ %>
    <tr>
    <td><%=i%></td><td><%=str[i]%></td>
    </tr>
    <%}%>
    </table>