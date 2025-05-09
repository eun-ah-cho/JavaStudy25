package ex1;

public class ConditionalExam1 {

	public static void main(String[] args) {
		int score = 85 ;
		char grade = (score > 90) ? 'A' : ((score > 80) ? 'B' : 'C') ;
		System.out.println(grade);

		int jumsu = 70 ;
		
		if (jumsu > 90) {
			
			System.out.println("A");
			if (jumsu > 80 ) {
				
				System.out.println("B");
			}
			
			else
			{
				System.out.println("C");
			}
		}
	
		
		
		
	}

}
