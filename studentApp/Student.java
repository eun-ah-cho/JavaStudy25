package studentApp;

public class Student extends Person { //자식 클래스 전화번호, 주소

	private String phone;
	private String adress ; 
	
	
    public Student(String phone, String adress, String name, int age,int hakbun, String major ) {
         		
    	super(name, age, hakbun, major);  // 부모 클래스 정보 끌어옴 : 이름,나이,학번,학과 
       
    	this.phone = phone;
        this.adress = adress;
 
    }	
	
   
    public String getPhone() {
		return phone;
	}

	public String getAdress() {
		return adress;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	public void setAdress(String adress) {
		this.adress = adress;
	}


	public void show() {
        super.show();
        System.out.println("이름: " + getName());
        System.out.println("나이: " + getAge());
        System.out.println("학번: " + getHakbun());
        System.out.println("학과: " + getMajor() );
        System.out.println("전화번호" + phone);
        System.out.println("주소" + adress);
        
    }
}
