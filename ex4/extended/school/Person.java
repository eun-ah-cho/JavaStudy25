package ex4.extended.school;

public class Person {
	//Person person = new Person(이름,키,몸무게,나이) 
	private String name;
	private int height;
	private int weight ;
	private int age;
	
	

	public Person(String name, int height, int weight, int age) {
		super(); //부모생성자 조상 -> superclass (자바의 최상위 부모객체) 
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
	}

	public Person() {
		super();
	}

	
	//게터 세터 메서드 (필드가 개인적으로 선언되었기 때문에 메서드로 접근 -> 캡슐화 )  
	public String getName() {
		return name + "님";
	}

	public void setName(String name) { //파라미터로 받은 이름을 필드로 전달한다. 
		this.name = name;
	}



	public int getHeight() {
		return height ;
	}



	public void setHeight(int height) {
		this.height = height; //파라미터로 받은 키를 필드로 전달한다. 
	}



	public int getWeight() {
		return weight;
	}



	public void setWeight(int weight) {
		this.weight = weight;
	}



	public int getAge() {
		return age;
	}



	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
}//클래스 종료 
