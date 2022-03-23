package day18;

import java.io.*;

/*
	Test06 에서 저장한 jennie.txt 파일을 읽어보자.
	
	ObjectOutputStream 으로 저장한(내보낸) 파일은
	반드시 ObjectInputStream 으로 읽어야 한다.
	그리고 보내는 쪽과 받는 쪽에 모두 동일한 클래스가 있어야 한다.
	
 */
public class Test07 {

	public Test07() {
		// 기본스트림
		FileInputStream fin = null;
		// 보조스트림
		ObjectInputStream oin = null;
		
		try {
			fin = new FileInputStream("src/day18/result/jennie.txt");
			oin = new ObjectInputStream(fin);
			
			// 클래스 통채로 읽어온다.
			Friend jn = (Friend) oin.readObject();
			
			String name = jn.getName();
			String tel = jn.getTel();
			String mail = jn.getMail();
			String addr = jn.getAddr();
			String blood = jn.getBlood();
			int age = jn.getAge();
			float height = jn.getHeight();
			char gen = jn.getGen();
			boolean rh = jn.isRh();
			
			// 출력
			System.out.println("이름 : " + name);
			System.out.println("전화 : " + tel);
			System.out.println("메일 : " + mail);
			System.out.println("주소 : " + addr);
			System.out.println("혈액형 : " + blood);
			System.out.println("나이 : " + age);
			System.out.println("신장 : " + height);
			System.out.println("성별 : " + gen);
			System.out.println("RH : " + (rh ? "+" : "-"));
			
			System.out.println("==============================");
			System.out.println(jn);
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				oin.close();
				fin.close();
			}catch(Exception e) {}
		}
	}

	public static void main(String[] args) {
		new Test07();
	}
}
