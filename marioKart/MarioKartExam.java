package marioKart;
import java.util.Scanner;

import marioKart.dto.*;


//마리오카트 게임을 만들어보자~ 할수이뜨아 
//MBC 패턴을 이용해서 마리오카트 프로그램 제작 DTO : 객체용 (Data Transfer Object) service : 부메뉴용
//c-r-u-d, 따로뺸 메서드들 main() : 컨트롤러용 (주메뉴, 분기담당) static : 고정=정적
public class MarioKartExam { 
	
	public static Scanner input = new Scanner(System.in); 
	
	public  static MemberDTO[] memberDTOs = new MemberDTO[10]; //회원관련 객체
	public  static MemberDTO loginState ; //로그인 성공시 객체가지고 있는 용도. 호출용! 
			 
	/* 예를 들어 게임에서: 로그인 성공 → 그 사람의 정보를 저장
    이후 메뉴에서 "내 정보 보기", "아이템 장착", "로그아웃" 같은 기능을 사용할 때 누가 로그인했는지 모르면 불가능!
   따라서 로그인 성공 시, 해당 사용자의 정보를 이 loginState에 저장하고, 그 이후 기능들에서 이 값을 계속 사용 */

  public  static CharacterDTO[] characterDTOs = new CharacterDTO[15]; //캐릭터 객체 
  public  static CartDTO[] cartDTOs = new CartDTO[8]; //카트 객체 
  public  static GliderDTO[] gliderDTOs = new GliderDTO[10]; //글라이더 객체 
  public  static TireDTO[] tireDTOs = new TireDTO[10];  //타이어 객체 
  public  static ItemDTO[] ItemDTOs = new ItemDTO[10]; //아이템 객체 
	
static {
	//미리 정의된 캐릭터 
	 CharacterDTO CharacterDTO0 = new CharacterDTO("마리오", 3.0, 4.5,3.7, 4.1, 3.8);
	 CharacterDTO CharacterDTO1 = new CharacterDTO("루이지", 3.0, 4.5,3.7, 4.1, 3.8);
	 CharacterDTO CharacterDTO2 = new CharacterDTO("와리오", 3.0, 4.5,3.7, 4.1, 3.8);
	 CharacterDTO CharacterDTO3 = new CharacterDTO("피치", 3.0, 4.5,3.7, 4.1, 3.8);	
	
	 //객체를 배열에 넣어서 관리 
	 characterDTOs[0] = CharacterDTO0; 
	 characterDTOs[1] = CharacterDTO1;
	 characterDTOs[2] = CharacterDTO2;
	 characterDTOs[3] = CharacterDTO3;
	
	
	 //미리 정의된 회원 
	 MemberDTO memberDTO0 = new MemberDTO("kkw", "1234", "기원씨","kkw@gmail.com", characterDTOs[3]); 
	 MemberDTO memberDTO1 = new MemberDTO("osh", "1234", "승환씨","osh@gmail.com",characterDTOs[1]);
	 MemberDTO memberDTO2 = new MemberDTO("phs", "1234","희진씨","phs@gmail.com", characterDTOs[0]);
	 
	 memberDTOs[0] = memberDTO0; 
	 memberDTOs[1] = memberDTO1;
	 memberDTOs[2] = memberDTO2;
	 //객체 생성완료 실행하면값을넣기

}

		 
		 
		 //***메인메서드***주메뉴***
		 public static void main(String[] args) {
			 
			 System.out.println("==========Mario Kart Game====부아앙~======");
			 
			 boolean run = true;
			  while(run) {
				  System.out.println("1.회원관리 | 2. 카트관리 | 3.게임실행 | 4.게임종료");
				  System.out.print(">>>>>");
				  int select = input.nextInt();
				  
				 switch(select) {
				 
				 case 1 : 
					 
					 System.out.println("      [회원관리 클래스 진입]      ");
					 MemberService memberService = new MemberService();
					 loginState = memberService.menu(input, memberDTOs, loginState);					 
					 break;
					
					 
				case 2 : 
					System.out.println("      [카트관리 클래스 진입]      ");
					 break;
					 
				
				case 3 :
					System.out.println("      [게임실행 클래스 진입]      ");
					break;
			    case 4 : 
					System.out.println("=======게임종료.B.Y.E=======");
					run = false;
					
					break;		    	
			    
			    	default:
			    		System.out.println("1~4번 숫자으로 다시 입력:");
					 
					 
				 }//스위치종료
			  
			  }//while종료 
		 }//메인메서드 종료
			 



}//클래스 종료 
	