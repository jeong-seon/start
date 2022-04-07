package jdbc;

import java.sql.*;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.Date;

import jdbc.sql.EmpSQL;

/*
	emp 테이블의 데이터를 조회하는데
	
	dno 라는 문자열을 입력받으면
		부서번호를 입력받아서 해당 부서의 부서원들의
			사원번호, 사원이름, 직급, 입사일, 급여, 부서번호, 부서이름, 부서위치
	를 출력해주고
	
	job 이라는 문자열을 입력받으면
		해당 직급을 가진 사원들의
			사원번호, 사원이름, 직급, 입사일, 급여, 급여등급, 커미션
	을 조회하도록 하고,
	
	all 을 입력받으면 모든 사원들의
		사원번호, 사원이름, 직급, 입사일
		을 조회하는 프로그램을 작성하세요.
		
	단, exit 라는 단어가 입력되면 프로그램이 즉시 종료되게 하세요.
 */

/*
	이 클래스는 사용자가 어떤것을 입력하던지
	결국 오라클을 사용할 준비가 되어있어야 한다.
	따라서 이 클래스가 new 되는 순간
	드라이버 로딩이 완료되면 편할것 같다.
 */
public class JdbcTest01 {
	public final int SEL_ALL = 0;
	public final int SEL_DNOINFO = 1;
	public final int SEL_JOBINFO = 2;
	
	// 작업에 필요한 변수 선언
	Connection con;
	Statement stmt;
	PreparedStatement pstmt;
	ResultSet rs;
	
	EmpSQL eSQL;
//	EmpSQL eSQL = new EmpSQL();
	public JdbcTest01() {
		// 드라이버 로딩
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			eSQL = new EmpSQL();
			
			getInput();
		} catch (Exception e) {
			System.out.println("### 서버 로딩 실패 ###");
		}
		
		
//		System.out.println(getSQL(this.SEL_ALL));
//		System.out.println(getSQL(this.SEL_DNOINFO));
//		System.out.println(getSQL(this.SEL_JOBINFO));
	}

	// 코드(정수)를 입력받으면 그 코드에 해당하는 질의명령을 반환해주는 함수
