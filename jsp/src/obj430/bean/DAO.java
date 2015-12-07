package obj430.bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

public class DAO {
	// �α������� �Էµ� ������ getInstance���� �ӽ÷� ������ �Ǿ��ٰ� ������ �ڵ����� �����˴ϴ�.
	private static DAO instance = new DAO();
// instance ��ü ����
	public static DAO getInstance() {
		return instance;

	}
	
	private Connection getConnection() throws Exception {

		Context ctx = new InitialContext();// �������� ã�ư��� ����
		Context env = (Context) ctx.lookup("java:comp/env");// �ڹٷ� ���ü����� ã�ư��� ��
															// java:comp/env ������
		DataSource ds = (DataSource) env.lookup("jdbc/orcl");
		return ds.getConnection();
	} // getConnection�� ���� Ŀ�ؼ� Ǯ�� �����մϴ�.

	public ArrayList select() {
		ArrayList list = null;
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			conn = getConnection();
			String sql = "select * from q1";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			if (rs != null) {
				list = new ArrayList();
				while (rs.next()) {
					DTO dto = new DTO();
					dto.setId(rs.getString("id"));
					dto.setNa(rs.getString("na"));
					dto.setPw(rs.getString("pw"));
					dto.setAdd(rs.getString("address"));
					dto.setA(rs.getString("sex"));
					dto.setPhone(rs.getString("phone"));
					dto.setEmail(rs.getString("mail"));
					dto.setB(rs.getString("mailagree"));
					dto.setNick(rs.getString("nick"));
					dto.setIntru(rs.getString("intru"));
					dto.setReg(rs.getTimestamp("reg"));
					list.add(dto);

				}
			}

		} catch (Exception e) {
			e.printStackTrace();

		} finally {// ���ῡ�� ���ܰ� ���� �� ������ ó���ؾߵ˴ϴ�.
			try {
				if (rs != null) {
					rs.close();
				}
			} catch (SQLException s) {
			}
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException s) {
			}
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException s) {
			}
			// Ŭ����� ���ε��� ����ó���� �� �� �ֵ��� �ؾ��Ѵ�. (���� �߻��� �ٸ� ���� ������� �ʱ� �����̴�)
		}
		return list;
	}

	public void insert(DTO dto) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("insert into q1 values(?,?,?,?,?,?,?,?,?,?,sysdate)");
			// �� ������ q1�� ���Ե� ������ �ִ� ���Դϴ�.
			pstmt.setString(1, dto.getId());
			pstmt.setString(2, dto.getPw());
			pstmt.setString(3, dto.getNa());
			pstmt.setString(4, dto.getAdd());
			pstmt.setString(5, dto.getA());
			pstmt.setString(6, dto.getPhfirst() + "-" + dto.getPhsec() + "-" + dto.getPhthr());
			pstmt.setString(7, dto.getMailId() + "@" + dto.getDomain());
			// ��ȭ��ȣ�� �̸��� �ּ� ���� ��� �ϳ��� ������ ���ؼ� �� �������� ������
			// ������ ���� �ְ� ������ �����Ǳ� ���� null�� ������ �������� ���� �������� ������ null�� ������ ����
			// �����ϱ� ���ؼ� ���ε��� �ؼ� �����Ѵ�.
			pstmt.setString(8, dto.getB());
			pstmt.setString(9, dto.getNick());
			pstmt.setString(10, dto.getIntru());
			pstmt.executeUpdate();
