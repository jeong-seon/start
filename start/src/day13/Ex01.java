package day13;

/*
	String[] arr = {"123", "456", "789", ...};
	가 있는 경우
	이 배열이 기억하는 숫자형태의 문자열을 정수로 바꾼 데이터들의
	합과 평균을 구하는 프로그램을 작성하세요.
	
	단, 발생할 수 있는 예외를 가정하여 모두 처리하세요.
		1.	배열의 범위를 벗어나서 사용하는 경우 (인덱스)
		2.	숫자로 변환이 불가능한 경우
		3.	평균을 계산하는데 0 으로 나누는 경우
		4.	위의 세가지 이외의 경우...
 */
public class Ex01 {
	String[] arr = {"6사0", "75", "82", "73", "85", "100", "95", "9삼2", "87", "67"}; 

	public Ex01() {
		int sum = 0;
		double avg = 0;
		int len = arr.length;
		int tmp = len;
		
		System.out.print("arr[] : ");
		for(int i = 0; i < len; i++) {
			System.out.print(arr[i] + "\t");
		}
		System.out.println();
		
		for(int i = 0; i < len; i++) {
			
			try {
				int no = Integer.parseInt(arr[i]);
				sum += no;
				avg = sum / (double)tmp;
				
			} catch(ArithmeticException e) {
				System.out.println("## 예외 발생 ## 정수를 0 으로 나누었습니다 !");
				
			} catch(IndexOutOfBoundsException e) {
				System.out.println("## 예외 발생 ## 배열의 범위를 벗어났습니다 !");
				
			} catch(NumberFormatException e) {
				tmp -= 1;
				System.out.println("## 예외 발생 ## " + arr[i] + " : 이 문자열은 숫자로 변환이 불가능합니다 !");
				
			} catch(Exception e) {
				System.out.println("!! ## 나머지 예외 발생 ## !!");
			}
			
		}
		System.out.println("arr[] 의 합계 : " + sum);
		System.out.printf("arr[] 의 평균 : %.2f", avg);
		
	}

	public static void main(String[] args) {
		new Ex01();
	}

}
