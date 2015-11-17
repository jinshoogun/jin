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
			pstmt = conn.prepareStatement("insert into Administrator values(?,?,?,?,?,?,?,?)");
			
			pstmt.setString(1, admin.getA_id());
			pstmt.setString(2, admin.getA_password());
			pstmt.setString(3, admin.getA_name());
			pstmt.setString(4, admin.getA_email());
			pstmt.setString(5, admin.getA_birth());
			pstmt.setString(6, admin.getA_phone());
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
	public List getArticles(int start, int end) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List articleList=null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(
					"select q_num, q_writer,q_subject,q_password2,q_reg_date,q_ref,q_re_step, q_re_level, q_content,q_readcount,r "
					+
					"from (select q_num, q_writer,q_subject, q_password2,q_reg_date, q_ref, q_re_step,q_re_level, q_content, q_readcount,rownum r " +
					"from (select q_num,q_writer,q_subject, q_password2, q_reg_date,q_ref, q_re_step, q_re_level, q_content, q_readcount " +
					"from qnA order by q_ref desc, q_re_step asc) order by q_ref desc, q_re_step asc ) where r >= ? and r <= ? ");
					pstmt.setInt(1, start); 
					pstmt.setInt(2, end); 

					rs = pstmt.executeQuery();
					if (rs.next()) {
						articleList = new ArrayList(end); 
						do{ 
							DTO article= new DTO();
							article.setQ_num(rs.getInt("q_num"));
							article.setQ_writer(rs.getString("q_writer"));
							article.setQ_subject(rs.getString("q_subject"));
							article.setQ_password2(rs.getString("q_password2"));
							article.setQ_reg_date(rs.getTimestamp("q_reg_date"));
							article.setQ_readcount(rs.getInt("q_readcount"));
							article.setQ_ref(rs.getInt("q_ref"));
							article.setQ_re_step(rs.getInt("q_re_step"));
							article.setQ_re_level(rs.getInt("q_re_level"));
							article.setQ_content(rs.getString("q_content"));
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
	

	public int ConfirmId(String a_id)  //�ߺ�Ȯ�� �޼ҵ�
	 throws Exception {
		 Connection conn = null;
		 PreparedStatement pstmt= null;
		 ResultSet rs = null;
		 String dbpasswd="";
		 int x=-1;
		 
		 try {
			 conn = getConnection();  //Ŀ�ؼ� ����
			 
			 pstmt = conn.prepareStatement("select a_id from Administrator where a_id =?");
			                               //ID�� �Է��ϰ� �׿��ش��ϴ� ID�� ������.
			 
			 pstmt.setString(1, a_id);
			
			 rs=pstmt.executeQuery();
			 
			 if(rs.next()) //rs�� ����� ����� ������ if������ ������ else�� ����
				 x=1; //�ش���̵� ����
			 else
				 x=-1; //�ش���̵����
			 
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
				conn = getConnection();  //Ŀ�ؼ� ����
	            pstmt = conn.prepareStatement("select a_password from Administrator where a_id = ?");
	            //���� ����, �ش��ϴ� ���̵� �´� pw�� �����´� -> dbpasswd������ �����Ѵ�.
	            pstmt.setString(1, a_id);
	            rs = pstmt.executeQuery();
				if(rs.next()){
					dbpasswd= rs.getString("m_password"); 
					System.out.println(a_password + dbpasswd);
					if(dbpasswd.equals(a_password)){  //equals �Լ��� ����ؼ� �������� ���� ������dbpassword�� pw�� ���Ͽ� �����ϸ� delete�� ����
						pstmt = conn.prepareStatement(
	            	      "delete from Administrator where a_id=?");
	                    pstmt.setString(1, a_id);
	                    pstmt.executeUpdate();
						x= 1; //ȸ��Ż�� ����
					}else
						x= 0; //��й�ȣ Ʋ��
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



	 