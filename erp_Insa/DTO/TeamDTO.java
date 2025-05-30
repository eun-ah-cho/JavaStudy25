package erp_Insa.DTO;

public class TeamDTO extends EmployeeDTO { //팀원(자식클래스) 

	//필드 
	private String leaderFeedback;
	private String team = "팀원";
	
	//생성자 
	public TeamDTO(int sabun, String name, String department, int pay, String position, String grade, String team) {
        super(sabun, name, department, pay, position, grade);
	}
        
	//필드 캡슐 
	public String getLeaderFeedback() {
		return leaderFeedback;
	}

	public void LeaderFeedback(String feedback, String teamname) {
		this.leaderFeedback = feedback; //평가내용을 저장해두는곳. 
		this.team = teamname;
	}
	 
	 
	//메서드
	 public void show() {
        super.show(); // 부모(Employee)의 show 호출
        System.out.println("팀장 평가말: " + leaderFeedback);
    
    }
	

	
	
}//클래스종료

