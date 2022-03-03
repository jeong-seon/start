package day05.ex;

/*
	문제 5 ]
		컴퓨터와 사용자 사이의 가위바위보 게임을 한다.
		
		컴퓨터는 랜덤하게 1 ~ 3 사이의 숫자를 발생하여
		가위, 바위, 보로 가정하고
		사용자는 키보드를 이용해서 1 ~ 3 사이의 숫자를 입력하도록 한다.
		
		누가 이겼는지를 확인하는 프로그램을 작성하세요.
		
		풀이 ]
			컴퓨터 - 사람 으로 계산해서
			
					컴퓨터
					1		2		3
		사람	1	0		1		2
				2	-1		0		1
				3	-2		-1		0
				
				여기서
					비긴경우 결과값		0
					컴퓨터가 이긴 경우	1, -2
					사람이 이긴 경우	-1, 2
 */

import java.util.*;

public class Ex05 {
	public static void main(String[] args) {
		// 입력도구
		Scanner sc = new Scanner(System.in);
		
		// 1 ~ 3 까지의 랜덤한 정수 발생
		int num = (int)(Math.random() * (3 - 1 + 1) + 1);
		
		// 변수 선언
		String result = "";
		
		// 랜덤정수가 1 일때 가위, 2 일때 바위, 3 일때 보.
		switch (num) {
		case 1:
			result = "가위";
			break;
		case 2:
			result = "바위";
			break;
		case 3:
			result = "보";
			break;
		}
		
		// 사용자 입력
		System.out.println("1: 가위\t2: 바위\t3: 보");
		System.out.print("1 ~ 3 사이의 숫자를 입력 : ");
		int rsp = sc.nextInt();
		
		// 변수 선언 및 가위바위보 시스템
		String res = "";
		if (num == 1 && rsp == 1) {
			res = "비겼습니다!";
		} else if (num == 1 && rsp == 2) {
			res = "당신이 이겼습니다!";
		} else if (num == 1 && rsp == 3) {
			res = "당신이 졌습니다!";
		} else if (num == 2 && rsp == 1) {
			res = "당신이 졌습니다!";
		} else if (num == 2 && rsp == 2) {
			res = "비겼습니다!";
		} else if (num == 2 && rsp == 3) {
			res = "당신이 이겼습니다!";
		} else if (num == 3 && rsp == 1) {
			res = "당신이 이겼습니다!";
		} else if (num == 3 && rsp == 2) {
			res = "당신이 졌습니다!";
		} else if (num == 3 && rsp == 3) {
			res = "비겼습니다!";
		}
		
		// 결과 출력
		System.out.println("컴퓨터 = " + num + " : " + result + "\n" + res);
	}
}
