package test0529_1;

public class Student extends Person { // 자식클래스 

	private int kor;
	private	int eng;
	private int math;
	
	public Student(int kor, int eng, int math, String name) {
		super(name); //부모클래스 상속 
		
	this.kor = kor;
	this.eng = eng;
	this.math = math;
	
		
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public void setMath(int math) {
		this.math = math;
	}
	
	
	
}
