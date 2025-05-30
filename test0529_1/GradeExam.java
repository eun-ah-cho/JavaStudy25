package test0529_1;
import java.util.Scanner;

public class GradeExam {

	public static Scanner inputStr = new Scanner(System.in); //재사용 할수 있게 전역변수 
	public static Scanner inputInt = new Scanner(System.in);
	static StudentService service = new StudentService(); // StudentService 호출  객체 생성
	
	public static void main(String[] args) {
		
		boolean run = true;
		while(run) {
			
			System.out.println("===========성적처리 프로그램===========");
			System.out.println("|1.등록 | 2.조회 | 3.성적수정 | 4.삭제 | 5.종료 |");
			System.out.print(">>>>");
			int select = inputInt.nextInt();
			switch(select) {
			case 1 : System.out.println("등록 메뉴입니다.입력해 주세요.");
			service.register();
			break;
			
			case 2 :
				System.out.println(" 학생 등록 조회 메뉴입니다. "); 
				service.StudentList();
				break;
			case 3 :
				System.out.println("성적 수정메뉴 입니다."); 
				service.updateGrade();
				break;
			case 4 : 
				System.out.println("성적 삭제메뉴 입니다."); 
				service.DeleteGrade();
				break;
			case 5 :
				System.out.println("시스템 종료"); 
				run = false;
				break; 
				
			default : 
				System.out.println("잘못 입력하셨습니다. 1~4까지만 입력해주세요"); 
				break;
					 
			}//스위치문 종료 
			
		}//와일문종료 
		
		

	}//메인메서드종료 
			
	

}//클래스종료 
