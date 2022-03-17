package day14.ex;

public class Student {
	private String name;
	private int ban, kor, eng, math, total;
	
	public Student() {}
	public Student(String name, int ban) {
		this.name = name;
		this.ban = ban;
		this.kor = (int)(Math.random() * 41 + 60);
		this.eng = (int)(Math.random() * 41 + 60);
		this.math = (int)(Math.random() * 41 + 60);
		setTotal();
	}
	
	public void setTotal() {
		total = kor + eng + math;
	}
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
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	
	@Override
	public String toString() {
		return "반 : " + ban + "\n이름 : " + name + "\n국어 : " + kor + "\n영어 : " + eng + "\n수학 : " + math + "\n총점 : " + total;
	}
	
	@Override
	public boolean equals(Object o) {
		boolean bool = false;
		
		Student nam = null;
		
		try {
			nam = (Student) o;
		} catch (Exception e) {
			return false;
		}
		
		bool = (ban == nam.getBan()) && (name == nam.getName());
		
		return bool;
	}
}
