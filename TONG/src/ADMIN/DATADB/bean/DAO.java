package ADMIN.DATADB.bean;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.sql.*;
import javax.naming.*;


public class DAO {
	private static DAO instance = new DAO();
    
    public static DAO getInstance() {
        return instance;
    }
    
    private DAO() {
    }
    //리소스 관리
	private Connection getConnection() throws Exception {
		
		Context initCtx = new InitialContext();
		Context envCtx = (Context) initCtx.lookup("java:comp/env");  //자바로 설정된 걸 찾는다.
		DataSource ds = (DataSource)envCtx.lookup("jdbc/orcl");  //자바로된 부분중에 jdbc로된걸 찾는다.고정된이름이라 외어야함
		return ds.getConnection();
	}
	
	//insert()메소드
	public void insertAdmin(DTO admin){
		Connection conn =null;
		PreparedStatement pstmt = null;
		try {
			conn=getConnection();//커넥션 연결
			//쿼리생성!
			pstmt = conn.prepareStatement("insert into Administrator values(?,?,?,?,?,?,?,?)");
			
			pstmt.setString(1, admin.getA_id());
			pstmt.setString(2, admin.getA_password());
			pstmt.setString(3, admin.getA_name());
			pstmt.setString(4, admin.getA_email());
			pstmt.setString(5, admin.getA_birth());
			pstmt.setString(6, admin.getA_phone());
			pstmt.executeQuery();
		} catch (Exception e) { //예외처리
			e.printStackTrace();

		} finally {
			
			try {if (pstmt != null) {pstmt.close();}} catch (SQLException e) {}
			try {if (conn != null) {conn.close();}} catch (SQLException e) {}
		}
	}
	public int userCheck(String id, String password) 
			throws Exception {
				Connection conn = null;
		        PreparedStatement pstmt = null;
				ResultSet rs= null;
		        String dbpasswd="";
				int x=-1;
		        
				try {
		            conn = getConnection();
		            
		            pstmt = conn.prepareStatement("select A_password from Administrator where A_ID = ?");
		            pstmt.setString(1, id);
		            rs = pstmt.executeQuery();

					if(rs.next()){
						dbpasswd= rs.getString("A_password"); 
						if(dbpasswd.equals(password))
							x= 1; //인증 성공
						else
							x= 0; //비밀번호 틀림
					   }else
						    x= -1;//해당 아이디 없음
					
					
		        } catch(Exception ex) {
		            ex.printStackTrace();
		        } finally {
					if (rs != null) try { rs.close(); } catch(SQLException ex) {}
		            if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
		            if (conn != null) try { conn.close(); } catch(SQLException ex) {}
		        }
				return x;
			}

	public DTO getAdminlist(String a_id) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		DTO adminlist=null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(
			"select * from Administrator where a_id = ?"); 
			pstmt.setString(1, a_id);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				adminlist = new DTO();
				adminlist.setA_id(rs.getString("a_id"));
				adminlist.setA_name(rs.getString("a_name"));

			}
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			if (rs != null) try { rs.close(); } catch(SQLException ex) {}
			if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
			if (conn != null) try { conn.close(); } catch(SQLException ex) {}
		}
		
		return adminlist;
	}
	
	
	
	

	public int ConfirmId(String a_id)  //중복확인 메소드
	 throws Exception {
		 Connection conn = null;
		 PreparedStatement pstmt= null;
		 ResultSet rs = null;
		 String dbpasswd="";
		 int x=-1;
		 
		 try {
			 conn = getConnection();  //커넥션 연결
			 
			 pstmt = conn.prepareStatement("select a_id from Administrator where a_id =?");
			                               //ID를 입력하고 그에해당하는 ID를 가져옴.
			 
			 pstmt.setString(1, a_id);
			
			 rs=pstmt.executeQuery();
			 
			 if(rs.next()) //rs에 저장된 결과가 있으면 if문실행 없으면 else문 실행
				 x=1; //해당아이디 있음
			 else
				 x=-1; //해당아이디없음
			 
		 }catch(Exception ex) {
			 ex.printStackTrace();
		 }finally {
			 if (rs != null) try { rs.close(); } catch(SQLException ex) {}
	            if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
	            if (conn != null) try { conn.close(); } catch(SQLException ex) {}
		 }
		 return x;
		 
	 }
	
		    
	public int deleteMembership (String a_id,String a_password)
	     throws Exception {
		 Connection conn = null;
	        PreparedStatement pstmt = null;
	        ResultSet rs= null;
	        String dbpasswd="";
	        int x=-1;
	        try {
				conn = getConnection();  //커넥션 연결
	            pstmt = conn.prepareStatement("select a_password from Administrator where a_id = ?");
	            //쿼리 생성, 해당하는 아이디에 맞는 pw를 가져온다 -> dbpasswd변수에 대입한다.
	            pstmt.setString(1, a_id);
	            rs = pstmt.executeQuery();
				if(rs.next()){
					dbpasswd= rs.getString("m_password"); 
					System.out.println(a_password + dbpasswd);
					if(dbpasswd.equals(a_password)){  //equals 함수를 사용해서 퀴리문을 통해 가져온dbpassword와 pw를 비교하여 동일하면 delete문 실행
						pstmt = conn.prepareStatement(
	            	      "delete from Administrator where a_id=?");
	                    pstmt.setString(1, a_id);
	                    pstmt.executeUpdate();
						x= 1; //회원탈퇴 성공
					}else
						x= 0; //비밀번호 틀림
				}
	        } catch(Exception ex) {
	            ex.printStackTrace();
	        } finally {
	            if (rs != null) try { rs.close(); } catch(SQLException ex) {}
	            if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
	            if (conn != null) try { conn.close(); } catch(SQLException ex) {}
	        }
			return x;
	    }
}



	 