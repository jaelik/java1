package nestedex;
/*
 * 내부 클래스중 인스턴스(멤버) 클래스는 외부 클래스의 멤버 위치로 선언, 외부 클래스의 인스턴스 멤버처럼 활요 가능합니다.
 * 주로 외부 클래스의 멤버들과 관련된 작업을 필드로만 처리하기 어려울때 정의 하여 사용합니다.
 * 여러분이 주의해서 봐야 할 부분은 Inner 객체를 생성하는 방법과, 접근할 수 있는 범위등만 기억 하세요 .
 * 
 */
public class MemberinnerExam {

	int a = 10;
	private int b = 100;
	static int c =300; 
	
	private int getA() {
		return a;
	}
	//Inner 클래스 정의 합니다.
	class Inner1_1{
		//Inner 클래스도 클래스 이기 떄문에 생성자, 필드 , 메서드 모두 정의 가능합니다.
		// 단 현재 정의하는 클래스는 멤버 Inner 이기 떄문에 static 필드는 갖지 못합니다. 
		
		//static int e =1000;
		static final int e =1000;// 상수로 선언되어지는 static 은 가능합니다.
		int f = 400;
		
		//메서드  정의 해서 외부 클래스의 필드를 활용해 봅니다.
		//
		public void printdata() {
			System.out.println("int a =" +a );
			System.out.println(getA());
			System.out.println("int b =" +b );
			System.out.println("int c =" +c );
			System.out.println("int e =" +e );
		}
	}

	public static void main (String[] args) {
		//Inner 클래스의 객체 생성하는 방법을 알아봅니다. Inner 클래스도 클래스이기에 타입을 먼저 선언한 후 
		//객체를 생성해야 합니다.. (당연하죠..) , 또한 멤버필드처럼 정의 되었기에 Outer 객체가 생성된 후 
		//Inner 객체가 생성되어야 합니다. (이또한 당연하죠)
		//아래는 한방에 Inner 객체 생성식 입니다.. (아우터클래스 객체생성 이너 객체생성이 순성방식입니다)
		MemberinnerExam.Inner1_1 inner1 = new MemberinnerExam().new Inner1_1();
		//아래는 풀어서 객체 생성하는 방법 .. 
		MemberinnerExam outer = new MemberinnerExam();
		MemberinnerExam.Inner1_1 inner2 = outer.new Inner1_1();
		
		inner1.printdata();
	}
}

