package oopEx.inheritance;


/*
 * 상속관계에서의 생성자 : 자식 클래스는 생성자를 정의 할 떄  만약 부모 클래스안에 생성자가  이미 정의 되어 있다면
 * 목적에 맞는 생성자를 명시적으로 super(); 를 이용해서 자식 생성자 첫 줄에 반드시 호출 해줘야 합니다.
 * 이유는 부모클래스는 생성자를 상속해주질 않아서 입니다.
 * 
 */

public class Dog extends Animal {

	private String name;//개의 이름 속성
	private String breed;//개의 품종 속성
	
	public Dog(String name , String breed) {
		super("개");
		this.name = name;
		this.breed = breed;
	}
	/*
	 * 메서드 오버라이드(Override) : 상속받은 부모의 메서드중 내용부를 자식 클래스의 목적에 맞게 재정의 하는것.
	 * 이렇게 오버라이드를 하게 되면 부모 메서드는 은닉 되어집니다.(즉 같은 이름으로 호출하게 되면 부모의 내용부는 
	 * 절대 호출되어지지 않는다는 말입니다.)..참고로, 오버라이드 할 떄는 반드시 부모의 메서드와 모든게 같아야 합니다.!!
	 * 접근제어자인 경우 부모보다 같거나 커야합니다. 
	 */
	
	
	@Override
	public void sound() {
		System.out.println("멍멍");
		//super.sound();
	} // 추상메서드를 상속 받으면 오버라이드 하거나  하위클래스 자신이 추상화가 되거나 둘중에 하나이다 
	//위의 오버라이드한것은  첫번째의 오버라이드 한것을 코딩한것이다. 
	
	
	//품종과 이름을 출력 할 수있도록 toString () 을 오버라이드 합니다. 
	public String toString() {
		
		return super.toString()+"이름은 : "+ name +" , " + "품종은 : " + breed; 
	}//부모클래스에서 정의된 내용을 자식 클래스에서 재정의 하게되면  내용은 은닉이 됩니다 
	// 그 은닉된 내용을 호출 위해서는 return뒤에 super.toString() +  이렇게 타이핑하여 호출합니다. 
}
