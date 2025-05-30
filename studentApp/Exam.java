package studentApp;

import java.util.Scanner;
import studentApp.Info.StudentInfo;

public class Exam {
	public static Scanner inputInt = new Scanner(System.in);
	public static Scanner inputStr = new Scanner(System.in);
	
	public static Student[] students = new Student[50];
	Student studet1 = new Student("01020127536", "서울시 용산구", "조은아", 38, 161120, "정보처리학" );
	Student[0] = studet1; 
	StudentInfo studentinfo = new StudentInfo();
	
	
	

	        // 서비스 클래스 사용
	      //  StudentService service = new StudentService();
	    //    Student student = service.createStudent(dto);

	        // 학생 정보 출력
	  //      service.printStudent(student);

	
	
	

	public static void main(String[] args) {
		
		boolean run = true;
		while(run) {
		System.out.println("================학생관리 시스템==============");
		System.out.println("메뉴를 선택하세요.");
		System.out.println("|1.학생정보 | 2.학점확인 | 3.과목신청 | 4.종료 |");
		System.out.println(">>>>>");
		int select = inputInt.nextInt();
		switch(select) {
		case 1 :
			System.out.println("학생 정보메뉴로 이동...");
			//StudentInfo
		case 2 :
			System.out.println("학점 확인메뉴로 이동...");
			//GradeInfo
		case 3 :
			System.out.println("과목 신청메뉴로 이동...");
			//SubjectInfo
		case 4 :
			System.out.println("프로그램을 종료합니다.");
			run = false ;
		 default : 
			 System.out.println("1~4값만 입력하세요");
			 break ;
		}
		
		}//while문종료 
	}//메인메서드 종료 

}//클래스 종료 
