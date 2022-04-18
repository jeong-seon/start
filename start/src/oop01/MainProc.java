package oop01;

import java.util.*;

public class MainProc {
/*
	 숫자를 입력받아서
	 그 숫자만큼의 크기를 갖는 정수배열을 만들고
	 랜덤하게 1 ~ 25 사이의 정수를 발생시켜서 배열에 기억시키고
	 그 배열의 내용을 출력하는 프로그램을 작성하세요.
	 단, 배열 초기화, 배열세팅, 배열 출력은 ArrProc 라는 클래스에서 기능을 구현하고
	 이 클래스에서는 만들어진 기능을 가져와서 사용하는 것으로 한다.
 */

	public MainProc() {
		// 입력받을 준비하고
		Scanner sc = new Scanner(System.in);
		
		int no = 0;
		
		while(true) {
			// 메세지 출력
			System.out.print("* 만들 배열의 길이 : ");
			
			// 정수를 꺼내오고
			
			String sno = sc.nextLine();
			
			try {
				no = Integer.parseInt(sno);
				// 정수로 변환이 되면 반복을 종료
				break;
			} catch (Exception e) {
				System.out.println("숫자형태로 다시 입력하세요!");
			}
		}
		ArrProc ap = new ArrProc();
		
		// 배열 만들고
		int[] num = ap.initArr(no);
		
		// 배열에 데이터 채우고
		ap.setArr(num);
		
		// 배열 출력
		ap.printArr(num);
	}

	public static void main(String[] args) {
		new MainProc();
	}

}
