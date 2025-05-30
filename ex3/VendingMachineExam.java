package ex3;

import java.util.Scanner;

public class VendingMachineExam {  //탄산음료 자판기 

	public static void main(String[] args) {
	
						
		Scanner inputInt = new Scanner(System.in);
		Scanner inputStr = new Scanner(System.in);
		String [] Bevsoda = {"사이다", "콜라", "환타","웰치스", "닥터페퍼"} ;
		int [] oldmember = { 1234, 7536 } ;
		int [] Amount = {1000, 1200, 1500, 1700, 2000 };
		String [] SelectBev = new String [0] ;
		int sum = 0;
		String adminid = "조은아";
		String adminpw = "1234";
		
		
		
		boolean run = true;
		while(run) {
		System.out.println("\n=============탄산음료 자판기 프로그램=============");
		System.out.println("1.관리자 모드 |2. 구매 |99. 사용종료");
		System.out.print(">>>>");
		int input = inputInt.nextInt();
		
		switch(input) {
		case 1 : //아이디 비번 입력후 관리자모드 들어가기 
				System.out.println("관리자모드 입장시 아이디와 패스워드를 입력해 주세요");
				System.out.print("id를 입력하세요 : "); 
				String id = inputStr.next(); //아이디 : 조은아 
				System.out.print("pw를 입력하세요 : "); 
				String pw = inputInt.next(); //패스워드 : 1234
				
				if(adminid.equals(id) == adminpw.equals(pw)) {
				
				adminMode(Bevsoda, Amount); //관리자모드 메소드 
				}
				else {
					System.out.println("틀렸습니다. 다시입력해 주세요");
				}
				
				break;
		
				
		case 2 :
				System.out.println("<구매 모드에 들어오셨습니다. 1번부터 순서대로 입력해야 순서대로 진행됩니다.>"); //2.구매자모드 선택후 입장.
				System.out.println("1)회원유무 | 2)주문  | 3)결재  | 99) 사용종료");
				System.out.print("번호를 선택해주세요 :"); 
				int Buynum = inputInt.nextInt();  
				String select1 ="";
				
				switch(Buynum) { 
				case 1 : //2-1회원유무 진행. 회원여부 확인후 주문이동. 아이디업으면 가입후 이동 
						buyMember(oldmember);
						
				case 2 : //2-2 주문 선택시 
				
						System.out.println(Bevsoda[0] + "|" + Bevsoda[1] + "|" + Bevsoda[2] +"|" + Bevsoda[3] + "|"	 + Bevsoda[4] + "|" );							
						System.out.print("어떤 음료를 주문 하시겠습니까? :");
						String select= inputStr.next();						
					    System.out.print("수량을 입력해주세요. :");
						select1 = inputStr.next();
						System.out.println(select + " " + select1 + "개 주문하셨습니다.");
						
				case 3 : 
						payMember(Bevsoda, SelectBev, Amount, select1);
												
				case 99 : //사용종료 					
				}								
				break; 
				
				default :
				run = false;
				System.out.println("<사용 종료 되었습니다.>");
					}//스위치문 종료 
		
				}//while문 종료 

		}//**메인메서드 종료 

	

