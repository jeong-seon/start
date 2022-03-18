package day15;

/*
	Ex01 ]
		아이디를 입력받아서
		입력받은 아이디가 유효한 아이디인지 아닌지를 판별해주는 프로그램을
		작성하세요. (사용가능한 아이디입니다 or 사용할 수 없는...)
		
		아이디는
			첫글자는 영문대문자로 시작하고
			두번째부터는 영문 대소문자 및 숫자를 사용할 수 있다.
			글자수는 총 5글자 이상이어야한다.
 */
import java.util.*;

import java.util.regex.*;

public class Ex01 {

	public Ex01() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ID 입력 : ");
		String id = sc.nextLine();
		
		Pattern form = Pattern.compile("[A-Z][a-zA-Z0-9]{4}.*");
		Matcher mat = form.matcher(id);
		
		boolean bool = mat.matches();
		
		String result = bool ? "사용 가능한" : "사용할 수 없는";
		
		System.out.println("입력받은 ID [ " + id + " ] 는 " + result + " 아이디 입니다.");
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
