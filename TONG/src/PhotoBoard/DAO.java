package PhotoBoard;
import java.sql.*;
import javax.sql.*;

import PhotoBoard.DTO;

import javax.naming.*;
import java.util.*; 

public class DAO {

	private static DAO instance = new DAO();
	
	public static DAO getInstance() {
		return instance;
	
	}
	private DAO() {}
	
	private Connection getConnection() throws Exception {
		Context Ctx = new InitialContext();
		Context env = (Context) Ctx.lookup("java:comp/env");
		
		DataSource ds = (DataSource)env.lookup("jdbc/orcl");
		return ds.getConnection();
	}
	
	
	public void insertArticle(DTO article) throws Exception {
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int p_num=article.getP_num();
		int p_ref=article.getP_ref();
		int p_re_step=article.getP_re_step();
		int p_re_level=article.getP_re_level();
		int number=0;
		String sql="";
		try {
			conn = getConnection(); 
			pstmt = conn.prepareStatement("select max(P_num) from PhotoBoard");
			rs = pstmt.executeQuery();
			if (rs.next()) 
				number=rs.getInt(1)+1;	
			else
				number=1; 
			if (p_num!=0) 
			{ 
				sql="update PhotoBoard set p_re_step=p_re_step+1 where p_ref= ? and p_re_step> ?";
				pstmt = conn.prepareStatement(sql);
				pstmt.setInt(1, p_ref);
				pstmt.setInt(2, p_re_step);
				pstmt.executeUpdate();
				p_re_step=p_re_step+1;
				p_re_level=p_re_level+1;
			}else{ 
				p_ref=number;
				p_re_step=0;
				p_re_level=0;
			}
			sql = "insert into PhotoBoard(p_num,p_writer,p_subject,p_reg,p_password,";
			sql+="p_readcount,p_re_step,p_re_level,p_content) values(PhotoBoard_seq.NEXTVAL,?,?,?,?,?,?,?,?)";
				pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, article.getP_writer());
			pstmt.setString(2, article.getP_subject());
			pstmt.setTimestamp(3, article.getP_reg_date());
			pstmt.setString(4, article.getP_password());
			pstmt.setInt(5, article.getP_readcount());
			pstmt.setInt(6, p_re_step);
			pstmt.setInt(7, p_re_level);
			pstmt.setString(8, article.getP_content());
			pstmt.executeUpdate();

		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			if (rs != null) try { rs.close(); } catch(SQLException ex) {}
			if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
			if (conn != null) try { conn.close(); } catch(SQLException ex) {}
		}
	}
	


	public int getArticleCount() throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int x=0;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("select count(*) from PhotoBoard");
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
	

	public List getArticles(int start, int end) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List articleList=null;
		try {
			conn = getConnection();

			pstmt = conn.prepareStatement(
					"select P_num,P_writer,P_subject,P_content,P_password,P_readcount,P_ref,P_re_step,P_re_level,P_reg,r "
					+
					"from (select P_num,P_writer,P_subject,P_content,P_password,P_readcount,P_ref,P_re_step,P_re_level,P_reg,rownum r " +
					"from (select P_num,P_writer,P_subject,P_content,P_password,P_readcount,P_ref,P_re_step,P_re_level,P_reg " +
					"from PhotoBoard order by P_ref desc, P_re_step asc) order by P_ref desc, P_re_step asc ) where r >= ? and r <= ? ");
			
					pstmt.setInt(1, start); 
					pstmt.setInt(2, end); 
				
					rs = pstmt.executeQuery();
					if (rs.next()) {
						articleList = new ArrayList(end); 
						do{ 
							DTO article = new DTO();
							article.setP_num(rs.getInt("p_num"));
							article.setP_writer(rs.getString("p_writer"));
							article.setP_subject(rs.getString("p_subject"));
							article.setP_content(rs.getString("p_content"));
							article.setP_password(rs.getString("p_password"));
							article.setP_readcount(rs.getInt("p_readcount"));
							article.setP_ref(rs.getInt("p_ref"));
							article.setP_re_step(rs.getInt("p_re_step"));
							article.setP_re_level(rs.getInt("p_re_level"));
							article.setP_reg_date(rs.getTimestamp("P_reg"));
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
	
	public List getPhotoBoardArticles(int start, int end, String sqry) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List articleList=null;
		String sql="";
		String col="";
		try {
			
			conn = getConnection();
			col = "p_num, p_writer, p_subject,p_password, p_reg, p_content,p_readcount";
			pstmt = conn.prepareStatement("select "+col+" from ( select "+col+", rownum r"+" from ( select "+col+" from PhotoBoard "+sqry+" order by p_reg) ) where r between ? and ?");
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);

					rs = pstmt.executeQuery();
					if (rs.next()) {
						articleList = new ArrayList(end); 
						do{ 
							DTO article= new DTO();
							article.setP_num(rs.getInt("p_num"));
							article.setP_writer(rs.getString("p_writer"));
							article.setP_subject(rs.getString("p_subject"));
							article.setP_password(rs.getString("p_password"));
							article.setP_reg_date(rs.getTimestamp("p_reg"));
							article.setP_readcount(rs.getInt("p_readcount"));
							article.setP_content(rs.getString("p_content"));
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
	public DTO getArticle(int p_num) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		DTO article=null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(
			"update PhotoBoard set p_readcount=p_readcount+1 where p_num = ?"); 
			pstmt.setInt(1, p_num);
			pstmt.executeUpdate();
			pstmt = conn.prepareStatement(
			"select * from PhotoBoard where p_num = ?"); 
			pstmt.setInt(1, p_num);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				article = new DTO();
				article.setP_num(rs.getInt("p_num"));
				article.setP_writer(rs.getString("p_writer"));
				article.setP_subject(rs.getString("p_subject"));
				article.setP_content(rs.getString("p_content"));
				article.setP_password(rs.getString("p_password"));
				article.setP_readcount(rs.getInt("p_readcount"));
				article.setP_ref(rs.getInt("p_ref"));
				article.setP_re_step(rs.getInt("p_re_step"));
				article.setP_re_level(rs.getInt("p_re_level"));

			}
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			if (rs != null) try { rs.close(); } catch(SQLException ex) {}
			if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
			if (conn != null) try { conn.close(); } catch(SQLException ex) {}
		}
		
		return article;
	}
	
	
	public DTO updateGetArticle(int p_num) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		DTO article=null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(
			"select * from PhotoBoard where p_num = ?"); 
			pstmt.setInt(1, p_num);
			rs = pstmt.executeQuery();
			if (rs.next()) {
				article = new DTO();
				article.setP_num(rs.getInt("p_num"));
				article.setP_writer(rs.getString("p_writer"));
				article.setP_subject(rs.getString("p_subject"));
				article.setP_content(rs.getString("p_content"));
				article.setP_password(rs.getString("p_password"));
				article.setP_readcount(rs.getInt("p_readcount"));
				article.setP_ref(rs.getInt("p_ref"));
				article.setP_re_step(rs.getInt("p_re_step"));
				article.setP_re_level(rs.getInt("p_re_level"));

			}
		} catch(Exception ex) {
			ex.printStackTrace();
		} finally {
			if (rs != null) try { rs.close(); } catch(SQLException ex) {}
			if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
			if (conn != null) try { conn.close(); } catch(SQLException ex) {}
		}

		return article;
	}
	public int getPhotoBoardArticleCount(String sqry) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		int x=0;

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("select count(*) from PhotoBoard " + sqry);	//	public int getArticleCount(String sqry) throws Exception {
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
	

	public int updateArticle(DTO article) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		String dbpasswd="";
		String sql="";
		int x=-1;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(
			"select p_password from PhotoBoard where p_num = ?");
			pstmt.setInt(1, article.getP_num());
			rs = pstmt.executeQuery();
			if(rs.next()){
				dbpasswd= rs.getString("p_password"); 
				if(dbpasswd.equals(article.getP_password())){
					sql="update PhotoBoard set p_writer=?,p_subject=?,p_password=?";
					sql+=",p_content=? where p_num=?";
					pstmt = conn.prepareStatement(sql);
					pstmt.setString(1, article.getP_writer());
					pstmt.setString(2, article.getP_subject());
					pstmt.setString(3, article.getP_password());
					pstmt.setString(4, article.getP_content());
					pstmt.setInt(5, article.getP_num());
					pstmt.executeUpdate();
					x= 1;
				}else{
					x= 0;
				}
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
	

	public int deleteArticle(int p_num, String p_password) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs= null;
		String dbpasswd="";
		int x=-1;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(
			"select p_password from PhotoBoard where p_num = ?");
			pstmt.setInt(1, p_num);
			rs = pstmt.executeQuery();
			if(rs.next()){
				dbpasswd= rs.getString("p_password");
				if(dbpasswd.equals(p_password)){
					pstmt = conn.prepareStatement(
					"delete from PhotoBoard where p_num=?");
					pstmt.setInt(1, p_num);
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
	
	public List getMyList(String p_writer){
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List articleList=null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("select * from PhotoBoard where p_writer=? order by p_reg_date");
				pstmt.setString(1, p_writer);
					rs = pstmt.executeQuery();
					if (rs.next()) {
						articleList = new ArrayList(); 
						do{ 
							DTO article= new DTO();
							article = new DTO();
							article.setP_num(rs.getInt("p_num"));
							article.setP_writer(rs.getString("p_writer"));
							article.setP_subject(rs.getString("p_subject"));
							article.setP_content(rs.getString("p_content"));
							article.setP_password(rs.getString("p_password"));
							article.setP_readcount(rs.getInt("p_readcount"));
							article.setP_ref(rs.getInt("p_ref"));
							article.setP_re_step(rs.getInt("p_re_step"));
							article.setP_re_level(rs.getInt("p_re_level"));
							article.setP_reg_date(rs.getTimestamp("p_reg_date"));
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
	
	}
