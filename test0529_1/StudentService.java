package test0529_1;

import java.util.Scanner;
public class StudentService {
	
	Scanner inputStr = new Scanner(System.in);
	Scanner inputInt = new Scanner(System.in);
	
	StudentDTO[] students = new StudentDTO[10];
	int count =0;
	
	
	public void register() {
		if (count >= 10) {
			System.out.println("더이상 등록이 불가합니다.");
			return;
		}
	    System.out.print("이름:");
        String name = inputStr.next();
        System.out.print("국어:");
        int kor = inputInt.nextInt();
        System.out.print("영어: ");
        int eng =  inputInt.nextInt();
        System.out.print("수학: ");
        int math =  inputInt.nextInt();
        
        students[count] = new StudentDTO(name, kor,  eng,  math ); //위에 전달받은값을 담음 
        count ++;
        System.out.println("----등록완료----");
	}//등록 메서드 종료 
		
				
	public void StudentList() { 
		if (count== 10) {
			System.out.println("등록된 학생이 없습니다.");
			return;
		}
				
		System.out.print("이름을 입력해 주세요 :");
        String name = inputStr.next();
               
        for (int i = 0; i < count; i++) {
            if (students[i].name.equals(name)) {
                StudentDTO student = students[i];
                System.out.println("===== 학생 정보 =====");
                System.out.println("이름: " + student.name);
                System.out.println("국어: " + student.kor);
                System.out.println("영어: " + student.eng);
                System.out.println("수학: " + student.math);
                System.out.println("총점: " + student.getTotal());
                System.out.println("평균: " + student.getAverage());
                return; 
            	}
        	}
		}
        
	
	 public void updateGrade() {
	        if (count == 0) {
	            System.out.println("등록된 학생이 없습니다.");
	            return;
	        }	        
	        System.out.print("성적을 수정할 학생 이름을 입력해주세요: ");
	        String name = inputStr.next();
	      
	        for (int i = 0; i < count; i++) {
	            if (students[i].name.equals(name)) {
	                StudentDTO student = students[i];
	                
	                System.out.println("현재 점수입니다.");
	                System.out.println("국어: " + student.kor + ", 영어: " + student.eng + ", 수학: " + student.math);
	                
	                System.out.print("수정할 국어 점수: ");
	                student.kor = inputInt.nextInt();
	                
	                System.out.print("수정할 영어 점수: ");
	                student.eng = inputInt.nextInt();
	                
	                System.out.print("수정할 수학 점수: ");
	                student.math = inputInt.nextInt();
	                
	                System.out.println("---- 성적 수정 완료 ----");
	                return;
	            }
	        }
	        
	        System.out.println("해당 이름의 학생을 찾을 수 없습니다.");
	    }
	
	 
	 
	 public void DeleteGrade() {
		        if (count == 0) {
		         System.out.println("등록된 학생이 없습니다.");
		         return;
		        }
		        
		        System.out.print("삭제할 학생 이름을 입력해주세요: ");
		        String name = inputStr.next();
		       		       
		        for (int i = 0; i < count; i++) {
		            if (students[i].name.equals(name)) {
		                System.out.print(name + "님 학생의 정보를 정말 삭제하시겠습니까? (Yes or No): ");
		                 String yesorno = inputStr.next();
		                 if(yesorno.equalsIgnoreCase("yes")) {
		                	 for (int j = i; j < count - 1; j++) {
		                         students[j] = students[j + 1];
		                     }
		                     students[count - 1] = null;
		                     count--; // 학생 수 감소
		                     System.out.println("---- 학생 정보 삭제 완료 ----");
		                 } else {
		                	 System.out.println("삭제를 취소하셨습니다.");
		                 }
		                return;
		            }
		        }
		        
		        System.out.println("해당 이름의 학생을 찾을 수 없습니다.");
		    }
        
	}
