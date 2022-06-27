package utilEx;

public class Student {

	//이름과 이메일주소  핸드폰번호 입력받아 저장  , 
	
	String name;
	String Hp;
	String Email;
	
	
	public Student (String name,String Hp , String Email) {
		this.name= name;
		this.Hp=Hp;
		this.Email= Email;
	}

	public String getEmail() {
		return Email;
	}
	public String getHp() {
		return Hp;
	}
	public String getName() {
		return name;
	}
	
	
}
