package ex5;

public class Computer extends Calculator {
	
	
	double areaCircle(double r) {
		System.out.println("Calculator 객체의 areaCircle()실행");
		return Math.PI * r * r;
		}
}
