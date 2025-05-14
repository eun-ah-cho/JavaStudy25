package ex2;

import java.util.Scanner;

public class CarRunExam {

	public static void main(String[] args) {
			/* 자동차 주행 프로그램 만들기
			C-> 시동을 건다 / R-> 계기판 정보 출력 / U -> 주행 / D -> 시동을 끈다(END) */
		
		Scanner input = new Scanner(System.in);
		boolean run = true;
		
		int speed = 0 ;
		final int MAXSPEED = 300; //최고속도 상수(변경안됨)
		final int MINSPEED = 0;  // 최저속도 상수(변경안됨) 
		
		System.out.println("람보르기니가 입고 되었습니다.");
		System.out.println("시동을 켭니다. ");
		System.out.println("현재속도 + " + speed + "km/h");
		
		while(run) {  //무한반복중메뉴 출력 
			
			System.out.println("===================");
			System.out.println("0. 시동 종료");
			System.out.println("1. 엑셀"); //30키로 가속 + 300 이하 까지만 가속가능 
			System.out.println("2. 브레이크");
			System.out.println("3. 멀티미디어");
			System.out.println("4. 주유하기");
			System.out.println("===================");
			System.out.print("(0~4 숫자입력)>>> ");
			
			int select = input.nextInt();
			switch(select) {
			
			case 0 :
				
				System.out.println("시동을 종료 합니다.");
				run = false ; //while문 종료 
				break;
				
			case 1 : 
				System.out.println("가속을 진행합니다.");
				speed += 30; 
				
				if(speed >= MAXSPEED) {
					
					speed = MAXSPEED ;
					
					System.out.println("현재속도 :" + speed + "km/h"); //현재속도가 최고속도보다 크거나 같으면
					break;
					
				} //이프문 종료 
							
			/*  else if (speed == 300 ) {
				System.out.println("현재속도 :" + speed + "km/h 이므로 300km넘어 과속입니다." );
			} */ 
			
			case 2 :
				System.out.println("감속을 진행합니다.");
				speed -= 10;
				if(speed <= MINSPEED) {
		
					speed = MINSPEED;
			}

				System.out.println("현재속도 :" + speed + "km/h");
				break;
				
			case 3 :
				System.out.println("멀티미디어를 실행합니다.");
				break;
				
			case 4 : 
				System.out.println("주유를 진행합니다.");
				break;
				
			default :
				System.out.println("잘못 입력 하였습니다. 다시입력 해주세요.");
				break;
				
			
			}//스위치 종료
			
				
			
		}//while문 종료 
		
		
		
		System.out.println("람보르 기니 자동차가 사라집니다.");	
		
		
		
		
		
	}//메소드 종료 

}
