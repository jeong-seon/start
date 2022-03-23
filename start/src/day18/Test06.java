package day18;

import java.io.*;

/*
 	제니의 정보를 Friend 클래스를 이용해서 저장해보자.
 	ObjectOutputStream 을 이용해서 저장.
 */
public class Test06 {

	public Test06() {
		// 기본스트림
		FileOutputStream fout = null;
		// 보조스트림
		ObjectOutputStream oout = null;
		
		// 데이터 만들고
		Friend jennie = new Friend();
		jennie.setName("제니");
		jennie.setTel("010-1111-1111");
		jennie.setMail("jennie@githrd.com");
		jennie.setAddr("YGM");
		jennie.setBlood("B");
		jennie.setAge(27);
		jennie.setHeight(165.5f);
		jennie.setGen('F');
		jennie.setRh(true);
		
		try {
			fout = new FileOutputStream("src/day18/result/jennie.txt");
			oout = new ObjectOutputStream(fout);
			
			// 준비된 데이터 사용
			oout.writeObject(jennie);
			// 이처럼 클래스 전체를 입출력하는 행위를 직렬화 라고 한다.
			
			System.out.println("***** 저장 성공 *****");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				oout.close();
				fout.close();
			}catch(Exception e) {}
		}
		
	}

	public static void main(String[] args) {
		new Test06();
	}

}
