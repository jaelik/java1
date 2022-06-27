package nestedex;

import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * 익명(무명) 클래스 : 클래스 이름이 없는 클래스입니다.
 * 일반적으로 인터페이스나 , 추상 클래스등을 일회용으로 사용하고 싶을 떄 이용되면, 활용정도만 익혀두세요
 * 
 */

interface TestInner{
	int data = 10000;
	void printData();
	void yourMethod();
}
public class AnonymousInner {
	
	public void test() {
		//특정 메서드에서 직접 익명 클래스를 오버라이드 및 호출 하는 방법을 봅니다.
		//주의 할 점... 메서드 호출시 ; 가 없습니다.. 다른경우엔 ; 이 필요할떄가 있습니다.
		
		new TestInner() {
			
			@Override
			public void yourMethod() {
				// TODO Auto-generated method stub
				System.out.println(data);
			}
			
			@Override
			public void printData() {
				// TODO Auto-generated method stub
				
			}
		}.printData();    // 메서드 호출시 . 으로 타이핑
	}
	public static void main(String[] args) {
		Frame f= new Frame("자바 GUI");
		Button b = new Button("Close");
		f.setSize(300, 300);
		f.add(b);
		f.setVisible(true);
		
		b.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				System.exit(0);
			}// 제일 많이쓰이는 형태 익명클래스 
		});
		
	}

}
