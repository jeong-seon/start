package githrd.dao;

import java.sql.*;
import java.util.*;

import empProj.vo.EmpVO;
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

	// 사원리스트 조회 전담 처리함수
	public ArrayList<MemberVO> getMnoList(){
		// 반환값 변수
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		// 커넥션
		con = db.getCon();
		// 질의명령
		String sql = mSQL.getSQL(mSQL.SEL_ALLMNO);
		// 명령전달도구
		stmt = db.getStmt(con);
		// 질의명령 보내고 결과 받고
		try {
			rs = stmt.executeQuery(sql);
			
			// 꺼내서 리스트에 담고
			while(rs.next()) {
				MemberVO mvo = new MemberVO();
				mvo.setMno(rs.getInt("mno"));
				
				list.add(mvo);
			}
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			db.close(rs);
			db.close(stmt);
			db.close(con);
		}
		
		// 리스트 반환하고
		return list;
		
	}
	
	// 회원번호 조회 전담 처리 함수
	public ArrayList<Integer> getNoList() {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		con = db.getCon();
		
		String sql = mSQL.getSQL(mSQL.SEL_ALLMNO);
		
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
	
	// 회원번호를 입력받아서 회원들의 정보를 반환해주는 함수
	public ArrayList<MemberVO> getMnoInfo(int mno) {
		// 반환값 변수
		ArrayList<MemberVO> list = new ArrayList<MemberVO>();
		
		// 커넥션 가져오고
		con = db.getCon();
		// 질의명령 가져오고
		String sql = mSQL.getSQL(mSQL.SEL_MNO);
		
		// 명령전달도구 준비하고
		pstmt = db.getPstmt(con, sql);
		
		try {
			// 질의명령 완성하고
			pstmt.setInt(1, mno);
			// 질의명령 보내고 결과 받고
			rs = pstmt.executeQuery();
			// 데이터 꺼내고
			while(rs.next()) {
				// 한명분 데이터 저장할 VO 만들고
				MemberVO mvo = new MemberVO();
				// 데이터 꺼내서 채우고
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
				
				// 리스트에 VO 담고
				list.add(mvo);
			}
		} catch(Exception e) {
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
		
		con = db.getCon();
		
		String sql = mSQL.getSQL(mSQL.UP_IDTEL);
		
		pstmt = db.getPstmt(con, sql);
		
		try {
//			String tel = mvo.getTel();
//			String id = mvo.getId();
			
			pstmt.setString(1, mvo.getTel());
			pstmt.setString(2, mvo.getId());
			
			cnt = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			db.close(pstmt);
			db.close(con);
		}
		
		return cnt;
	}
	
	// [bonus]
	// Scanner 로 회원정보를 입력받아서 회원가입을 처리해주는 함수
	public int insertJoin(MemberVO mvo) {
		int cnt = 0;
		
		con = db.getCon();
		
		String sql = mSQL.getSQL(mSQL.INSERT_JOIN);
		
		pstmt = db.getPstmt(con, sql);
		
		try {
//			String name = mvo.getName();
//			String id = mvo.getId();
//			String pw = mvo.getPw();
//			String mail = mvo.getMail();
//			String tel = mvo.getTel();
//			String gen = mvo.getGen();
//			int avt = mvo.getAvt();
			
			pstmt.setString(1, mvo.getName());
			pstmt.setString(2, mvo.getId());
			pstmt.setString(3, mvo.getPw());
			pstmt.setString(4, mvo.getMail());
			pstmt.setString(5, mvo.getTel());
			pstmt.setString(6, mvo.getGen());
			pstmt.setInt(7, mvo.getAvt());
			
			
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
