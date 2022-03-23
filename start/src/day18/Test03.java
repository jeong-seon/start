package day18;

import java.io.*;

/*
	이미지 파일을 문자단위 스트림으로 복사해보자.
		result/jennie.jpg --> jennie_copy.jpg
		
	원칙은 문자단위 스트림으로 주고받으면 안된다.
	바이트코드가 역순이 될 수 있기 때문에..
	
	결과는 복사된 이미지 파일이 안보이는 것이 정상이다. (코드가 섞이기때문)
 */
public class Test03 {

	public Test03() {
		// 기본스트림이 두 개 필요하다.
		// 읽는것과 쓰는것 두 개.
		FileReader fr = null;
		FileWriter fw = null;
		try {
			fr = new FileReader("src/day18/result/jennie.jpg");
			fw = new FileWriter("src/day18/result/jennie_copy.jpg");
			
			char[] buff = new char[1024];
			// 몇 번 반복해야하는지 알 수 없으므로
			while(true) {
				// 한 쪽에서 읽어서 배열에 채워주고
				int len = fr.read(buff);
				// 읽은 데이터가 없는 경우
				if (len == -1) {
					break;
				}
				// 다른 쪽에 내용을 쓴다
				fw.write(buff, 0, len);				
			}
			// 결과 출력
			System.out.println("*** 제니 복사 완료 ***");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fw.close();
				fr.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test03();
	}

}
