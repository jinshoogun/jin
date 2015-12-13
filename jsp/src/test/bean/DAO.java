package test.bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;


public class DAO {

	private Connection getConnection() throws Exception {

		Context ctx = new InitialContext();//컨텐츠를 찾아가는 과정
		Context env = (Context)ctx.lookup("java:comp/env");//자바로 셋팅설정을 찾아가는 곳 java:comp/env 고정값
		DataSource ds = (DataSource)env.lookup("jdbc/orcl");
		return ds.getConnection();
	}

	public ArrayList select() {
		ArrayList list = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			String sql = "select * from obj140";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if (rs != null) {
				list = new ArrayList();
				while (rs.next()) {
					DTO dto = new DTO();
					dto.setId(rs.getString("id"));
					dto.setPw(rs.getString("pw"));
					dto.setAge(rs.getInt("age") + ""); // 파라미터값은 String만 가능한데
														// Int + String("") =
														// String형이 됨!
					dto.setReg(rs.getTimestamp("reg"));
					list.add(dto);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {// 연결에도 예외가 생길 수 있으니 처리해야됩니다.
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException s) {
			}
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException s) {
			}
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException s) {
			}
			// 클로즈는 따로따로 예외처리를 할 수 있도록 해야한다. (예외 발생시 다른 것이 종료되지 않기 때문이다)
		}
		return list;
	}
	
	public void insert(DTO dto){
		Connection conn = null;
		PreparedStatement pstmt = null;
		try{	
			conn = getConnection();
			String sql = "insert into obj140 values(?,?,?,sysdate)";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, dto.getId()); 
			pstmt.setString(2, dto.getPw());
			int age = Integer.parseInt(dto.getAge());
			pstmt.setInt(3, age);
			pstmt.executeUpdate();
		}catch (Exception e){
			e.printStackTrace();
		
		}finally{
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException s) {
			}
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException s) {
			}
		}
	}
}