// ���� �÷��� �°� ���ڵ忡 ������ �Ǿ����� ��ġ�� ������ �ʴ´�.
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			try {
				if (pstmt != null) {
					pstmt.close();
				}
			} catch (SQLException s) {
			}
			try {
				if (conn != null) {
					conn.close();
				}
			} catch (SQLException s) {
			}
		}
	}         // ����ó���� �ǽ��Ѵ�. ����ÿ��� ���� ����ó�� �ǽ�

	public int userCheck(String id, String pw) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String dbpw = "";
		int x = -1;
		// LoginPro.jsp���Ͽ��� ������ ���̵�� ��й�ȣ�� ������ �ɴϴ�. x�� �⺻���� -1�� �����Ǿ��ֽ��ϴ�.
		try {
			conn = getConnection();

			pstmt = conn.prepareStatement("select pw from q1 where id = ?");
			// ���̵�� DB���� �ִ��� �˻��� �ϸ� �˻������ ��й�ȣ�� ���ɴϴ�
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			// �װ������ rs��� ���� ������ �Ǿ����� ���� ���� ���� �ִ�

			if (rs.next()) {// rs���� ���� ��й�ȣ�� �ִ� Ȯ���� �մϴ�.
				// next �޼ҵ带 ���� Ŀ���� �ִ� ���� �ִ��� Ȯ���մϴ�.
				dbpw = rs.getString("pw");
				if (dbpw.equals(pw))
					x = 1; // ��й�ȣ ���� �����ϸ� x=1�� ���� �ְ� �ݴϴ�.
				else
					x = 0; // ��й�ȣ ���� �ٸ��� x=0�� ���� �ݴϴ�.
			} else
				x = -1;// next�޼ҵ�� �������� ������� ���ٸ�(���̵� ���� ���) x=-1�� �ݴϴ�

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
		return x; // ������� loginPro���� �����ݴϴ�
	}

	public DTO getMember(String id) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		DTO member = null;
		// id���� primary key�� ��ұ� ������ id�� ���������� ���ȴ�. �׷��� ������ id ������ member ��ü���� �ҷ����� �� �ִ�. ���� DTO���� member ������ �����Ѵ�.
		try {
			conn = getConnection();

			pstmt = conn.prepareStatement("select * from q1 where id = ?");
			// id�� ���� ��� �������� ����Ǿ ����.
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();

			if (rs.next()) { 	// ��� ���ư��� rs���� �־�����.
				member = new DTO();
				member.setId(rs.getString("id"));
				member.setPw(rs.getString("pw"));
				member.setNa(rs.getString("na"));
				member.setAdd(rs.getString("address"));
				member.setA(rs.getString("sex"));
				member.setPhone(rs.getString("phone"));
				member.setEmail(rs.getString("mail"));
				member.setB(rs.getString("mailagree"));
				member.setNick(rs.getString("nick"));
				member.setIntru(rs.getString("intru"));
			 // member�� ���� ������ �÷������ٰ� html���� �Էµ� ������ name�� �°� ���� �÷��� ���ڵ� ������ �ҷ��� ����Ǿ�����. 
			 // �̶� getString()�� html�� name�� �ƴ� �÷��� �°� ������ �Ѵ�.  
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
		} // ������ ������ ����ó�����Ѵ�.
		return member;
	}// �׸��� ������� member��� ������ ���� �������� �ȴ�.

	public void updateMember(DTO member) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
