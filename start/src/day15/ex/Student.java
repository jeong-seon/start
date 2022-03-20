package day15.ex;
/*
	학생 한명의 정보를 저장할 클래스를 제작하세요.
	정보는
			학생이름, 반, 번호,
			자바, 데이터베이스, 웹, 스프링 점수
			총점, 평균
	를 기억하게 되고
	
	10명의 학생을 TreeSet 에 입력하고
	반 순서대로 정렬되도록 하세요.
	반이 같으면 번호순으로 정렬되도록 하세요.
*/
public class Student implements Comparable {
	private String name;
	private int ban, num, java, db, web, spr, total;
	private double avg;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getBan() {
		return ban;
	}

	public void setBan(int ban) {
		this.ban = ban;
	}

	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getDb() {
		return db;
	}

	public void setDb(int db) {
		this.db = db;
	}

	public int getWeb() {
		return web;
	}

	public void setWeb(int web) {
		this.web = web;
	}

	public int getSpr() {
		return spr;
	}

	public void setSpr(int spr) {
		this.spr = spr;
	}

	public int getTotal() {
		return java + db + web + spr;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public double getAvg() {
		return total / 4.;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

	@Override
	public int compareTo(Object o) {
		Student s = (Student) o;
		
		int result = ban - s.getBan();
		
		if (ban == s.getBan()) {
			result = num - s.getNum();
		}
		
		return result;
	}
	
	@Override
	public String toString() {
		
		return "학생 : " + name + "\t반 : " + ban + "\t\t번호 : " + num + "\tJAVA : " + java + "\tDB : " + db + "\t\tWEB : " + web + "\tSPRING : " + spr + "\t총점 : " + total + "\t평균 : " + avg; 
	}
}
