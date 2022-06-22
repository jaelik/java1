package langex;

import java.util.Arrays;

/*
 * String class : 문자열을 객체화 하여 관리합니다.
 * 문자열객체(String)를 생성하는 방법은 크게 2가지가 있는데, ""를 이용하는 방법과, 생성자 또는 메서드를 이용하는 방법입니다.
 * 이중 "" 을 이용해서 생성되는 문자열 객체를 리터럴문자열 객체라고 하는데, VM은 ""를 이용해서 생성된 문자열 객체를 관리하는
 * 메모리를 따로 생성하여 사용하기떄문에, 객체를 생성하기 전에 값이 같은 객체가 존재하는지를 먼저 검사해서 만약 있다면 해당 
 * 객체의 Ref를 리턴하여 줍니다. 이렇게 되면 , 변수명은 틀려도 같은 객체가 됩니다.
 * 나머지는 모두 다른개체로 생성하게 됩니다. 
 * 
 */
public class StringExam {

	public static void main(String[] args) {
		

		String a = "AB";
		String b = "CD";
		String c = "AB";
		
		if(a==c) {
			System.out.println("같은 객체 입니다. 당연히 값도 같겠네요");
		}
		
		byte[] bArr = {65,66,67,68,69};
		String str = new String(bArr);
		System.out.println(str); // byte를 응용 설명 
	
		String myName = "황원준";  
		bArr = myName.getBytes();
		System.out.println(Arrays.toString(bArr));//byte로 쪼개면 한글은 인코딩했다 한다..//
		str = new String(bArr);
		System.out.println(str);
		
		str = new String(bArr,0,bArr.length);
		System.out.println(str);
		
		char[] cArr = myName.toCharArray();
		System.out.println(Arrays.toString(cArr));
		
		str = new String(cArr,0,2);
		System.out.println(str);
	
		String myMail = "whowhoman@naver.com";
		for(int i = 0; i <myMail.length(); i++) {
			char ch = myMail.charAt(i);
			System.out.println(ch);
		
		}
	
		int codePoint = myName.codePointAt(0);
		System.out.println("내성의 유니코드 값-->>"+ codePoint);
		
		int[] iArr = {codePoint};
		String uniName = new String(iArr,0,1);
		System.out.println(uniName);
		
		if(myMail.contains("@")) {
			System.out.println("올바른 이메일 형식임");
		}else {
			System.out.println("@가 누락되었습니다");
		}
		String t1 = String.copyValueOf(cArr);
		System.out.println(t1);
		
		// equls ,equalsIgnoreCase  적절한 활용 예
		String s1 ="ABc";
		String s2 ="ABC";
		if(s1.equalsIgnoreCase(s2)) {//equals 서로 같은지 확인(대소문자 다같은지확인)  ,equalsIgnoreCase 대소문자 구분없이 확인 
			System.out.println("값이 같습니다.");
		}else {
			System.out.println("값이 틀립니다");
		}
		//indexof 의 설명 
		//return 값이 int 인경우  값이 없을떄 -1로 표기 
		//System.out.println("@ 인덱스 --> " + myMail.indexOf("@x"));
	
		//indexOf()를 이용해서 @ 가 위치한 index 값을 찾아봅시다.
		System.out.println("@ 인덱스 --> " + myMail.indexOf("@n"));// 인덱스가 시작하는 @째부터 번호로표기 
		// indexOf() fromindex  사용예시
		myMail += "@";
		System.out.println(myMail);
		
		int idx2= myMail.indexOf('@',myMail.indexOf('@')+1);
		System.out.println(idx2);
		//lastindexOf 마지막부터 찾아서 확인하지만 인트 리턴값은 처음시작점부터 확인해서 리턴 
		System.out.println(myMail.lastIndexOf("@"));
		//replaceAll 사용 예시  기존 문자열을 수정하는것이 아니라 새로운 문자열을  만들어낸후 붙여내는 방식 
		myMail += "x";
		
		myMail = myMail.replaceAll("@x", "");	// myMail에다가 = myMail 이렇게 사용하는 이유 
		System.out.println(myMail);
	
		//@ 기준으로  아이디와 주소를 나누는 예시  substring 사용문 
		int idx = myMail.indexOf('@');
		if (myMail.indexOf('@') != -1) {
			String id =myMail.substring(0,idx);
			String server = myMail.substring(idx+1);
			System.out.println(id);
			System.out.println(server);
			
			
		}
		//id 입력하세요 ...aaa 공백등을 사용할경우  이런것들을 없앨수있는 문 (앞과 뒤만 없앨수있음)
		String t2 =" abc ";
		System.out.println(t2.length());
		t2 = t2.trim();
		System.out.println(t2);
	
		int aa =1;
		String vOf= String .valueOf(aa);
		//parseInt 사용 예시 문자열을 인트값으로 변경 
		System.out.println(Integer.parseInt(vOf)+1);
		
		
	}
	
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
	

}
