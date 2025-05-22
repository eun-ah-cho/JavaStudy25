package ex4;

import java.util.Scanner;

public class Member {
	/*클래스의 기본속성이 3가지 필요함. <!필드,생성자,메서드!>	  
	  필드(변수=속성=전역변수=지역변수):객체가 가지고 있어야 할 값(사람이라는 객체에서 가지고있는 성별,나이,혈액형이르는것들..)
	  생성자: main()메서드에서 new로 호출할 때 동작.
	  메서드(동작): Member클래스에서 행해지는 동작들..구성할때 항상 CRUD로 구상!*/
	
	
	//필드(변수)선언 
	public int mno;
	public String id;
	public String pw;
	
	//생성자 선언 
	public Member() {
		//생성자는 클래스명이랑같이 근데 소문자여야하는데 클래스랑같이해서 대문자가능.
		// 기본생성자 : 클래스명과 같은 메서드 클래스명:Member=생성자:Member
	}	
	

	//메서드 선언 메인메서드에서 불러올 메서드들 정보 입력. 
	public Member memberAdd(Scanner input) { 
	//main-1.회원가입, 메인에있는 scanner 쓰기 
		Member member = new Member();
		
		 	System.out.println("===회원가입용 메서드 입니다==="); 
			System.out.println("회원번호를 입력하세요");
			System.out.print("(숫자)>>>>");
			member.mno = input.nextInt();
			
			System.out.println("회원id를 입력하세요");
			System.out.print(">>>>");
			member.id = input.next();
			
			System.out.println("회원pw를 입력하세요");
			System.out.print(">>>>");
			member.pw = input.next();
			
			return member; //void 지움. 메서드 자체를 종료하고 값을 반환하거나 종료만 함
		 }
	
	
	public void memberAllList(Member[] members) { //main-2.회원전체보기
		System.out.println("모든 회원 보기 리스트"); 
			for(int i=0; i < members.length ; i++ ) {
				if (members[i] == null) {
		            continue; // 이번 루프만 건너뛰고 다음 반복으로 진행. 입력한값이 비어있는 칸이면 건너뜀.
		        	}
				System.out.println("회원번호 : " + members[i].mno + ": 회원id : " + members[i].id + " : 회원pw : " + members[i].pw);
				System.out.println("----------------------------------------------------");
				}//입력한 수만큼 움직인뒤 정보들출력 
			}
	
	
	
	public void memberLogin(Member[] members, Scanner input) { //main-3.로그인
		Member member = new Member();
		
		System.out.println("로그인 메서드");
		boolean run = true;
		while(run) {			
		System.out.print("회원id를 입력하세요 :");
		member.id = input.next();
		System.out.print("회원pw를 입력하세요 :");
		member.pw = input.next();
				
		boolean found = false;    
		for (int i = 0; i < members.length; i++) {
		        if (members[i] == null) {
		            continue; // 이번 루프만 건너뛰고 다음 반복으로 진행. 입력한값이 비어있는 칸이면 건너뜀.
		        	}
		        	if (members[i].id.equals(member.id) && members[i].pw.equals(member.pw)) {
		        		System.out.println("로그인 하셨습니다. 환영합니다!!!");
		        		return;
		        	
		        		}
		    	}//for문 종료 
		

		    	if (!found) {
		        System.out.println("일치하지 않습니다. 다시 로그인해주세요.");
		    	}	
			}//while문 종료 		
		}//로그인메서드 종료 
	
	public void memberUpdate(Member[] members, Scanner input) { //main-4.회원수정
		Member member = new Member();
		System.out.println("회원수정 메서드");
		
		while(true) {
		System.out.print("id를 입력하세요 :");
		member.id = input.next();
		System.out.print("비밀번호를 입력하세요 :");
		member.pw = input.next();
		
		boolean found = false;    
		for (int i = 0; i < members.length; i++) {
		        if (members[i] == null) {
		            continue; // 이번 루프만 건너뛰고 다음 반복으로 진행. 입력한값이 비어있는 칸이면 건너뜀.
		        	}
		        if (members[i].id.equals(member.id) && members[i].pw.equals(member.pw) ) {
		        	found = true;
		        	System.out.print("수정할 비밀번호를 입력하세요 :");
		        	members[i].pw = input.next();		        	       	
		        	System.out.println("회원 정보가 수정되었습니다.");
		        	return;	        
		        }
		    	}//for문 종료 						
		    	if (!found) {
		        System.out.println("해당id를 찾을수 없습니다. 다시 입력해 주세요.");
		    	}	
		}//while문 종료
		
	}//회원정보수정 메서드 종료 
	
	
	public void memberDelete(Member[] members, Scanner input) { //main-5.회원삭제
		Member member = new Member();
		System.out.println("회원탈퇴 메서드");
		
		while(true) {
			System.out.print("탈퇴할 id를 입력하세요 :");
			member.id = input.next();
			System.out.print("비밀번호를 입력해 주세요. :");
			member.pw = input.next();
			
			boolean found = false;    
			for (int i = 0; i < members.length; i++) {
			        if (members[i] == null) {
			            continue; // 이번 루프만 건너뛰고 다음 반복으로 진행. 입력한값이 비어있는 칸이면 건너뜀.
			        	}
			        if (members[i].id.equals(member.id) && members[i].pw.equals(member.pw) ) {
			        
			        	members[i] = null;
			        	found = true;			        			        	        			       	
			        	System.out.println("회원 탈퇴 되었습니다.");
			        	break;
			        	
			        
			        	}
			    	}//for문 종료 						
			    	if (found) {
			    	break; //삭제가 되면 다시 메뉴로 돌아가도록 while문 종료 
			    	} else {
			        System.out.println("해당id를 찾을수 없습니다. 다시 입력해 주세요.");
			    	}	
			}//while문 종료
		
	}//회원삭제 메서드 종료 
}//클래스Member종료 
