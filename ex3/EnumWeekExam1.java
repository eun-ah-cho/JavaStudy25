package ex3;

import ex4.Week;

public class EnumWeekExam1 {

	public static void main(String[] args) {
		
		Week today = Week.MONDAY;
		String day = today.name(); //열거 객체가 가지고있는 문자열 리턴.
		int ordinal = today.ordinal(); //몇번째인지열거
		Week day1 = Week.MONDAY;
		Week day2 = Week.SUNDAY;
		
		int result1 = day1.compareTo(day2); //앞으로가는건 -마이너스
		int result2 = day2.compareTo(day1);//뒤로가는건 -플러스 
		
		System.out.println(day);
		System.out.println(ordinal);
		System.out.println(result1);
		System.out.println(result2);
		
		Week weekday = Week.valueOf("SUNDAY");
		if(weekday == Week.SATURDAY || weekday == Week.SUNDAY) { //토,일 같으면 주말이군요 아니면 평일이군요 
			System.out.println("주말이군요");
		} else {
			System.out.println("평일이군요");
		}
		
		Week[] days = Week.values();
		for (Week a : days) {
			System.out.println(a);
		}
		
		
		
	}

}
