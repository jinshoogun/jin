 package DATADB.bean;
 
 import java.sql.*;
 import javax.sql.*;
 import javax.naming.*;
 import java.util.*;
 
 public class eDAO {
    
 	private static eDAO instance = new eDAO();
    
    public static eDAO getInstance() {
        return instance;
    }
    
    private eDAO() {
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

		int num=article.getE_num();
		int ref=article.getE_ref();
		int re_step=article.getE_re_step();
		int re_level=article.getE_re_level();
		int number=0;
        String sql="";

        try {
            conn = getConnection();
            pstmt = conn.prepareStatement("select max(e_num) from event");
			rs = pstmt.executeQuery();
			
			if (rs.next())
		      number=rs.getInt(1)+1;
		    else
		      number=1; 
		   
		    if (num!=0)
		    {  
		      sql="update event set e_re_step=e_re_step+1 where e_ref= ? and e_re_step> ?";
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
            sql = "insert into event(e_num,e_writer,e_subject,e_content,e_password,";
		    sql+="e_ref,e_re_step,e_re_level,e_reg_date) values(event_seq.NEXTVAL,?,?,?,?,?,?,?,sysdate)";

            pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, article.getE_writer());
            pstmt.setString(2, article.getE_subject());
			pstmt.setString(3, article.getE_content());
            pstmt.setString(4, article.getE_password());
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
    
	public int getArticleCount()
    throws Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;

        int x=0;

        try {
            conn = getConnection();
            
            pstmt = conn.prepareStatement("select count(*) from event");
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

	public List getArticles(int start, int end)
    throws Exception {
        Connection conn = null;
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        List articleList=null;
        try {
            conn = getConnection();
            
            pstmt = conn.prepareStatement(
            		"select e_num,e_writer,e_subject,e_content,e_password,e_readcount,e_reg_date,e_ref,e_re_step,e_re_level,r "+
        					"from (select e_num,e_writer,e_subject,e_content,e_password,e_readcount,e_reg_date,e_ref,e_re_step,e_re_level,rownum r " +
        					"from (select e_num,e_writer,e_subject,e_content,e_password,e_readcount,e_reg_date,e_ref,e_re_step,e_re_level " +
        					"from event order by e_ref desc, e_re_step asc) order by e_ref desc, e_re_step asc ) where r >= ? and r <= ? ");
            pstmt.setInt(1, start);
			pstmt.setInt(2, end);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                articleList = new ArrayList(end);
                do{
                  DTO article= new DTO();
				  article.setE_num(rs.getInt("e_num"));
				  article.setE_writer(rs.getString("e_writer"));
                  article.setE_subject(rs.getString("e_subject"));
                  article.setE_content(rs.getString("e_content"));
                  article.setE_password(rs.getString("e_password"));
				  article.setE_readcount(rs.getInt("e_readcount"));
			      article.setE_reg_date(rs.getTimestamp("e_reg_date"));
                  article.setE_ref(rs.getInt("e_ref"));
                  article.setE_re_step(rs.getInt("e_re_step"));
				  article.setE_re_level(rs.getInt("e_re_level"));
				  
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
            	"update event set e_readcount=e_readcount+1 where e_num = ?");
			pstmt.setInt(1, num);
			pstmt.executeUpdate();

            pstmt = conn.prepareStatement(
            	"select * from event where e_num = ?");
            pstmt.setInt(1, num);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                article = new DTO();
                article.setE_num(rs.getInt("e_num"));
				article.setE_writer(rs.getString("e_writer"));
                article.setE_subject(rs.getString("e_subject"));
                article.setE_content(rs.getString("e_content")); 
                article.setE_password(rs.getString("e_password"));
				article.setE_readcount(rs.getInt("e_readcount"));
			    article.setE_reg_date(rs.getTimestamp("e_reg_date"));
                article.setE_ref(rs.getInt("e_ref"));
                article.setE_re_step(rs.getInt("e_re_step"));
				article.setE_re_level(rs.getInt("e_re_level"));   
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
            	"select * from event where e_num = ?");
            pstmt.setInt(1, num);
            rs = pstmt.executeQuery();

            if (rs.next()) {
                article = new DTO();
                article.setE_num(rs.getInt("e_num"));
				article.setE_writer(rs.getString("e_writer"));
                article.setE_subject(rs.getString("e_subject"));
                article.setE_content(rs.getString("e_content"));
                article.setE_password(rs.getString("e_password"));
				article.setE_readcount(rs.getInt("e_readcount"));
			    article.setE_reg_date(rs.getTimestamp("e_reg_date"));
                article.setE_ref(rs.getInt("e_ref"));
                article.setE_re_step(rs.getInt("e_re_step"));
				article.setE_re_level(rs.getInt("e_re_level"));
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
            	"select e_password from event where e_num = ?");
            pstmt.setInt(1, article.getE_num());
            rs = pstmt.executeQuery();
            
			if(rs.next()){
			  dbpasswd= rs.getString("e_password"); 
			  if(dbpasswd.equals(article.getE_password())){
                sql="update event set e_writer=?,e_subject=?,e_password=?";
			    sql+=",e_content=? where e_num=?";
                pstmt = conn.prepareStatement(sql);

                pstmt.setString(1, article.getE_writer());
                pstmt.setString(3, article.getE_subject());
                pstmt.setString(4, article.getE_password());
                pstmt.setString(5, article.getE_content());
			    pstmt.setInt(6, article.getE_num());
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
            	"select e_password from event where e_num = ?");
            pstmt.setInt(1, num);
            rs = pstmt.executeQuery();
            
			if(rs.next()){
				dbpasswd= rs.getString("e_password"); 
				if(dbpasswd.equals(password)){
					pstmt = conn.prepareStatement(
            	      "delete from event where e_num=?");
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
			pstmt = conn.prepareStatement("select * from event where e_writer=? order by e_reg_date");
					
			        pstmt.setString(1, id);

					rs = pstmt.executeQuery();
					if (rs.next()) {
						articleList = new ArrayList(); 
						do{ 
							DTO article= new DTO();
							article.setE_num(rs.getInt("e_num"));
							article.setE_writer(rs.getString("e_writer"));
							article.setE_subject(rs.getString("e_subject"));
							article.setE_content(rs.getString("e_content"));
							article.setE_password(rs.getString("e_password"));
							article.setE_readcount(rs.getInt("e_readcount"));
							article.setE_reg_date(rs.getTimestamp("e_reg_date"));
							article.setE_ref(rs.getInt("e_ref"));
							article.setE_re_step(rs.getInt("e_re_step"));
							article.setE_re_level(rs.getInt("e_re_level"));
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