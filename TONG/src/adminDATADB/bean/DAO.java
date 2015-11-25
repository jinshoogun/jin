package adminDATADB.bean;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.sql.*;
import javax.naming.*;
import java.text.NumberFormat;
import adminDATADB.bean.DTO;


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
			pstmt = conn.prepareStatement("insert into Administrator values(?,?,'FV215b_183',?,'master@HeadTong.co.kr', '2015-12-04', '02-111-1111')");		
			pstmt.setString(1, (numformat.format(x)));
			pstmt.setString(2, "Admin"+(numformat.format(x)));
			pstmt.setString(3, "관리자"+(numformat.format(x)));
		    pstmt.executeQuery();}
			 }else{
				 alert("생성량이 초과 되었습니다");
			 }
			
		} catch (Exception e) { //예외처리
			e.printStackTrace();

		} finally {
			
			try {if (pstmt != null) {pstmt.close();}} catch (SQLException e) {}
			try {if (conn != null) {conn.close();}} catch (SQLException e) {}
		}
	}
	private void alert(String string) {
		// TODO Auto-generated method stub
		
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
	
	public List getMembershiplists(int start, int end) throws Exception {
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

	public List getUserlists(int start, int end, String sqry) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List articleList=null;
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
				articleList = new ArrayList(end);
				do{
					DTO article= new DTO();
			      	article.setM_num(rs.getString("m_num"));
			      	article.setM_id(rs.getString("m_id"));
					article.setM_password(rs.getString("m_password"));
					article.setM_name(rs.getString("m_name"));
					article.setM_email(rs.getString("m_email"));
					article.setM_sex(rs.getString("m_sex"));
					article.setM_birth(rs.getString("m_birth"));
					article.setM_phone(rs.getString("m_phone"));
					article.setM_reg(rs.getTimestamp("m_reg"));
					articleList.add(article);
				}while(rs.next());
			}
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			if (rs != null) try { rs.close(); } catch(SQLException ex) {}
			if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
			if (conn != null) try { conn.close(); } catch(SQLException ex) {}
		}
		return articleList;
	}
	public int getUserlistCount(String sqry) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		int x=0;

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("select count(*) from membership "+sqry);	//	public int getArticleCount(String sqry) throws Exception {
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
	}	//	int getArticleCount(String sqry)
}

	 