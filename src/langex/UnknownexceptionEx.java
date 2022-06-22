package langex;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class UnknownexceptionEx {
	static void c() {
		int a = 10;
		int b = 0;
		try {
			int result = a/b;
			System.out.println("결과는--->"+result);
		}catch(Exception e) {
			System.out.println("0으로 나눌수 없습니다. 입력값을 확인하세요 ");
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
	}
	static void b() {
		c();
	}
	static void a() {
		b();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		a();








		String myName = "wonjun";
		byte[] bArr = myName.getBytes();
		FileOutputStream fos = null;
		try {

			fos = new FileOutputStream(myName + ".txt");
			fos.write(bArr);
			fos.close();
			System.out.println("파일을 잘 썻습니다.");
		}catch(FileNotFoundException fnf) {

		}catch(IOException e) {

		}

	}


}

