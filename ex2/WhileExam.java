package ex2;

import java.util.Scanner;

public class WhileExam {

	public static void main(String[] args)  {
		// while 문은 조건식이 true일 때만 반복한다. 종료 원할시 false 처리를 한다. <무한반복용> 코드 작성시 사용 . 
		
		Scanner inputInt = new Scanner(System.in); //정수용 
		Scanner inputChar = new Scanner(System.in); //문자용 
		boolean run = true; // 무한 반복용 변수 
				
		
		
		while(run) {
			
			System.out.println("======엠비씨 성적처리======");
			System.out.println("1. 교직원 관리");
			System.out.println("2. 학생 관리");
			System.out.println("3. 성적 관리");
			System.out.println("9. 프로그램종료");
			System.out.print("1~9 >>>>>");
			int selectInt = inputInt.nextInt(); //숫자 입력 
			
			switch(selectInt) { //키보드로 입력된 숫자를 판단하여 분기 
			
			case 1 : // create(생성) read(읽기) update(수정) del(삭제) 기법에 맞출것. 
				boolean subrun = true; 
				while (subrun) {
					System.out.println("[[[[[교직원관리메뉴로 진입]]]]]");
					System.out.println("a. 교직원등록 ");
					System.out.println("b. 교직원보기 ");
					System.out.println("c. 교직원수정 ");
					System.out.println("d. 교직원삭제 ");
					System.out.println("z. 교직원관리메뉴종료");
					
					System.out.print("입력해 주세요>>>>>>>");
					char subSelect = inputChar.next().charAt(0); 
					//문자열로 입력된 값중에 맨앞 문자만 subSelect 변수에 넣음. 
						
					switch(subSelect) {
					case 'a' : 
					case 'A' :
						
						System.out.println("교직원 등록메뉴로 진입");
						break;
					
					case 'b' : 
					case 'B' :
						
						System.out.println("교직원 보기메뉴로 진입");
						break;	
						
					case 'c' : 
					case 'C' :
						
						System.out.println("교직원 수정메뉴로 진입");
						break;
						
					case 'd' : 
					case 'D' :
						System.out.println("교직원 삭제메뉴로 진입");
						break;
						
					case 'z' : 
					case 'Z' :
						System.out.println("교직원 메뉴를 종료합니다.");
						subrun = false;
						break;			
					
						
					default :
						 System.out.println("값을 다시입력하세요 ");
						break; 
						
						
					
					}//스위치 종료 
								
									
				}//와일문 종료 
				break;
				
			case 2 : 
				System.out.println("==학생관리메뉴로 진입==");
				break;
			case 3 : 
				System.out.println("==성적관리메뉴로 진입==");
				break;
			case 9 : 
				System.out.println("==프로그램 종료==");
				run = false;
				break;
			
				default :
				 System.out.println("값을 다시입력하세요 ");
				break;
				
				
			} //스위치문 종료 
			
			
			
		} // while문 종료 
		
		
		
		
		
	} //메인 종료

}
