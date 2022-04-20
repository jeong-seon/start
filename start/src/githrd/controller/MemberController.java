package githrd.controller;

import githrd.view.*;
import java.util.*;

public class MemberController {
	private MemberView view;
	
	public MemberController() {
		view = new MemberView();
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("회원번호와 아이디 조회 : mnoid\n회원번호 1001번 조회 : no1001\n전화번호 수정 : uptel\n회원가입 : join\n회원번호 조회 : allmno\n프로그램 종료 : exit\n명령 입력 : ");
			String str = sc.nextLine();
			System.out.println();
			
			switch(str) {
			// 회원번호와 아이디를 조회해서 출력해주는 함수
			case "mnoid":
				view.MnoIdPrint();
				break;
			// 회원 번호(1001)를 입력하면 해당 회원의 정보를 출력해주는 함수
			case "no1001":
				view.No1001Print(1001);
				break;
			// 아이디를 입력해서 해당 회원의 전화번호를 수정(010-1212-1212) 해주는 함수
			case "uptel":
				view.UpdateTel(sc);
				break;
			// [bonus]
			// Scanner 로 회원정보를 입력받아서 회원가입을 처리해주는 함수
			case "join":
				view.Join(sc);
				break;
			// 회원번호를 입력하면 해당 회원의 정보를 출력해주는 함수
			case "allmno":
				view.mnoInfoPrint(sc);
				break;
			case "exit":
				sc.close();
				System.out.println("## 프로그램을 종료합니다 ##");
				return;
			default:
				System.out.println("# 잘못 입력 하셨습니다.\n");
			}
		}
	}	
	
	
	public static void main(String[] args) {
		new MemberController();
	}

}
