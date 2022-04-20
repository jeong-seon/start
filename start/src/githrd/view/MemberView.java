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
	
	// 회원번호 조회 전담 처리 함수
	public void mnoPrint() {
		ArrayList<MemberVO> list = mDao.getMnoList();
		
		System.out.println("============");
		System.out.println("| 회원번호 |");
		System.out.println("------------");
		for(MemberVO mvo : list) {
			System.out.printf("|  %7s |\n", mvo.getMno());
		}
		System.out.println("============");
	}
	
	// 회원 번호를 입력하면 해당 회원의 정보를 출력해주는 함수
	public void mnoInfoPrint(Scanner sc) {
		while(true) {
			int mno = getMno(sc);
			
			if(mno == -1) {
				break;
			}
			ArrayList<MemberVO> list = mDao.getMnoInfo(mno);
			
			if(list.size() == 0) {
				System.out.println("# 없는 회원번호 입니다.\n");
				continue;
			}
			System.out.println("### " + mno + "번 회원 정보 조회");
			
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
	}
	
	// 회원번호 입력받기 전담처리함수
	public int getMno(Scanner sc) {
		int mno = 0;
		ArrayList<Integer> mnoList = mDao.getNoList();
		while(true){
			mnoPrint();
			System.out.print("회원번호를 입력하세요! 이전단계는 -1 을 입력하세요.\n회원번호 : ");
			String sno = sc.nextLine();
			System.out.println();
			try {
				mno = Integer.parseInt(sno);
				
				if(mno != -1 && !mnoList.contains(mno)) {
					System.out.println("# 없는 사원입니다. 다시입력하세요!\n");
					continue;
				}
			} catch(Exception e) {
				System.out.println("# 잘못된 입력입니다.\n");
				continue;
			}
			break;
		}
		
		return mno;
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
			idPrint();
			System.out.print("수정할 전화번호와 아이디를 입력하세요! 이전단계는 -1 을 입력하세요.\n전화번호 : ");
			String tel = sc.nextLine();
			if(tel.equals("-1")) {
				System.out.println();
				break;
			}
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			if(id.equals("-1")) {
				System.out.println();
				break;
			}
			
			mvo.setTel(tel);
			mvo.setId(id);

			System.out.println();
			
			
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
	public void Join(Scanner sc) {
		while(true) {
			String str;
			MemberVO mvo = new MemberVO();
			
			System.out.print("정해진 절차에따라 회원가입하세요! 이전단계는 -1 을 입력하세요.\n회원이름 : ");
			
			
			String name = sc.nextLine();
			if(name.equals("-1")) {
				System.out.println();
				break;
			}
			System.out.print("아이디 : ");
			String id = sc.nextLine();
			if(id.equals("-1")) {
				System.out.println();
				break;
			}
			System.out.print("비밀번호 : ");
			String pw = sc.nextLine();
			if(pw.equals("-1")) {
				System.out.println();
				break;
			}			
			System.out.print("이메일 : ");
			String mail = sc.nextLine();
			if(mail.equals("-1")) {
				System.out.println();
				break;
			}			
			System.out.print("전화번호 (010-####-####) : ");
			String tel = sc.nextLine();
			if(tel.equals("-1")) {
				System.out.println();
				break;
			}
			System.out.print("성별 (남자 = M / 여자 = F) : ");
			String gen = sc.nextLine();
			if(gen.equals("-1")) {
				System.out.println();
				break;
			}
			System.out.print("아바타 (11 ~ 16) : ");
			String savt = sc.nextLine();
			if(savt.equals("-1")) {
				System.out.println();
				break;
			}
			System.out.println();
			
//			if (name.equals("-1") || id.equals("-1") || pw.equals("-1") || mail.equals("-1") || tel.equals("-1") || gen.equals("-1") || savt.equals("-1")) {
//				return;
//			}

			int avt = Integer.parseInt(savt);
			
			mvo.setName(name);
			mvo.setId(id);
			mvo.setPw(pw);
			mvo.setMail(mail);
			mvo.setTel(tel);
			mvo.setGen(gen);
			mvo.setAvt(avt);

			System.out.println();
			
			
			int result = mDao.insertJoin(mvo);
			if(result == 1) {
				System.out.println("회원가입이 성공적으로 완료되었습니다!\n");
				break;
			} else {
				System.out.println("회원가입에 실패하였습니다! 다시 입력해주세요!\n");
			}
		
		}
	}
}
