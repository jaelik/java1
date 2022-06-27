package langex;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/*
 *Throws : 예외를 전가 및 선언 하는 키워드 입니다.  //예외를 선언하는것과 비슷한 개념
 *만약 어떤 특정 API 의 메서드, 생성자에서 알려진 예외가 발생되는 코드가 있을떄 해당 예외를 직접 핸드링 하지 않고 
 *해당 예외가 발생할 코드가 있다고 선언하는  형태입니다.  만약 해당 API를 사용 할 떄 예외가 발생하면 예외 객체는 
 *API를 호출한 코드로 전가 되어지고, 아무도 핸들링 하지 않으면 예외는 프로그램 밖으로 빠지게 되어 비정상 종료되어집니다.
 * 
 */

class MyException extends Exception{
	//Exception 클래스를 상속 받은 user 예외 클래스 정의.
	
	public MyException(String message) {
		super(message);
	}
	
}
public class ThrowsExam {// throws 전가 예시 txt 파일 message를 뒤에 a를 타이핑하여 일부러 예외발생시킴

	public static void main(String[] args)   {
		try {
			a();
		} catch (MyException e) {
			// TODO Auto-generated catch block
			
		}
		

	}

	static void a() throws MyException {
		try {
			b();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			throw new MyException("파일명이 틀렸거나 경로가 틀렸습니다");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();  // 스텍트레이스  문제발생의 스텍을 쌓아 콘솔에 보여지는 형태  시작점은 콘솔에서 위에서부터 알수있다 
		}
	}
	static void b() throws FileNotFoundException,IOException {// 콤마를 기준으로 예외를 나열가능 
		//File 을 읽어 들이는 작업을 합니다.
		FileReader fr= null;
		
		fr = new FileReader("message.txt");
		
		int data = 0;
		// 파일을 읽는 메서드 호출하여 읽은 데이터를 콘솔에 출력합니다.
		while(true) {
			data = fr.read();
			if(data == -1)
				break;
			System.out.print((char)data);
			
		}
		fr.close(); //  예외를 잡았을떄는 finally를 사용하지않아도된다 
	}
}
