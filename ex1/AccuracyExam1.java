package ex1;

public class AccuracyExam1 {

	public static void main(String[] args) {
		int apple = 1;
		int totalPieces = apple * 10; 
		double pieceUnit = 0.1 ;
		int number1 = 7;
		int temp = totalPieces - number1 ;
		double result = temp / 10.0 ;
		
		System.out.println(number1 * pieceUnit);
		System.out.println(totalPieces - number1);
		System.out.println(result);
		
	}

}
