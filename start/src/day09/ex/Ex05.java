package day09.ex;

/*
	문제 5 ]
		10 학생의 국어, 영어, 수학 점수를 랜덤하게 입력받아서
		총점과 석차를 구하는 프로그램을 작성하세요.
		
		각 학생의 점수 입력(랜덤), 총점계산, 석차계산, 출력은 함수로 처리.
 */
public class Ex05 {

	public Ex05() {
		int[][] stud = studArr();
		stud = scoreSum();
		stud = studRank();
		
		toPrint(stud);
	}
	
	public static void main(String[] args) {
		new Ex05();
	}

	// 배열에 점수 채워줄 랜덤정수 입력
	public int[][] studArr() {
		int[][] stud = new int[10][5];
		
		for (int i = 0; i < stud.length; i++) {
			
			for (int j = 0; j < stud[i].length - 2; j++) {
				int no = (int)(Math.random() * 41 + 60);
				stud[i][j] = no;
				
			}
		}
		return stud;
	}
	
	// 총점 계산
	public int[][] scoreSum() {
		int[][] arr = studArr();
		
		for (int i = 0; i < arr.length; i++) {
			
			for (int j = 0; j < arr[i].length - 2; j++) {
				arr[i][3] += arr[i][j];
			}
		}
		return arr;
	}

	// 석차 계산
	public int[][] studRank() {
		int[][] arr = scoreSum();
		int[] rank = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i][4] = 1;
		}
		for (int i = 0; i < rank.length; i++) {
			rank[i] = 1;
		}
		for (int i = 0; i < rank.length; i++) {
			
			for (int j = 0; j < rank.length; j++) {
				if (arr[j][3] > arr[i][3]) {
					rank[i] += 1;
					arr[i][4] = rank[i];
				}
			}
		}
		
		return arr;
	}
	
	// 출력
	public void toPrint(int[][] arr) {
		System.out.println("\t국어\t영어\t수학\t총점\t석차");
		
		for (int i = 0; i < arr.length; i++) {
			System.out.print("학생 " + (i + 1) + " : ");
			
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
