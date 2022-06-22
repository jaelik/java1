package oopEx.inheritance;

public interface BirdAct extends Floating, Flyable, Huntingfish {
	//인터페이스에는 필드와 메서드만 선언할수 있습니다 
	//이중 필드는 선언과 동시에 public static  final 을 명명받습니다. 즉 공용 상수화 된다는 의미입니다.
	/*
	 * 모든 static  필드 , 메서드는 클래스 로더가 클래스를 메모리에 올리는 시점에 초기화 되어지고, 메모리 영역도 객체와 틀립니다.
	 * 해서 static 의 주체는 class or interface 가 됩니다. 
	 * 이말은 static 을 호출할떄는 주체(class or interface). 필드 or 메서드 로 호출하는게 정상적입니다.
	 * 하지만 객체를 발생후 호출해도 문제는 없습니다.(객체 입장에서는 static 은 과거 이기 때문에..)
	 * 반대로 non-static 에서 static 을 호출하는 경우는 컴파일 에러입니다.
	 */
	int PIGEON_MAX_ENERGY = 100;
	int DUCK_MAX_ENERGY= 80;
	int CHICKEN_MAX_ENERGY=50;
	
	int ALL_ANIMALS_DEATH_ENERGY =0;
	
}
