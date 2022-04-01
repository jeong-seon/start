package ping;

import java.util.*;

public class PingServer {
	private boolean bool = true;
	private PingThread ping;
	private Scanner sc;
	public PingServer() {
		ping = new PingThread();
		
		sc = new Scanner(System.in);
		
		loop:
		while(true) {
			// 메세지 출력
			System.out.println();
			System.out.println("===== 핑서버프로그램 MENU =====\n# 서버시작 : start\n# 서버중단 : quit\n# 명령을 입력하세요 !");
			String str = sc.nextLine();
			
			switch(str) {
			case "start":
				if(bool) {
					ping.start();
					bool = false;
					try {
						Thread.sleep(100);
					} catch(Exception e) {}
					break;
				}
				System.out.println("************************************");
				System.out.println("*** ! 이미 서버를 실행중입니다 ! ***");
				System.out.println("************************************");
				break;
			case "quit":
				ping.setStart(false);
				try {
					ping.allClose();
				} catch (Exception e) {}
				break loop;
			}
		}
	}

	public static void main(String[] args) {
		new PingServer();
	}

}
