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

		Context ctx = new InitialContext();// �������� ã�ư��� ����
		Context env = (Context) ctx.lookup("java:comp/env");// �ڹٷ� ���ü����� ã�ư��� ��
															// java:comp/env ������
		DataSource ds = (DataSource) env.lookup("jdbc/orcl");
		return ds.getConnection();
	} // getConnection�� ���� Ŀ�ؼ� Ǯ�� �����մϴ�.

	
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
