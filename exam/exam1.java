//
//
//
//public class StudentDTO extends Person {
//    private int kor;
//    private int eng;
//    private int math;
//
//    public StudentDTO(String name, int kor, int eng, int math) {
//        super(name);
//        this.kor = kor;
//        this.eng = eng;
//        this.math = math;
//    }
//
//    public int getKor() {
//        return kor;
//    }
//
//    public int getEng() {
//        return eng;
//    }
//
//    public int getMath() {
//        return math;
//    }
//
//    public int getTotal() {
//        return kor + eng + math;
//    }
//
//    public double getAverage() {
//        return getTotal() / 3.0;
//    }
//
//    public String getGrade() {
//        double avg = getAverage();
//        if (avg >= 90) return "A";
//        else if (avg >= 80) return "B";
//        else if (avg >= 70) return "C";
//        else if (avg >= 60) return "D";
//        else return "F";
//    }
//}


/*
 * 
 * public class StudentService { private StudentDTO[] students; private int
 * index;
 * 
 * public StudentService(int size) { students = new StudentDTO[size]; index = 0;
 * }
 * 
 * public void addStudent(StudentDTO student) { if (index < students.length) {
 * students[index] = student; index++; } else {
 * System.out.println("더 이상 등록할 수 없습니다."); } }
 * 
 * public void printAllStudents() { System.out.println("\n=== 학생 성적 목록 ===");
 * System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t등급");
 * 
 * for (int i = 0; i < index; i++) { StudentDTO s = students[i]; if (s != null)
 * { System.out.printf("%s\t%d\t%d\t%d\t%d\t%.2f\t%s\n", s.getName(),
 * s.getKor(), s.getEng(), s.getMath(), s.getTotal(), s.getAverage(),
 * s.getGrade()); } } }
 * 
 * public void updateStudent(String name, int kor, int eng, int math) { for (int
 * i = 0; i < index; i++) { StudentDTO s = students[i]; if (s != null &&
 * s.getName().equals(name)) { students[i] = new StudentDTO(name, kor, eng,
 * math); System.out.println("수정 완료!"); return; } }
 * System.out.println("학생을 찾을 수 없습니다."); }
 * 
 * public void deleteStudent(String name) { for (int i = 0; i < index; i++) { if
 * (students[i] != null && students[i].getName().equals(name)) { students[i] =
 * null; System.out.println("삭제 완료!"); return; } }
 * System.out.println("학생을 찾을 수 없습니다."); } }
 */




import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("저장할 학생 수를 입력하세요: ");
        int size = scanner.nextInt();
        scanner.nextLine();

        StudentService service = new StudentService(size);

        while (true) {
            System.out.println("\n=== 메뉴 ===");
            System.out.println("1. 학생 등록");
            System.out.println("2. 학생 목록 출력");
            System.out.println("3. 학생 수정");
            System.out.println("4. 학생 삭제");
            System.out.println("5. 종료");
            System.out.print("선택 > ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 1) {
                System.out.print("이름: ");
                String name = scanner.nextLine();
                System.out.print("국어 점수: ");
                int kor = scanner.nextInt();
                System.out.print("영어 점수: ");
                int eng = scanner.nextInt();
                System.out.print("수학 점수: ");
                int math = scanner.nextInt();
                scanner.nextLine();

                StudentDTO student = new StudentDTO(name, kor, eng, math);
                service.addStudent(student);
                System.out.println("등록 완료!");

            } else if (choice == 2) {
                service.printAllStudents();

            } else if (choice == 3) {
                System.out.print("수정할 학생 이름: ");
                String name = scanner.nextLine();
                System.out.print("새 국어 점수: ");
                int kor = scanner.nextInt();
                System.out.print("새 영어 점수: ");
                int eng = scanner.nextInt();
                System.out.print("새 수학 점수: ");
                int math = scanner.nextInt();
                scanner.nextLine();

                service.updateStudent(name, kor, eng, math);

            } else if (choice == 4) {
                System.out.print("삭제할 학생 이름: ");
                String name = scanner.nextLine();
                service.deleteStudent(name);

            } else if (choice == 5) {
                System.out.println("프로그램 종료");
                break;

            } else {
                System.out.println("잘못된 입력입니다.");
            }
        }

        scanner.close();
    }
}