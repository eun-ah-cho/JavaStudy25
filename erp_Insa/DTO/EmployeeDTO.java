package erp_Insa.DTO;

public class EmployeeDTO {// 직원(부모클래스)

		//필드
	 	private int sabun; //사번 ->고유번호.key값 
		private String name; //이름
	    private String department; //부서
	    private String  position; //직급
	    private int pay;
	    private String grade; //등급 
	   

	    // 생성자
	    public EmployeeDTO(int sabun, String name, String department, int pay, String position, String grade) {
	    	this.sabun = sabun; 
	    	this.name = name;
	        this.department = department;
	        this.pay = pay;
	        this.position = position;
	        this.grade = grade;
	        
	    }

	    //필드캡슐
	    public String getName() { 
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public String getDepartment() {
	        return department;
	    }

	    public void setDepartment(String department) {
	        this.department = department;
	    }

	    public int getPay() {
	        return pay;
	    }

	    public void setPay(int pay) {
	        this.pay = pay;
	    }
	    
	    public String getPosition() {
			return position;
		}

		public void setPosition(String position) {
			this.position = position;
		}
		
		
		public int getSabun() {
			return sabun;
		}

		public void setSabun(int sabun) {
			this.sabun = sabun;
		}

		//메서드
	    public void show() {
	    	System.out.println("사번: " + sabun);
	        System.out.println("이름: " + name);
	        System.out.println("부서: " + department);
	        System.out.println("연봉: " + pay + "만원");
	        System.out.println("직급:"+ position);
	        System.out.println("등급:" + grade  );
	    }
	    
	    
	    
	    
}//클래스종료
