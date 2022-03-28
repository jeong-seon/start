package day19.ping;

import java.util.*;

public class Exec01 {

	public Exec01() {
		boolean bool = true;
		Scanner sc = new Scanner(System.in);
		// 메세지 출력
		
		PingServer02 t1 = new PingServer02();
		
		System.out.print("*** 핑서버 프로그램 ***\n서버기동 : start\n서버중단 : quit\n명령을 입력하세요 : ");
		String str = sc.nextLine();
		
		switch(str) {
		case "start":
			t1.start();
			break;
		case "quit":
			
			break;
		}
	}

	public static void main(String[] args) {
		new Exec01();
	}

}