	private static void adminMode(String[] Bevsoda, int[] Amount ) { //id,pw 입력후 관리자모드 
	
		 Scanner inputInt = new Scanner(System.in);
	 	 Scanner inputStr = new Scanner(System.in);
	 		 	
	 	boolean run = true; 
	 	
		
		while(run) {
			System.out.println("\n <관리자 모드에 들어오셨습니다.>");
			System.out.println("1)메뉴변경 | 2) 메뉴삭제 | 3)금액수정  | 99) 사용종료");
			System.out.print(">>>>");
			int input = inputInt.nextInt();
			
		switch(input) {
			case 1 : //메뉴변경모드 - 메뉴바꾸기 
				System.out.println("음료 메뉴변경 모드로 들어오셨습니다.");
				System.out.println("어떤 메뉴를 변경 하시겠습니까?");
				System.out.println("사이다 / 콜라 / 환타 / 웰치스 / 닥터페퍼 ");
				System.out.print(">>>>");
				String input1 = inputStr.next(); //바꿀 음료수 적기 ex)사이다
				

				for(int i=0 ; i < Bevsoda.length ; i++) {
			
				if(input1.equals(Bevsoda[i])) {
					System.out.print("변경할 음료를 기재하세요 : ");  // 마운틴듀
					String changeBev = inputStr.next();
					Bevsoda[i]=changeBev;				
					}
				
					System.out.print(Bevsoda[i] + " |");	
					
				} 
				break;	
				
				
			case 2 : //관리자 모드 - 메뉴 삭제 				
									
					if(run) {

						System.out.println("\n음료 삭제 모드로 들어오셨습니다.");
						System.out.println("어떤 메뉴를 삭제 하시겠습니까?");
						System.out.println(Bevsoda[0] + " |"+Bevsoda[1] + " |"+Bevsoda[2] + " |"+Bevsoda[3] + " |"+Bevsoda[4] + " |");
						System.out.print(">>>>");
						String input2 = inputStr.next(); //삭제할 음료수 적기 ex)사이다
						
						int count = Bevsoda.length;
							for(int i=0 ; i < Bevsoda.length ; i++) {
								if(input2.equals(Bevsoda[i])) {
								System.out.println(input2 +"를 삭제합니다.");
									for(int j =i; j<count-1;j++) {
									Bevsoda[j]=Bevsoda[j+1];
									Bevsoda[j+1] = null;
								}
								count--;
								run=true;
							}
						}
							if(run) {
								for(int i= 0; i<count;i++) {
								System.out.print(Bevsoda[i]+"|");
							
								}
								break;				
						}
					}
					
					else  {
							System.out.println("삭제할 음료가 없습니다.");
						}
		
		case 3 : //금액변경 
			System.out.println("음료 금액변경 모드로 들어오셨습니다.");
			System.out.println("1."+Bevsoda[0] + Amount[0] +"원 |"+"2." +Bevsoda[1] + Amount[1] + "원 |"+"3."+Bevsoda[2] + Amount[2] + "원 |"+"4."+
			Bevsoda[3] + Amount[3] + "원 |"+Bevsoda[4] + Amount[4] + "원 |");
			
				for(int i=0 ; i < Amount.length ; i++) {
											 
						System.out.print("변경할 음료를 기재하세요 : ");
						System.out.print(Bevsoda[i] + ">>>>");
						int changeAmo = inputInt.nextInt();
						Amount[i]=changeAmo;							
				}
				
			System.out.println(Bevsoda[0] + Amount[0] +"원 |" +Bevsoda[1] + Amount[1] + "원 |"+Bevsoda[2] + Amount[2] + "원 |"+
								Bevsoda[3] + Amount[3] + "원 |"+Bevsoda[4] + Amount[4] + "원 |");
										
				run = false;
								
		case 99 : 
			run = false;
			System.out.println("관리자 모드 종료 하겠습니다. 메인메뉴로 돌아갑니다.");
	
			}//스위치문종료 
		}//while문 종료 
		
		
	}//**관리자모드 메서드 종료 


	
	private static void buyMember( int[] oldmember) { //회원유무메뉴 
		Scanner inputInt = new Scanner(System.in);
	 	Scanner inputStr = new Scanner(System.in);
	 	
	    int point = 1000;
	 	boolean run = true; 
	 			
		System.out.print("회원가입 유무 확인. 핸드폰 뒷자리 4자리 번호 입력해 주세요. :");
		int phone4 = inputInt.nextInt();
		
		if(run) {
		for(int i=0 ; i < oldmember.length ; i++) {
			if(phone4 ==oldmember[i] ) {
				System.out.println(oldmember[i] +"님 환영합니다." + "적립금은" + point + "원이 있습니다.");
				break;
			}
			
			
			else if(phone4 != oldmember[i] ) {
				System.out.print("회원이 아니시네요. 회원가입 하시겠습니까? (yes or no) :");
					String yesorno = inputStr.next();
						if(yesorno.equalsIgnoreCase("yes")) {
							System.out.print("등록할 핸드폰 번호 뒷자리 입력하세요 :");
							int inputnumber = inputInt.nextInt();
							System.out.println(inputnumber + "번호로 회원가입이 되셨습니다.");
				 		break ;
				 		}
					else if(yesorno.equalsIgnoreCase("no")) {
						System.out.println("가입없이 주문 진행하겠습니다.");	
						break;
				 		}
					} //else if종료 
			}//for
		
		}//if 
		return;//case 3부터 진행
		
	}//회원유무 메소드 종료 
	
	
	
	private static void payMember(String[] bevsoda, String[]SelectBev , int[] Amount, String select) {
		
		Scanner inputInt = new Scanner(System.in);
	 	Scanner inputStr = new Scanner(System.in);
	 	boolean run = true;
		System.out.print(">>>결재방식은 무엇으로 할까요? (카드 or 현금) : ");
		String payselect = inputStr.next();
		if(run) {
		if(payselect.equalsIgnoreCase("카드")) {
			System.out.println("...결재중입니다...결재완료되었습니다.");
			System.out.print("적립할까요? (yes or no) : ");
			String yesorno1 = inputStr.next();
					if(yesorno1.equalsIgnoreCase("yes")) {
						System.out.print("50point 적립되었습니다. 맛있게드세요.");
						run =false;
					}				
					
					else if(yesorno1.equalsIgnoreCase("no")) {
						System.out.println("적립하지 않겠습니다. 맛있게드세요.");	
						
					}
						run = false;
					}
			
		else if(payselect.equalsIgnoreCase("현금")) {
				System.out.print("금액을 투입구에 입력후 넣어주세요 :"); //위에서 선택한음료를 결재시 현금을 낸금액 맞춰 계산
				String payselect1 = inputStr.next();
				
					if(payselect1 == select) {
					//사이다로 주문한 값에 현금값 계산하기 ---->여기서부터 시작하기 하다담..ㅠ_ㅠ
					
				}
					
				}
				
				System.out.println("...결재중입니다...결재완료되었습니다.");
				System.out.print("적립할까요? (yes or no) : ");
				String yesorno2 = inputStr.next();
						if(yesorno2.equalsIgnoreCase("yes")) {
							System.out.print("50point 적립되었습니다. 맛있게드세요.");
							run =false;
						}				
						
						else if(yesorno2.equalsIgnoreCase("no")) {
							System.out.println("적립하지 않겠습니다. 맛있게드세요.");	
							
						}
							run = false;
						} //run if문 종료 

			
} //결재 메소드 종료 




	
	
	
	
}//클래스 종료 
