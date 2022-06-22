package selfstudy;

import java.util.Scanner;

/*
 * 과제 
 * 
 * email 를 입력 받아 회원 가입을 시키는 프로그램을 짠다고 가정합니다.
 * 조건은 아래와 같습니다.
 * IDCheacker.java 를 생성후 정의 하세요 ..
 * 1.Email 입력하세요 
 * 2.받은 이메일을 검증합니다.
 * 3.1 ID는 반드시 8자 이상 12자 이하 여야 합니다.
 * 2.2 @는 반드시 포함 되어있어야 합니다. 
 * 2.3 ID중 하나이상은 반드시 영 대문자가, 숫자 하나가 포함되어야 합니다. 
 * 2.4 위 ID 를 검증하시고 만약 위배되는 경우가 발생되면 에러 내용을 출력 시키세요  syso
 * ex> 8자가 미만입니다 or 12자를 초과 합니다 or  @가 없습니다. or 숫자는 반드시 하나이상 존재 해야합니다 
 * or 영 대문자는 반드시 하나이상 존재 해야합니다. 
 * 2.5 메일 서버가 .com or .net or .co.kr 로 끝나는 경우 메일 서버를 . java.com 으로 변경해서 
 * 출력시키세요 .. replaceof 
 * ex>Aaa12345@aaa.com --> Aaa12345@java.com 
 * 
 */
public class IDCheacker {

	public static void main(String[] args) {
	
		System.out.println("이메일을 입력하세요");
		Scanner sc = new Scanner(System.in);
		
		String myMail= sc.next();
		
		char abc ='1';
	
		int idx = myMail.indexOf('@');
	
		String id =myMail.substring(0,idx);
		String server = myMail.substring(idx+1);

//		System.out.println(id);  //id 분리 송출
//		System.out.println(server); // 서버 분리 송출
		
		
		if (idx != -1 ) {
			if(id.length() >= 8 && id.length() <=12) {
				System.out.println("아이디 길이통과 ");
//				for(int i=0; i>=id.length(); i++) {
//				id.charAt(i);
					if (id.matches(".*[A-Z].*"))  {//(abc>='A' && abc<='Z')   ,,charactor.isDigit is Uppercase (ch) 등으로도 가능
					System.out.println("대소문자통과");
						if (id.matches(".*[0-9].*")) {
							System.out.println("숫자 통과");
							
							
						}else {
							System.out.println("이메일 아이디에는 숫자 1개이상은 들어가야합니다.");
						}
					
					}else  {
					System.out.println("이메일 아이디에는 대문자가 1자 이상은 들어가야합니다.");
					}
					
			}else {
				System.out.println("id는 8자 이상 12자 이하여야 합니다");
			}
			
			
		}else {
			System.out.println("잘못된 이메일 형식입니다, @ or 도메인형식을 확인하세요  .com  , .net ");
		
		}
//		myMail.replace(".com",".java.com");
		myMail=myMail.replaceAll(server,"java.com");
		System.out.println(myMail);
//		if(sc==)
//		System.out.println(sc);
	}

}