// ���ۿ� �ʿ��� ���� �� �⺻�� ������ �Ѵ�.
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement(
			"update q1 set pw=?, address=?, phone=?, mail=?, mailagree=?, nick=?, intru=? " + "where id = ?");
			// update ���̺�� �� �׸� ���� ���� �ҷ��´�. �̶� ?�� setString ������ ���߾�� �ϰ� ������ ����� �ùٸ��� �÷��� �°� ���ڵ� ���� �ҷ����� �� �ִ�.
			pstmt.setString(1, member.getPw());
			pstmt.setString(2, member.getAdd());
			pstmt.setString(3, member.getPhone());
			pstmt.setString(4, member.getEmail());
			pstmt.setString(5, member.getB());
			pstmt.setString(6, member.getNick());
			pstmt.setString(7, member.getIntru());
			pstmt.setString(8, member.getId());
			// setString�� ���� ������ ���� ����� ���� ������ ������ ��������.
			pstmt.executeUpdate();
			// �� �������� ������ ���� ������ �Ϸ� �Ǿ�����.

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
        // ����ó���� �ǽ��Ѵ�. ����ÿ��� ���� ����ó�� �ǽ�
	}

	public int confirmId(String id) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		int x = -1;
		// confirmId.jsp���Ͽ��� ������ ���̵� ������ �ɴϴ�. x�� �⺻���� -1�� �����Ǿ��ֽ��ϴ�.
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("select id from q1 where id= ?");
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
//sql���� ���̺��� id���� �˻��� �ϰ� �ȴ�. �׸��� ?�� ������ id�� �Ķ���� ���� ���´�.
			if (rs.next())
				x = 1;
			//���� ���������� ��� ������. ���� ��� x=-1�� �ִ´�.
			else
				x = -1; // �׿ܿ��� x=-1�� �־��ش�.
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
		return x; // ������� confirmId.jsp���� �����ݴϴ�
	}

	public int deleteMember(String id, String pw) 
	throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String dbpw ="";
		int x=-1;
		// ���� ������ �ϱ� ���� ID�� ���� memId������ �ҷ����δ�. ����, pw�� ������ �����ϱ� ���� ����������� pw�� ���� ���� �θ���.
		// x�� �⺻���� -1�̴�
		try {
			conn = getConnection();
			
			pstmt = conn.prepareStatement(
					"select pw from q1 where id = ?");
			// �� ������ id�� ���ؼ� ��й�ȣ�� �ҷ����δ�. �׷��� ������ ?�� id������ pw�� �ҷ����δ�. �׸��� �׸��� rs���ٰ� ������ �Ѵ�.
			pstmt.setString(1, id);
			rs = pstmt.executeQuery();
			if (rs.next()){// ������� ���������� �ҷ����δ�.
				dbpw= rs.getString("pw");
				//dbpw�� ����ڰ� �ۼ��� �ν���Ʈ�� ���� �ۼ��� ���̴�.
				if(dbpw.equals(pw)){ // ����ڰ� �ۼ��� ���� ���� ��й�ȣ�� ������ ����� if���� �ۼ��ϰ� �ִ�.
					pstmt = conn.prepareStatement( //���ǿ� �´´ٸ� id���� ���� ���̺��� �ִ� id�� �´� ���ڵ���� ������ �ȴ�.
					"delete from q1 where id=?");
					pstmt.setString(1, id);
					pstmt.executeUpdate(); //�׸��� ������� ���� �Ϸἱ���Ѵ�.
					x= 1; //�׸��� x=1�̶�� ������ �����Ѵ�.
				} else 
					x= 0; // �� ���� ��й�ȣ�� �ٸ� ����̹Ƿ�, x=0���� �����Ѵ�.
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
			return x; // X ������� deletePro���� �����ݴϴ�
		}
	public int confirmNick(String nick) 
	throws Exception {
		Connection conn = null;
     PreparedStatement pstmt = null;
		ResultSet rs= null;
		int x=-1;
		// confirmNick.jsp���Ͽ��� ������ �г����� ������ �ɴϴ�. x�� �⺻���� -1�� �����Ǿ��ֽ��ϴ�.
		try {
         conn = getConnection();
         
         pstmt = conn.prepareStatement(
         	"select nick from q1 where nick = ?");
         pstmt.setString(1, nick);
         rs= pstmt.executeQuery();
       //sql���� ���̺��� id���� �˻��� �ϰ� �ȴ�. �׸��� ?�� ������ id�� �Ķ���� ���� ���´�.
			if(rs.next())
				//���� ���������� ��� ������. ���� ��� x=-1�� �ִ´�.
				x= 1; //x =1�� �˻��� �Ǿ����� �����̴�.
			else
				x= -1;//x =1�� �˻��� �Ǿ����� �ʴ� ����(���� ����)�̴�.
     } catch(Exception ex) {
         ex.printStackTrace();
     } finally {
			if (rs != null) try { rs.close(); } catch(SQLException ex) {}
         if (pstmt != null) try { pstmt.close(); } catch(SQLException ex) {}
         if (conn != null) try { conn.close(); } catch(SQLException ex) {}
     }
		return x;
	}// ������� confirmNick.jsp���� �����ݴϴ�
	
}