package schoolStudy;

import javax.swing.JOptionPane;


public class WhileTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int kor, math, eng;
		int count = 0;
		while (true) {
			if (count == 0) {
				kor = Integer.parseInt(JOptionPane.showInputDialog("국어 점수 입력(0 ~ 100)"));
				if (kor > 100 || kor < 0) {
					JOptionPane.showMessageDialog(null, "점수가 잘못됨");
					continue;
				}
				count++;
			}
			if (count == 1) {
				math = Integer.parseInt(JOptionPane.showInputDialog("수학 점수 입력(0 ~ 100)"));
				if (math > 100 || math < 0) {
					JOptionPane.showMessageDialog(null, "점수가 잘못됨");
					continue;
				}
				count++;
			}
			if(count == 2) {
				eng = Integer.parseInt(JOptionPane.showInputDialog("영어 점수 입력(0 ~ 100)"));
				if (eng > 100 || eng < 0) {
					JOptionPane.showMessageDialog(null, "점수가 잘못됨");
					
				}
			}break;
		}

	}

}