//	public String getSQL(int code) {
//		StringBuffer buff = new StringBuffer();
//		
//		switch(code) {
//		case SEL_ALL:
//			buff.append("SELECT ");
//			buff.append("	empno, ename, job, hiredate ");
//			buff.append("FROM ");
//			buff.append("	emp ");
//			break;
//		case SEL_DNOINFO:
//			buff.append("SELECT ");
//			buff.append("	empno, ename, job, hiredate, sal, e.deptno, dname, loc ");
//			buff.append("FROM ");
//			buff.append("	emp e, dept d ");
//			buff.append("WHERE ");
//			buff.append("	e.deptno = d.deptno ");
//			buff.append("	AND e.deptno = ? ");
//			break;
//		case SEL_JOBINFO:
//			buff.append("SELECT ");
//			buff.append("	empno, ename, job, hiredate, sal, grade, NVL(TO_CHAR(comm), '커미션없음') comm ");
//			buff.append("FROM ");
//			buff.append("	emp, salgrade ");
//			buff.append("WHERE ");
//			buff.append("	sal BETWEEN losal AND hisal ");
//			buff.append("	AND job = ? ");
//			break;
//		}
//		// buff 에 담긴 내용을 문자열로 변환해서 반환해준다.
//		return buff.toString();
//	}
	
	// 문자열 입력받는 함수
	public void getInput() {
		// Scanner 를 이용해서 문자열을 입력받고
		// 각 문자열 마다 입력받을 내용도 받아서 실행시켜주는 함수
		
		// 작업순서
		// 입력도구 준비
		Scanner sc = new Scanner(System.in);
		while(true) {
			// 메세지 출력
			System.out.print("부서번호로 조회 : dno\n직급으로 조회 : job\n모든사원 조회 : all\n프로그램 종료 : exit\n명령 입력 : ");
			String str = sc.nextLine();
			System.out.println("==========================================================================");
			switch(str) {
			case "dno":
				getDnoInfo(sc);
				break;
			case "job":
				getJobInfo(sc);
				break;
			case "all":
				getAll();
				break;
			case "exit":
				System.out.println("*** 프로그램을 종료합니다 ***");
				return;
			}
			System.out.println("==========================================================================");
		}
		
	}
	// job 직급 조회 함수
	public void getJobAll() {
		try {
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String pw = "tiger";
			
			con = DriverManager.getConnection(url, user, pw);

			String sql = eSQL.getSQL(eSQL.SEL_ALLJOB);
			
			stmt = con.createStatement();
			
			rs = stmt.executeQuery(sql);
			
			while(rs.next()) {
				String alljob = rs.getString("job");
				
				System.out.print(" | " + alljob);
			}
			System.out.println();
			System.out.println("==========================================================================");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				rs.close();
				stmt.close();
				con.close();
			} catch (Exception e) {}
		}
		
	}
	
	// 직급을 입력받아서 해당 직급의 사원들의 정보를 조회해주는 함수
	public void getJobInfo(Scanner sc) {
		while(true) {
			// 할 일
			// 메세지 출력
			getJobAll();
			System.out.println();
			System.out.print("조회할 직급을 입력하세요!\n이전단계는 quit 을 입력하세요 !\n직급이름 입력 : ");
			// 직급 입력받고
			String job = sc.nextLine();
			System.out.println("==========================================================================");
			
			if(job.equals("quit")) {
				return;
			}
			// 데이터베이스 작업
			try {
				// 커넥션 꺼내오고
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String user = "scott";
				String pw = "tiger";
				
				con = DriverManager.getConnection(url, user, pw);
				// 질의명령 가져오고
				String sql = eSQL.getSQL(eSQL.SEL_JOBINFO);
				
				// 명령전달도구 준비
				pstmt = con.prepareStatement(sql);
				
				// 질의명령 완성
				pstmt.setString(1, job);
				
				// 질의명령 보내고 결과받고
				rs = pstmt.executeQuery();
				
				// 결과에서 데이터 꺼내서 출력
				while(rs.next()) {
					// 필드의 데이터를 꺼낸다.
					int eno = rs.getInt("empno");
					String name = rs.getString("ename");
					job = rs.getString("job");
					Date hdate = rs.getDate("hiredate");
					Time htime = rs.getTime("hiredate");
					int sal = rs.getInt("sal");
					int grade = rs.getInt("grade");
					String comm = rs.getString("comm");
					
					SimpleDateFormat form1 = new SimpleDateFormat("YYYY년 MM월 dd일");
					SimpleDateFormat form2 = new SimpleDateFormat("HH:mm:ss");
					
					String sdate = form1.format(hdate) + form2.format(htime);
					
					// 출력
					System.out.printf("| %5d | %10s | %10s | %24s | %6d | %2d | %7s |\n",
							eno, name, job, sdate, sal, grade, comm);
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					rs.close();
					pstmt.close();
					con.close();
				} catch (Exception e) {}
			}
		}
	}
	
	
	// 부서번호를 입력받아서 해당 부서의 사원들을 조회해주는 함수
	public void getDnoInfo(Scanner sc) {
		while(true) {
			// 할 일
			// 메세지 출력
			System.out.print("부서번호를 입력하세요! 이전단계는 quit 을 입력하세요.\n부서번호 : ");
			String no = sc.nextLine();
			System.out.println("==========================================================================");
			
			if(no.equals("quit")) {
				// 이 경우는 이전단계로 이동하기를 원하는 경우이므로
				// 이 함수의 실행을 즉시 종료한다.
	//			getInput();
				return;
			}
			int no1 = Integer.parseInt(no);
			
			// 이 경우는 부서번호를 입력받은 경우이므로
			// 부서번호에 소속된 사원들의 정보를 조회하면 된다.
			
			try {
				// 따라서 데이터베이스에 접속하고 <== Connection
				String url = "jdbc:oracle:thin:@localhost:1521:xe";
				String user = "scott";
				String pw = "tiger";
				con = DriverManager.getConnection(url, user, pw);
				// 질의명령 가져오고
				String sql = eSQL.getSQL(eSQL.SEL_DNOINFO);
				// 명령전달도구 만들고
				// 위에서 가져온 질의명령에는 ? 로 되어있는 부분을 데이터로 채워줘야하는
				// 불완전한 질의명령이다.
				// 이 때 사용하는 명령 전달 도구는 PreparedStatement 를 사용한다.
				pstmt = con.prepareStatement(sql);
				
				// 질의명령을 완성하고
				pstmt.setInt(1, no1);
				/*
					만약 질의 명령이
						SELECT
							empno, ename
						FROM
							emp
						WHERE
							sal >= ?
							AND deptno = ?;
					라고 가정하면
					이 때
						sal >= ? 의 ? 의 위치값이 1 이고
						deptno = ? 의 ? 의 위치값이 2 가 된다.
						
				 */
				// 질의명령 보내고 결과(ResultSet) 받고
				rs = pstmt.executeQuery();
				// 꺼내서 출력하고
				while(rs.next()) {	// 레코드 포인터 한줄 내리고
					// (EOF 로 이동하면 false 를 반환)
					// 데이터 추출하고
					int eno = rs.getInt("empno");
					String name = rs.getString("ename");
					String job = rs.getString("job");
					Date hdate = rs.getDate("hiredate");
					Time htime = rs.getTime("hiredate");
					int sal = rs.getInt("sal");
					int dno = rs.getInt("deptno");
					String dname = rs.getString("dname");
					String loc = rs.getString("loc");
					
					SimpleDateFormat hform = new SimpleDateFormat("YYYY년 MM월 dd일 ");
					SimpleDateFormat tform = new SimpleDateFormat("HH:mm:ss");
					
					String sdate = hform.format(hdate) + tform.format(htime);
					
					// 출력
					System.out.printf("| %5d | %10s | %10s | %24s | %6d | %2d | %10s | %8s |\n",
							eno, name, job, sdate, sal, dno, dname, loc);
				}
			} catch (Exception e) {
				e.printStackTrace();
			} finally {
				try {
					rs.close();
					pstmt.close();
					con.close();
				} catch (Exception e) {}
			}
		}
	}
	
	// 모든 사원의 정보를 출력해주는 기능의 함수
	public void getAll() {
		// 할 일
		try {
			// 이 함수에서는 데이터베이스에 연결해서
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String pw = "tiger";
			con = DriverManager.getConnection(url, user, pw);
			// 질의명령을 보내고
//			EmpSQL eSQL = new EmpSQL();	// 먼저 객체로 만들고
			String sql = eSQL.getSQL(eSQL.SEL_ALL);	// 질의명령 가져오고
//			String sql = getSQL(SEL_ALL);
			
			// 명령 전달도구 준비
			stmt = con.createStatement();
			
			// 결과를 받아서
			rs = stmt.executeQuery(sql);
			
			// 결과를 출력해줘야 한다.
			// 몇 행을 꺼내왔는지 알 수 없으므로
			while(rs.next()) {
				// empno, ename, job, hiredate
				int eno = rs.getInt("empno");
				String name = rs.getString("ename");
				String job = rs.getString("job");
				/*
					참고 ]
						JDBC 에서는 데이터베이스에서 날짜데이터를 꺼내올 때
						날짜와 시간을 따로 꺼내오도록 함수를 분리해서 만들어 놓았다.
						
				 */
				// 날짜데이터
				Date hdate = rs.getDate("hiredate");	// 날짜만 꺼내오는 함수
				Time htime = rs.getTime("hiredate");	// 시간만 꺼내오는 함수
				/*
					날짜 데이터를 원하는 문자열로 바꿔주는 형식화 클래스
						SimpleDateFormat form = new SimpleDateFormat(날짜형식문자열);
						String sdate = form.format(hdate);
				 */
				SimpleDateFormat hform = new SimpleDateFormat("YYYY년 MM월 dd일 ");
				SimpleDateFormat tform = new SimpleDateFormat("HH:mm:ss");
				
				String sdate = hform.format(hdate) + tform.format(htime);
				
				// 출력
				System.out.printf("%5d | %10s | %10s | %24s |\n", eno, name, job, sdate);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// 자원 반환
				rs.close();
				stmt.close();
				con.close();
			} catch (Exception e) {}
		}
	}
	public static void main(String[] args) {
		new JdbcTest01();
	}

}