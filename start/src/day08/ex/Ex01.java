package day08.ex;

/*
	7 학생의 5 과목 점수를 랜덤하게 만들어서 기억시키고
	각 학생 배열의 맨 마지막에는 총점을 계산해서 입력되게 하고
	결과를 출력하는데
	평균도 계산해서 출력하세요.
	(평균 배열은 별도로 작성)
 */
public class Ex01 {

	public static void main(String[] args) {
		// 학생 배열
		int[][] stud = new int[7][6];
		
		// 맨 윗줄 출력
		System.out.println("\t과목1\t과목2\t과목3\t과목4\t과목5\t총점\t평균");
		
		for(int i = 0; i < stud.length; i++) {
			int hap = 0;
			
			for(int j = 0; j < stud[i].length -1; j++) {
				int score = (int)(Math.random() * 41 + 60);
				stud[i][j] = score;
				
				hap += stud[i][j];
				stud[i][5] = hap;
			}
		}
		for(int i = 0; i < stud.length; i++) {
			System.out.print("학생 " + (i + 1) + " : ");
			double avg = 0.0;
			for(int j = 0; j < stud[i].length; j++) {
				avg = stud[i][5] / 5.;
				
				
				System.out.print(stud[i][j] + "\t");
			}
			System.out.print(avg);
			
			System.out.println();
		}
		
	}

}
