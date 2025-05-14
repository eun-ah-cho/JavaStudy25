package ex2;

public class MultiForExam {

	public static void main(String[] args) {
		//for문 안쪽에 또다른 for문을 넣어 테스트 해보자. 
		// 9*9단을 만들어 본다.
		// 앞단에 for문 구현 
		
		for(int m = 2; m <= 9 ; m++ ) { // 2~9까지 1씩 증가. 
		System.out.println();
		System.out.println("===========" + m + "단==========");
		
		// 뒷단에 for문 구현. 1부터 9까지 1씩증가
		for(int n = 1; n<=9 ; n++) {   
		
			System.out.print(m + "X" + n + "=" + (m*n) + " "); 
			
		} // 이중for문 종료 
		
	}//for문 종료 

		
} // 메서드 종료 
}