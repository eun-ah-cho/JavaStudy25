package ex2;

import java.util.Scanner;

public class IfExam1 {

	public static void main(String[] args) {
		// 성적 확인하기

		Scanner input = new Scanner(System.in); //입력커서 생성
		System.out.println("해당 과목의 점수를 입력해 주세요.");

		System.out.print("국어 :");
		int kor = input.nextInt(); // 국어성적입력
		if (kor < 0 || kor > 100) {
			System.out.println("다시 입력해 주세요");
		}
		System.out.print("수학 :");
		int mat = input.nextInt(); // 수학성적 입력
		if (mat < 0 || mat > 100) {
			System.out.println("다시 입력해 주세요");
		}
		System.out.print("영어 :");
		int eng = input.nextInt(); // 수학성적 입력
		if (eng < 0 || eng > 100) {
			System.out.println("다시 입력해 주세요");
		}

		System.out.print("평균을 확인 하고 싶습니까?(yes or no) : ");
		String avgyesorno = input.next();
		if (avgyesorno.equalsIgnoreCase("yes")) {

			int total = kor + mat + eng;
			double avg = (double) total / 3;
			System.out.println("평균은" + avg + "입니다.");
			
		} 
		else if (avgyesorno.equalsIgnoreCase("no")) {

			System.out.println("no를 입력 하였으므로 종료 하겠습니다.");
		}

	}// main 종료 
}
