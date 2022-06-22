package oopEx.inheritance;

import oopEx.inheritance.Flyable; // extends 상속 받은후 implements 인터페이스 구현 하기전에 import로 class파일을 정해줘야한다

import oopEx.inheritance.Floating;
import oopEx.inheritance.BirdAct;

//import oopEx.*;// oopEx 패키지내의 모든 API 를 import 한다는 의미 *;
//import의 개념 패키지와 다른 패키지는 종속되지 않기에 다른패키지내에 클래스파일을 불러오거나 상속시킬때 사용 

//정의: 메서드를 정의하는등의 행위
//구현: 그메서드를 오버라이드 할떄

/*
 * 상속관계에서의 생성자 : 자식 클래스는 생성자를 정의 할 떄  만약 부모 클래스안에 생성자가  이미 정의 되어 있다면
 * 목적에 맞는 생성자를 명시적으로 super(); 를 이용해서 자식 생성자 첫 줄에 반드시 호출 해줘야 합니다.
 * 이유는 부모클래스는 생성자를 상속해주질 않아서 입니다.
 * 
 */

public class Duck extends Animal implements BirdAct{// 인터페이스 상속을 받을떄는 extends 다음에 implements 상속받을 인터페이스명 으로 진행
//패키지 폴더와 폴더간의 종속되지 않기에 import로 해당 패키지안에 클래스파일을 지정해야줘야 한다. 
//디폴트패키지간에는 자동으로 종속진행 
	
	private String name;//개의 이름 속성
	private String breed;//개의 품종 속성
	
	
	private int hp;
	//에너지 필드를 추가합니다.
//	public final static int max_Energe; // final 과 static 은 값을 공유와 고정을 할떄 같이 쓰임
//	public int death_Energe = 0;
	
	
	public Duck(String name , String breed) {
		super("오리");
		this.name = name;
		this.breed = breed;
		
	}
	@Override //구현 
	public void sound() {
		System.out.println("꾁꾁");
		//super.sound();
	}
	//오리가 알을 낳는 기능을 추가합니다.
	public void layEggs() {
		System.out.println("오리가 알을 낳다.");
		
	}
	public void fly() {
		System.out.println(this.type + " 날다..");
		
		try {
			
			if (hp == BirdAct.ALL_ANIMALS_DEATH_ENERGY) {
				System.out.println(this.type+"이 에너지가 고갈되어 죽었습니다.");
			}
			Thread.sleep(2000);
			
			System.out.println(this.type+"날다");
			hp -= 10;
			
			System.out.println("현재 에너지 : = " +(hp));
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}//2초 쓰래드가 잠들었다 재 실행함. 쓰래드는 나중에 배웁니다.
	}
	
	public void floating() {
		System.out.println(this.type + "물위에 둥둥..");
		
	}
	
	
	public int getHp() {
		return hp;
	}
	
	
}
