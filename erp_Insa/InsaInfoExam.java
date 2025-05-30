package erp_Insa;

import java.util.Scanner;

public class InsaInfoExam {

	public static Scanner inputInt = new Scanner(System.in);
	public static Scanner inputStr = new Scanner(System.in);
	
	
	
	
	public static void main(String[] args) {
		System.out.println("ERP-[인사정보]-시스템 ");
		//1.직원 등록 - 등록,수정,삭제.
		//2.직원 목록 보기 
	    //4.직원정보 및 평가확인 -사번 및 비밀번호 입력후  평가확인  
		//5.시스템종료 
		
		System.out.println("사번을 입력하세요:");
		
		System.out.println("====" + "님의 정보 및 평가 내용입니다." + "====");
		
		
	}
	
}


//TeamService teamService = new TeamService();
//LeaderService leaderService = new LeaderService();
//
//while (true) {
//    System.out.println("\n=== ERP 시스템 ===");
//    System.out.println("1. 팀원 등록");
//    System.out.println("2. 팀장 등록");
//    System.out.println("3. 팀원 목록 보기");
//    System.out.println("4. 팀장 목록 보기");
//    System.out.println("0. 종료");
//    System.out.print("선택: ");
//    int menu = sc.nextInt();
//    sc.nextLine(); // 개행 제거
//
//    switch (menu) {
//        case 1:
//            System.out.print("이름: ");
//            String name = sc.nextLine();
//            Member m = new Member(101, name, "개발팀", 3000, "사원", "B");
//            teamService.registerMember(m);
//            break;
//        case 2:
//            System.out.print("팀장 이름: ");
//            String leaderName = sc.nextLine();
//            Leader l = new Leader(201, leaderName, "개발팀", 6000, "팀장", "A");
//            leaderService.registerLeader(l);
//            break;
//        case 3:
//            teamService.printAllMembers();
//            break;
//        case 4:
//            leaderService.printLeaders();
//            break;
//        case 0:
//            System.out.println("프로그램 종료");
//            return;
//    }
//}
//}
//}