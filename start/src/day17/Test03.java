package day17;

import java.io.*;

/*
	이미지 파일을 복사해보자.
 */
public class Test03 {

	public Test03() {
		// 할 일
		// 스트림은 단방향이다.
		// 복사라는 작업은 한 곳에서 읽어서 다른곳에 그대로 읽은 내용을 쓰는 작업
		// 따라서 스트림이 두 개 준비되어야 한다.
		
		// 스트림 준비
		FileInputStream fin = null;
		FileOutputStream fout = null;
		
		try {
			// 스트림 만들기
			fin = new FileInputStream("src/day17/jennie.jpg");
			fout = new FileOutputStream("src/day17/result/jennie_copy.jpg");
			
			// 한 쪽에서 읽어서 그대로 다른곳에 쓰면 된다.
			// 몇 번 읽어야 할 지 모르므로
			while(true) {
				byte[] buff = new byte[1024];
				int len = fin.read(buff);
				
				if(len == -1) {
					// 이 경우는 더이상 읽은 데이터가 없는 경우
					break;
				}
				fout.write(buff, 0, len);
			}
			
			// 메세지 출력
			System.out.println("*** 파일 복사 성공 ***");
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fout.close();
				fin.close();
			} catch(Exception e) {
				
			}
		}
	}

	public static void main(String[] args) {
		new Test03();
	}

}
