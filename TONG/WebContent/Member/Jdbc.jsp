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
			out.println("���̵� : " + rs.getString("m_id") + " ");
			out.println("��й�ȣ: " + rs.getString("m_password") + " ");
			out.println("��й�ȣȮ��: " + rs.getString("m_name") + " ");
			out.println("�̸���: " + rs.getString("m_email") + " ");
			out.println("����: " + rs.getString("m_sex") + " ");
			out.println("�������: " + rs.getString("m_birth") + " ");
		    out.println("�ڵ��� : " + rs.getString("m_phone") + " ");
			out.println(rs.getTimestamp("m_reg") + "<br/>");

		}
	}
	rs.close();
	pstmt.close();
	conn.close();
%>