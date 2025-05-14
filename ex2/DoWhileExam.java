package ex2;

import java.util.Scanner;

public class DoWhileExam {

	public static void main(String[] args) {
		//While문은 시작과 동시에 조건비교, do-While은 1번은 실행 되고 다음부터 조건 진행. 
		
		System.out.println("메세지를 입력하세요.");
		System.out.println("프로그램을 종료하려면 q를 입력하세요 : ");
		
		Scanner input = new Scanner(System.in);
		String inputString; //키보드로 입력 받은 값 저장용
		
		do {
			System.out.print(">>>");
			inputString = input.nextLine();
			System.out.println("전송값 : " + inputString);
			
			
		} while (!inputString.equals("q"));
		System.out.println("-------------------");
		System.out.println("프로그램 종료");
		System.out.println("-------------------");
	}

}
