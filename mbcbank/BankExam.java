package mbcbank;

import java.util.Scanner;

import mbcbank.DTO.AccountDTO;
import mbcbank.DTO.HanaAccountDTO;
import mbcbank.service.HanaBankService;
//부모 : Acccount | 자식 : DTO, Service , Exam 
 


public class BankExam {
	// 필드
	public static Scanner inputInt = new Scanner(System.in);
	public static Scanner inputStr = new Scanner(System.in);
	
	public static HanaAccountDTO[] hanaBank =  new HanaAccountDTO[10];
	public static AccountDTO session = null;
	
	// 생성자 -> 정적블럭 (main메서드 초기화 값)
	static {
		HanaAccountDTO accountDTO0 = new HanaAccountDTO("1234","김기원",3000000,"하나");
		hanaBank[0] =  accountDTO0;
		}
	
	
	// 메서드
	public static void main(String[] args) {
		// 기본값 입력 더미데이터 출력용 코드 -> toString 오버라이딩으로 볼수 있다.
		//System.out.println("하나은행 더미데이터 출력 테스트 : " + hanaBank[0]);

		
		boolean run = true; // 주메뉴 반복용
		while(run) {
			System.out.println("=============================");
			System.out.println("MBC코인시스템에 오신것을 환영합니다.");
			System.out.println("=============================");
			System.out.println("1. 하나은행");
			System.out.println("2. 우리은행(보수중)");
			System.out.println("3. 농협은행(보수중)");
			System.out.println("4. 프로그램 종료");
			System.out.print(">>>");
			String select = inputStr.next();
			switch(select) {
			case "1" :
				System.out.println("하나은행으로 진입합니다.");
				
				HanaBankService hanaBankService = new HanaBankService();
				hanaBankService.menu(inputInt, inputStr, hanaBank);
				
				break ;
			case "2" :
				System.out.println("우리은행으로 진입합니다.");
				//WoriBankService woriBankService = new WoriBankService();
				//woriBankService.menu(inputInt, inputStr, hanaBank);
				break ;
			case "3" :
				System.out.println("농협은행으로 진입합니다.");
				//NhBankService nhBankService = new NhBankService();
				//nhBankService.menu(inputInt, inputStr, hanaBank);
				break ;
		
			case "4" :
				System.out.println("프로그램을 종료합니다.");
				run = false ;
				break ;
			default :
				System.out.println("1~4값만 입력하세요");
				break;
			} // 메뉴 선택문 종료 (switch)
			
			
			
			
		}// 주메뉴 종료(while)
		
		
	}// 메서드 종료 (main())

} // 클래스 종료 (BankExam)
