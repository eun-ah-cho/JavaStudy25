package ex3;

import java.util.Scanner;

public class ArrayDrinkExam {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("=====음료등록 프로그램=====");
		System.out.println("음료가 몇종류인지 입력해주세요.");
		System.out.print(">>> ");
		int count = input.nextInt();
		System.out.println(count+"가지 종류의 음료를 등록하겠습니다.");
		System.out.println();
		
		String[] names = new String[count];
		int[][] drinks = new int[count][2];
		
		Add(names, drinks, count);
		
		boolean run = true;
		boolean runBuy = true;
		boolean runAdm = true;
		
		System.out.println();
		System.out.println("=====자판기 프로그램 시작=====");
		
		while (run) {
			System.out.println("1.음료별 재고 확인하기\n2.음료 구매하기\n3.관리자 호출하기\n4.자판기 종료하기");
			System.out.print(">>> ");
			int ansBuy = input.nextInt();
			switch (ansBuy) {
			case 1:
				System.out.println();
				System.out.println("음료별 재고 확인 메뉴입니다.");
				System.out.println();
				System.out.println("각 음료별 재고를 알려드리겠습니다.");
				for (int i = 0; i < count; i++) {
					System.out.println(names[i] + " : " + drinks[i][0] + "개");
				}
				System.out.println("입니다.");
				System.out.println("자판기 초기화면으로 돌아갑니다.");
				System.out.println();
				break;
			case 2:
				System.out.println();
				System.out.println("음료의 구매를 진행합니다.");
				System.out.println();
				System.out.println("음료목록을 보시고, 1~"+count+" 사이의 번호를 입력해주세요.");
				System.out.println();
				for(int i = 0; i<count ; i++) {
					System.out.println((i+1)+". "+names[i]);
				}
				while (runBuy) {
					System.out.print(">>> ");
					int num = input.nextInt();
					if (num >= 1 && num <= count) {
						if (drinks[num - 1][0] == 0) {
							System.out.println("재고가 남아있지 않은 음료입니다. 다른 음료를 골라주세요.");
							System.out.println();
						} else {
							System.out.println(num + ". " + names[num - 1] + "을(를) 고르셨습니다.");
							System.out.println(names[num - 1] + "의 가격은 " + drinks[num - 1][1] + "원 입니다.");							
							System.out.println("결제방법은 어떻게 하시겠습니까?");
							System.out.println("1.신용카드\n2.현금\n3.계좌이체");
							System.out.print(">>> ");
							int pay = input.nextInt();
							
							switch(pay) {
							case 1 :
								System.out.println("카드 투입구에 신용카드를 넣어주세요.");
								System.out.println("결제중입니다......");
								System.out.println("결제 완료되었습니다.");
								drinks[num-1][0] = drinks[num-1][0]-1;
								break;
							case 2 :
								System.out.println("현금 투입구에 현금을 넣어주세요.");
								System.out.println("결제 완료되었습니다.");
								drinks[num-1][0] = drinks[num-1][0]-1;
								break;
							case 3 :
								System.out.println("계좌이체를 선택하셨습니다.");
								System.out.println("계좌번호 'xxxxxxxxxxxx'로 "+drinks[num-1][1]+"원을 이체해주세요.");
								System.out.println("계좌이체 확인중입니다......");
								System.out.println("계좌이체 확인완료. 결제 완료되었습니다.");
								drinks[num-1][0] = drinks[num-1][0]-1;
								break;
							} // switch(pay)문 종료
							runBuy = false;
							run = false;
						}

					} else {
						System.out.println("1~" + count + " 사이의 번호로 다시 입력해주세요.");
						System.out.println();
					}
				} // while(runBuy)문 종료
				break;
			case 3:
				System.out.println("관리자 호출 메뉴를 선택하셨습니다.");
				System.out.println("관리자의 전화번호는 010-xxxx-xxxx 입니다.");
				System.out.println("불편을 끼쳐드려 죄송합니다.");
				run = false;
				break;
			case 4:
				System.out.println("자판기 프로그램을 종료합니다.");
				System.out.println("다음에 다시 이용해주세요!!");
				run = false;
				break;
			case 1111:
				System.out.println("관리자 메뉴입니다.");
				System.out.println("관리자 메뉴에 진입하려면 비밀번호를 입력해주세요!!!");
				System.out.print(">>> ");
				int pw = input.nextInt();
				
				if(pw==9999) {
					System.out.println("비밀번호가 일치합니다.");
					System.out.println("=====관리자 메뉴에 진입합니다.=====");
					while (runAdm) {
						System.out.println("1.메뉴, 가격 및 수량변경\n2.재고보충\n3.통계\n4.구매자 메뉴로 돌아가기");
						System.out.print(">>> ");
						int ansAdm = input.nextInt();
						switch (ansAdm) {
						case 1:
							System.out.println("변경할 음료의 이름을 입력해주세요.");
							System.out.print(">>> ");
							String name = input.next();

							for (int i = 0; i < count; i++) {
								if (name.equals(names[i])) {
									System.out.print("수정할 메뉴를 입력해주세요 : ");
									names[i] = input.next();
									System.out.print(names[i] + "의 수량을 입력하세요 : ");
									drinks[i][0] = input.nextInt();
									System.out.print(names[i] + "의 가격을 입력하세요 : ");
									drinks[i][1] = input.nextInt();
									System.out.println("수정이 완료되었습니다!");
									System.out.println(names[i] + "의 수량 : " + drinks[i][0] + "개");
									System.out.println(names[i] + "의 가격 : " + drinks[i][1] + "원");
									System.out.println("관리자 메뉴로 돌아갑니다.");
								}
							}
							break;
						case 2:
							System.out.println("재고보충 메뉴입니다.");
							System.out.println("재고보충할 음료의 이름을 입력해주세요.");
							System.out.print(">>> ");
							String name1 = input.next();

							for (int i = 0; i < count; i++) {
								if (name1.equals(names[i])) {
									System.out.print("보충할 " + names[i] + "의 수량을 입력하세요 : ");
									drinks[i][0] = drinks[i][0] + input.nextInt();
									System.out.println("재고보충이 완료되었습니다!");
									System.out.println(names[i] + "의 수량 : " + drinks[i][0] + "개");
									System.out.println("관리자 메뉴로 돌아갑니다.");
								}
							}
							break;
						case 3:
							System.out.println("통계 메뉴입니다.");
							System.out.println("현재 남아있는 모든 음료가격의 총합을 알려드리겠습니다.");
							int sum = 0;
							for (int i = 0; i < count; i++) {
								sum = sum + (drinks[i][0] * drinks[i][1]);
							}
							System.out.println("모든 음료가격의 총합 : " + sum);
							System.out.println("관리자 메뉴로 돌아갑니다.");
							break;
						case 4:
							System.out.println("구매자 메뉴로 돌아갑니다.");
							runAdm = false;
							break;
						} // switch(ansAdm)문 종료
					} // while (runAdm)문 종료
					
					
				}else {
					System.out.println("비밀번호를 틀리셨습니다.");
					System.out.println("보안을 위해 비밀번호를 한번이라도 틀리면 프로그램을 종료합니다.");
					run = false;
				}
				break;
			default :
				System.out.println("메뉴에 있는 번호중에 하나를 입력해주세요.");
				break;
			} // switch(ans)문 종료
		} // while(run)문 종료
		
		
		
		
		
		
		

	} // main 메서드 종료

	
	static void Add(String[] names, int[][] drinks, int count) {
		Scanner input = new Scanner(System.in);
		
		for(int i=0 ; i<count ; i++) {
			System.out.println("음료의 이름을 입력하세요.");
			System.out.print(">>> ");
			names[i] = input.next();
			
			System.out.println(names[i]+"의 수량을 입력하세요.");
			System.out.print(">>> ");
			drinks[i][0] = input.nextInt();
			
			System.out.println(names[i]+"의 가격을 입력하세요.");
			System.out.print(">>> ");
			drinks[i][1] = input.nextInt();
			
			System.out.println(names[i]+"의 수량 : "+drinks[i][0]+"개");
			System.out.println(names[i]+"의 가격 : "+drinks[i][1]+"원");
			System.out.println();
		}
		System.out.println("각 음료별 수량과 가격 입력이 완료되었습니다.");
		
	} // 음료등록 메서드 종료

}
