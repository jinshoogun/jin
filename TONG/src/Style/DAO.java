package Style;

import java.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.*;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import org.apache.catalina.connector.Request;

import Style.DTO;
import Style.DAO;


public class DAO {

	private static DAO instance = new DAO();

	public static DAO getInstance() {
		return instance;
	}

	private DAO() {
	}

	private Connection getConnection() throws Exception {
		Context initCtx = new InitialContext();
		Context envCtx = (Context) initCtx.lookup("java:comp/env");
		DataSource ds = (DataSource) envCtx.lookup("jdbc/orcl");
		return ds.getConnection();
	}

	public void insertArticle(DTO article) throws Exception {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int num = article.getNum();
		int number = 0;
		String sql = "";

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("select max(num) from style");
			rs = pstmt.executeQuery();
			if (rs.next())
				number = rs.getInt(1) + 1;
			else
				number = 1;

			sql = "insert into style(photo,storename,storeid,area,sex,";
			sql += "style,price,myself,nickname,num) values(?,?,?,?,?,?,?,?,?,Style_seq.NEXTVAL)";
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, article.getStyle_Photo());
			pstmt.setString(2, article.getStyle_Storename());
			pstmt.setString(3, article.getStyle_storeid());	
			pstmt.setString(4, article.getStyle_Area());
			pstmt.setString(5, article.getStyle_Sex());
			pstmt.setString(6, article.getStyle_Style());
			pstmt.setString(7, article.getStyle_Price());
			pstmt.setString(8, article.getStyle_Myself());
			pstmt.setString(9, article.getStyle_Nickname());
			pstmt.executeUpdate();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException ex) {
				}
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

	public void StoreArticle(DTO article) throws Exception {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int num = article.getNum();
		int number = 0;
		String sql = "";

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("select max(num) from store");
			rs = pstmt.executeQuery();
			if (rs.next())
				number = rs.getInt(1) + 1;
			else
				number = 1;

			sql = "insert into style(storename,num) values(?,Style_seq.NEXTVAL)";
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, article.getStorename());
		
			pstmt.executeUpdate();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException ex) {
				}
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
	
	
	public int getArticleCount() throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int x = 0;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("select count(*) from style");
			rs = pstmt.executeQuery();
			if (rs.next()) {
				x = rs.getInt(1);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException ex) {
				}
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
		return x;
	}

	public List getArticles(int start, int end) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List articleList = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("select num,photo,storename,storeid,area,sex,style,price,myself,nickname "
					+ "from (select num,photo,storename,storeid,area,sex,style,price,myself,nickname,rownum r "
					+ "from (select num,photo,storename,storeid,area,sex,style,price,myself,nickname "
					+ "from style)) where r>=? and r<=?");

			pstmt.setInt(1, start);
			pstmt.setInt(2, end);

			rs = pstmt.executeQuery();
			if (rs.next()) {
				articleList = new ArrayList(end);
				do {
					DTO article = new DTO();
					article.setNum(rs.getInt("num"));
					article.setStyle_Photo(rs.getString("photo"));
					article.setStyle_Storename(rs.getString("storename"));
					article.setStyle_storeid(rs.getString("storeid"));
					article.setStyle_Area(rs.getString("area"));
					article.setStyle_Sex(rs.getString("sex"));
					article.setStyle_Style(rs.getString("style"));
					article.setStyle_Price(rs.getString("price"));
					article.setStyle_Myself(rs.getString("myself"));
					article.setStyle_Nickname(rs.getString("nickname"));
					articleList.add(article);
				} while (rs.next());
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException ex) {
				}
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

		return articleList;
	}

	public List getstorename(int start, int end) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List storename = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("select storename,num "
					+ "from (select storename,num,rownum r "
					+ "from (select storename,num "
					+ "from store)) where r>=? and r<=?");

			pstmt.setInt(1, start);
			pstmt.setInt(2, end);

			rs = pstmt.executeQuery();
			if (rs.next()) {
				storename = new ArrayList(end);
				do {
					DTO article = new DTO();
					article.setStorename(rs.getString("storename"));
					article.setNum(rs.getInt("num"));
					storename.add(article);
				} while (rs.next());
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException ex) {
				}
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

		return storename;
	}
	
	
	public DTO getArticle(int num) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		DTO article = null;
		try {
			conn = getConnection();

			pstmt = conn.prepareStatement("select * from style where num = ?");
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				article = new DTO();
				article.setNum(rs.getInt("num"));
				article.setStyle_Photo(rs.getString("photo"));
				article.setStyle_Storename(rs.getString("storename"));
				article.setStyle_storeid(rs.getString("storeid"));
				article.setStyle_Area(rs.getString("area"));
				article.setStyle_Sex(rs.getString("sex"));
				article.setStyle_Style(rs.getString("style"));
				article.setStyle_Price(rs.getString("price"));
				article.setStyle_Myself(rs.getString("myself"));
				article.setStyle_Nickname(rs.getString("nickname"));
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException ex) {
				}
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
		return article;
	}

	public DTO updateGetArticle(int num) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		DTO article = null;
		try {
			conn = getConnection();

			pstmt = conn.prepareStatement("select * from event where e_num = ?");
			pstmt.setInt(1, num);
			
			rs = pstmt.executeQuery();

			if (rs.next()) {
				article = new DTO();
				article.setNum(rs.getInt("num"));
				article.setStyle_Photo(rs.getString("photo"));
				article.setStyle_Storename(rs.getString("storename"));
				article.setStyle_storeid(rs.getString("storeid"));
				article.setStyle_Area(rs.getString("area"));
				article.setStyle_Sex(rs.getString("sex"));
				article.setStyle_Style(rs.getString("style"));
				article.setStyle_Price(rs.getString("price"));
				article.setStyle_Myself(rs.getString("myself"));
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException ex) {
				}
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
		return article;
	}
	
	public List getStoreList(DTO article) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List storeList = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("select * from style where storename=? order by num");

			pstmt.setString(1, article.getStorename());

			rs = pstmt.executeQuery();
			if (rs.next()) {
				storeList = new ArrayList();
				do {
					article = new DTO();
					article.setNum(rs.getInt("num"));
					article.setStyle_Photo(rs.getString("photo"));
					article.setStyle_Storename(rs.getString("storename"));
					article.setStyle_storeid(rs.getString("storeid"));
					article.setStyle_Area(rs.getString("area"));
					article.setStyle_Sex(rs.getString("sex"));
					article.setStyle_Style(rs.getString("style"));
					article.setStyle_Price(rs.getString("price"));
					article.setStyle_Myself(rs.getString("myself"));
					article.setStyle_Nickname(rs.getString("nickname"));
					
					storeList.add(article);
				} while (rs.next());
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException ex) {
				}
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

		return storeList;
	}
	
	public void insertStorename(DTO article) throws Exception {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int num = article.getNum();
		int number = 0;
		String sql = "";

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("select max(num) from store");
			rs = pstmt.executeQuery();
			if (rs.next())
				number = rs.getInt(1) + 1;
			else
				number = 1;

			sql = "insert into store(STORENAME";
			sql += ",NUM) values(?,Store_seq.NEXTVAL)";
			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, article.getStorename());
			pstmt.executeUpdate();
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException ex) {
				}
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

	public int getStoreCount() throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int x = 0;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("select count(*) from store");
			rs = pstmt.executeQuery();
			if (rs.next()) {
				x = rs.getInt(1);
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException ex) {
				}
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
		return x;
	}
}