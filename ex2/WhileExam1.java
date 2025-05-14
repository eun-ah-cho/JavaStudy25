package ex2;

public class WhileExam1 {

	
	public static void main(String[] args) throws Exception {
	
		// 스캐너 객체 안쓸때 이용했던 방식  
		
		
		boolean run = true; //실행여부 판단
		int speed = 100 ; // 현재속도는 100km/h
		int keycode = 0; // 키보드로 입력되는 값
		
		while(run) { //run에 초기값이 true 이기 때문에 주행중이라는 뜻!
			if(keycode != 13 && keycode != 10 ) { //유니코드로 인트
				System.out.println("현재속도는 100km 입니다.");
						
				System.out.println("-----------------");
				System.out.println("1.엑셀 | 2. 브레이크 | 3. 중지 ");
				System.out.println("-----------------");
				
				System.out.print("선택 : ");
				keycode = System.in.read();
							
			} //if문 종료 
			
			if (keycode == 49) {
				speed += 5;
				System.out.println("현재 속도 : " + speed );			
			}
			
			else if (keycode == 50 ) {
				speed -= 5; 
				System.out.println("현재 속도 : " + speed );
				
			}
			else if (keycode == 51) {
				run = false;
				System.out.println("크루즈 기능이 종료 됩니다.");
				System.out.println("현재 속도 :" + speed );
				System.out.println("안전운전 하세요!!!" );
				break;
				
			}
			run = false ;
			System.out.println("프로그램 종료 ");
			break;
			
		} //while문 종료 
	
				
		
		
	} // 메소드 종료 

}
