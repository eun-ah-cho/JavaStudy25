package ex4.extended.school;

public class Teacher extends Person {
	private String teacherID; // 교직원번호
	private int grade; // 담당학년
	private int room; // 담당교실
	private int Stcount; // 학생수

	// 부모생성자 + 선생님(자식) 기본생성자
	public Teacher(String name, int height, int weight, int age, String teacherID, int grade, int room, int Stcount) {
		super(name, height, weight, age);

		this.teacherID = teacherID;
		this.grade = grade;
		this.room = room;
		this.Stcount = Stcount;

	}

	// 부모 기본생성자 + 선생님(자식)기본자 생성자용
	public Teacher() {
		super();

	}

	public String getTeacherID() {
		return teacherID;
	}

	public int getGrade() {
		return grade;
	}

	public int getRoom() {
		return room;
	}

	public int getStcount() {
		return Stcount;
	}

	public void setTeacherID(String teacherID) {
		this.teacherID = teacherID;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public void setScount(int scount) {
		this.Stcount = scount;
	}
	
	public void show() {
		 System.out.println("-----------------------------");
		 System.out.println("선생님 이름 : " + getName()); //부모 
		 System.out.println("선생님 나이 : " + getAge());
		 System.out.println("선생님 키 : " + getHeight());
		 System.out.println("선생님 몸무게 : " + getWeight());
		 System.out.println("-----------------------------");
		 System.out.println("담당학년 : " + getGrade()); //선생님
		 System.out.println("담당교실 : " + getRoom()); 
		 System.out.println("학생수 : " + getStcount());

	}
}

