package ex1;

public class CompareExam1 {

	public static void main(String[] args) {
		int bo1 = 10;
		int bo2 = 5;
		
		boolean bototal = (bo1 >= bo2); 
		System.out.println(bototal);
		//boolean은 참,거짓 구분가능 
		
		boolean hi1 = !true;
		System.out.println(!hi1 + "입니다.");
		
		System.out.println("====================");
		
		
		char chr1 = 'A' ; //65 유니코드
		char chr2 = 'B' ; //66  
		
		
		boolean bototal1 = (chr1 > chr2) ;  // chr1=A=65 가 더작으니 false 
		System.out.println(bototal1);
		//문자 -> 유니코드 숫자로 변환하여 참거짓 구분 
		
		char chr3 = '1' ;
		char chr4 = 1 ; 
		
		
		boolean bototal2 = (chr3 == chr4) ;  //문자와 유니코드 다름 
		System.out.println(bototal2);
	
		int sum1 = 1 ;
		double sum2 = 1.0;
		
		System.out.println(sum1 == sum2); 
		// -> sum1이 4바이트 이고 sum2가 8바이트라 sum1이 큰 더블(8바이트)를 인식 하여 1->1.0으로변함
		System.out.println("====================");
		double dob1 = 0.4;
		float flo1 = 0.4f;
		System.out.println(dob1 == flo1); //double과 float은 불일치 
		
		System.out.println((float)dob1 == flo1); //더블 강제 float로 실행 하면 일치
		System.out.println(dob1 == (double)flo1); 
		System.out.println(dob1); //더블값 
		System.out.println("====================");
		System.out.println(dob1);
		System.out.println((float)dob1);
		System.out.println(flo1);
		System.out.println((double)flo1);
	}

}
