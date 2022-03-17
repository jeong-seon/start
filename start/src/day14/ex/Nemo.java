package day14.ex;

public class Nemo {
	private int garo, sero, area;
	
	public Nemo() {}
	public Nemo(int garo, int sero) {
		this.garo = garo;
		this.sero = sero;
		setArea();
	}
	public void setArea() {
		area = garo * sero;
	}
	public int getGaro() {
		return garo;
	}
	public void setGaro(int garo) {
		this.garo = garo;
	}
	public int getSero() {
		return sero;
	}
	public void setSero(int sero) {
		this.sero = sero;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	
	@Override
	public String toString() {
		return "사각형 - 가로 : " + garo + " , 세로 : " + sero + " , 면적 : " + area;
	}
	
	@Override
	public boolean equals(Object o) {
		boolean bool = false;
		
		Nemo nam = null;
		try {
			nam = (Nemo) o;
		} catch (Exception e) {
			return false;
		}
		
		bool = (garo == nam.getGaro()) && (sero == nam.getSero()) ;
		
		return bool;
	}
}
