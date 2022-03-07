package day09.ex;

/*
	문제 3 ]
		사각형의 넓이를 계산하는 프로그램을 작성하세요.
		
		길이를 랜덤하게 만들어주는 함수
		넓이를 계산해주는 함수
		사각형의 내용을 출력해주는 함수
 */
public class Ex03 {

	public Ex03() {
		int garo = setGaro();
		int sero = setSero();
		int result = getRes(garo, sero);
		toPrint(garo, sero, result);
	}
	public static void main(String[] args) {
		new Ex03();
	}
	public int setGaro() {
		int garo = (int)(Math.random() * 10 + 1);
		
		return garo;
	}
	public int setSero() {
		int sero = (int)(Math.random() * 10 + 1);
		
		return sero;
	}
	public int getRes(int no1, int no2) {
		int result = no1 * no2;
		
		return result;
	}
	public void toPrint(int no1, int no2, int result) {
		System.out.println("사각형 정보");
		System.out.println("가로 : " + no1 + "\t세로 : " + no2 + "\n넓이 : " + result);
	}

}
