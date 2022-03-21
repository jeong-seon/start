package day16.ex;

/*
	학생들의 과목점수를 기억하는 HashMap 을 만들고
	다섯 학생의 점수를 저장해서 출력하는 프로그램을 작성하세요.
	과목은
		국어, 영어, 수학, 과학, 국사
	의 점수를 기억하도록 하세요.
 */

import java.util.*;

public class Ex02 {
	// 전체 그룹 관리
	HashMap groupMap = new HashMap();
	
	public Ex02() {
		setSub("제니", "국어", setNo());
		setSub("제니", "영어", setNo());
		setSub("제니", "수학", setNo());
		setSub("제니", "과학", setNo());
		setSub("제니", "국사", setNo());
		
		setSub("리사", "국어", setNo());
		setSub("리사", "영어", setNo());
		setSub("리사", "수학", setNo());
		setSub("리사", "과학", setNo());
		setSub("리사", "국사", setNo());
		
		setSub("로제", "국어", setNo());
		setSub("로제", "영어", setNo());
		setSub("로제", "수학", setNo());
		setSub("로제", "과학", setNo());
		setSub("로제", "국사", setNo());
		
		setSub("지수", "국어", setNo());
		setSub("지수", "영어", setNo());
		setSub("지수", "수학", setNo());
		setSub("지수", "과학", setNo());
		setSub("지수", "국사", setNo());
		
		setSub("둘리", "국어", setNo());
		setSub("둘리", "영어", setNo());
		setSub("둘리", "수학", setNo());
		setSub("둘리", "과학", setNo());
		setSub("둘리", "국사", setNo());
		
		getGroup("제니");
		getGroup("리사");
		getGroup("로제");
		getGroup("지수");
		getGroup("둘리");
	}
	
	// 과목점수 랜덤발생
	public int setNo() {
		return (int)(Math.random() * 41 + 60);
	}

	// 그룹 없으면 새로 만들기
	public void makeGroup(String stud) {
		if(!groupMap.containsKey(stud)) {
			groupMap.put(stud, new HashMap());
		}
	}
	
	// 그룹 만들어서 과목과 점수 추가
	public void setSub(String group, String sub, int score) {
		makeGroup(group);
		HashMap tmp = (HashMap)groupMap.get(group);
		
		tmp.put(sub, score);
	}
	
	// 그룹 전체 출력
	public void getGroup(String group) {
		System.out.println("*** " + group + " ***");
		HashMap tmp = (HashMap) groupMap.get(group);
		
		Set set = tmp.keySet();
		
		Iterator itor = set.iterator();
		
		while(itor.hasNext()) {
			String key = (String) itor.next();
			int value = (int) tmp.get(key);
			System.out.println(key + " : " + value + " 점");
		}
		System.out.println("=============");
//		System.out.println();
	}
	
	public static void main(String[] args) {
		new Ex02();
	}

}
