package oopEx;

public class javaClassPerson {//우리반 학생들을 정의 하는 클래스 입니다.
	
	/*
	 * 멤버필드 정의
	 */
	
	/*
	 * Encapsulation : 캡슐화 ...객체의 중요 요소인 필드를 외부 (자신의 클래스 밖) 에서 직접 접근 할 수 없도록 하는 방법
	 * private 이라는 키워드를 이용해서 필드의 캡슐화를 적용할수 있다.
	 * 만약 메서드도 캡슐화 할 경우 똑같이 이용하면 된다.
	 * 
	 */
	private String name;
	private String addr;
	private int age;
	private char gender;
	
	/*
	 *  생성자 (Constructor) : 자바의 생성자는 클래스를 객체화 할떄 (Instance) 해당 역할을 해줍니다.'
	 *  일단 문법적인 면을 보면, 메서드와 비슷하지만 리턴 타입이 없고 , 클래스이름과 정확히 같아야 합니다.
	 *  생성자가 하는 기능을 더 말하자면, 객체의 초기화 역활을 합니다. 즉, 객체를 만들떄 필요한 만큼의 
	 *  멤버필드를 초기화 하여 객체를 생성할 수 있다는 말입니다.(이렇게 되면 기본객체가 아니고, 더이상 기본객체를 만들수없음)
	 *  여러분이 기본 객체를 생성할 수 있었던 이유는 자바 컴파일러가 컴파일시 기본 생성자를 제공하기 떄문입니다.
	 *  만약 여러분이 생성자를 하나라도 정의 하면 기본생성자는 제공되지 않습니다. 
	 *  즉 이말은 객체를 생성할 수 있는 가이드라인과 같은 역할도 한다는 의미입니다.
	 */
	
	
	
	/*
	 *  생성자 /메서드 오버로딩 (OverLoading) : 생성자나 메서드를 같은 이름으로 정의시 파라미터의 Signature 에 따라서 
	 *  동적으로 호출되도록 하는 기능
	 *  Signature 는 파라미터의 갯수, 타입, 순서 중 하나라도 틀리면 다르게 인식합니다.
	 */
	
	/*
	 * 생성자  this([parameter]): 생성자에서 다른 생성자를 호출시에 사용되는 키워드입니다.
	 * 반드시 생성자 바디의 첫 코드에서 호출되어야 하고 한번만 호출 할 수 있습니다.
	 * 
	 */
	public javaClassPerson(String name) {//생성자 초기화는 갯수 변수 파라미터가 같으면 안된다 
		this.name = name;
	}
	public javaClassPerson(String name, String addr ,int age ,char gender) {
		this(name); 
		this.addr = addr;
		this.age = age;
		this.gender = gender;
	}
	

	
	/*
	 * 객체 필드의 값을 해쉬가 아닌 실제 값으로 문자열로 되돌려주는 toString()를 정의해 봅니다..
	 * 나중에 상속떄 왜 이게 되는지 이해 될테니, 지금은 위의 구문간 기억하세요.
	 * 
	 */
	/*
	 
		
		return "이름은" + name +"나이는" + age + "성별은" + gender + "주소는"+addr;
	}
	 */
	/*
	 * 자바 메서드 (method) : 클래스가 객체화 되어 특정 기능을 수행할 수 있도록 (멤버 메서드)
	 * 또는 클래스 자체(static method)에서 특정 기능을 수행 할 수 있도록 구현하는 것. 
	 * 메서드는 아래에 같은 문법을 가지고 있습니다. 
	 * [access modifier (public, protected,default,private] [static] returntype (P or R or void ) methodName ([parameter]){
	 *     // 메서드 바디 (method body)
	 * }
	 * 
	 * 
	 */
	public String getAddr() {
		return addr;
	}
	public int getAge() {
		return age;
	}
	public char getGender() {
		return gender;
	}
	public String getName() {
		return name;
	}
	
	void setAddr (String addr) { //seter 는 return 값이 없어도 됨으로 void 로 코딩 
		this.addr = addr;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
}
