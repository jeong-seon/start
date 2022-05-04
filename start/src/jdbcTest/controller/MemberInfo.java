package jdbcTest.controller;

import java.util.*;
import jdbcTest.dao.*;
import jdbcTest.vo.*;

public class MemberInfo {
	private MemberDao mDao;

	public MemberInfo() {
		mDao = new MemberDao();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("회원번호를 입력해서 아이디, 이름, 이메일을 조회하기 : mno\n프로그램 종료 : exit\n명령 입력 : ");
			String str = sc.nextLine();
			System.out.println();
			
			switch(str) {
			case "mno":
				mnoInfoPrint(sc);
				break;
			case "exit":
				sc.close();
				System.out.println("***** 프로그램 종료 *****");
				return;
			default:
				System.out.println("# 잘못 입력 하셨습니다 #\n");
			}
		}
	}
	
	public void mnoInfoPrint(Scanner sc) {
		while(true) {
			int mno = getMno(sc);
			
			if (mno == -1) {
				break;
			}
			ArrayList<MemberVO> list = mDao.getMnoInfo(mno);
			
			if(list.size() == 0) {
				System.out.println("# 없는 회원번호 입니다!\n");
				continue;
			}
			System.out.println("##### " + mno + " 번 회원 정보 조회");
			
			System.out.println("============================================");
			System.out.println("| 아 이 디 | 회원이름 |      이 메 일      |");
			System.out.println("--------------------------------------------");
			for(MemberVO m : list) {
				System.out.printf("|%8s  | %6s | %18s |\n",
							m.getId(), m.getName(), m.getMail());
			}
			System.out.println("============================================");
			System.out.println();
		}
	}
	
	public int getMno(Scanner sc) {
		int mno = 0;
		ArrayList<Integer> mnoList = mDao.getMnoList();
		while(true) {
			System.out.println("회원번호를 입력하세요! 이전단계는 -1 을 입력하세요.\n회원번호 : ");
			String sno = sc.nextLine();
			System.out.println();
			try {
				mno = Integer.parseInt(sno);
				
				if(mno != -1 && !mnoList.contains(mno)) {
					System.out.println("# 없는 회원입니다. 다시 입력하세요!\n");
					continue;
				}
			} catch (Exception e) {
				System.out.println("# 잘못된 입력입니다!\n");
				continue;
			}
			break;
		}
		return mno;
	}

	public static void main(String[] args) {
		new MemberInfo();
	}

}
