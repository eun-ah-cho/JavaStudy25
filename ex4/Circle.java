package ex4;

public class Circle { //라이브러리 클래스로 인스턴스(객체용)
	//필드(클래스에서 사용될 변수) 
	public int radius; //main 메서드에서 Circle.radius =10 
	public String name; 
	
	
	//기본 생성자. 클래스를 호출할때 new 연산자를 사용함. 생성자는 클래스와 같은이름!
	public Circle() { 
		
	}
	
	public double getArea(){ //메서드 
		return 3.14*radius*radius; 
		
	}
	
	
}
