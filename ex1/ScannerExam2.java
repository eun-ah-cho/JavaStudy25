package ex1;

import java.util.Scanner;

public class ScannerExam2 {

	public static void main(String[] args) {
		
		String loginid = "jea";
		String loginpw = "1234" ;
		
		Scanner input = new Scanner(System.in);
		
		
		System.out.print("-> 아이디를 입력하세요: ");
		String name = input.nextLine();
		
		if (loginid.equals(name)) {
			System.out.println("일치합니다.");
			System.out.print("-> 패스워드를 입력하세요: ");
			String pw = input.nextLine();
			if (loginpw.equals(pw)) {
				
				System.out.println("아이디와 패스워드가 일치합니다.");
				System.out.println("Welcome to Eunah home! :-) ");
				
				
			}
			
			else { 
				System.out.println("패스워드가 일치하지 않습니다.다시 패스워드를 입력하세요.");
				System.out.println("======================");
				System.out.print("패스워드를 입력하세요.-> ");
				String pw1 = input.nextLine();
				if (loginpw.equals(pw1)) {
					
					System.out.println("Welcome to Eunah home! :-) ");
				}
			}
				
		}
		
		else {
			System.out.println("아이디가 일치하지 않습니다.다시 아이디를 입력하세요.");
			System.out.println("======================");
			System.out.print("아이디를 입력하세요.-> ");
			String name1 = input.nextLine();
			if (loginid.equals(name1)) {
				
				System.out.println("Welcome to Eunah home! :-) ");
			}
			
			
			
		}
		
		
		
		
		
		
			
	}

}
