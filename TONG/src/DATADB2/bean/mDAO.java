package DATADB2.bean;

import java.sql.*;
import javax.sql.*;
import javax.naming.*;


public class mDAO {
	private static mDAO instance = new mDAO();
    
    public static mDAO getInstance() {
        return instance;
    }
    
    private mDAO() {
    }
    
	private Connection getConnection() throws Exception {
		
		Context initCtx = new InitialContext();
		Context envCtx = (Context) initCtx.lookup("java:comp/env");
		DataSource ds = (DataSource)envCtx.lookup("jdbc/orcl");
		return ds.getConnection();
	}
	
	
	public void insertMembership(DTO membership){
		Connection conn =null;
		PreparedStatement pstmt = null;
		try {
			conn=getConnection();
			
			pstmt = conn.prepareStatement( "insert into membership values(?,?,?,?,?,?,?,sysdate)");
			
			pstmt.setString(1,membership.getM_id());
			pstmt.setString(2,membership.getM_password());
			pstmt.setString(3,membership.getM_name());
			pstmt.setString(4,membership.getM_email());
			pstmt.setString(5,membership.getM_sex());
			pstmt.setString(6,membership.getM_birth());
			pstmt.setString(7,membership.getM_phone());
			
			
			pstmt.executeQuery();
		} catch (Exception e) { 
			e.printStackTrace();

		} finally {
			
			try {if (pstmt != null) {pstmt.close();}} catch (SQLException e) {}
			try {if (conn != null) {conn.close();}} catch (SQLException e) {}
		}
			
		
		
		
	}
	public int userCheck(String m_id, String m_password) 
			throws Exception {
				Connection conn = null;
		        PreparedStatement pstmt = null;
				ResultSet rs= null;
		        String dbpasswd="";
				int x=-1;
		        
				try {
		            conn = getConnection();
		            
		            pstmt = conn.prepareStatement(
		            	"select m_password from membership where m_id =?");
		            pstmt.setString(1, m_id);
		            rs= pstmt.executeQuery();
					if(rs.next()){
						dbpasswd= rs.getString("m_password");
						
						if(dbpasswd.equals(m_password))
							x= 1;
						else
							x= 0;
					}else{
						x= -1;
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


	public int ConfirmId(String m_id) 
	 throws Exception {
		 Connection conn = null;
		 PreparedStatement pstmt= null;
		 ResultSet rs = null;
		 String dbpasswd="";
		 int x=-1;
		 
		 try {
			 conn = getConnection(); 
			 
			 pstmt = conn.prepareStatement("select m_id from membership where m_id =?");
			                              
			 
			 pstmt.setString(1, m_id);
			
			 rs=pstmt.executeQuery();
			 
			 if(rs.next()) 
				 x=1; 
			 else
				 x=-1;
			 
		 }catch(Exception ex) {
			 ex.printStackTrace();
		 }finally {
			 if (rs != null) try { rs.close(); } catch(SQLException ex) {}
	            if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
	            if (conn != null) try { conn.close(); } catch(SQLException ex) {}
		 }
		 return x;
		 
	 }
	
		    
	public int deleteMembership (String m_id,String m_password)
	     throws Exception {
		 Connection conn = null;
	        PreparedStatement pstmt = null;
	        ResultSet rs= null;
	        String dbpasswd="";
	        int x=-1;
	        try {
				conn = getConnection();
	            pstmt = conn.prepareStatement("select m_password from membership where m_id = ?");
	            
	            pstmt.setString(1, m_id);
	            rs = pstmt.executeQuery();
				System.out.println(m_id);
				if(rs.next()){
					dbpasswd= rs.getString("m_password"); 
					System.out.println(m_password + dbpasswd);
					if(dbpasswd.equals(m_password)){
						pstmt = conn.prepareStatement(
	            	      "delete from membership where m_id=?");
	                    pstmt.setString(1, m_id);
	                    pstmt.executeUpdate();
						x= 1; 
					}else
						x= 0; 
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
	public DTO getMembership(String m_id) 
			throws Exception {
				Connection conn = null;
				PreparedStatement pstmt =null;
				ResultSet rs = null;
				DTO membership =null;
				
				try {
					conn =getConnection();
					
					pstmt = conn.prepareStatement("select * from membership where m_id =?");
					System.out.println("id "+m_id);
					pstmt.setString(1, m_id);
					rs=pstmt.executeQuery();
					
					if(rs.next()) { 
						membership = new DTO();
						
						membership.setM_id(rs.getString("m_id"));
						membership.setM_password(rs.getString("m_password"));
						membership.setM_name(rs.getString("m_name"));
						membership.setM_email(rs.getString("m_email"));
						membership.setM_sex(rs.getString("m_sex"));
						membership.setM_birth(rs.getString("m_birth"));
						membership.setM_phone(rs.getString("m_phone"));
						membership.setM_reg(rs.getTimestamp("m_reg"));
						
						
					}
				}catch(Exception ex) {
					ex.printStackTrace();
				}finally {
					if (rs!=null) try { rs.close(); }catch(SQLException ex) {}
					if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
			        if (conn != null) try { conn.close(); } catch(SQLException ex) {}		
				}
				return membership;
				
			}

			public void updateMembership(DTO membership)  
			throws Exception {
				Connection conn = null;
				PreparedStatement pstmt = null ;
				
				try {
					conn = getConnection(); 
					
				    pstmt = conn.prepareStatement("update membership set m_password=?,m_name=?,m_email=?");
				                           
				                           
				    pstmt.setString(1,membership.getM_password());
				    pstmt.setString(2, membership.getM_name());
				    pstmt.setString(3, membership.getM_email());
				    
				    pstmt.executeQuery();
				    
				    }catch(Exception ex) {
				    	ex.printStackTrace();
				    }finally {
				    	 if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
				         if (conn != null) try { conn.close(); } catch(SQLException ex) {}
				    }
				
			}
	 }