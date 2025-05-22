package ex4;

public class CircleExam {

	public static void main(String[] args) { //메인메서드 
		
		Circle circle = new Circle(); //Circle 클래스를 객체로 받아서 동작하는 메서드 
		//객체는 circle 이라는 변수와 연결한다. 
		
		circle.name = "조은아"; //name필드에 String 값을 넣는다. 
		circle.radius = 20 ; 
		
		double result = circle.getArea();
		
		System.out.println(result);
		
	}

}
