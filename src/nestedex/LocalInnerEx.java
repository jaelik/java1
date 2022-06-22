package nestedex;

import nestedex.StaticInnerEx.StaticInner;

/*
 * 지역(local) Inner 클래스 : 외부 클래스의 메서드나 초기화 블락 안에 선언,
 * 선언된 영역 내부에서만 사용 가능함..
 * 사용 목적은 특정 메서드의 기능에 클래스를 정의 해야만 할 경우 사용됨..
 * 잘 사용하지 않음..
 * 접근할 수 있는 필드는 일반적인 규칙과 같음..
 */
public class LocalInnerEx {
	
	int k = 1;
	class MemberInner{
		int a = 100;
		
	}
	static class staticInner{
		int b = 200;
		static int c = 300;
	}
	//지역 클래스를 정의한 메서드 정의.
	public void myMethod(int gg) {
		int localVar = 100;
		
		class LocalInner{
			int d = 400;
			
			MemberInner in = new MemberInner();
			
			int k = localVar + 10;
			//클래스이기 때문에 메서드도 정의 가능함..
			void doSome() {
				int r = k + d + staticInner.c + localVar + gg;
			}
		}
		new LocalInner().doSome();
	}
	public static void main(String[] args) {
		LocalInnerEx li = new LocalInnerEx();
		li.myMethod(100);
	}

}
