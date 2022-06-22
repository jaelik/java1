/*
 /* do{}while(조건식)
 * 위 구문은 조거식이 true 인 경우 실행합니다.
 * while()과의 차이점은 do~while은  일단 무조건 한번은 실행 한다는 것입니다.
 * 보통 DB에서 Data 를 가져올떄 등에 쓰이지만 while 구문이 훨씬 많이 쓰인다.
 * 	
 * 
 * 
 */

package schoolStudy;

import java.util.Scanner;

public class dowhileExam {

	public static void main(String[] args) {
		int kor, eng, math, total;
		char grade;
		double avg;

		do {
			System.out.println("국어 점수를 입력 하세요 (0~100) : ");
			Scanner sc = new Scanner(System.in);
			kor = sc.nextInt();

		} while (kor > 100 || kor < 0);

		do {
			System.out.println("국어 점수를 입력 하세요 (0~100) : ");
			Scanner sc = new Scanner(System.in);
			eng = sc.nextInt();

		} while (eng > 100 || eng < 0);

		do {
			System.out.println("국어 점수를 입력 하세요 (0~100) : ");
			Scanner sc = new Scanner(System.in);
			math = sc.nextInt();

		} while (math > 100 || math < 0);

		total = kor + eng + math;
		avg = total / 3.0;

		switch ((int) avg / 10) {
		case 10:
			grade = 'S';
			break;
		case 9:
			grade = 'A';
			break;
		case 8:
			grade = 'B';
			break;
		case 7:
			grade = 'C';
			break;
			
		default:
			grade = 'F';
			break;

		}
		System.out.println("당신의 총점은"+ avg + "평점은" + grade);

	}

	/*
	 * 국영수 세과목점수 입력 받고, 범위 틀리면 해당 과목을 계속 입력 받도록 하세요. 모두 입력을 받으면 총점 ?, 평균 , 학점 A(평균
	 * 90이상) B(80이상 ) c(70이상) 나머지 F를 출력
	 * 
	 * 
	 */

}
