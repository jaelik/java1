/*MultiScoreEx 라는 클래스를 생성하세요 
				 * main메서드내에 아래와 같은 결과가 나올수 있도록 정의 하세요.
				 * 1. 3명의 학생의 성적을 관리하는 프로그램을 구성합니다.
				 * 2. 시작과 동시에 학생 이름을 입력 받으세요.
				 * 3. 이름 입력이 끝나면 국어점수 입력 (0~100) 하도록 하고, 검증후 틀리면 맞을떄까지 반복해서 수행토록하세요.(이미했음)
				 * 4. 이렇게 국,영,수 모든 과목의 점수를 3명에 대해서 입력받고 ,
				 * 5. 출력시 ex> 철수, 영의 , 삼식 이런순으로 입력되었으면 , 철수 총점 : ?, 평균: ?, 학점 :? 나오도록 출력시키세요 .
				 * 6. 반드시 다중배열을 사용하시고 1번이상. 
				 * 7. 반드시!!! 한번의 do {}whileI(); 구문과 그 내부에 한번의 이중 for 구문만 구현되도록 하세요 ..
				 * 8. 만약 7번이 도저히 안되면 나름대로 구현해보세요 .
				 */


package selfstudy;

import java.util.Scanner;

public class day0527multiScoreEx {
	
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		String [] kem = {"국어","영어","수학"};
		String[] name = new String [kem.length];
		
		int[][] score = new int [name.length][name.length+1];
		double[] avg = new double [score.length];
		char[] grade= new char[avg.length];
		
		for (int i= 0; i>kem.length; i++) {
			System.out.println("이름을 입력하세요");
			name[i]=sc.next();
			for (int j = 0; j>score[i].length-1;j++) {
				System.out.println(kem[i]+"점수를 입력하세요 (0~100)");
				score[i][j]= sc.nextInt();
				if (score[i][j]>100 || score[i][j] < 0) {
					System.out.println("잘못된 점수입니다. 정확한 점수를 입력하세요 (0~100)");
					j--;
					continue;
				}
				
				
			}
			
		}//outfor
		
		
	}//main

}
