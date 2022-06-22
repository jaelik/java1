
/*
 * 자바의 반복문 : 반복적으로 실행문을 수행할떄 사용되는 구문..
 * 3가지가 있다 ... for(변수 초기화; 조건식; 증감식), while(조건), do{}while(조건);<<-- 이넘만 끝에 ; 꼭 넣어야 합니다 . 
 * 반복문을 제어 할떄는 조건을 정의 하고 탈출할떄는 break 를 실행문을 건너띄고 조건으로 다시 갈때는 continue 를 이용한다.
 * 필요에 따라서 반복문 내에 반복문을 중첩 정의할 수 있다.
 *
 *
 */

package schoolStudy;

public class LoofForExam {

	public static void main(String[] args) {
		int sum = 0;
		int dan = 3;

		for (int i = 0; i <= 10; i++) {
			sum += i;
		}

		System.out.println(sum);

		// 3단을 출력해보세요 ... 3 * 1 =3.... 3 * 9 = 27

		for (int i = 1; i <= 9; i++) {
			sum = dan * 1;
			System.out.println(dan + " * " + i + " = " + sum);

		}
		sum = 0;
		// 중첩 for...
		// 1. outer for 에 단을 정의 합니다.,
		for (int i = 2; i <= 9; i++) {
			System.out.println(i + "단 시작");
//			if(i % 2 ==0)
//				continue;

			for (int j = 1; j <= 9; j++) {
				if (j > 6)
					break;

				sum = i * j;

//				if(sum % 2 != 0) {
//					continue; //continue를 만나면  아래의 실행문을 건너 띄고, 속한 for의 조건으로 다시 넘어가라는 의미 
//				}
				System.out.println(i + " * " + j + " = " + sum);

			}

			System.out.println(i + " 단 끝 ");

		}

	}

}
