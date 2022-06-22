package oopEx.inheritance;

//날수 있는 기능을 가진 interface 정의함.


public interface Flyable {

	//인터페이스의 메서드는 abstract 을 선언하건 안하건 컴파일시 무조건 들어감.
	//인터페이스 생성시 형용사로 이름을 지어줘야하며  외부로 노출되기떄문에 public으로 생성을 많이함 
	// abstract 메서드이기때문에 바디가 없고 세미콜론 ; 을 찍어야한다.
	
	abstract void  fly ();

}
