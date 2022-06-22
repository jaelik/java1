/*
 *  자바의 조건 if 
 *  if (조건식){  조건식 결과가 true 시 실행구문 정의}
 *  위 if 는 필요시 마다 중복 정의 할수있고 , if 내에 if 를 또 정의 할 수있다.
 *  만약 모든 조건식 (else 포함 )에서 {} 을 하지 않으면 바로 아래의 한문장만 
 *  해당 조건문의 명령문으로 인식한다.
 */

package schoolStudy;

import javax.swing.JOptionPane;

public class IfExam2 {

	public static void main(String[] args) {
		
//		String sAge = JOptionPane.showInputDialog("당신의 나이를 입력하세요");
//		int age = Integer.parseInt(sAge);//정수로 되어진 문자열의 정수 값을 추출 하는 API 응용..
//		
//		//성인 여부를 검사해 봅시다 .. 만 18세 이상은 성인으로 아닌경우 미성년자로 출력시켜봅니다.
//		
//		if (age >= 18) {
//			System.out.println("당신은 성인 입니다.");
//		}else
//			System.out.println("당신은 미성년자 이군요 ..");
//	
//	System.out.println("이건 메인메서드 구분입니다.");
//	
		String sKor = JOptionPane.showInputDialog("국어 점수를 입력하세요(0~100)");
		int kor = Integer.parseInt(sKor);
		
		char grade = 'F';
		
		if(kor < 100 && kor >= 0) {
			if (kor >= 90) {
				grade = 'A';
			}else if (kor >= 80 && kor < 90) {
				grade = 'B';
				
			}else {
				System.out.println("올바르지 않은 점수입니다.");
			}
		}
		
		
//		if(kor > 0) {
//			if(kor <= 100) { 
//				if(kor >= 90) {
//					grade = 'A';
//					//System.out.println("당신의 학점 A 입니다.");
//				}else if ( kor >= 80) {
//					grade = 'B';
//					//System.out.println("B학점 입니다.");
//				}else if  ( kor >= 70) {
//					grade = 'C';
//					//System.out.println("C학점 입니다.");
//				}else if (kor >= 60 ) {
//					grade = 'D';
//					//System.out.println("D학점 입니다.");
//			
//				
////				}
////			}else { 
////				System.out.println("점수는 100보다 클수 없습니다.");
////				return;
////			
////			}
////		
////		}else {
////			System.out.println("점수는 0보다 작을수 없습니다.");
////			return;
//			
//		}
//		
//		System.out.println("당신의 점수는"+kor+"이고"+"학점은"+grade+"입니다");
		
	}
	
	
	
	
	

}
