package day11;

public class Test00 {

	public Test00() {
		// 네모객체 다섯개를 기억할 배열
		Nemo[] sagak = new Nemo[5];
		
		// 각 방에 객체를 만들어서 채워준다.
		for (int i = 0; i < 5; i++) {
			// 가로 세로 만들고
			int height = (int)(Math.random() * 21 + 5);
			int width = (int)(Math.random() * 21 + 5);
			
			Nemo n = new Nemo(height, width);
			
			// 배열에 만들어진 네모 채우고
			sagak[i] = n;
		}
		
		// 출력
		for (int i = 0; i < 5; i++) {
			Nemo n = sagak[i];
			
			int height = n.getHeight();
			int width = n.getWidth();
			int area = n.getArea();
			
			// 출력
			System.out.printf("이 사각형 %2d 은 가로가 %3d 이고 세로가 %3d 이고 넓이는 %4d 입니다.", i, height, width, area);
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		new Test00();
	}

}
