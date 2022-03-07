package day08.ex;

/*
	Ex02 ]
		Ex01 에서 만든 배열의 내용을
		다섯과목의 7학생의 배열로 바꿔서
		해결해보세요.
		(복사)
		
	bonus ]
		Ex01 의 각 학생의 항목에 석차도 입력되도록 하세요.
		그 후 내림차순 정렬하세요.
 */
public class Ex02 {

	public static void main(String[] args) {
		int[][] stud = new int[6][8];
		
		// 맨 윗줄 출력
		System.out.println("\t학생1\t학생2\t학생3\t학생4\t학생5\t학생6\t학생7\t총점");
				
		// 랜덤 점수 입력
		for(int i = 0; i < stud.length-1; i++) {
			int hap1 = 0;
			
			
			for(int j = 0; j < stud[i].length -1; j++) {
				int score = (int)(Math.random() * 41 + 60);
				stud[i][j] = score;

				// 과목 i 의 학생점수 총합
				hap1 += stud[i][j];
				stud[i][7] = hap1;
			}
		}
		// 학생 i 의 과목점수 총합
		for(int i = 0; i < 7; i++) {
			int hap = 0;
			
			for(int j = 0; j < 5; j++) {
				hap += stud[j][i];
				stud[5][i] = hap;
			}
			
		}
		// 표 출력
		for(int i = 0; i < stud.length-1; i++) {
			System.out.print("과목 " + (i + 1) + " : ");
			for(int j = 0; j < stud[i].length; j++) {
				
				
				System.out.print(stud[i][j] + "\t");
			}
			
			System.out.println();
		}
		
		// 총점 출력
		System.out.print("총점   : ");
		for(int i = 0 ; i < 7; i++) {
			
			
			System.out.print(stud[5][i] + "\t");
		}
		// 평균 출력
		System.out.println();
		System.out.print("평균   : ");
		for(int i = 0; i < 7; i++) {
			double avg = 0.0;
			avg = stud[5][i] / 5.;
			System.out.print(avg + "\t");
		}
		// 석차 출력
		System.out.println();
		System.out.print("석차   : ");
		int[] rank = new int[7];
		
		for(int i = 0; i < rank.length; i++) {
			rank[i] = 1;
		}
		
		// 석차 출력
		for(int i = 0; i < rank.length; i++) {
			for(int j = 0; j < rank.length; j++) {
				
				if(stud[5][j] > stud[5][i]) {
					rank[i] += 1;
					
				}
			}
		}
		
		// 석차 출력
		for(int i = 0; i < rank.length; i++) {
			System.out.print(rank[i] + "등\t");
		}
		
		
	}
}
