package ex1;

public class StringTest1 {

	public static void main(String[] args) {
		String str1 = "연습" ;
		String str2 = "+중" ;
		String str3 = "3" + 3 ;
		String str4 = 3 + "3" + "  문자로 인지"; 
		String str5 = 5 + 10 + "십오다 " ;
		System.out.println(str5);
		
		String str6 = "십이다" + 5 + 5 ;
		System.out.println(str6);
		
		String totalstr = str1 + str2 + str4;
		System.out.println(totalstr);
		String totalstr1 = 3 + 3.0 + " 숫자로 인지" ;
				
		System.out.println(totalstr1);
		
		//앞에 숫자 넣고 문자 넣으면 앞 숫자들이 숫자로인지되어 숫자로 인식 문자 뒤에 숫자는 문자로 인지 
			
		

	}

}
