package accModi;

import oopEx.protectedExam;

/*
 * 
 * 자바 접근 제어자 (Access Modifier) 
 * public >protected > default > private 으로 구성 되어집니다.
 * 클래스엔 public or default 만 사용 가능하고 나머지엔 모두 사용되어집니다.
 * public 은 같은 패키지 여부와 상관 없이 모두 접근 가능한 키워드입니다.
 * protected 는 같은 패키지 내부와, 상속하는 경우 오직 자신만이 접근가능한 접근제어자입니다.
 * default 는 같은 패키지 내에서만 접근 가능합니다. 
 * private 은 only 자신의 클래스에서만 접근 가능합니다. 
 * 
 */
public class ModifireExam extends protectedExam{
	
	public ModifireExam() {
		super("하하");
	}

	public static void main(String[] args) {
	
		

	}

}
