package ex3;

import java.util.Calendar;

import ex4.Week;

public class EnumWeekExam {

	public static void main(String[] args) {
		
		Week today = null;
		Calendar cal = Calendar.getInstance();
		
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1 ;
		//컴퓨터는 0부터라 +1넣어야함. month만!!
		
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int week = cal.get(Calendar.DAY_OF_WEEK);
		
		switch(week) {
		case 1 : today = Week.SUNDAY; 
		System.out.println(year +"년 " +month +"월"+day+"일"+ "오늘은 일요일이다~");
		break;
			
		case 2 : today = Week.MONDAY;
		System.out.println(year +"년 " +month +"월"+day+"일"+"오늘은 월요일이다~");
		break; 
		case 3 : today = Week.TUESDAY;
		System.out.println(year +"년 " +month +"월"+day+"일"+"오늘은 화요일이다~");
		break;
		case 4 : today = Week.WEDNESDAY;
		System.out.println(year +"년 " +month +"월"+day+"일"+" 오늘은 수요일이다~");
		break;
		case 5 :today = Week.THURSDAY;
		System.out.println(year +"년 " +month +"월"+day+"일"+"오늘은 목요일이다~");
		break;
		case 6 : today = Week.FRIDAY;
		System.out.println(year +"년 " +month +"월"+day+"일"+"오늘은 금요일이다~");
		break;
		case 7 : today = Week.SATURDAY;
		System.out.println(year +"년 " +month +"월"+day+"일"+"오늘은 토요일이다~");
		break;
		}
		
		
		
		
		
		
		
		

	}

}
