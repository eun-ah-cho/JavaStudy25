package ex1;

public class TestExam {

	public static void main(String[] args) {
		int siheon = 90 ;
	    int jeong = 80 ;
	    boolean totall = siheon > jeong ;
	    
	    if (totall) {
	    	 System.out.println("시헌이가 정열이보다 점수가 높습니다.");	
		}
	   		    		
	    int eunah = 10 ;
	    int siheon1 = 20 ;
	    boolean ttotal = siheon1 > eunah ;
	    if (ttotal) {
	    	System.out.println("시헌이가 은아보다 점수가 높습니다");
			
		}
	    

	    int mom = 80 ;
	    int dad = 70 ;
	    boolean jumsu = dad < mom ;
	    if (jumsu) {
			
	    	System.out.println("엄마가 아빠보다 점수가 높습니다.");
	    	
		}
	
	    int korea = 100 ;
	    int india = 80 ;
	    int air = 0 ;
	    
	    if (india > 70 ) {
			
	    	System.out.println("한국이 미세먼지가 더 좋습니다.");
		}
	    
	    int iljin = 3 ;
	    int dia = 2 ;
	    
	    boolean ood = iljin % 2 == 1;
	    System.out.println(ood);
	   
	    
	}

}
