package ex4;

import java.util.Scanner;

public class CarExam {


	public static void main(String[] args) {
		//자동차 주 실행 프로그램 
		Scanner input = new Scanner(System.in);
		Car myCar = new Car(); //기본생성자 객체생성_생성시 speed,rpm,oil은 기본값으로 생성 
		int number = 6163;
		
		System.out.println("=====k8 AutoSystem=====");
		boolean run = true;
		while(run) {			
		System.out.print("차량번호 끝에 4자리를 입력하세요.(6163):"); //6163
		int select = input.nextInt();
		if(select == number) {
			System.out.println("["+ select + "] 차주님. 환영합니다. 원하시는 항목을 선택해 주세요.");
			break;
			}
		
		else {
			System.out.println("일치하지 않습니다. 다시로그인 해주세요.");
			}
		}
						
		boolean run1 =true;
		while (run1) {
			System.out.println("|1.주행 정보확인 | 2.차량 시동걸기 | 3.차량 주행시작 | 4.차량 주행종료 |");
			System.out.print(">>>>");
			String select1 = input.next();
			switch (select1) {
			
			case "1" : 	//차량정보 확인 메서드 호출 
				Car myCar1 = new Car();
				myCar1.Carinfos(number);
				break;												
				
			case "2" :  //차량 시동걸기 메서드 호출 
				Car myCar2 = new Car();
				myCar2.Ready(input);
				break;
						
		
			case "3" :
				Car myCar3 = new Car();
				myCar3.CarStart(input);
				
			// case "4" :
		
				
			
			}
			
			
		}//while문 종료 
		
		

	}//메인메서드종료 

}//클래스 종료 
