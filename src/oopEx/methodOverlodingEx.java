package oopEx;

/*
 * 메서드 오버로딩 : 같은 접근제어, 리턴타입, 이름으로 하나 이상의 메서드를 
 * 정의 하는 형태, 단,  파라미터 시그니처는 틀려야함 ...(생성자 오버로딩과 같이) 
 * 이렇게 하는 이유는 큰틀에서 하는 기능은 같으나 세부적인 내용이 조금씩 차이나는 
 * 기능을 정의 해 사용하기 위함이다. 
 * 
 */


public class methodOverlodingEx {  //메서드 오버로딩 예시 
	
	static int plus (char yon , int a , int b) {
		return a +10;
	}
	static int plus (String yon , int a , int b) {
		char y = yon.charAt(0);
		return a+b;
	}
	static int plus (int yon, int a, int b) {
		char y = (char)yon;
		return a+b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String email = "whowhoman@naver.com";
		
		int index = email.indexOf("@");
		System.out.println("여러분의 이메일의 @는"+ index + "번쨰 있습니다" );
	}

}
