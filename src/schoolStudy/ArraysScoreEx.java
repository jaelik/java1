package schoolStudy;

import java.util.Scanner;

/*
 * 
 * 국영수 점수를 입력받아 배열에 담은후 총점 , 평균 , 학점을 출력하도록 해봅니다.
 */

public class ArraysScoreEx {

	private static Scanner sc = new Scanner(System.in);//메인 메서드에서 콘솔 입력받을 Scanner 객체를 필드로 초기화 합니다.
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] scores = new int[4];// 총점 포함 4개의 index를 생성
		String[] subject = { "국어 점수 입력 : ", "수학 점수 입력 :", "영어 점수 입력 : " };

		double avg;
		char grade;
		
		
		do {
			System.out.println(subject[0]);
			scores[0]= sc.nextInt();
		} while (scores[0] > 100 || scores[0] <0);
		  
		
		do {
			System.out.println(subject[1]);
			scores[1]= sc.nextInt();
		} while (scores[1] > 100 || scores[1] <0);
		
		do {
			System.out.println(subject[2]);
			scores[2]= sc.nextInt();
		} while (scores[2] > 100 || scores[2] <0);
		
			for (int i =0; i <scores.length-1; i++){
				scores[scores.length-1] += scores[i];
			}
			 avg = scores[3]/3.0 ; 
			
			System.out.println("국어점수"+scores[0]+"수학점수"+scores[1]+"영어점수"+scores[2]);
			System.out.println("총점은"+scores[3]+"평균은"+avg );
	}

}
