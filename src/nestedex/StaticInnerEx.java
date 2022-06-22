package nestedex;
/*
 * 
 * 외부 클래스의 필드 위치에 정의 하는건 같습니다. 단 , 외부클래스의 static 필드처럼  취급되어집니다.
 * 외부 클래스의 static 멤버, 특시 static 메서드에서 사용될 목적으로 정의 되어집니다.
 * 만약 내부 클래스에서 static 필드 (상수아님) 을 선언해야 할경우엔, Inner 도 static 으로 선언되어져야 합니다
 */
public class StaticInnerEx {

	int a = 10;
	private int b = 100;
	static int c =200; 
	
	public int getA() {
		return a;
		
	}
	public static int getC() {
		return c;
		
	}
	
	//static Inner 정의 
	public static class StaticInner{
		
		//static Inner 클래스에도 필드와 메서드 정의 가능합니다. 멤버필드도 정의 가능합니다. 
		//static Inner 에서 Outer 를 접근할떄의 접근 방법만 기억하세요.
		
		int d =300;
		static final int e =400;
		static int f = 500;
		
		public static void printA() {
			//System.out.println(a); // static 에서 nonstatic 호출 불가 
			System.out.println(c);
			
			System.out.println(getC());
			//System.out.println(d);  static Inner 의 멤버필드 또한 직적접근 불가 . 객체를 만들어야 가능
			
			System.out.println(e + " ::" + f);
		}
		
		//static Inner 에서 멤버 메서드 정의시 호출 가능 범위 확인..
		// 외부 nonstatic 은 모두 접근 불가
		public void printB() {
			//System.out.println(a); // 접근 불가 
			//System.out.println(b);  동일 불가
			System.out.println(c);//static --> static 끼리만 가능
			//System.out.println(getA()); 호출 불가 
			System.out.println(getC());//static 은가능
			
			printA();// 당연히 가능
			
			
		}
		
		
		public static void main(String[] args) {
			//static Inner 의 필드를 (메서드,필드) 호출하는 방법..
			StaticInnerEx.StaticInner.printA();
			
			StaticInnerEx.StaticInner sInner = new StaticInner();
			sInner.printB();
			
			
		}
		
	}
}
