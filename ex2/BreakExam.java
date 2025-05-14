package ex2;

public class BreakExam {

	public static void main(String[] args) {
		//break Outter라는 라벨을 생성하고 중지하고 싶은 반복문 앞에
		// 라벨을 적으면 break 문이 종료되는 시점을 만들 수 있다.
		
		for(char upper='A'; upper <= 'Z'; upper++) {
			
			Outter : for(char lower='a'; lower <= 'z'; lower++) {
				
				System.out.println(upper + "- " + lower);
				if(lower == 'c') {
					break Outter;
				}//if문 종료 
			
						
			}//이중 for문 
				} //for문 
			
		}
	
	}
