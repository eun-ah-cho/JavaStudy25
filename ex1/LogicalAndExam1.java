package ex1;

import java.util.Scanner;

public class LogicalAndExam1 {

	public static void main(String[] args) {
	  // 논리곱 AND && & 조건이 두개 이상일때, 조건이 두개다 맞을때 () & () 
		
		Scanner input = new Scanner(System.in);
		System.out.print("정수 입력시 유니코드로 변경됩니다. 입력해주세요 : ");
		int input1 = input.nextInt();
		
		if ((input1 >= 0 ) & (input1 >= 33)) {
			System.out.println("정수에서 유니코드로 변환된 내역은 : " + (char)input1 + "입니다." );
			
			
			}
		
		else{
			System.out.println("유니코드가 없습니다.");
			
		}
		
		
		
		
		
		

	}

}
