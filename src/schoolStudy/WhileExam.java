/*
 * while(조건식){수행문} 반복문
 * 조건식 true 인 경우만 수행한다.  break, continue 는 동일하게 사용가능하다..
 * 
 */

package schoolStudy;

import javax.swing.JOptionPane;

public class WhileExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean flag = true;
		int kor = Integer.parseInt(JOptionPane.showInputDialog("국어점수 입력(0~ 100)"));
		
		while(kor<= 100 && kor >=0) {
			System.out.println("올바른 점수 입니다.");
		
			break;
			
			
		
		}
		int num = 50;
		while(num >= 50) {
			System.out.println("1");
		} // while
		
		
	}

}
