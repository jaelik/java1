package langex;


/*
 * 
 * Object 클래스
 * Object 는 모든 API의 직간접 슈퍼 클래스입니다
 * 컴파일시 컴파일러가 상속을 하도록 해주기 떄문에 클래스는 상속되어진 메서드를
 * 사용가능하거나 오버라이드 할수 있습니다.
 * java.lang 패키지는 컴파일시에 기본적으로 import 되어지기 때문에 import 를 
 * 하지 않아도 됩니다.(lang packege 만 자동 import 됨)
 * 
 */
public class ObjectExam {

	public static void main(String[] args) {
		ObjectExam obj1 = new ObjectExam();
		ObjectExam obj2 = new ObjectExam();
		obj2=obj1;
		
		//Object 클래스의 equals() 를 이용해서 같은 객체 여부를 확인해봅니다.
		if(obj1.equals(obj2)) {
			System.out.println("같은 객체입니다.");
		}else {
			System.out.println("틀린 객체입니다.");
		}
		
		
//		System.out.println("obj2의 원래 해쉬 값--->"+obj2);
//		obj2= obj1;  //이렇게 되면 같은 객체가 됩니다. Ref를 복사하게되는것 
//		
//		
//		// == 연산자를 객체에 이용시 의미는 두 객체의 Ref 가 같은지를 물어보는것이다.
//		// 즉 같은 객체인지를 묻는것이다. 맞으면 true , 아니면 false 리턴된다.
//		
//		if(obj1==obj2) {
//		System.out.println("같은 객체입니다... 즉 Reference가 같습니다.");
//		System.out.println(obj1);
//		System.out.println(obj2);
//		
//		}else {
//			System.out.println("틀린 객체입니다. 즉 Reference가 틀립니다.");
//		}
	}
	
	
}
