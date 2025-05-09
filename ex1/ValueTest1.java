package ex1;

public class ValueTest1 {

	public static void main(String[] args) {
		byte bytValue = 10; 
		int intValue ;
		intValue = bytValue ;
		System.out.println(intValue);
		
		char charValue = '가' ;
		intValue = charValue ;
		System.out.println("가의 유니코드 값은 : " + intValue);
		
		intValue = 500 ;
		long longValue = intValue ;
			System.out.println(longValue);
		
		double doubleValue = intValue ; 
		System.out.println(doubleValue);
		

	}

}
