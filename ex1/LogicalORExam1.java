package ex1;

import java.util.Scanner;

public class LogicalORExam1 {

	public static void main(String[] args) {
		  // 논리합 + OR || 조건이 두개 이상일때,둘중 하나라도 맞아야 넘어감. (==) & (==) 
		
		Scanner input = new Scanner(System.in);
		System.out.print("정수를 계산해 보자");
		System.out.print(">>>");
		int value = input.nextInt();
		if( (value%2 == 0) || ( value%3 ==0) ){
			
			System.out.println("2의 배수 또는 3의 배수 입니다. : " + value);
		}
		else {
			System.out.println("2의배수 또는 3의 배수가 아닙니다.");
		}
		
		
		
		
		
		
		   

	}

}
