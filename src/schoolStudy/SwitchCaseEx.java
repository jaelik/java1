/*
 * switch (조건변수)
 *  case true : 실행문. (if ,else if 의 나열과 같음)
 *  break; 탈출구문
 *  case:
 *  break;
 *  default: // else 와 같은기능.. 위의 조건에 하나도 만족 못할떄 실행구문.
 *  }
 *  위 조건 변수는 기본적으로 정수 타입만 들어올수있습니다.
 * 
 */


package schoolStudy;

public class SwitchCaseEx {

	public static void main(String[] args) {
		
		char grade = 'a';
		
		switch (grade) {
		case 'a':
			System.out.println("당신은 장학생 입니다.");
			break;
			
		case 'b':
		System.out.println("좀 더 노력하세요");
			break;
		
			default:
				System.out.println("공부하세요");
			break;
		}

	}

}
