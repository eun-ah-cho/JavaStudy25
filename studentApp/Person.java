package studentApp;

public class Person { //부모클래스 정보 : 이름,나이,학번,학과
	private String name;
	private int age;
    private int hakbun; 
    private String major;
   
    
 
	public Person() {}

    public Person(String name, int age,int hakbun, String major ) {
        this.name = name;
        this.age = age;
        this.hakbun = hakbun;
        this.major = major;
        
    	}
    
    
    public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public int getHakbun() {
		return hakbun;
	}

	public String getMajor() {
		return major;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setHakbun(int hakbun) {
		this.hakbun = hakbun;
	}

	public void setMajor(String major) {
		this.major = major;
	}   
    

    public void show() {
        System.out.println("이름: " + name);
        System.out.println("나이: " + age);
    }
}