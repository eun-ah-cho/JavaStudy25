package ex3;

import java.util.Scanner;

public class ArrayTest {
	
	 
	public static void main(String[] args) {   
	     
	    int studentNum = 0;
	    int[] scores = null;
	    Scanner scanner1 = new Scanner(System.in);
	   
	    boolean run = true;
	    
	        	
	    while(run) {
	    	System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
	    	System.out.print("메뉴 선택 >>>");
	    	int selectNo = scanner1.nextInt();
	    	
	    	switch(selectNo) {
	    	
	    	case 1 : System.out.print("학생수를 입력하세요>>");
    				studentNum = scanner1.nextInt();
    				scores = new int[studentNum];
    				break;
	    	case 2 : //점수 입력 
	    		for(int i =0 ; i < scores.length; i++) {
	    			System.out.println("점수[" + i + "] 입력 >>");
	    			scores[i] = scanner1.nextInt();}
	    		break;
	    		
	    	case 3 :
	    		for(int i =0; i< scores.length; i++ ) {
	    			System.out.println("점수[" + i + "] : " + scores[i]);}
	    		break;
	    		
	    	case 4 :
	    		int max =0; int sum = 0; double avg = 0.0;
   		    	for (int i=0; i < scores.length; i++) {
	    			max = (max < scores[i]) ? scores[i] : max;
	    			sum += scores[i];} 
   		    		avg = (double) sum / studentNum; 
   		    		System.out.println("최고점수:" + max);
   		    		System.out.println("평균점수:" + avg);
	    		break; 	
	    		
	    	case 5 :
	    		System.out.println("프로그램 종료");
	    		run = false ;
	    		break;
	    	
	    	default :
	    		System.out.println("잘못입력하셨습니다.");
	    		break;
	    		
	    		
	    	} //switch 종료 
	    	
	    	
	    	
	    	
	    	
	    }//while 종료 
			
		
	}//메인메서드 종료 
	


}//클래스 종료 
