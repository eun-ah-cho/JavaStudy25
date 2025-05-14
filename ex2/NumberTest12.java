package ex2;

import java.util.Scanner;

public class NumberTest12 {

	public static void main(String[] args) {
		//주민번호를 입력후 여자인지 남자인지 구분하기 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("주민번호를 입력해 주세요. (******-******)숫자 13자리 입력  : ");
		String jumininput = input.next();
		char number1 = jumininput.charAt(7); 
		// System.out.println(number1);
		switch(number1) { //스위치 시작
		case '1' : case '3' : case '5' : case '7' : 
			System.out.println("당신은 남자입니다. ");
			break;
			
		case '2' : case '4' : case '6' : case '8' : 
			System.out.println("당신은 여자입니다. ");
			break;
			
			default : 
				System.out.println("값을 잘못입력 했습니다.");
			
		
		} //스위치 종료 
		
		
	}

}
