 package DATADB.bean;
 
 import java.sql.*;
 import javax.sql.*;
 import javax.naming.*;
 import java.util.*;
 
 public class nDAO {
    
 	private static nDAO instance = new nDAO();
    
    public static nDAO getInstance() {
        return instance;
    }
    
    private nDAO() {
    }
    
    private Connection getConnection() throws Exception {
      Context initCtx = new InitialContext();
      Context envCtx = (Context) initCtx.lookup("java:comp/env");
      DataSource ds = (DataSource)envCtx.lookup("jdbc/orcl");
      return ds.getConnection();
    }
 
    public void insertArticle(DTO article) 
    throws Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;
		ResultSet rs = null;

		int num=article.getN_num();
		int ref=article.getN_ref();
		int re_step=article.getN_re_step();
		int re_level=article.getN_re_level();
		int number=0;
        String sql="";

        try {
            conn = getConnection();
            pstmt = conn.prepareStatement("select max(n_num) from notice");
			rs = pstmt.executeQuery();
			
			if (rs.next())
		      number=rs.getInt(1)+1;
		    else
		      number=1; 
		   
		    if (num!=0)
		    {  
		      sql="update notice set n_re_step=n_re_step+1 where n_ref= ? and n_re_step> ?";
              pstmt = conn.prepareStatement(sql);
              pstmt.setInt(1, ref);
			  pstmt.setInt(2, re_step);
			  pstmt.executeUpdate();
			  re_step=re_step+1;
			  re_level=re_level+1;
		     }else{
		  	  ref=number;
			  re_step=0;
			  re_level=0;
		     }
            sql = "insert into notice(n_num,n_writer,n_subject,n_content,n_password,";
		    sql+="n_ref,n_re_step,n_re_level,n_reg_date) values(notice_seq.NEXTVAL,?,?,?,?,?,?,?,sysdate)";

            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, article.getN_writer());
            pstmt.setString(2, article.getN_subject());
			pstmt.setString(3, article.getN_content());
            pstmt.setString(4, article.getN_password());
            pstmt.setInt(5, ref);
            pstmt.setInt(6, re_step);
            pstmt.setInt(7, re_level);
			
            pstmt.executeUpdate();
        } catch(Exception ex) {
            ex.printStackTrace();
        } finally {
			if (rs != null) try { rs.close(); } catch(SQLException ex) {}
            if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
            if (conn != null) try { conn.close(); } catch(SQLException ex) {}
        }
    }
    
	public int getArticleCount(String sqry)
    throws Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        int x=0;

        try {
            conn = getConnection();
            
            pstmt = conn.prepareStatement("select count(*) from notice" + sqry);
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

	public List getArticles(int start, int end, String sqry)
    throws Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List articleList=null;
		String sql="";
		String col="";
        try {
            conn = getConnection();
            col = "n_num, n_writer, n_subject, n_password, n_content, n_readcount, n_reg_date, n_ref, n_re_step, n_re_level";
			pstmt = conn.prepareStatement("select "+col+" from ( select "+col+", rownum r"+" from ( select "+col+" from notice "+sqry+" order by n_reg_date desc) ) where r between ? and ?");
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                articleList = new ArrayList(end);
                do{
                  DTO article= new DTO();
				  article.setN_num(rs.getInt("n_num"));
				  article.setN_writer(rs.getString("n_writer"));
                  article.setN_subject(rs.getString("n_subject"));
                  article.setN_content(rs.getString("n_content"));
                  article.setN_password(rs.getString("n_password"));
				  article.setN_readcount(rs.getInt("n_readcount"));
			      article.setN_reg_date(rs.getTimestamp("n_reg_date"));
                  article.setN_ref(rs.getInt("n_ref"));
                  article.setN_re_step(rs.getInt("n_re_step"));
				  article.setN_re_level(rs.getInt("n_re_level"));
				  
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
 
    public DTO getArticle(int num)
    throws Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        DTO article=null;
        try {
            conn = getConnection();

            pstmt = conn.prepareStatement(
            	"update notice set n_readcount=n_readcount+1 where n_num = ?");
			pstmt.setInt(1, num);
			pstmt.executeUpdate();

            pstmt = conn.prepareStatement(
            	"select * from notice where n_num = ?");
            pstmt.setInt(1, num);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                article = new DTO();
                article.setN_num(rs.getInt("n_num"));
				article.setN_writer(rs.getString("n_writer"));
                article.setN_subject(rs.getString("n_subject"));
                article.setN_content(rs.getString("n_content")); 
                article.setN_password(rs.getString("n_password"));
				article.setN_readcount(rs.getInt("n_readcount"));
			    article.setN_reg_date(rs.getTimestamp("n_reg_date"));
                article.setN_ref(rs.getInt("n_ref"));
                article.setN_re_step(rs.getInt("n_re_step"));
				article.setN_re_level(rs.getInt("n_re_level"));   
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

    public DTO updateGetArticle(int num)
    throws Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        DTO article=null;
        try {
            conn = getConnection();

            pstmt = conn.prepareStatement(
            	"select * from notice where n_num = ?");
            pstmt.setInt(1, num);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                article = new DTO();
                article.setN_num(rs.getInt("n_num"));
				article.setN_writer(rs.getString("n_writer"));
                article.setN_subject(rs.getString("n_subject"));
                article.setN_content(rs.getString("n_content"));
                article.setN_password(rs.getString("n_password"));
				article.setN_readcount(rs.getInt("n_readcount"));
			    article.setN_reg_date(rs.getTimestamp("n_reg_date"));
                article.setN_ref(rs.getInt("n_ref"));
                article.setN_re_step(rs.getInt("n_re_step"));
				article.setN_re_level(rs.getInt("n_re_level"));
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

    public int updateArticle(DTO article)
    throws Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs= null;

        String dbpasswd="";
        String sql="";
		int x=-1;
        try {
            conn = getConnection();
            
			pstmt = conn.prepareStatement(
            	"select n_password from notice where n_num = ?");
            pstmt.setInt(1, article.getN_num());
            rs = pstmt.executeQuery();
            
			if(rs.next()){
			  dbpasswd= rs.getString("n_password"); 
			  if(dbpasswd.equals(article.getN_password())){
                sql="update notice set n_writer=?,n_subject=?,n_password=?";
			    sql+=",n_content=? where n_num=?";
                pstmt = conn.prepareStatement(sql);

                pstmt.setString(1, article.getN_writer());
                pstmt.setString(3, article.getN_subject());
                pstmt.setString(4, article.getN_password());
                pstmt.setString(5, article.getN_content());
			    pstmt.setInt(6, article.getN_num());
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
    
    public int deleteArticle(int num, String password)
    throws Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs= null;
        String dbpasswd="";
        int x=-1;
        try {
			conn = getConnection();

            pstmt = conn.prepareStatement(
            	"select n_password from notice where n_num = ?");
            pstmt.setInt(1, num);
            rs = pstmt.executeQuery();
            
			if(rs.next()){
				dbpasswd= rs.getString("n_password"); 
				if(dbpasswd.equals(password)){
					pstmt = conn.prepareStatement(
            	      "delete from notice where n_num=?");
                    pstmt.setInt(1, num);
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
    
    public List getMyList(String id) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List articleList=null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("select * from notice where n_writer=? order by n_reg_date");
					
			        pstmt.setString(1, id);

					rs = pstmt.executeQuery();
					if (rs.next()) {
						articleList = new ArrayList(); 
						do{ 
							DTO article= new DTO();
							article.setN_num(rs.getInt("n_num"));
							article.setN_writer(rs.getString("n_writer"));
							article.setN_subject(rs.getString("n_subject"));
							article.setN_content(rs.getString("n_content"));
							article.setN_password(rs.getString("n_password"));
							article.setN_readcount(rs.getInt("n_readcount"));
							article.setN_reg_date(rs.getTimestamp("n_reg_date"));
							article.setN_ref(rs.getInt("n_ref"));
							article.setN_re_step(rs.getInt("n_re_step"));
							article.setN_re_level(rs.getInt("n_re_level"));
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
 }