package DATADB.bean.obj140;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class fgh {
	
	private Connection getConnection() throws Exception {

		Context ctx = new InitialContext();// 컨텐츠를 찾아가는 과정
		Context env = (Context) ctx.lookup("java:comp/env");// 자바로 셋팅설정을 찾아가는 곳
															// java:comp/env 고정값
		DataSource ds = (DataSource) env.lookup("jdbc/orcl");
		return ds.getConnection();
	} // getConnection을 통해 커넥션 풀을 연결합니다.

	
	public int getQ_num() throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List articleList=null;
		int q_num = 0;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("select q_num(*) from QnA");
			rs = pstmt.executeQuery();
			if (rs.next()) {
				q_num = rs.getInt(1); 
		
			}
			System.out.println(q_num);
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			if (rs != null) try { rs.close(); } catch(SQLException ex) {}
			if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
			if (conn != null) try { conn.close(); } catch(SQLException ex) {}
		}
		return q_num; 
		
	}


	
}
