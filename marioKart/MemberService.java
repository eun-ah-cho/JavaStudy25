package marioKart;

import java.util.Scanner;
import marioKart.dto.MemberDTO;

//MemberDTO는 데이터를 담는 그릇 객체.  MemberService는 데이터가지고 무엇을 할지 정리한곳. 
public class MemberService {

	
	//menu 메소드 
	 public  MemberDTO menu(Scanner input, MemberDTO[] memberDTOs, MemberDTO loginState) {
		 MemberDTO memberDTO = new MemberDTO(); //MemberDTO객체데이터를 불러서 memberDTO에 새로 만든다. 
		 
		 System.out.println("[회원관리 메뉴에 진입하셨습니다.]"+ "");
		 boolean subrun = true; 
		 while(subrun) {
			 System.out.println("1.가입 | 2.로그인 | 3.수정 | 4.삭제 | 5.종료");
			 System.out.print(">>>");
			 String select = input.next();
			 
			 switch(select) {
			 case "1" : 
				 System.out.println("계정을 생성합니다.");
				 create(input, memberDTOs,loginState );
				 break;
				 
			 case "2" :
				 System.out.println("로그인 화면입니다.");
				 loginState = login(input, memberDTOs, loginState);
				 break;				 
			
			 case "3" :
				 System.out.println("계정을 수정합니다.");
				 loginState = modify(input, memberDTOs,loginState );
				 break;
			 
			 case "4" :
				 System.out.println("계정을 삭제합니다.");
				// del(inputInt, inputStr, memberDTOs,loginState );
				 break;
			 
			 case "5" :
				 System.out.println("회원관리메뉴를 종료합니다.");
				 System.out.println("메인메뉴로 복귀합니다.");
				 subrun = false;
				 break;
				 
			 case "99" :
				 System.out.println("히든 메뉴로 진입하였습니다. ");
				 System.out.println("캐릭터 해킹을 진행합니다. ");
				 break;	
			
			 default : 
				System.out.println("⚠잘못 입력하셨습니다.1~5 사이 값만 입력 하세요.⚠ :");
			 
			 	}			 
		 }// while문 종료 
		 return loginState;
	}//menu 메소드 종료 
	 


	//create 메소드 생성 
	 void create(Scanner input, MemberDTO[] memberDTOs, MemberDTO loginState) {
		MemberDTO memberDTO = new MemberDTO(); //MemberDTO객체데이터를 불러서 memberDTO에 새로 만든다. 
		
		
		System.out.print("사용할 id를 입력하세요. :");
		memberDTO.id = input.next();
		System.out.print("사용할 pw를 입력하세요. :");
		memberDTO.pw = input.next();
		System.out.print("사용할 닉네임을 입력하세요. :");
		memberDTO.nickName = input.next();
		System.out.print("사용할 e-mail을 입력하세요. :");
		memberDTO.email = input.next();
		
		for(int i=0; i < memberDTOs.length; i++) {
			if(memberDTOs[i] == null ) {
				memberDTOs[i] = memberDTO;
				
				}			
			System.out.println("["+ memberDTO.nickName + "]님 회원가입을 축하 드립니다.");
			System.out.println("가입 하신 정보는 아래와 같습니다. ");
			System.out.println("[ID:"+memberDTO.id + "/ " + "PW :" + memberDTO.pw + " /" + "닉네임:" + memberDTO.nickName + "/ " +
			"E-mail:" + memberDTO.email + "]");
			break;
			}
	 
	}//create 메소드 종료
	
	//로그인 메서드 
		 public MemberDTO login(Scanner input, MemberDTO[] memberDTOs, MemberDTO loginState) {
		 MemberDTO memberDTO = new MemberDTO();
		
			boolean run = true;
			while(run) {
			System.out.print("id를 입력하세요. :");
			String id = input.next();
			System.out.print("pw를 입력하세요. :");
			String pw = input.next();
		
			memberDTO.id = id;
			memberDTO.pw = pw;			
			
			for (int i = 0; i < memberDTOs.length; i++) {
		        if (memberDTOs[i] == null) continue;
		              	if (memberDTOs[i].id.equals(id) && memberDTOs[i].pw.equals(pw)) {
		        		loginState = memberDTOs[i];
		        		System.out.println(loginState.nickName + "님. 로그인 하셨습니다.");
		        		run = false;
		        		break;
		            	}	      	
		        	
		    	}//for문 종료 
			
		    	if(run) {  
		        System.out.println("⚠id"+ " 또는 pw가 일치하지 않습니다. 다시 로그인해주세요.⚠");
		        	}	
				}//while문 종료 	
			return loginState;
		 }//로그인 메서드종료 

		 //수정메서드 
		static MemberDTO modify(Scanner input,MemberDTO[] memberDTOs, MemberDTO loginState) {
			 MemberDTO memberDTO = new MemberDTO();
			
	 		while(true) { //로그인 성공할떄까지 계속반복 돌리기.내부에서 return사용하면 반복은사라짐. 
			System.out.print("id를 입력하세요. :");
	 		String id = input.next();
	 		System.out.print("pw를 입력하세요. :");
	 		String pw = input.next();
			
	 		for (int i = 0; i < memberDTOs.length; i++) { //배열의 처음부터 끝까지 순서대로 확인 
			    if(memberDTOs[i] != null && memberDTOs[i].id.equals(id)&& memberDTOs[i].pw.equals(pw) ) {
			    	while(true){  //로그인 성공시 수정메뉴 
			   		System.out.println("1.아이디 | 2.패스워드 | 3.닉네임 | 4.이메일 | 5.종료");
		        	System.out.print("수정할 항목을 선택 하세요:");
		        	String select = input.next();		    	        						        						        	
		        	switch(select) {
			        	
			        	case "1":
			        		System.out.print("바꾸실 아이디를 입력하세요.");
			        		memberDTOs[i].id= input.next();
			        		 break;
			        	case "2":
			        		System.out.print("바꾸실 패스워드를 입력하세요.");
			        		memberDTOs[i].pw= input.next();
			        		 break;
			        	case "3":
			        		System.out.print("바꾸실 닉네임을 입력하세요.");
			        		memberDTOs[i].nickName= input.next();
			        		 break;
			        	case "4":
			        		System.out.print("바꾸실 이메일을 입력하세요.");
			        		memberDTOs[i].email= input.next();
			        		 break;
			        	case "5":
			        		System.out.print("수정 항목을 종료하겠습니다.");
			        		System.out.println("[ID:"+memberDTOs[i].id + "/ " + "PW :" + memberDTOs[i].pw + " /" + "닉네임:" + memberDTOs[i].nickName + "/ " +
								      "E-mail:" + memberDTOs[i].email + "]");
			        		return memberDTOs[i]; //메서드 완전 종료, 더이상아래코드 안나옴. 					      
			        	default : 
			        		System.out.println("잘못 입력하셨습니다.1~5 사이 값만 입력 하세요. :");
			        		continue;//while문으로다시 올라감. 	        		
			       		}//스위치종료   
		        	
				       	 System.out.println("[ID:"+memberDTOs[i].id + "/ " + "PW :" + memberDTOs[i].pw + " /" + "닉네임:" + memberDTOs[i].nickName + "/ " +
							      "E-mail:" + memberDTOs[i].email + "]");
					
			    		}//와일문종료 
					   	 	
					   	   
					    }//if문종료 
				
			 		}//for문종료 
			 		 	           
	 		System.out.println("일치하지 않습니다. 다시 시도해 주세요,");}
	 	//return loginState;
			}//와일문종료  	
}//수정메서드 종료

		 

