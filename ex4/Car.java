package ex4;

import java.util.Scanner;

public class Car {
	//필드(객체가 가지고 있어야 하는 값) -> 글로벌 변수(GV)
	// 고유데이터 =변수
		
		public String[] carinfo = {"255우 6163", "기아", "K8", "25,000kM","60%" };
		int maxSpeed ; //최고속도 120km 
		public String oilType ; //경유, 휘발유 
	
		
	//상태값(변동가능==동작)
		public int speed ;
		public int rpm;
		public int oil;
	
		// 부품에 필드 사용법
	// Car myCar = new Car(); -> 객체 생성(인스턴스)
	// myCar.maxSpeed = 300; -> 객체 있는 maxSpeed에 300 정수를 넣는다.
	// --------------------------------------------------------
		
	
	// [기본 생성자]는 생략이가능(객체가 생성할 때 사용되는 메서드 : 클래스명과 같은 이름) 
		public Car() {
		//  new Car(); 설정시 아래 속도와 rpm 넘어감 
			speed = 0;
			rpm = 50;
			oil = 100;
		}//객체가 생성되면서 변수에 값이 저장됨. 

			
	// C:시동 R:(차량상태, 주행상태) U:(가속,감속,주차) D:(시동종료) 
	//메서드(객체가 수행해야되는 동작) 
		
		public void Carinfos(int number) {
			System.out.println("1.주행정보 확인 메뉴에 들어오셨습니다.");
			System.out.println("=====" + number + "님의 차량 정보는 아래와 같습니다." + "=====");
			System.out.println("차량번호 : " + carinfo[0]);
			System.out.println("제조사 : "+ carinfo[1]);
			System.out.println("모델명 :"+ carinfo[2]);
			System.out.println("총주행 거리:"+ carinfo[3]);
			System.out.println("잔여연료량:"+ carinfo[4]);
			System.out.println("");			
			}
		
		
		
		
		
		public void Ready(Scanner input) {
			String a = "yes";		
			System.out.print("차량 시동을 거시겠습니까?(yes or no):");
			String yesorno = input.next();			
			if(yesorno.equalsIgnoreCase(a)) {
				System.out.println("차량 시동이 걸렸습니다. ");
				System.out.println("현재속도 : " + this.speed + "현재속도 : " + this.rpm+ "km" + "현재 주유량 :" + carinfo[4]);
				
			}
			else {
				System.out.println("시동을 걸지 않아 메인메뉴로 돌아갑니다.");				
				}
		}
		
	
		public void CarStart(Scanner input) {
			
			System.out.println(carinfo[2] + "가(이) 주행을 시작합니다.");
			//운전주행모드 선택
			
			int km = 0;
			boolean run =true;				
			while(run) {
				System.out.print("엑셀 or 브레이크 중 운전할 항목을 선택하세요 : ");	
				String select = input.next();
								
				if(select.equals("엑셀")) {
					km += 10;
					System.out.println("시속"+ km+ "km입니다.");
				}
		
				else if(select.equals("브레이크")) {
					km -= 10;
					System.out.println("시속"+ km+ "km입니다.");	
					if(km == 0) {
						System.out.println("==멈춰있습니다.===");
						break;
					}
				}			
			
			else {
				System.out.println("잘못 입력 하였습니다.");
			}
				
			}
			

			//System.out.println("현재속도 : " + km + "현재rpm : " + this.rpm + "현재 주유량 :" + carinfo[4]);
	}//차량주행시작 메서드 종료 
			
			

		
		
		
}//클래스 종료 
