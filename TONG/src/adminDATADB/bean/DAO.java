
package adminDATADB.bean;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.sql.*;
import javax.naming.*;
import java.text.NumberFormat;



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
	public void insertAdmin(){
		Connection conn =null;
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		

		try {
			int s = 0;
			int x;
				conn=getConnection();
		        pstmt = conn.prepareStatement("select count(*) from Administrator");
		        rs = pstmt.executeQuery();
		        if(rs.next()){
		        	x= rs.getInt(1);
		        	if(x < 16){
		        		NumberFormat numformat = NumberFormat.getIntegerInstance();
		        		numformat.setMinimumIntegerDigits(2);
			pstmt = conn.prepareStatement("insert into Administrator values(?,?,default,?,default,default,Sysdate)");		
			pstmt.setString(1, (numformat.format(x)));
			pstmt.setString(2, "Admin"+(numformat.format(x)));
			pstmt.setString(3, "관리자"+(numformat.format(x)));
		    pstmt.executeQuery();}
			 }else{

			 }
			
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
	
	
	public DTO getAdminlist(String a_num) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		DTO adminlist=null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(
			"select * from Administrator where a_num = ?"); 
			pstmt.setString(1, a_num);
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
			 conn = getConnection();  //커넥션 연결
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
	
		    
	public DTO updateGetAdmin(String a_num) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		DTO admin = new DTO();
		try {
			conn = getConnection();

			pstmt = conn.prepareStatement(
			"select * from Administrator where a_num = ?"); 
			pstmt.setString(1, a_num);
			rs = pstmt.executeQuery();
			if (rs.next()) {
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
	public void updateAdmin(DTO admin) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(
			"update Administrator set a_password=?, a_email=?, a_birth=?, a_phone=? where a_num = ?");
			pstmt.setString(1, admin.getA_password());
			pstmt.setString(2, admin.getA_email());
			pstmt.setString(3, admin.getA_phone());
			pstmt.setString(4, admin.getA_birth());
			pstmt.setString(5, admin.getA_num());
			pstmt.executeUpdate();;
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException ex) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException ex) {
				}
		}
        // 예외처리를 실시한다. 종료시에도 각각 예외처리 실시
	}
	
	
	public int getMembershipCount() throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int x=0;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("select count(*) from MEMBERSHIP");
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

	public List getUserlists(int start, int end, String sqry) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List UserList=null;
		String sql="";
		String col="";

		try {
			conn = getConnection();
			col = "m_num, m_id, m_password, m_name, m_email, m_sex, m_birth, m_phone, m_reg";
			pstmt = conn.prepareStatement("select "+col+" from ( select "+col+", rownum r"+" from ( select "+col+" from membership "+sqry+" order by m_reg desc) ) where r between ? and ?");	//	public List getArticles(int start, int end, String sqry) throws Exception {
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				UserList = new ArrayList(end);
				do{
					DTO userInfo= new DTO();
					userInfo.setM_num(rs.getString("m_num"));
					userInfo.setM_id(rs.getString("m_id"));
					userInfo.setM_password(rs.getString("m_password"));
					userInfo.setM_name(rs.getString("m_name"));
					userInfo.setM_email(rs.getString("m_email"));
					userInfo.setM_sex(rs.getString("m_sex"));
					userInfo.setM_birth(rs.getString("m_birth"));
					userInfo.setM_phone(rs.getString("m_phone"));
					userInfo.setM_reg(rs.getTimestamp("m_reg"));
					UserList.add(userInfo);
				}while(rs.next());
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			if (rs != null) try { rs.close(); } catch(SQLException ex) {}
			if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
			if (conn != null) try { conn.close(); } catch(SQLException ex) {}
		}
		return UserList;
	}
	public int getUserlistCount(String sqry) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		int x=0;

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("select count(*) from membership " + sqry);	//	public int getArticleCount(String sqry) throws Exception {
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
	
	public DTO updateGetUser(String m_num) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		DTO user = new DTO();
		try {
			conn = getConnection();

			pstmt = conn.prepareStatement(
			"select * from membership where m_num = ?"); 
			pstmt.setString(1, m_num);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				user.setM_num(rs.getString("m_num"));
				user.setM_id(rs.getString("m_id"));
				user.setM_password(rs.getString("m_password"));
				user.setM_name(rs.getString("m_name"));
				user.setM_email(rs.getString("m_email"));
				user.setM_sex(rs.getString("m_sex"));
				user.setM_birth(rs.getString("m_birth"));
				user.setM_phone(rs.getString("m_phone"));
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			if (rs != null) try { rs.close(); } catch(SQLException ex) {}
			if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
			if (conn != null) try { conn.close(); } catch(SQLException ex) {}
		}
		return user;
	}
	public void updateUser(DTO user) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(
			"update membership set m_password=?, m_email=?, m_birth=?, m_phone=? where m_num = ?");
			pstmt.setString(1, user.getM_password());
			pstmt.setString(2, user.getM_email());;
			pstmt.setString(3, user.getM_birth());
			pstmt.setString(4, user.getM_phone());
			pstmt.setString(5, user.getM_num());
			
			pstmt.executeUpdate();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException ex) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException ex) {
				}
		}
	}
	
	public void DeleteUser(int m_num) throws Exception {
		 Connection conn = null;
		 PreparedStatement pstmt= null;
		 ResultSet rs = null;
		 try {
			 conn = getConnection();  //커넥션 연결
			 pstmt = conn.prepareStatement("delete from membership where m_num=?");
			 pstmt.setInt(1, m_num);
			 rs=pstmt.executeQuery();
			 
		 }catch(Exception ex) {
			 ex.printStackTrace();
		 }finally {
			 if (rs != null) try { rs.close(); } catch(SQLException ex) {}
	            if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
	            if (conn != null) try { conn.close(); } catch(SQLException ex) {}
		 }
	 }
	
	
	public List getDesignerlists(int start, int end, String sqry) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List DesignerList=null;
		String sql="";
		String col="";

		try {
			conn = getConnection();
			col = "d_num, d_id, d_password, d_name, d_nickname, d_email, d_sex, d_birth, d_phone, d_store, d_date ";
			pstmt = conn.prepareStatement("select "+col+" from ( select "+col+", rownum r"+" from ( select "+col+" from designer "+sqry+" order by d_date desc) ) where r between ? and ?");
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				DesignerList = new ArrayList(end);
				do{
					DTO designerInfo= new DTO();
					designerInfo.setD_num(rs.getString("d_num"));
					designerInfo.setD_id(rs.getString("d_id"));
					designerInfo.setD_password(rs.getString("d_password"));
					designerInfo.setD_nickname(rs.getString("d_nickname"));
					designerInfo.setD_name(rs.getString("d_name"));
					designerInfo.setD_email(rs.getString("d_email"));
					designerInfo.setD_sex(rs.getString("d_sex"));
					designerInfo.setD_birth(rs.getString("d_birth"));
					designerInfo.setD_phone(rs.getString("d_phone"));
					designerInfo.setD_store(rs.getString("d_store"));
					designerInfo.setD_date(rs.getTimestamp("d_date"));
					DesignerList.add(designerInfo);
				}while(rs.next());
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			if (rs != null) try { rs.close(); } catch(SQLException ex) {}
			if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
			if (conn != null) try { conn.close(); } catch(SQLException ex) {}
		}
		return DesignerList;
	}
	
	public int getDesignerlistCount(String sqry) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		int x=0;

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("select count(*) from designer " + sqry);	//	public int getArticleCount(String sqry) throws Exception {
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
	
	public DTO updateGetDesigner(String d_num) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		DTO designer = new DTO();
		try {
			conn = getConnection();

			pstmt = conn.prepareStatement(
			"select * from designer where d_num = ?"); 
			pstmt.setString(1, d_num);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				designer.setD_num(rs.getString("d_num"));
				designer.setD_id(rs.getString("d_id"));
				designer.setD_password(rs.getString("d_password"));
				designer.setD_name(rs.getString("d_name"));
				designer.setD_email(rs.getString("d_email"));
				designer.setD_sex(rs.getString("d_sex"));
				designer.setD_birth(rs.getString("d_birth"));
				designer.setD_phone(rs.getString("d_phone"));
				designer.setD_nickname(rs.getString("d_nickname"));
				designer.setD_store(rs.getString("d_store"));
				designer.setD_date(rs.getTimestamp("d_date"));
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			if (rs != null) try { rs.close(); } catch(SQLException ex) {}
			if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
			if (conn != null) try { conn.close(); } catch(SQLException ex) {}
		}
		return designer;
	}
	public void updateDesigner(DTO designer) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(
			"update Designer set d_password=?, d_email=?, d_birth=?, d_phone=?, d_store=?, d_nickname=? where d_num = ?");
			pstmt.setString(1, designer.getD_password());
			pstmt.setString(2, designer.getD_email());;
			pstmt.setString(3, designer.getD_birth());
			pstmt.setString(4, designer.getD_phone());
			pstmt.setString(5, designer.getD_store());
			pstmt.setString(6, designer.getD_nickname());
			pstmt.setString(7, designer.getD_num());
			
			pstmt.executeUpdate();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException ex) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException ex) {
				}
		}
	}
	
	public void DeleteDesigner(int d_num) throws Exception {
		 Connection conn = null;
		 PreparedStatement pstmt= null;
		 ResultSet rs = null;
		 try {
			 conn = getConnection();  //커넥션 연결
			 pstmt = conn.prepareStatement("delete from designer where d_num=?");
			 pstmt.setInt(1, d_num);
			 rs=pstmt.executeQuery();
			 
		 }catch(Exception ex) {
			 ex.printStackTrace();
		 }finally {
			 if (rs != null) try { rs.close(); } catch(SQLException ex) {}
	            if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
	            if (conn != null) try { conn.close(); } catch(SQLException ex) {}
		 }
	 }
}

	 