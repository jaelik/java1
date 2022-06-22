package oopEx;

public class Calculator {
	
	/*
	 * 4칙 연산을 하는 계산기를 만들어 봅시다
	 * 
	 */

	int fir,sec;
	int result;
	
	//더하기 메서드 정의 
	
	int plus( int a, int b) {
		fir = a;
		sec = b;
		result = fir + b;
		return result;
	}
	private int gob (int a, int b) {
		return result = a*b;
	}
	private double devide(int a, int b) {
		return (double)a/b;
		}
	
	// 외부에서 사칙 연산에 사용되는 공통 메서드 정의 해볼게요..
	// 연산자에 따라서 내부 메서드 호출해서 결과를 출력 하는 기능입니다.
	
	public void calc(char yon, int fir, int sec) {
		int res1 = 0;
		double res2 =0;
		
		switch (yon) {
		case '+':
			res1 = plus(fir,sec);
			break;
		case '*' :
			res1 = gob(fir,sec);
			break;
		case '/' :
			res2 = devide(fir,sec);
			break;

		default:
			System.out.println("아직 실력이 미지하여 뺴기 기능은 구현 못했습니다.");
			return;
		}
		System.out.println(""+fir + yon + sec + " = " + res1);
		String temp = yon+"";
		if(temp.equals("/")) {// 같은말  if (yon == '/'){}
			System.out.println(fir / sec);
		}
		
	}
	
	
	
}
