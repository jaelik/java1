package oopEx.inheritance;


/*
 * 상속관계에서의 생성자 : 자식 클래스는 생성자를 정의 할 떄  만약 부모 클래스안에 생성자가  이미 정의 되어 있다면
 * 목적에 맞는 생성자를 명시적으로 super(); 를 이용해서 자식 생성자 첫 줄에 반드시 호출 해줘야 합니다.
 * 이유는 부모클래스는 생성자를 상속해주질 않아서 입니다.
 * 
 */

public class Cat extends Animal {

	private String name;//개의 이름 속성
	private String breed;//개의 품종 속성
	
	public Cat(String name , String breed) {
		super("고양이");
		this.name = name;
		this.breed = breed;
		
	 
	}
	@Override
	public void sound() {
		System.out.println("야옹");
		//super.sound();
	}
}
