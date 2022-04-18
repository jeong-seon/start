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
	public void UpdateTel(Scanner sc1, Scanner sc2) {
		while(true) {
			MemberVO mvo = new MemberVO();
			mDao.updateTel(mvo);
			idPrint();
			System.out.print("수정할 전화번호와 아이디를 입력하세요! 이전단계는 -1 을 입력하세요.\n전화번호 : ");
			String tel = sc1.nextLine();
			System.out.print("아이디 : ");
			String id = sc2.nextLine();
			
			mvo.setTel(tel);
			mvo.setId(id);

			System.out.println();
			
			if(tel.equals("-1") || id.equals("-1")) {
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
	
	// [bonus]
	// Scanner 로 회원정보를 입력받아서 회원가입을 처리해주는 함수
	public void Join(Scanner sc1, Scanner sc2, Scanner sc3, Scanner sc4, Scanner sc5, Scanner sc6, Scanner sc7) {
		while(true) {
			MemberVO mvo = new MemberVO();
			mDao.insertJoin(mvo);
			System.out.print("정해진 절차에따라 회원가입하세요! 이전단계는 -1 을 입력하세요.\n회원이름 : ");
			String name = sc1.nextLine();
			System.out.print("아이디 : ");
			String id = sc2.nextLine();
			System.out.print("비밀번호 : ");
			String pw = sc3.nextLine();
			System.out.print("이메일 : ");
			String mail = sc4.nextLine();
			System.out.print("전화번호 (010-####-####) : ");
			String tel = sc5.nextLine();
			System.out.print("아바타 (11 ~ 16) : ");
			int avt = sc6.nextInt();
			System.out.print("성별 (남자 = M / 여자 = F) : ");
			String gen = sc7.nextLine();
			
			
			mvo.setName(name);
			mvo.setId(id);
			mvo.setPw(pw);
			mvo.setMail(mail);
			mvo.setTel(tel);
			mvo.setAvt(avt);
			mvo.setGen(gen);

			System.out.println();
			
			if(name.equals("-1")) {
				break;
			}
			
			int result = mDao.insertJoin(mvo);
			if(result == 1) {
				System.out.println("회원가입이 성공적으로 완료되었습니다!");
				break;
			} else {
				System.out.println("회원가입에 실패하였습니다! 다시 입력해주세요!");
			}
		
		}
	}
}
