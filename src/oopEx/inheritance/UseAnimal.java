package oopEx.inheritance;

public class UseAnimal {

	public static void main(String[] args) {
		
		/*
		 *  자바의 다형성 (Polymorphism) : 다형성이란 객체를 Ref 하는 타입에 따라서 객체를 다양하게 활용 할 수있다는 말임..
		 *  쉽게 , 상속 관계에서 하위 타입의 객체를 생성시 Ref  하는 타입은 같은 타입 또는 슈퍼타입으로 할 수 있다. 
		 *  자신의 타입으로 Ref  할 경우엔 별 문제가 없지만, 상위 타입으로 하는 경우엔 객체의 타입이 Super 타입이기에 
		 *  메서드 호출등에서 문제가 발생한다.
		 *  따라서 필요시 적절한 타입 케스팅을 통해 메서드나, 필드를 호출해야한다. 
		 */
		
		Animal dog = new Dog("두아","푸들");
		Dog mydog = (Dog)dog;  // R타입 객체 타입도 캐스팅이 가능 하며 , 슈퍼클래스로 dog을 선언되었으면  
		// dog 을 선언시 캐스팅을 해줘야한다.  대문자 소문자 확인필요 
		
		Dog dog2 = new Dog("두아","푸들");
		Cat cat =new Cat("루비","친칠라");
		Duck duck = new Duck("도날드덕","헐리웃오리");
		Pigeon pigeon = new Pigeon("비둘기");
		
		//Super 타입(Animal) 로 배열 생성 ..
		Animal[] animals = new Animal[4];
		animals[0] = dog;
		animals[1]= cat;
		animals[2]= duck;
		animals[3]= pigeon;
		
		for (int i = 0; i < animals.length; i++) {
			Animal any = animals[i];
			any.sound();
			if(any instanceof BirdAct) {//instanceof  연산자   == if (any ==duck) 같은말이긴 하나 
				//하나하나 일일이 확인하여 수정할수 없기에 vm에게 직접 실행시 바꾸라고 명령을 내릴떄 하는 명령어
				// 좌측의 Ref 변수가 참조하는 Instace 가 우측의 클래스 타입이 맞다면 true 리턴..
				for(int j=0; j<10; j++) {
					((BirdAct)any).fly();
					if(any instanceof Duck ) {
						if(((Duck)any).getHp() == BirdAct.ALL_ANIMALS_DEATH_ENERGY){
							break;
						}
					}if (any instanceof Pigeon) {
						if (((Duck)any).getHp() == BirdAct.ALL_ANIMALS_DEATH_ENERGY) {
							break;
						}
					}
						
			//((duck)any).layEggs();  //Animal 부모클래스에  duck을 정의했고 케스팅하였으나 .이 최고연산자이기에 
			//컴파일 에러가 뜬다 그래서 케스팅 괄호를 any와 함께 묶는다.
			
			
				}
				
			}
		}
		
		
		
		System.out.println(dog);
		System.out.println(cat);
		System.out.println(duck);
		
		dog.sound();
		cat.sound();
		duck.sound();
		
		
		
		//Animal animal = new Animal("동물"); //필요는 없지만 동물 객첼르 만들어 봅시다.
		
//		Dog dog = new Dog("두아","푸들");
//		System.out.println(dog);
//		dog.sound();
//		
//		Cat cat = new Cat("레옹","페르시안");
//		System.out.println(cat);
//		cat.sound();
//		
//		Duck duck = new Duck("오옹","토종");
//		System.out.println(duck);
//		duck.sound();
	}

}
