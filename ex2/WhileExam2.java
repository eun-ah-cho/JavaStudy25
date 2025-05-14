package ex2;

import java.util.Scanner;

public class WhileExam2 {

	public static void main(String[] args) {
		Scanner inputInt = new Scanner(System.in); //정수
		Scanner inputChar = new Scanner(System.in); //문자용
		Scanner inputString = new Scanner(System.in); //문자열 
		System.out.println("MBC 성적처리 시스템에 오신것을 환영합니다.");
		
		boolean run = true; 
		while(run) { //메인 while 시작 
			System.out.println("========================");
			System.out.println("1. 교직원 관리"); System.out.println("2. 학생 관리"); System.out.println("3. 성적 관리");System.out.println("9. 프로그램종료");
			System.out.println("========================");
			System.out.print("<<<<<1~9 중에 숫자를 입력 하세요>>>>> :");
		
			int selectInt = inputInt.nextInt(); //입력시 위까지 무한반복
			
			// 입력한 숫자대로 항목 들어감. 생성, 읽기, 수정, 삭제 기법에 맞추자. 
			switch(selectInt) { 
			
			case 1 :  //1번 메뉴로 들어옴. 교직원관리 
				boolean sawon = true; 
					while(sawon) {
						System.out.println("[[[[[교직원 관리메뉴]]]]]");
						System.out.println("a.교직원등록 ");
						System.out.println("b.교직원보기 ");
						System.out.println("c.교직원수정");
						System.out.println("d.교직원삭제");
						System.out.println("z.교직원관리메뉴종료");
						System.out.print("[원하는 메뉴를 입력해 주세요] : ");
						char subSelect = inputChar.next().charAt(0);
						
							switch(subSelect) { // case1-a-switch 시작
							case 'A' :
							case 'a' :
							System.out.println("<교직원 등록 메뉴>");System.out.print("이름:");String inputName = inputString.next();
							System.out.print("나이:"); String inputage = inputString.next();
							System.out.print("담당과목:"); String inputsubject = inputString.next();
							System.out.print("연락처:"); String inputphon = inputString.next();								
							System.out.println("이름:" + inputName + "/"+ "나이:" + inputage + "/"+ "담당과목:" + inputsubject + "/"+ "연락처:" + inputphon);
							System.out.println("맞습니까?(yes or no 선택) : ");
							
							String yesorno = inputString.next();
							boolean run1 = true;
							while(run1) { //case1-a-switch-while에서 yes일때 완료처리 
								
								if(yesorno.equalsIgnoreCase("yes")) {
								System.out.println(inputName + "님의 교직원 등록이 완료 되었습니다. ");
								break;
							}//if문종료 
							
							System.out.println("다시입력하세요");
							run1 = false;
							break;	}//case1-a-switch-while에서 yes일때 종료 															
							
					
						case 'B' :
						case 'b' :
							System.out.println("b.교직원보기 입문");
							break;
						
						case 'C' :
						case 'c' :
							System.out.println("c.교직원수정 입문");
							break;
						
						case 'D' :
						case 'd' :
							System.out.println("d.교직원삭제 입문");
							break;
						
						case 'Z' :
						case 'z' :
							System.out.println("메뉴가 종료 되었습니다.");
							break;
							
						default :
								System.out.println("값을다시 입력하세요");
								
						
						}// case1-while-switch종료 
								
					}							
				
					
					case 2 :  //2번 메뉴로 들어옴. 학생관리  
						boolean hak = true; 
						while(hak) {
							System.out.println("[[[[[학생 관리메뉴]]]]]"); System.out.println("a.학생등록 "); System.out.println("b.학생보기 "); System.out.println("c.학생수정"); System.out.println("d.학생삭제"); System.out.println("z.교직원관리메뉴종료");
							System.out.print("[원하는 메뉴를 입력해 주세요] : ");
							char subSelect1 = inputChar.next().charAt(0);
				
							switch(subSelect1) { // case2-a-switch 시작
							case 'A' :
							case 'a' :
							System.out.println("<학생 등록 메뉴>"); System.out.print("이름:"); String inputName = inputString.next();
							System.out.print("학번:"); String inputage = inputString.next();
							System.out.print("연락처:"); String inputphon = inputString.next();
							System.out.println("이름:" + inputName + "/"+ "학번:" + inputage + "/"+ "연락처:" + inputphon);
					
					System.out.println("맞습니까?(yes or no 선택) : ");
					String yesorno1 = inputString.next();
					boolean run2 = true;
					while(run2) {
						
						if(yesorno1.equalsIgnoreCase("yes")) {
						System.out.println(inputName + "님의 학생 등록이 완료 되었습니다. ");
						break;}
										
					System.out.println("다시입력하세요");
					
					run2 = false;
					break;}															
					
					
				case 'B' :
				case 'b' :
					System.out.println("b.교직원보기 입문");
					break;
									
				case 'C' :
				case 'c' :
					System.out.println("c.교직원수정 입문");
					break;
				
				case 'D' :
				case 'd' :
					System.out.println("d.교직원삭제 입문");
					break;
				
				case 'Z' :
				case 'z' :
					System.out.println("메뉴가 종료 되었습니다.");
					break;
					
				default :
						System.out.println("값을다시 입력하세요");
						break;
				
				}// case2 스위치 종료 
				
				}//case2 while 종료 
				
									
							case 3 :  //3번 메뉴로 들어옴. 성적관리
							
											
								}							
						}
						
						
					
					
			}//메인 스위치 종료 
			
			
			
			System.out.println("프로그램을 종료합니다.");
			run = false;
			break;	}//While문 종료 
		
		

	}//메서드 

}
// 개선점 : 메뉴에서 처리가 되면 다시 돌아갈때 맨처음으로 돌아가지 않고 그다음 메뉴처음으로 돌아감 