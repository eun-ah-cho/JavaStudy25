package ex3;

import java.util.Scanner;

public class ArranyInsaExam {
	// 인사정보 시스템을 만들어 보자.
	
	public static void main(String[] args) {
		
		Scanner inputInt = new Scanner(System.in);
		Scanner	inputStr = new Scanner(System.in);
//		String[] teams = new String[count]; //팀명
//		String[] person = new String[count]; //사원이름
//						
//				int[] services  = new int [count]; //고객 관리 및 대응 점수
//				int[] tests = new int[count];   //자격증 및 시험 점수 
//				int[] works = new int[count];  // 업무 능력 점수 
//				
		
		boolean run = true;
		while(run) {
		System.out.println("======ILJin(주) 인사정보시스템======");
		System.out.println("1.개인정보 | 2.평가 | 3.KPI | 4.연봉 | 99.팀장권한(관리자모드) | 11.나가기 ");
		System.out.print("원하시는 항목의 숫자를 입력해주세요.:");
		int select = inputInt.nextInt();	
		
		switch(select) {
		case 1 : 
			
			System.out.println("===개인정보 화면 입니다.===");
			System.out.print("사번을 입력해주세요.:");
			String sabun = inputStr.next();	
			System.out.println("");
			//개인정보 메서드 만들어서 이동 
//			if(sabun ==)
//			//int ipsa = Integer.parseInt(sabun.substring(0,2));
//		
		
		
		break;
		case 2 : System.out.println("===KPI 화면 입니다.===");
		// 사번입력후 kpi 모드이동 kpi메서드 만들기 
		break;
		case 3 : System.out.println("===연봉 화면 입니다.===");
		// 사번입력 
		break;
		case 4 : System.out.println("===고과평과 화면===");
		break;
		
		
		case 99 : 
			
			System.out.println("인사정보시스템을 종료 하겠습니다.");
			run = false ;
			break;
		
		default :
			System.out.print("잘못 입력 하였습니다. 다시 입력해 주세요.:");
			int reselect = inputInt.nextInt();
			}//스위치문 종료

		
		}//while문 종료 
		
		
			} //메인메서드 종료

} //클래스 종료 
