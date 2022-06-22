package selfstudy;

import java.util.Scanner;

public class IDChecker2 {
	Scanner sc = new Scanner(System.in);
	
	private int idx = -1;
	
	private String mailId;
	private String mailServer;
	
	private int upperCharCount;
	
	private int digitcount;
	
	
	public boolean isEmail(String email) {
		if(email.indexOf('@') == -1)
		return false;
		
		idx = email.indexOf('@');
		splitEmail(email);
		return true;
	}
	
	private void splitEmail(String email) {
		mailId = email.substring(0,idx);
		mailServer = email.substring(idx+1);
	}
	
	public void isUpperCase(String mailId) {
		//for 를 이용해서 mailId의 문자열을 문자로 하나씩 꺼내옵니다.
		//해서 대문자 내에 포함되어진 문자라면 upperCharCount 를 증가시키고 break; 합니다.
		for(int i = 0; i < mailId.length(); i++) {
			char ch = mailId.charAt(i);
			if(ch >= 'A' && ch <= 'Z') { //  같은 문 if(Chatacter.isUpperCase(ch))  ///? 계산이되는 과정이 궁금  소문자는 숫자값으로 잡히는것이 아닌지?
				upperCharCount++;  // 대문자확인후 인트값 증감으로  대문 구분 
				break;  //  대문자확인후 끝날수있게 break  
			}
		}
	}
	
	public void isDigit(String mailId) {
		//for 를 이용해서 mailId의 문자열을 문자로 하나씩 꺼내옵니다.
		//해서 대문자 내에 포함되어진 문자라면 upperCharCount 를 증가시키고 break; 합니다.
		for(int i = 0; i < mailId.length(); i++) {
			char ch = mailId.charAt(i);
			if(ch >= '0' && ch <= '9') {//같은 문 if(Chatacter.isDigit(ch))
				digitcount++;
				break;
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		System.out.println("이메일을 입력해 주세요.");
		
		
		IDChecker2 checker = new IDChecker2();
		String email = checker.sc.next();
		
		if(!checker.isEmail(email)) {
			System.out.println("@가 없습니다. 프로그램을 종료합니다.");
			System.exit(0);//실행중인 자바를 명시적으로 종료합니다.			
		}else {
			if(checker.mailId.length() >= 8 && checker.mailId.length() <= 12) {
				checker.isUpperCase(checker.mailId);
				if(checker.upperCharCount > 0) {//대문자가 한개라도있으면 true
					checker.isDigit(checker.mailId);
					if(checker.digitcount > 0) {
						if(email.endsWith(".com") || email.endsWith(".co.kr")|| email.endsWith(".net")) {
							email = email.replaceAll(".com", ".javacom");
							email = email.replaceAll(".co.kr", ".javacom");
							email = email.replaceAll(".net", ".javacom");
							System.out.println(email);
						}
					}else {
						System.out.println("숫자 없음");
						System.exit(0);
					}
				}else {
					System.out.println("대문자 없음");
					System.exit(0);
				}
					
			}else {
				System.out.println("id는 8~12자 이내여야 합니다.");
				System.out.println("당신의 id 길이" + checker.mailId.length());
				System.exit(0);
			}
			
		}

	}

}

