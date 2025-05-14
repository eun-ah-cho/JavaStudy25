package ex2;

import java.util.Scanner;

public class SwichCharExam1 {

	public static void main(String[] args) {
		
		Scanner inChar = new Scanner(System.in);
		System.out.print("회원 등급을 입력하세요 (A~C) : ");
		
		// String gradeStr = inChar.next(); //문자열로 데이터를 입력받아 string에 넣음. 
		char gradeStr =  inChar.next().charAt(0); // inChar에서 받은 첫번째입력한값을 char gradeChr 변수에 넣음. 
				 
	System.out.println(gradeStr);	
	
	switch(gradeStr) {
	
	case 'a' :
	case 'A' :
		System.out.println("우수회원 입니다.");
		break;
		
	case 'b' :
	case 'B' :
		System.out.println("일반회원 입니다.");
		break;
		
	case 'c' :
	case 'C' :
		System.out.println("사업자회원 입니다.");
		break;
		
	default :
		System.out.println("관련사항 없을시 회원가입 필요시 yes를 입력해주세요");
		String name = inChar.next();
		if(name.equalsIgnoreCase("yes")) { //if문 시작 
			System.out.print("아이디 : ");
			String id = inChar.next();
			System.out.println(id + "님 방갑습니다. 가입 되었습니다.");
			break; 
		}
		
		else{ 
			
			System.out.println("회원가입을 원치 않으시니 종료 하겠습니다.");
			break;
			
		}//else 종료 
		
		
		
	
	}//스위치문 종료 
	
		
		
	}//메소드 종료 

}
