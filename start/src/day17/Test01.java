package day17;

import java.io.*;

/*
	파일에 내용을 저장하는 프로그램을 만들어보자.
 */

public class Test01 {

	public Test01() {
		// 파일에 저장하기 위해서는 파일로 연결된 스트림이 필요하다.
		FileOutputStream fout = null;

		// 경로가 잘못되면 파일을 만들수 없으므로 예외처리가 필요하다.
		try {
			// 절대경로든 상관없다.
//			fout = new FileOutputStream("src/day17/result/FileTest01.txt");
			fout = new FileOutputStream("C:\\class\\java\\h_repo\\start\\start\\src\\day17\\result\\FileTest01.txt");
			// 파일이 존재하지 않아도 자동으로 만들어준다.
			
			/*
			// 1. 한글자만 입력해보자.
//			fout.write('j');	// char ==> int 자동형변환
			
			// 2. 여러 글자를 내보내 보자.
			// 문자열 준비
			String song = "Hey boy\r\nMake 'em whistle like a missile, bomb, bomb";
			
			// 준비된 문자열을 바이트 배열로 변환 하고
			byte[] buff = song.getBytes();
			
			// 배열을 스트림에 흘려보낸다.
			fout.write(buff);
			*/
			

			String song = "Make 'em whistle like a missile, bomb, bomb";
			byte[] buff = song.getBytes();
			fout.write(buff, 9, buff.length - 9);
			// buff.length - 9 : 내보낼 갯수
			// 9 : 시작 인덱스
			
			System.out.println("### 파일 저장 성공 ###");
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			// 외부장치와 연결된 경우는 해당 외부장치의 사용이 끝나면
			// 닫아주는 것이 원칙이다.
			try {
				fout.close();
			} catch(Exception e) {
				
			}
		}
	}

	public static void main(String[] args) {
		new Test01();
	}

}
