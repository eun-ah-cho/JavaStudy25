package ex2;
/*성적처리용 프로그램을 메서드로 재구현 
메인 메서드에서는 주 메뉴를 구현
사용자 지정 메서드는 부 메뉴 구현*/ 
import java.util.Scanner;

public class MethodExam1 {

	public static void main(String[] args) {
		
		
		Scanner inputInt = new Scanner(System.in);
		boolean run =true;  
		String id = "조은아"; String pw = "1234";
		int hakbun = 161120 ;
		boolean session = false ;   // 로그인 상태 저장용 
				
		
		while(run) { 
			
			System.out.println("==== 엠비씨 성적처리용 ====");
			System.out.println("1. 로그인");
			System.out.println("2. 교사관리");
			System.out.println("3. 학생관리");
			System.out.println("4. 성적관리");
			System.out.println("9. 프로그램 종료");
			System.out.print(">>>>>>>>>>>>>>>>>>>>>");
			
			int select = inputInt.nextInt();
			switch (select) { //메뉴 선택 후 입장 
			
			case 1 : 
				System.out.println("로그인 메뉴로 이동합니다. ");
				session = loginOK(id,pw,session);
				break;
				
				
			case 2 : 
				System.out.println("교사관리 메뉴로 이동합니다. ");
				 session = TeaInfo(id,pw,session);
				 break;
			case 3 : 
				System.out.println("학생관리 메뉴로 이동합니다. ");
				session = Stuinfo(id,hakbun,session);
				break;
				
			case 4 : 
				System.out.println("성적관리 메뉴로 이동합니다. ");
				session = Jumsuinfo(id,hakbun,session);
				break;
				
			case 5 : 
				System.out.println("프로그램 종료 합니다. ");
				run = false;
				break;
				
		 } //스위치문 종료 
	
		} //while문 종료 
		
	} //메인메서드 종료 

	
	 static boolean loginOK(String id, String pw, boolean session) {  
	
		Scanner inputLogin = new Scanner(System.in);
		System.out.println("로그인 id를 입력하세요 ");
		System.out.print(">>>");
		String inputId = inputLogin.next(); // 커서창 생성. 입력한값 inputId 변수에 들어감. 
		
		System.out.println("로그인 pw를 입력하세요");
		System.out.print(">>>");
		String inputPw = inputLogin.next();
		
		
		if (id.equals(inputId) && pw.equals(inputPw)) {
			System.out.println("id와 pw가 일치합니다.");
			System.out.println("로그인성공!!!"); 
			session = true; 
			
		}else {
			System.out.println("id와 pw가 불일치합니다.");
			System.out.println("로그인실패!!!");} // id pw 판단문 종료 
			session = false;
			
			return session; //로그인 성공과 실패 결과를 리턴 함. 리턴이 있으면 보이드 안되니깐 바꿔줘야함 
			
		
	}//1. 로그인  메서드 종료 
	
	
	 static boolean TeaInfo(String id, String pw, boolean session) {  
		
		Scanner inputLogin1 = new Scanner(System.in);
		boolean run1 = true;
		
		while(run1) {
		
		System.out.print("사번을 입력하세요 : ");
		int sabun = inputLogin1.nextInt(); 
		
			
		if (sabun == 330654) {
			System.out.println("["+id + "님의 관한 정보 입니다.]");
			System.out.println("거주지: 경기도 안양시 동안구 평촌동\n나이: 38세 \n담당과목 : 데이터베이스 \n경력:5년 \n" );
			session = true; 		
			return session;
		}
			
		else {
			System.out.println("사번이 틀렸습니다.");
			continue; 
			
			
			}
			
		}
		return session;
			
		
	}//2. 교사관리  메서드 종료 
	
	 static boolean Stuinfo(String id, int hakbun, boolean session) {  
		
		Scanner inputLogin2 = new Scanner(System.in); 
		boolean run1 = true; 
		while(run1) {
		
		System.out.print("학번을 입력하세요 : ");
		int hakbun1 = inputLogin2.nextInt(); 
		
			
		if (hakbun1 == hakbun) {
			System.out.println("["+id + "님의 관한 학생정보 입니다.]");
			System.out.println("\n거주지: 경기도 안양시 동안구 평촌동\n나이: 20세\n학과 : 전자공학 \n입학년도:2016년\n" );
			session = true; 
			return session;
	 		}	
		else {
			System.out.println("학번이 틀렸습니다.");
			
			continue; 
			}
		}
		
			return session;
		
		
			
	}//3. 학생관리 메서드 종료 
	
	 static boolean Jumsuinfo(String id, int hakbun, boolean session) {  

		 
		Scanner inputLogin2 = new Scanner(System.in); 
		boolean run2 = true; 

		while(run2) {

		System.out.print("관리 하고자 하는 학번을 입력하세요 : ");
		int hakbun1 = inputLogin2.nextInt(); 
							
			if (hakbun1 == hakbun) {
			
			System.out.println("["+id + "님의 관한 성적정보 입니다.]");
			System.out.println("\nC++: B\nJAVA: A\nDataBase: A++ \n교양: P\n" );
						
			System.out.print("[1.종료하기] [2.전단계로 돌아가기] :");
			int suntak = inputLogin2.nextInt();
						
			if (suntak == 2) {
				continue;
			}
			else { 
				System.out.println("종료 되었습니다."); 
				break;	
			}
			
		}//성적if문 종료
		
		else {
			System.out.println("학번이 틀렸습니다.");
			session = false;
			}
			
		}//while문 종료
		
		
			return session;
			
	 }//3. 학생관리 메서드 종료 


} // 클래스 종료 