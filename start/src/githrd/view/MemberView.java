package githrd.view;

import java.util.*;

import githrd.dao.*;
import githrd.vo.*;

public class MemberView {
	private MemberDao mDao;
	public MemberView() {
		mDao = new MemberDao();
	}
	
	// 회원번호와 ID 조회함수
	public void MnoIdPrint() {
		ArrayList<MemberVO> list = mDao.getMnoId();
		
		System.out.println("=========================");
		System.out.println("| 회원번호 |  아 이 디  |");
		System.out.println("-------------------------");
		for(MemberVO m : list) {
			System.out.printf("|%7d   | %10s |\n", m.getMno(), m.getId());
		}

		System.out.println("=========================");
		System.out.println();
	}
	
	// 회원 번호(1001)를 입력하면 해당 회원의 정보를 출력해주는 함수
	public void No1001Print(int mno) {
		ArrayList<MemberVO> list = mDao.getNo1001(mno);
		
		System.out.println("===============================================================================================================================");
		System.out.println("| 회원번호 | 회원이름 | 아 이 디 | 비밀번호 |      이 메 일      |  전 화 번 호  | 아바타 | 성 별 |        가  입  일         |");
		System.out.println("-------------------------------------------------------------------------------------------------------------------------------");
		for(MemberVO m : list) {
			System.out.printf("|%7d   | %6s | %8s | %8s | %18s | %13s | %6d | %5s | %22s |\n",
					m.getMno(), m.getName(), m.getId(), m.getPw(), m.getMail(), m.getTel(), m.getAvt(), m.getGen(), m.getSdate());
		}

		System.out.println("===============================================================================================================================");
		System.out.println();	
	}
	
	// 아이디 조회 전담 처리 함수
	public ArrayList<MemberVO> idPrint() {
		ArrayList<MemberVO> list = mDao.getIdList();
		
		System.out.println("==========");
		System.out.println("| 아이디 |");
		System.out.println("----------");
		for(MemberVO mvo : list) {
			System.out.printf("|%7s |\n", mvo.getId());
		}
		System.out.println("==========");
		
		return list;
	}
	
	// 아이디를 입력해서 해당 회원의 전화번호를 수정(010-1212-1212) 해주는 함수
	public void UpdateTel(Scanner sc) {
		while(true) {
			MemberVO mvo = new MemberVO();
			mDao.updateTel(mvo);
			idPrint();
			System.out.print("아이디를 입력하세요! 이전단계는 -1 을 입력하세요.\n아이디 : ");
			String id = sc.nextLine();
			System.out.println();
			
			if(id.equals("-1")) {
				break;
			}
			
			int result = mDao.updateTel(mvo);
			if(result == 1) {
				System.out.println(id + " 아이디의 수정에 성공하였습니다!");
				break;
			} else {
				System.out.println(id + " 아이디의 수정에 실패하였습니다!");
			}
		
		}
	}

}
