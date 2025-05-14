package ex2;

import java.util.Scanner;

public class ForExam1 {

	public static void main(String[] args) {
		
		//둘 이상의 초기화식.. 초기화식이 둘이상이나 증감식이 둘이상인경우.. && 
		/* for(int i = 0, j =100 ; i <= 10 && j >= 80 ; i++,  j--) {
			System.out.println("i값의 증가 :" + i + " // j값의 감소 : " + j );
		
		}//for문 종료 
		*/ 
		
		/* for문을 이용한 구구단 
		for (int m = 2; m <= 9; m++ ) {
			System.out.println("=====" +  m + "단=====");
			 
			for (int n = 1; n <=9; n++ ) {
				 System.out.println( m + "x" + n + "=" + (m*n));
				 
			 }//중첩for종료 
		} //for종료 
		*/
		
		
		     	
				Scanner inputInt = new Scanner(System.in);
				System.out.print("최소숫자 입력 : ");
				int min = inputInt.nextInt(); 
				
				System.out.print("최대숫자 입력 : ");
				int max = inputInt.nextInt(); 
				
						
				System.out.print("증감수 입력 : ");
				int add = inputInt.nextInt();
				
				System.out.println( min + "~" + max + "의" + add + "증감수는");
				int total =   0; 
				// total = total + 1; // x 100
				
				
						
				for (total= min; total <= max; total += add) {
				//						total = total + add 
					System.out.println( total);
			}
				
		
		
		
		
		
		
		
		
		
			
		
		
		
		
		
	}//메서드 종료 
	

}
