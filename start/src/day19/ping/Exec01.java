package day19.ping;

import java.io.IOException;
import java.util.*;

public class Exec01 {
	private PingServer02 ping;
	private Scanner sc;
	private boolean bool = true;
	

	public Exec01() {
		ping = new PingServer02();
		sc = new Scanner(System.in);
		
		// 메세지 출력
		while(bool) {
			System.out.print("*** 핑서버 프로그램 ***\n서버기동 : start\n서버중단 : quit\n명령을 입력하세요 : ");
			String str = sc.nextLine();
			
			switch(str) {
			case "start":
				if(!ping.isAlive()) {
					ping.start();				
				}
				break;
			case "quit":
				bool = false;
				ping.setStart(false);
				
				try {
					ping.getServer().close();
				}catch (IOException e) {}
				
				break;
			}
			
		}
		System.out.println("### 프로그램 종료 ###");
	}

	public static void main(String[] args) {
		new Exec01();
	}

}
