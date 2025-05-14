package ex2;

import java.util.Scanner;

public class SwitchStringExam1 {

	public static void main(String[] args) {
		// 연봉통지서 
		
		System.out.println("========연봉 통지서========");
		Scanner input = new Scanner(System.in);
		//int용 str용, 문자용 scanner 따로만들것 추천 
				
		System.out.print("이름을 입력하세요 :");
		String inputname = input.next();
		
			
		System.out.print("직급을 입력하세요 : ");
		String input1 = input.next();
		
		System.out.print("사번을 입력하세요 :");
		String sabun = input.next();
				
		
		System.out.print("이름은 : " + inputname + " / ");
		System.out.print ("직급은 : " +  input1 + " / " ) ;
		System.out.println("사번 : " + sabun);
			
		System.out.print(sabun.substring(0,2) + "년도에 입사 하였습니다.");
		
	      int ipsa = Integer.parseInt(sabun.substring(0,2));
	
		// 16 1120 - 1120 절삭 후 25-16으로 
		System.out.print("경력(");
		System.out.println(25-ipsa + "년)차");
		System.out.println("==========================");
		System.out.print("맞습니까? (yes or no로 기재) -->  ");
		
		String yes1 = input.next();
		
			if(yes1.equalsIgnoreCase("yes")) {
			System.out.println();
				
			switch(input1){
			
			case "사원" :
				System.out.println(inputname + " 님의 사원 연봉은 : 3,500만원 입니다.");
				break; 
			case "대리" :
				System.out.println(inputname +" 님의 대리 연봉은 :4,500만원 입니다.");
				break;
			case "과장" :
				System.out.println(inputname +" 님의 과장 연봉은 :5,500만원 입니다.");
				break;
			case "차장" :
				System.out.println(input1 +" 님의 차장 초봉 연봉은 :6,600만원 입니다.");
				break;
			case "부장" :
				System.out.println(input1 +" 님의 부장 연봉은 :7,500만원 입니다.");
				break;
				
			default :
				System.out.println("잘못 입력하였습니다.");
				break; 
			}//스위치문 종료 
				
			
			
			}//if문 종료 
		
			else {
				System.out.println("yes를 입력하지 않아 연봉을 확인 할수 없습니다. ");
				
				
				
				
				
				
				
			}
					
				
				
	 	
		
		
	} //메서드 종료 

}
