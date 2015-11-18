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
    //���ҽ� ����
	private Connection getConnection() throws Exception {
		
		Context initCtx = new InitialContext();
		Context envCtx = (Context) initCtx.lookup("java:comp/env");  //�ڹٷ� ������ �� ã�´�.
		DataSource ds = (DataSource)envCtx.lookup("jdbc/orcl");  //�ڹٷε� �κ��߿� jdbc�εȰ� ã�´�.�������̸��̶� �ܾ����
		return ds.getConnection();
	}
	
	//insert()�޼ҵ�
	public void insertAdmin(DTO admin){
		Connection conn =null;
		PreparedStatement pstmt = null;
		try {
			conn=getConnection();//Ŀ�ؼ� ����
			//��������!
			pstmt = conn.prepareStatement("insert into Administrator values(?,?,?,?,?,?,?,?,?)");
			pstmt.setString(1, admin.getA_num());
			pstmt.setString(2, admin.getA_id());
			pstmt.setString(3, admin.getA_password());
			pstmt.setString(4, admin.getA_name());
			pstmt.setString(5, admin.getA_email());
			pstmt.setString(6, admin.getA_birth());
			pstmt.setString(7, admin.getA_phone());
			pstmt.executeQuery();
		} catch (Exception e) { //����ó��
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
							x= 1; //���� ����
						else
							x= 0; //��й�ȣ Ʋ��
					   }else
						    x= -1;//�ش� ���̵� ����
					
					
		        } catch(Exception ex) {
		            ex.printStackTrace();
		        } finally {
					if (rs != null) try { rs.close(); } catch(SQLException ex) {}
		            if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
		            if (conn != null) try { conn.close(); } catch(SQLException ex) {}
		        }
				return x;
			}
	public List getAdminlists(int start, int end) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List adminList=null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(
					"select * from Administrator where a_num >= ? and a_num <= ? order by a_num asc");
					pstmt.setInt(1, start); 
					pstmt.setInt(2, end); 

					rs = pstmt.executeQuery();
					if (rs.next()) {
						adminList = new ArrayList(end); 
						do{ 
							DTO adminlist= new DTO();
							adminlist.setA_num(rs.getString("a_num"));
							adminlist.setA_id(rs.getString("a_id"));
							adminlist.setA_name(rs.getString("a_name"));
							adminList.add(adminlist); 
						}while(rs.next());
					}
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			if (rs != null) try { rs.close(); } catch(SQLException ex) {}
			if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
			if (conn != null) try { conn.close(); } catch(SQLException ex) {}
		}

		
		return adminList;
		
	}
	
	public int getAdminlistCount() throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int x=0;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("select count(*) from Administrator");
			rs = pstmt.executeQuery();
			if (rs.next()) {
				x= rs.getInt(1); 
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
	

	public void DeleteAdmin(int a_num) throws Exception {
		 Connection conn = null;
		 PreparedStatement pstmt= null;
		 ResultSet rs = null;
		 try {
			 conn = getConnection();  //Ŀ�ؼ� ����
			 pstmt = conn.prepareStatement("delete from Administrator where a_num=?");
			 pstmt.setInt(1, a_num);
			 rs=pstmt.executeQuery();
			 
		 }catch(Exception ex) {
			 ex.printStackTrace();
		 }finally {
			 if (rs != null) try { rs.close(); } catch(SQLException ex) {}
	            if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
	            if (conn != null) try { conn.close(); } catch(SQLException ex) {}
		 }
	 }
	
		    
	public DTO updateGetAdmin(int a_num) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		DTO admin =null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(
			"select * from Administrator where a_num = ?"); 
			pstmt.setInt(1, a_num);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				admin = new DTO();
				admin.setA_num(rs.getString("a_num"));
				admin.setA_id(rs.getString("a_id"));
				admin.setA_password(rs.getString("a_password"));
				admin.setA_name(rs.getString("a_name"));
				admin.setA_email(rs.getString("a_email"));
				admin.setA_birth(rs.getString("a_birth"));
				admin.setA_phone(rs.getString("a_phone"));
				
		
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			if (rs != null) try { rs.close(); } catch(SQLException ex) {}
			if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
			if (conn != null) try { conn.close(); } catch(SQLException ex) {}
		}

		return admin;
	}
}



	 