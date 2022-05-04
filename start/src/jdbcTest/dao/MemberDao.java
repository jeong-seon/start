package jdbcTest.dao;

import java.sql.*;
import java.util.*;

import jdbcTest.db.*;
import jdbcTest.sql.*;
import jdbcTest.vo.*;

public class MemberDao {
	private GitJDBC db;
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private MemberSQL mSQL;
	
	public MemberDao() {
		db = new GitJDBC();
		
		mSQL = new MemberSQL();
	}
	
	public ArrayList<MemberVO> getMnoInfo(int mno) {
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		
		con = db.getCon();
		
		String sql = mSQL.getSQL(mSQL.SEL_MEMBER_INFO);
		
		pstmt = db.getPstmt(con, sql);
		
		try {
			pstmt.setInt(1, mno);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				MemberVO mvo = new MemberVO();
				
				mvo.setId(rs.getString("id"));
				mvo.setName(rs.getString("name"));
				mvo.setMail(rs.getString("mail"));
				
				list.add(mvo);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(pstmt);
			db.close(con);
		}
		return list;
	}
	
	public ArrayList<Integer> getMnoList() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		con = db.getCon();
		
		String sql = mSQL.getSQL(mSQL.SEL_MNO);
		
		stmt = db.getStmt(con);
		
		try {
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				list.add(rs.getInt("mno"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		return list;
	}

}
