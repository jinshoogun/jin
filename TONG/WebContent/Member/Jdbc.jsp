<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ page import="java.sql.Connection"%>
<%@ page import="java.sql.DriverManager"%>
<%@ page import="java.sql.PreparedStatement"%>
<%@ page import="java.sql.ResultSet"%>
<%
	request.setCharacterEncoding("EUC-KR");

	Class.forName("oracle.jdbc.driver.OracleDriver");

	String url = "jdbc:oracle:thin:@khmaster.iptime.org:7000:orcl";
	String user = "web19";
	String pwd = "web19";
	Connection conn = DriverManager.getConnection(url, user, pwd);

	String sql = "select * from MEMBERSHIP";
	PreparedStatement pstmt = conn.prepareStatement(sql);

	ResultSet rs = pstmt.executeQuery();

	if (rs != null) {
		while (rs.next()) {
			out.println("아이디 : " + rs.getString("m_id") + " ");
			out.println("비밀번호: " + rs.getString("m_password") + " ");
			out.println("비밀번호확인: " + rs.getString("m_name") + " ");
			out.println("이메일: " + rs.getString("m_email") + " ");
			out.println("성별: " + rs.getString("m_sex") + " ");
			out.println("생년월일: " + rs.getString("m_birth") + " ");
		    out.println("핸드폰 : " + rs.getString("m_phone") + " ");
			out.println(rs.getTimestamp("m_reg") + "<br/>");

		}
	}
	rs.close();
	pstmt.close();
	conn.close();
%>