package Style;

import java.sql.*;
import javax.sql.*;
import javax.naming.*;
import java.util.*;
import java.util.Date;

public class rDAO {

	private static rDAO instance = new rDAO();

	public static rDAO getInstance() {
		return instance;
	}

	private rDAO() {
	}

	private Connection getConnection() throws Exception {
		Context initCtx = new InitialContext();
		Context envCtx = (Context) initCtx.lookup("java:comp/env");
		DataSource ds = (DataSource) envCtx.lookup("jdbc/orcl");
		return ds.getConnection();
	}

	public void insertReservation(DTO reservation) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		int num = reservation.getR_num();
		int number = 0;
		String sql = "";

		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("select max(r_num) from reservation");
			rs = pstmt.executeQuery();

			if (rs.next())
				number = rs.getInt(1) + 1;
			else
				number = 1;

			sql = "insert into reservation(r_num,r_name,r_id,r_password,r_phone,r_style,r_date,r_start,r_end,";
			sql += "r_subject,r_designer,r_store,r_cost,r_reg_date) values(reservation_seq.NEXTVAL,?,?,?,?,?,?,?,?,?,?,?,?,sysdate)";

			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, reservation.getR_name());
			pstmt.setString(2, reservation.getR_id());
			pstmt.setString(3, reservation.getR_password());
			pstmt.setString(4, reservation.getR_phone());
			pstmt.setString(5, reservation.getR_style());
			pstmt.setString(6, reservation.getR_date());
			pstmt.setString(7, reservation.getR_start());
			pstmt.setString(8, reservation.getR_end());
			pstmt.setString(9, reservation.getR_subject());
			pstmt.setString(10, reservation.getR_designer());
			pstmt.setString(11, reservation.getR_store());
			pstmt.setString(12, reservation.getR_cost());

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

	public int getReservationCount() throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		int x = 0;

		try {
			conn = getConnection();

			pstmt = conn.prepareStatement("select count(*) from reservation");
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

	public List getReservations(int start, int end) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List reservationList = null;
		try {
			conn = getConnection();

			pstmt = conn.prepareStatement(
					"select r_num,r_name,r_id,r_password,r_phone,r_style,r_date,r_start,r_end,r_subject,r_designer,r_store,r_cost,r_reg_date,r "
							+ "from (select r_num,r_id,r_name,r_password,r_phone,r_style,r_date,r_start,r_end,r_subject,r_designer,r_store,r_cost,r_reg_date,rownum r "
							+ "from (select r_num,r_id,r_name,r_password,r_phone,r_style,r_date,r_start,r_end,r_subject,r_designer,r_store,r_cost,r_reg_date "
							+ "from reservation order by r_num desc, r_reg_date asc) order by r_num desc, r_reg_date asc ) where r >= ? and r <= ? ");
			pstmt.setInt(1, start);
			pstmt.setInt(2, end);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				reservationList = new ArrayList(end);
				do {
					DTO reservation = new DTO();
					reservation.setR_num(rs.getInt("r_num"));
					reservation.setR_name(rs.getString("r_name"));
					reservation.setR_id(rs.getString("r_id"));
					reservation.setR_password(rs.getString("r_password"));
					reservation.setR_phone(rs.getString("r_phone"));
					reservation.setR_style(rs.getString("r_style"));
					reservation.setR_date(rs.getString("r_date"));
					reservation.setR_start(rs.getString("r_start"));
					reservation.setR_end(rs.getString("r_end"));
					reservation.setR_subject(rs.getString("r_subject"));
					reservation.setR_designer(rs.getString("r_designer"));
					reservation.setR_store(rs.getString("r_store"));
					reservation.setR_cost(rs.getString("r_cost"));
					reservation.setR_reg_date(rs.getTimestamp("r_reg_date"));

					reservationList.add(reservation);
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
		return reservationList;
	}

	public DTO getReservation(int num) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		DTO reservation = null;
		try {
			conn = getConnection();

			pstmt = conn.prepareStatement("select * from reservation where r_num = ?");
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				reservation = new DTO();
				reservation.setR_name(rs.getString("r_name"));
				reservation.setR_id(rs.getString("r_id"));
				reservation.setR_password(rs.getString("r_password"));
				reservation.setR_phone(rs.getString("r_phone"));
				reservation.setR_style(rs.getString("r_style"));
				reservation.setR_date(rs.getString("r_date"));
				reservation.setR_start(rs.getString("r_start"));
				reservation.setR_end(rs.getString("r_end"));
				reservation.setR_subject(rs.getString("r_subject"));
				reservation.setR_designer(rs.getString("r_designer"));
				reservation.setR_store(rs.getString("r_store"));
				reservation.setR_cost(rs.getString("r_cost"));
				reservation.setR_reg_date(rs.getTimestamp("r_reg_date"));
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
		return reservation;
	}

	public DTO updateGetReservation(int num) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		DTO reservation = null;
		try {
			conn = getConnection();

			pstmt = conn.prepareStatement("select * from reservation where r_num = ?");
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				reservation = new DTO();
				reservation.setR_num(rs.getInt("r_num"));
				reservation.setR_name(rs.getString("r_name"));
				reservation.setR_id(rs.getString("r_id"));
				reservation.setR_password(rs.getString("r_password"));
				reservation.setR_phone(rs.getString("r_phone"));
				reservation.setR_style(rs.getString("r_style"));
				reservation.setR_date(rs.getString("r_date"));
				reservation.setR_start(rs.getString("r_start"));
				reservation.setR_end(rs.getString("r_end"));
				reservation.setR_subject(rs.getString("r_subject"));
				reservation.setR_designer(rs.getString("r_designer"));
				reservation.setR_store(rs.getString("r_store"));
				reservation.setR_store(rs.getString("r_cost"));
				reservation.setR_reg_date(rs.getTimestamp("r_reg_date"));
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
		return reservation;
	}

	public int updateReservation(DTO reservation) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		String dbpasswd = "";
		String sql = "";
		int x = -1;
		try {
			conn = getConnection();

			pstmt = conn.prepareStatement("select r_password from reservation where r_num = ?");
			pstmt.setInt(1, reservation.getR_num());
			rs = pstmt.executeQuery();

			if (rs.next()) {
				dbpasswd = rs.getString("r_password");
				if (dbpasswd.equals(reservation.getR_password())) {
					sql = "update reservation set r_style=?,r_date=?,r_start=?,r_end=?,";
					sql += "r_subject=?,r_designer=?,r_store=? where r_num=?";
					pstmt = conn.prepareStatement(sql);

					pstmt.setString(1, reservation.getR_style());
					pstmt.setString(2, reservation.getR_date());
					pstmt.setString(3, reservation.getR_start());
					pstmt.setString(4, reservation.getR_end());
					pstmt.setString(5, reservation.getR_subject());
					pstmt.setString(6, reservation.getR_designer());
					pstmt.setString(7, reservation.getR_store());
					pstmt.setInt(8, reservation.getR_num());
					pstmt.executeUpdate();
					x = 1;
				} else {
					x = 0;
				}
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

	public int cancelReservation(int num, String password) throws Exception {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String dbpasswd = "";
		int x = -1;
		try {
			conn = getConnection();

			pstmt = conn.prepareStatement("select r_password from reservation where r_num = ?");
			pstmt.setInt(1, num);
			rs = pstmt.executeQuery();

			if (rs.next()) {
				dbpasswd = rs.getString("r_password");
				if (dbpasswd.equals(password)) {
					pstmt = conn.prepareStatement("delete from reservation where r_num=?");
					pstmt.setInt(1, num);
					pstmt.executeUpdate();
					x = 1;
				} else
					x = 0;
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

	public List getMyList(String name) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List reservationList = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("select * from reservation where r_name=? order by r_reg_date");

			pstmt.setString(1, name);

			rs = pstmt.executeQuery();
			if (rs.next()) {
				reservationList = new ArrayList();
				do {
					DTO reservation = new DTO();
					reservation.setR_num(rs.getInt("r_num"));
					reservation.setR_name(rs.getString("r_name"));
					reservation.setR_id(rs.getString("r_id"));
					reservation.setR_password(rs.getString("r_password"));
					reservation.setR_phone(rs.getString("r_phone"));
					reservation.setR_style(rs.getString("r_style"));
					reservation.setR_date(rs.getString("r_date"));
					reservation.setR_start(rs.getString("r_start"));
					reservation.setR_end(rs.getString("r_end"));
					reservation.setR_subject(rs.getString("r_subject"));
					reservation.setR_designer(rs.getString("r_designer"));
					reservation.setR_store(rs.getString("r_store"));
					reservation.setR_cost(rs.getString("r_cost"));
					reservation.setR_reg_date(rs.getTimestamp("r_reg_date"));
					reservationList.add(reservation);
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

		return reservationList;
	}
	
	
	public List getDesignerList(String designer) {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List reservationList = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("select * from reservation where r_id=? order by r_reg_date");

			pstmt.setString(1, designer);

			rs = pstmt.executeQuery();
			if (rs.next()) {
				reservationList = new ArrayList();
				do {
					DTO reservation = new DTO();
					reservation.setR_num(rs.getInt("r_num"));
					reservation.setR_name(rs.getString("r_name"));
					reservation.setR_id(rs.getString("r_id"));
					reservation.setR_password(rs.getString("r_password"));
					reservation.setR_phone(rs.getString("r_phone"));
					reservation.setR_style(rs.getString("r_style"));
					reservation.setR_date(rs.getString("r_date"));
					reservation.setR_start(rs.getString("r_start"));
					reservation.setR_end(rs.getString("r_end"));
					reservation.setR_subject(rs.getString("r_subject"));
					reservation.setR_designer(rs.getString("r_designer"));
					reservation.setR_store(rs.getString("r_store"));
					reservation.setR_cost(rs.getString("r_cost"));
					reservation.setR_reg_date(rs.getTimestamp("r_reg_date"));
					reservationList.add(reservation);
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

		return reservationList;
	}
	
	
	public List getAdminList() {
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		List reservationList = null;
		try {
			conn = getConnection();
			pstmt = conn.prepareStatement("select * from reservation order by r_reg_date");

			rs = pstmt.executeQuery();
			if (rs.next()) {
				reservationList = new ArrayList();
				do {
					DTO reservation = new DTO();
					reservation.setR_num(rs.getInt("r_num"));
					reservation.setR_name(rs.getString("r_name"));
					reservation.setR_id(rs.getString("r_id"));
					reservation.setR_password(rs.getString("r_password"));
					reservation.setR_phone(rs.getString("r_phone"));
					reservation.setR_style(rs.getString("r_style"));
					reservation.setR_date(rs.getString("r_date"));
					reservation.setR_start(rs.getString("r_start"));
					reservation.setR_end(rs.getString("r_end"));
					reservation.setR_subject(rs.getString("r_subject"));
					reservation.setR_designer(rs.getString("r_designer"));
					reservation.setR_store(rs.getString("r_store"));
					reservation.setR_cost(rs.getString("r_cost"));
					reservation.setR_reg_date(rs.getTimestamp("r_reg_date"));
					reservationList.add(reservation);
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

		return reservationList;
	}
}
