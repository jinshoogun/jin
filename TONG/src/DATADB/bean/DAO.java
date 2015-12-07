package DATADB.bean;

import java.sql.*;
import javax.sql.*;
import javax.naming.*;

public class DAO {//������ ������ ���������ϴ� ��ü Ŀ�ؼ� ������ �ϳ����ΰ� ��������ڰ� dao �� �������̽���
	              //����Ͽ� �ʿ��� �ڷῡ �����ϵ��� �ϴ� �� 
	private static DAO instance = new DAO();

	public static DAO getInstance() {
		return instance;
	}

	public DAO() {
	}

	// ���ҽ� ����
	private Connection getConnection() throws Exception {
		//getConnection �޼��� (java.lang.String,java.lang.String)
	    //javax.sql.DataSource �������̽���  getConnection �޼��忡 ���� �����ȴ�.
		//null�� �ƴ� ����� �̸� �Ǵ� ��ȣ�� ����Ͽ� getConnection �޼��带 ȣ���ϸ�
		//SQLServerConnection ��ü�� �ʱ�ȭ �Ҷ� SQLServerDataSource Ŭ������ ������ ����� �̸� �� ��ȣ �Ӽ��� ��ü�ȴ�.
		

		Context initCtx = new InitialContext();//���� ȯ���� naming context ȹ���ϱ�
		Context envCtx = (Context) initCtx.lookup("java:comp/env"); // �ڹٷ� ������ ��
																	// ã�´�.
		DataSource ds = (DataSource) envCtx.lookup("jdbc/orcl"); // �ڹٷε� �κ��߿� DATASOURCEã�� 
																	// jdbc�εȰ�
																	// ã�´�.�������̸��̶�
																	// �ܾ����
		return ds.getConnection(); //���ؼ��� ���´�.
	}

