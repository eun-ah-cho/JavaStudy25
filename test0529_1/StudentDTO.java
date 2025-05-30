package test0529_1;

public class StudentDTO { //데이터 전달용 객체 

	//필드
	public String name;
	public int kor;
	public int eng;
	public int math;
	
	//생성자 
	public StudentDTO(String name, int kor, int eng, int math ) {
		this.name= name;
		this.kor =kor;
		this.eng =eng;
		this.math = math;
	}
	
	//메서드 
	 public int getTotal() {
	        return kor + eng + math;
	    }
	 
	 public double getAverage() {
	        return getTotal() / 3.0;
	 }
	 
}


