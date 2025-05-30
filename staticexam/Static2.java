package staticexam;

public class Static2 {

	static String company = "Samsung";
	static String model = "LED";
	static String info;
	
	static { //정적블록 
		info = company + "-" + model;
		
		
	}
	
}
