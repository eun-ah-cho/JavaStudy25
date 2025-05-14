package ex2;

public class SwitchExam1 {

	public static void main(String[] args) {

		int num = (int)(Math.random()*6 ) +1 ;
		System.out.println("주사위 랜덤");
		
		switch (num) { //스위치 시작
		case 1 :
			System.out.println("1번이 나왔습니다.");
			break;
		case 2 : 
			System.out.println("1번이 나왔습니다.");
			break;
		case 3 : 
			System.out.println("3번이 나왔습니다.");
			break;
		case 4 :
			System.out.println("4번이 나왔습니다.");
			break;
		case 5 :
			System.out.println("5번이 나왔습니다.");
			break;
		case 6 : 
			System.out.println("6번이 나왔습니다.");
			break;
			
		default :
			System.out.println("시스템 오류 다시 돌려주세요");
			break;
		
		} //스위치 종료 
		
		
		
		
		
		
		
		
	}// 메서드종료

}
