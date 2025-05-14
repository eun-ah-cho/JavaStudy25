package ex2;

import java.util.Scanner;

public class Juminbunho {

	public static void main(String[] args) {
		//주민번호 만들자		
		
		Scanner in = new Scanner(System.in);
		System.out.print("주민번호를 입력해 주세요 :  ");
		String ssn = in.next();
		
		char ssn2 = ssn.charAt(7); //성별확인 추출 
		int num = Character.getNumericValue(ssn2);
		
		
		switch (ssn2) {
		case '1' :
			System.out.print("남자");
			break;
		case '2' : 
			System.out.print("여자");
			break; 
			
			default :
				System.out.println("외계인????");
			break; 
		
		}//스위치 종료 
		
		int year = Integer.parseInt(ssn.substring(0,2)); //태어난 년도 추출
		if(num == 1 || num == 2 || num == 5 || num == 6) {
			System.out.println("나이는 " + (2025 - (1900 + year) + 1 ) + "입니다.");
		}
		else if (num == 3 || num == 4 || num == 7 || num == 8) {
			System.out.println("나이는 " + (2025 - (2000 + year) + 1 ) + "입니다.");
		}
		else {
			System.out.println("다시 입력해 주세요.");
		}
		
		int month = Integer.parseInt(ssn.substring(2,4));
		if(month <= 0 || month >= 13 ) {
			System.out.println("다시 입력 해주세요");
			
		}
		else if (month >= 3 && month <= 5) {
			System.out.println("봄에 태어났습니다."); }	
		else if ( month >=6 && month <= 8) {
			System.out.println("여름에 태어났습니다.");}
		else if (month >= 9 && month <= 11) {
			System.out.println("가을에 태어났습니다. ");	}
		else { 
			System.out.println("겨울에 태어났습니다.");
		}
		
		
		
		
		
		
		
	} // 메서드 종료 

}
