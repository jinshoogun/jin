package ShopProduct;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import ShopProduct.DTO;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;



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
	
	/*
	public void insertAricle(DTO article) throws Exception {

	      Connection conn = null;
	      PreparedStatement pstmt = null;
	      ResultSet rs = null;
	      int num = article.getNum();
	      int number = 0;
	      String sql = "";
	      
	      try {
	         conn = getConnection();
	         pstmt = conn.prepareStatement("select max(num) from movieInfo");
	         rs = pstmt.executeQuery();
	         
	         if (rs.next())
	            number = rs.getInt(1) + 1;
	         else
	            number = 1;

	         sql = "insert into movieInfo(num,writer,subject,content,reg_date,readcount,ip,image)";
	         sql += " values(movieInfo_seq.NEXTVAL,?,?,?,?,?,?,?)";
	         pstmt = conn.prepareStatement(sql);
	         pstmt.setString(1, article.getWriter());
	         pstmt.setString(2, article.getSubject());
	         pstmt.setString(3, article.getContent());
	         pstmt.setTimestamp(4, article.getReg_date());
	         pstmt.setInt(5, article.getReadcount());
	         pstmt.setString(6, article.getIp());
	         pstmt.setString(7, article.getImage());
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
	   */
	public void insertShopProduct(DTO ShopProduct) throws Exception {
		System.out.println("------------------insertShopProduct(DTO ShopProduct) start--------------------");
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int s_no = ShopProduct.getS_no();
		int number = 0;
		String sql = "";

		try {
			conn = getConnection();
			/*pstmt = conn.prepareStatement("select max(s_no) from SHOPPRODUCT");
			rs = pstmt.executeQuery();
			if (rs.next()){
				number = rs.getInt(1) + 1;
			pstmt.close();
			}else{
				number = 1;
			pstmt.close();
			}*/

			sql = "insert into SHOPPRODUCT(S_NO,S_NAME,S_PRICE,S_DERAIL,S_DATE,"
					+ "S_STOCK,S_IMAGE) values(shopproduct_seq.NEXTVAL,?,?,?,sysdate,?,?)";
			
			sql = "insert into SHOPPRODUCT values(shopproduct_seq.NEXTVAL,?,?,?,?,?,sysdate)"; 

			pstmt = conn.prepareStatement(sql);

			pstmt.setString(1, ShopProduct.getS_name());
			pstmt.setString(2, ShopProduct.getS_price());
			pstmt.setString(3, ShopProduct.getS_derail());
			pstmt.setString(4, ShopProduct.getS_stock());
			pstmt.setString(5, ShopProduct.getS_image());
			pstmt.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (rs != null)
				try {
					rs.close();
				} catch (SQLException e) {
				}
			if (pstmt != null)
				try {
					pstmt.close();
				} catch (SQLException e) {
				}
			if (conn != null)
				try {
					conn.close();
				} catch (SQLException e) {
				}
		}
		System.out.println("------------------insertShopProduct(DTO ShopProduct) end--------------------");
	}

	public int getArticleCount() throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int x = 0;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("select count(*) from SHOPPRODUCT");
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
			pstmt = conn.prepareStatement("select S_NO,S_NAME,S_PRICE,S_DERAIL,S_STOCK,S_IMAGE,S_DATE "
					+ "from (select S_NO,S_NAME,S_PRICE,S_DERAIL,S_STOCK,S_IMAGE,S_DATE, rownum r "
					+ "from (select S_NO,S_NAME,S_PRICE,S_DERAIL,S_STOCK,S_IMAGE,S_DATE "
					+ "from SHOPPRODUCT )) where r>=? and r<=?");


			
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);

			rs = pstmt.executeQuery();
			if (rs.next()) {
				articleList = new ArrayList(end);
				do {
					DTO article = new DTO();
					article.setS_no(rs.getInt("S_NO"));
					article.setS_name(rs.getString("S_NAME"));
					article.setS_price(rs.getString("S_PRICE"));
					article.setS_derail(rs.getString("S_DERAIL"));
					article.setS_stock(rs.getString("S_STOCK"));
					article.setS_image(rs.getString("S_IMAGE"));
					article.setS_date(rs.getString("S_DATE"));
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
	
	

}
