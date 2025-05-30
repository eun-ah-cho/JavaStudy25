package staticexam;

import java.io.PrintStream;

public class Static1Exam {

	public static void main(String[] args) {
		Static1 nostatic = new Static1 ("조은아", 2014);
		Static1 nostatic1 = new Static1 ("이정열", 2014);
		Static1 nostatic2 = new Static1 ("이시헌", 2016);
			
		System.out.println("이름은 :" + nostatic.name);
		System.out.println("배우자이름은 :" + nostatic1.name);
		System.out.println("아이의 이름은 :" + nostatic2.name);		
		
		int todayyear = 2025;
		
		System.out.println("결혼한지"+ minus(todayyear,nostatic.wedingyear) +"년");
		
		/*
		 * System.out.println("이름은 :" + Static1.name);
		 * 
		 * Static1.name = "이정열"; System.out.println("남편의 이름은 : " + Static1.name);
		 * Static1.name = "이시헌"; System.out.println("아이이 이름은 :" + Static1.name);
		 * System.out.println("결혼일은" + Static1.wedingdate); System.out.println("결혼한지" +
		 * Static1.minus(2025, 2013) + "년");
		 */

	}
	
	// 메서드 빼기용 
		public static int minus(int x, int y) {
			return x - y;
		}
	

}
