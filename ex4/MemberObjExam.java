package ex4;

import java.util.Scanner;

public class MemberObjExam {

	public static void main(String[] args) {
		//메인메서드! Member 클래스를 호출하여 처리해보자.
	
		Scanner input = new Scanner(System.in);
		Member[] members = null;
		
		System.out.print("가입할 회원수를 입력하세요. :");
		int count = input.nextInt();
		members = new Member[count]; //입력값 
		
		System.out.println("<<<회원가입 시작합니다.>>>");
		
		boolean run =true;
		while(run){
		
			System.out.println("|1.회원가입 | 2.회원전체보기 | 3.로그인 | 4.회원수정 | 5.회원탈퇴 |");
			System.out.println("1~5까지 입력하세요(다른키가 눌리면 꺼집니다.)");
			System.out.print(">>>");
			int select = input.nextInt(); //메뉴 선택값입력 
			
			switch(select) {
			case 1 : 
				Member member1 = new Member(); //객체생성. 메서드생성하려면.
				for(int i=0; i<members.length; i++) { //입력한값까지 memberAdd메소드정보 출력 
					member1 = member1.memberAdd(input);
					members[i] = member1;					
				}
				break;				
			
			case 2 :
				Member member2 = new Member(); //객체생성. 메서드생성하려면.
				member2.memberAllList(members);
				break;
				
			case 3 :
				Member member3 = new Member();
				member3.memberLogin(members,input);				
				break;
				
			case 4 :
				Member member4 = new Member();
				member4.memberUpdate(members, input);
				break;
			
			case 5 :
				Member member5 = new Member();
				member5.memberDelete(members, input);
				break;
				
				
			default :
				System.out.println("회원가입 프로그램 종료");
				run = false;
			
			}//스위치문 종료 
			
			
		}//와일문 종료 
		
	}

}
