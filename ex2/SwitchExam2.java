package ex2;

public class SwitchExam2 {

	public static void main(String[] args) {
		
		int time = (int)(Math.random()* 6 ) +6;
		System.out.println("[현재시간은 : am  " + time + "시]");
		
		switch(time) { //스위치 시작
		case 6 :
		System.out.println("쿨쿨 자는중");
		case 7 :
			System.out.println("일어나서 머리감고 밥먹는중");
		case 8 :
			System.out.println("아침밥 준비후 시헌이를 깨우자");
		case 9 : 
			System.out.println("학원 가는중 ");	
		case 10 : 
			System.out.println("학원 수업중");		
		
		}//스위치 종료 
		
		
		
		
		
		
		
		
	}//메인 종료

}
