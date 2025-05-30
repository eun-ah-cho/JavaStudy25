package erp_Insa.DTO;

public class LeaderDTO extends EmployeeDTO { //팀장(자식클래스) 
	//필드생성 
	private String teamFeedback ;
	private String leder = "팀장";
	
	
	//생성자 
	public LeaderDTO(int sabun, String name, String department, int pay, String position, String grade, String leder) {
        super(sabun, name, department, pay, position, grade);
	}

	public String getTeamFeedback() {
		return teamFeedback;
	}

	
	public void setTeamFeedback(String feedback, String ledername) {
		this.teamFeedback = feedback;
		this.leder =ledername;
	}
	
	public void show() {
        super.show(); // 부모 메서드 호출
        System.out.println("팀원 평가: " + teamFeedback);
	
	}
	
}//클래스 종료

