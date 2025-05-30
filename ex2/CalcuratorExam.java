package ex2;

/* 간단한 계산기 프로그램
입력받기 : 숫자>연산자>숫자 | 연산자 별로 메서드에 숫자를 넣기.(입력받는 순서에 맞춰서 메서드에서 해결하기) | 결과값 main메서드 에서 출력해주기(return을 받아서)
완료 반복 재생 가능하게 while문 사용하기 | (다시 하시겠습니까? or 이어서 계산하시겠습니까?) */

import java.util.Scanner;

public class CalcuratorExam { // 클래스 생성

	public static void main(String[] args) { // void 메인 메서드 생성

		int x1 = 0, x2 = 0, x3 = 0, x4 = 0, x5 = 0; // 변수 5개 생성 x1=처음입력수 x2=부호입력 x3=두번째입력수 x4=결과값
		boolean run = true, run2 = true; // while문 쓸때
		String y1 = "연산기호"; // 연산기호 문자열 설정

		Scanner scInt = new Scanner(System.in); // 커서 입력값 설정

		while (run) { // 첫번째 while run 돌기
			if (x1 == 0) {
				System.out.print("**정수계산기**  n숫자를 입력해주세요(int 범위 내에서만) >>>");
				x1 = scInt.nextInt();
			} // x1은 처음입력한 숫자 변수

			System.out.print("부호를 선택해주세요\n1.+(더하기)\t2.-(빼기)\n3.(곱하기)\t4.(나누기)\n>>");
			x2 = scInt.nextInt(); // x2는 부호선택 변수

			System.out.print("숫자를 입력해주세요(int 범위 내에서만)\n>>");
			x3 = scInt.nextInt(); // x3은 두번째 입력한 숫자 변수
			// ============================================================>> 입력값
			run2 = true;

			switch (x2) {// x2 부호를 어떤거를 넣느냐에 따라 케이스마다 연산 결과 반영
			case 1:
				x4 = plus(x1, x3);
				y1 = "+";
				break; // plus(x1, x3)란곳에 더하기 메서드생성. plus메서드에서 돌린값 반영

			case 2:
				x4 = minus(x1, x3);
				y1 = "-";
				break;// minus(x1, x3)란곳에 빼기 메서드생성. minus메서드에서 돌린값 반영

			case 3:
				x4 = times(x1, x3);
				y1 = "x";
				break;// times(x1, x3)란곳에 곱하기 메서드생성. times메서드에서 돌린값 반영

			case 4:
				x4 = divide(x1, x3);
				y1 = "÷";
				break;
			}// divide(x1, x3)란곳에 나누기 메서드생성. divide메서드에서 돌린값 반영

			System.out.println("계산결과 :" + x1 + " " + y1 + " " + x3 + " = " + x4);
			// ============================================================>> x2=부호값 입력한대로
			// 계산반영한거 출력

			while (run2) { // 두번째 while run2 돌기
				if (x4 != 0) {
					System.out.println("1.종료하기\\n2.다시하기\\n3.이어서계산하기\\n>>>");
				} // 결과 값이 0과 같지 않으면 선택

				else {
					System.out.print("1.종료하기\n2.다시하기\n>>>");
				} // 결과값이 0과 같다면 이어서하기제외 0으로 이어서할시 다음 결과값이 다 0나오니까

				x5 = scInt.nextInt();

				switch (x5) { 
				case 2:
					x1 = 0;
					x1 = 0;
					x3 = 0;
					run2 = false;
					break;
				case 3:
					x1 = x4;
					x2 = 0;
					x3 = 0; // 보기
					run2 = false;
					break;

				case 1:
					run = false;
					run2 = false; // 왜 run은 오지?
					break;

				default:
					System.out.println("숫자를 잘못 선택하셨습니다,\n다시 입력해주세요\n");
				}

			} // run2 while문 종료

		} // while문 종료

	}

	static int plus(int x1, int x3) { // 메서드 추가 더하기용
		int x4 = 0;
		x4 = x1 + x3;
		return x4;
	}

	static int minus(int x1, int x3) { // 메서드 추가 빼기용
		int x4 = 0;
		x4 = x1 - x3;
		return x4;
	}

	static int times(int x1, int x3) { // 메서드 추가 곱하기용
		int x4 = 0;
		x4 = x1 * 3;
		return x4;
	}

	static int divide(int x1, int x3) { // 나누기용
		int x4 = 0;
		x4 = x1 / x3;
		return x4;
	}

}// 클래스 종료
