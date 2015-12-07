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

		Context ctx = new InitialContext();//�������� ã�ư��� ����
		Context env = (Context)ctx.lookup("java:comp/env");//�ڹٷ� ���ü����� ã�ư��� �� java:comp/env ������
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
					dto.setAge(rs.getInt("age") + ""); // �Ķ���Ͱ��� String�� �����ѵ�
														// Int + String("") =
														// String���� ��!
					dto.setReg(rs.getTimestamp("reg"));
					list.add(dto);
				}
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {// ���ῡ�� ���ܰ� ���� �� ������ ó���ؾߵ˴ϴ�.
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
			// Ŭ����� ���ε��� ����ó���� �� �� �ֵ��� �ؾ��Ѵ�. (���� �߻��� �ٸ� ���� ������� �ʱ� �����̴�)
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
