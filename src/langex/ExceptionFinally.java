package langex;

import java.io.FileWriter;
import java.io.IOException;

public class ExceptionFinally {
	
	/*
	 * finally : try {} catch(){} finally{}
	 * 예외의 셋트같은 개념  ,, 대규모의 리소스 작업할떄 사용 ,커넥 작업등 ex)DB 작업 
	 * finally 는 option 과 같아서 예외 핸드링에 익숙해 지면 구현 하지 않는경우도 많습니다. 
	 * finally 는 예외 발생 여부와 상관없이 무조건 실행되는 구문으로 , 좌와 같은 조건으로 구현 
	 * 하고싶을떄 사용됩니다. 당연히 finally 내에도 try catch 를 구현할 수 있습니다. 
	 * 
	 * finally 는 try catch 절을 사용하고 무조건 사용 하게되어있음
	 * finally도  예외 핸들링 try catch문을 사용할때가 있다
	 */
	
	

	public static void main(String[] args) {
		
		String msg ="공부, 운동 , 수면  적절하게 분배하여 실행하도록 나를 가꾸자 !!화이팅";
		
		FileWriter fw = null;
		
		try {
			fw = new FileWriter("message.txt");
			fw.write(msg);
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally { // finally 의 예외 핸들링 사용 예시
			try {
				fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		
		// finally 마지막 무조건 실행되는 예시
		
//		int a =2,b=0;
//			
//		try {
//			System.out.println(a/b);
//		} catch (Exception e) {
//			System.out.println(e.getMessage());
//			
//		}finally {
//			System.out.println("예외 여부와 상관없이 수행됨 ");
//		}
		
		

	}

}
