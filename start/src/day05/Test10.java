package day05;

public class Test10 {
	public static void main(String[] args) {
		int no = 10;
		// do while 문 (조건이 맞지 않아도 적어도 한번은 실행함.)
		do {
			System.out.println("no : " + no);
			++no;
		} while(no < 10);
	}
}