	//-------------------------------�Ϲ�ȸ�� insert �޼ҵ�------------------------------------------------
	public void insertMembership(DTO membership) {
		Connection conn = null;  //Connection�� ������Ÿ������ conn ��ü���������� �����ϰ�  null ���� �����ؼ� �ʱ�ȭ�Ѵ�
		PreparedStatement pstmt = null; //PreparedStatement�� ���� ������ �̸� ������ ���°��� ���Ѵ�.
		                                //PreparedStatement�� ������Ÿ�� pstmt ��ü���������� �����ϰ� null���� �����ؼ� �ʱ�ȭ

		try {
			conn = getConnection();// Ŀ�ؼ� ����
			// ��������!
			pstmt = conn.prepareStatement("insert into MEMBERSHIP values(?,?,?,?,?,?,?,sysdate,MEMBERSHIP_SEQ.NEXTVAL)");
          
			
			
			pstmt.setString(1, membership.getM_id());          //���̵�
			pstmt.setString(2, membership.getM_password());    //��й�ȣ
			pstmt.setString(3, membership.getM_name());        //�̸�
			pstmt.setString(4, membership.getM_email());       //�̸���
			pstmt.setString(5, membership.getM_sex());         //����
			pstmt.setString(6, membership.getM_birth());       //�������
			pstmt.setString(7, membership.getM_phone());       //�ڵ�����ȣ
			// pstmt.setTimestamp(8,membership.getM_reg());

			

			pstmt.executeQuery(); //executeQuery()�޼ҵ�� SELECT�� �����Ҷ� ���̴µ�
			                      //�̶� ��ȯ�ϴ� ResultSet��ü�� SELECT���� �̿��Ͽ� ���̺�κ��� ���� �����͸� ����ִ�.
		} catch (Exception e) { // ����ó��
			e.printStackTrace();

		} finally {

			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException e) {
			}
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
			}
		}

	}

	/*public int userCheck(String m_id, String m_password) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String dbpasswd = "";
		int x = -1;

		try {
			conn = getConnection();

			pstmt = conn.prepareStatement("select m_password from MEMBERSHIP where m_id = ?");
			pstmt.setString(1, m_id);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				dbpasswd = rs.getString("m_password");
				if (dbpasswd.equals(m_password))
					x = 1; // ���� ����
				else
					x = 0; // ��й�ȣ Ʋ��
			} else
				x = -1;// �ش� ���̵� ����

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
	}*/

	public int ConfirmId(String m_id) // �ߺ�Ȯ�� �޼ҵ�
			throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String dbpasswd = "";
		int x = -1;

		try {
			conn = getConnection(); // Ŀ�ؼ� ����

			pstmt = conn.prepareStatement("select m_id from MEMBERSHIP where m_id =?");
			// ID�� �Է��ϰ� �׿��ش��ϴ� ID�� ������.

			pstmt.setString(1, m_id);

			rs = pstmt.executeQuery();

			if (rs.next()) // rs�� ����� ����� ������ if������ ������ else�� ����
				x = 1; // �ش���̵� ����
			else
				x = -1; // �ش���̵����

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

	public int deleteMembership(String m_id, String m_password) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String dbpasswd = "";
		int x = -1;
		try {
			conn = getConnection(); // Ŀ�ؼ� ����
			pstmt = conn.prepareStatement("select m_password from MEMBERSHIP where m_id = ?");
			// ���� ����, �ش��ϴ� ���̵� �´� pw�� �����´� -> dbpasswd������ �����Ѵ�.
			pstmt.setString(1, m_id);
			rs = pstmt.executeQuery();
			System.out.println(m_id);
			if (rs.next()) {
				dbpasswd = rs.getString("m_password");
				System.out.println(m_password + dbpasswd);
				if (dbpasswd.equals(m_password)) { // equals �Լ��� ����ؼ� �������� ����
													// ������dbpassword�� pw�� ���Ͽ�
													// �����ϸ� delete�� ����
					pstmt = conn.prepareStatement("delete from MEMBERSHIP where m_id=?");
					pstmt.setString(1, m_id);
					pstmt.executeUpdate(); //���� ���� ���� ���õ� SQL���� �����Ҷ� ���̰� ������ ���ڵ� ������ ��ȯ�Ѵ� 
					                      
					x = 1; // ȸ��Ż�� ����
				} else
					x = 0; // ��й�ȣ Ʋ��
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

	public DTO getMembership(String m_id) // ȸ������ ������, ������ �������� �޼���
			throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		DTO membership = null;

		try {
			conn = getConnection(); // Ŀ�ؼ� ����

			pstmt = conn.prepareStatement("select *from MEMBERSHIP where m_id =?"); // �ش���̵���
																					// ������
																					// ã��

			pstmt.setString(1, m_id);
			rs = pstmt.executeQuery();

			if (rs.next()) { // getString("id")���� �̸��� DB������ �����ϰ� �ؾ��ϸ� , next() =
								// Ŀ���� �����ɷ� �Ѱ��ִ�
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
		return membership;

	}

	public void updateMembership(DTO membership) // ȸ������ ���� �޼���
			throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = getConnection(); // Ŀ�ؼ� ����

			pstmt = conn.prepareStatement("update MEMBERSHIP set m_password=?,m_email=?" + "where m_id=?");
			// update ���̺�� set�÷���=��, �÷���=��...
			// �����÷��� �����Ϸ��� ��ǥ�� �����Ͽ� set��ġ�� ���ش�
			pstmt.setString(1, membership.getM_password());
			
			pstmt.setString(2, membership.getM_email());
			pstmt.setString(3, membership.getM_id());

			pstmt.executeQuery();

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
	public String SearchId(String m_name, String m_birth) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String id=null;

		try {
			conn = getConnection();

			pstmt = conn.prepareStatement("select m_id from MEMBERSHIP where m_name = ? and m_birth =?");

			pstmt.setString(1, m_name);
			pstmt.setString(2, m_birth);
			rs = pstmt.executeQuery();
			if(rs.next())
			id = rs.getString("m_id");
			
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
		return id;
	}
	
	//��й�ȣã��
	public String SearchPw(String m_id, String m_birth)throws Exception
	{
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	String pw=null;
	
	try {
		conn=getConnection();
		pstmt=conn.prepareStatement("select m_password from MEMBERSHIP where m_id =? and m_birth=? ");
		
		pstmt.setString(1,m_id);
		pstmt.setString(2,m_birth);
		
		rs = pstmt.executeQuery();
		
		if(rs.next())
			pw = rs.getString("m_password");
			
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
		return pw;


} 

	
	// ---------------------------------�����̳� ȸ������-------------------------------------------------------------------
	public void insertDesigner(DTO Designer) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int d_num = Designer.getD_num();
		int number = 0;
		String sql ="";
		
		try {
			conn = getConnection();
			
			sql = "insert into DESIGNER values(DESIGNER_seq.NEXTVAL,?,?,?,?,?,?,?,?,?,SYSDATE)";
			
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setString(1, Designer.getD_id());
			pstmt.setString(2, Designer.getD_password());
			pstmt.setString(3, Designer.getD_name());
			pstmt.setString(4, Designer.getD_nickname());
			pstmt.setString(5, Designer.getD_email());
			pstmt.setString(6, Designer.getD_sex());
			pstmt.setString(7, Designer.getD_birth());
			pstmt.setString(8, Designer.getD_phone());
			pstmt.setString(9, Designer.getD_store());
			pstmt.executeUpdate();
			
			
		
		} catch (Exception e) {e.printStackTrace();} finally {
			if (rs != null)try {rs.close();} catch (SQLException e) {}
			if (pstmt != null)try {pstmt.close();} catch (SQLException e) {}
			if (conn != null)try {conn.close();} catch (SQLException e) {}
		}
	}
	
	public int userCheck(String id, String password) throws Exception {
	      Connection conn = null;
	      PreparedStatement pstmt = null;
	      ResultSet rs = null;
	      String dbpw = "";
	      int x = -1;
	      try {
	         conn = getConnection();
	         pstmt = conn.prepareStatement("select m_password from MEMBERSHIP where m_id = ?");
	         pstmt.setString(1, id);
	         rs = pstmt.executeQuery();
	         if (rs.next()) {
	            dbpw = rs.getString("m_password");
	            if (dbpw.equals(password))
	               x = 1; // ����ȸ�� Ȯ��

	            else
	               x = 0; // ��й�ȣ ����
	         
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
	
	
	public int designerCheck(String id, String password) throws Exception {
	      Connection conn = null;
	      PreparedStatement pstmt = null;
	      ResultSet rs = null;
	      String dbpw = "";
	      int x = -1;
	      try {
	         conn = getConnection();
	         pstmt = conn.prepareStatement("select d_password from DESIGNER where d_id = ?");
	         pstmt.setString(1, id);
	         rs = pstmt.executeQuery();
	         if (rs.next()) {
	            dbpw = rs.getString("d_password");
	            if (dbpw.equals(password))
	               x = 1; // ����ȸ�� Ȯ��

	            else
	               x = 0; // ��й�ȣ ����
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
	
	public int adminCheck(String id, String password) throws Exception {
	      Connection conn = null;
	      PreparedStatement pstmt = null;
	      ResultSet rs = null;
	      String dbpw = "";
	      int x = -1;
	      try {
	         conn = getConnection();
	         pstmt = conn.prepareStatement("select a_password from Administrator where a_id = ?");
	         pstmt.setString(1, id);
	         rs = pstmt.executeQuery();
	         if (rs.next()) {
	            dbpw = rs.getString("a_password");
	            if (dbpw.equals(password))
	               x = 1; // ����ȸ�� Ȯ��

	            else
	               x = 0; // ��й�ȣ ����
	         
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
	
	
//�����̳� ȸ������ �ߺ�Ȯ�� �޼ҵ�
	public int D_confirmId(String d_id) 
			throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String dbpasswd = "";
		int x = -1;

		try {
			conn = getConnection(); // Ŀ�ؼ� ����

			pstmt = conn.prepareStatement("select d_id from DESIGNER where d_id =?");
			// ID�� �Է��ϰ� �׿��ش��ϴ� ID�� ������.

			pstmt.setString(1, d_id);

			rs = pstmt.executeQuery();

			if (rs.next()) // rs�� ����� ����� ������ if������ ������ else�� ����
				x = 1; // �ش���̵� ����
			else
				x = -1; // �ش���̵����

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
	
	//�����̳�ȸ�� Ż�� �޼ҵ�
	public int deleteDesigner(String d_id, String d_password) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String dbpasswd = "";
		int x = -1;
		try {
			conn = getConnection(); // Ŀ�ؼ� ����
			pstmt = conn.prepareStatement("select d_password from DESIGNER where d_id = ?");
			// ���� ����, �ش��ϴ� ���̵� �´� pw�� �����´� -> dbpasswd������ �����Ѵ�.
			pstmt.setString(1, d_id);
			rs = pstmt.executeQuery();
			System.out.println(d_id);
			if (rs.next()) {
				dbpasswd = rs.getString("d_password");
				System.out.println(d_password + dbpasswd);
				if (dbpasswd.equals(d_password)) { // equals �Լ��� ����ؼ� �������� ����
													// ������dbpassword�� pw�� ���Ͽ�
													// �����ϸ� delete�� ����
					pstmt = conn.prepareStatement("delete from DESIGNER where d_id=?");
					pstmt.setString(1, d_id);
					pstmt.executeUpdate();
					x = 1; // ȸ��Ż�� ����
				} else
					x = 0; // ��й�ȣ Ʋ��
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
	
	
	
//�����̳� ȸ������ ������ ������ �������� �޼��� 
	public DTO getDesigner(String d_id) 
			throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		DTO designer = null;

		try {
			conn = getConnection(); // Ŀ�ؼ� ����

			pstmt = conn.prepareStatement("select *from DESIGNER where d_id =?"); // �ش���̵���
																					// ������
																					// ã��

			pstmt.setString(1, d_id);
			rs = pstmt.executeQuery();

			if (rs.next()) { // getString("id")���� �̸��� DB������ �����ϰ� �ؾ��ϸ� , next() =
								// Ŀ���� �����ɷ� �Ѱ��ִ�
				designer = new DTO();

				designer.setD_id(rs.getString("d_id"));
				designer.setD_password(rs.getString("d_password"));
				designer.setD_name(rs.getString("d_name"));
				designer.setD_nickname(rs.getString("d_nickname"));
				designer.setD_email(rs.getString("d_email"));
				designer.setD_sex(rs.getString("d_sex"));
				designer.setD_birth(rs.getString("d_birth"));
				designer.setD_phone(rs.getString("d_phone"));
				
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
		return designer;

	}

	public void updateDesigner(DTO designer) // ȸ������ ���� �޼���
			throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;

		try {
			conn = getConnection(); // Ŀ�ؼ� ����

			pstmt = conn.prepareStatement("update DESIGNER set d_password=?,d_email=?" + "where d_id=?");
			// update ���̺�� set�÷���=��, �÷���=��...
			// �����÷��� �����Ϸ��� ��ǥ�� �����Ͽ� set��ġ�� ���ش�
			pstmt.setString(1, designer.getD_password());
			pstmt.setString(2, designer.getD_email());
			pstmt.setString(3, designer.getD_id());

			pstmt.executeQuery();

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
	
}









