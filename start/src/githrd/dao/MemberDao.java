package githrd.dao;

import java.sql.*;
import java.util.*;

import githrd.db.*;
import githrd.sql.*;
import githrd.vo.*;

public class MemberDao {
	private JenyJDBC db;
	private Connection con;
	private Statement stmt;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private MemberSQL mSQL;
	
	public MemberDao() {
		db = new JenyJDBC();
		
		mSQL = new MemberSQL();
	}
	
	// 회원번호와 아이디를 조회해서 출력해주는 함수
	public ArrayList<MemberVO> getMnoId() {
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		
		con = db.getCon();
		
		String sql = mSQL.getSQL(mSQL.SEL_MNOID);
		
		stmt = db.getStmt(con);
		
		try {
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				MemberVO mvo = new MemberVO();
				
				int mno = rs.getInt("mno");
				String id = rs.getString("id");
				
				mvo.setMno(mno);
				mvo.setId(id);
				
				list.add(mvo);
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
	
	// 회원 번호(1001)를 입력하면 해당 회원의 정보를 출력해주는 함수
	public ArrayList<MemberVO> getNo1001(int mno) {
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		
		con = db.getCon();
		
		String sql = mSQL.getSQL(mSQL.SEL_NO1001);
		
		pstmt = db.getPstmt(con, sql);
		
		try {
			pstmt.setInt(1, mno);
			
			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				MemberVO mvo = new MemberVO();
				
				mvo.setMno(rs.getInt("mno"));
				mvo.setName(rs.getString("name"));
				mvo.setId(rs.getString("id"));
				mvo.setPw(rs.getString("pw"));
				mvo.setMail(rs.getString("mail"));
				mvo.setTel(rs.getString("tel"));
				mvo.setAvt(rs.getInt("avt"));
				mvo.setGen(rs.getString("gen"));
				mvo.setJdate(rs.getDate("joindate"));
				mvo.setJtime(rs.getTime("joindate"));
				mvo.setSdate();
				
//				if(mvo.getGen() == "F") {
//					mvo.getGen() = "여";
//				}
				
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

	// 아이디 조회 전담 처리 함수
	public ArrayList<MemberVO> getIdList() {
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		
		con = db.getCon();
		
		String sql = mSQL.getSQL(mSQL.SEL_ALLID);
		
		stmt = db.getStmt(con);
		
		try {
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				MemberVO mvo = new MemberVO();
				
				mvo.setId(rs.getString("id"));
				
				list.add(mvo);
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
	// 아이디를 입력해서 해당 회원의 전화번호를 수정(010-1212-1212) 해주는 함수
	public int updateTel(MemberVO mvo) {
		int cnt = 0;
//		MemberVO mvo = new MemberVO();
		con = db.getCon();
		
		String sql = mSQL.getSQL(mSQL.UP_IDTEL);
		
		pstmt = db.getPstmt(con, sql);
		
		try {
			String id = mvo.getId();
			
			pstmt.setString(1, id);
			
			cnt = pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			db.close(pstmt);
			db.close(con);
		}
		
		return cnt;
	}
}
