package day16;

import java.util.*;
import java.io.*;

public class Test09 {
/*
	Properties 로 Map 데이터를 사용하다가 파일에 저장해보도록 하자.
 */
	public Test09() {
		Properties prop = new Properties();
		prop.put("name", "홍길동");
		prop.put("age", "16");
		prop.put("tel", "010-1111-1111");
		prop.put("addr", "율도국");
		
		// 이렇게 Map 처럼 작업을 하다가
		// 보관해야 할 필요가 생기면 이 데이터를 모두 파일에 저장한다.
		FileOutputStream fout = null;
		try {
			fout = new FileOutputStream("src/day16/result.txt");
			// 데이터를 흘려보낸다.
			prop.store(fout, "저장되었습니다!");
			// 이 작업이 문제 없이 완료되면 이미 파일에 저장되어있는 상태가 된다.
			System.out.println("***** 파일 저장 성공 *****");
			
			
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			try {
				fout.close();
			} catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test09();
	}

}
