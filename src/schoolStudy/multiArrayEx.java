package schoolStudy;

public class multiArrayEx {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 다중 배열은 배열내에 배열을 선언하는것으로, 일반적으로 2중 배열정도로만 사용.
		 * 		
		 */
		//다중 배열 생성식...
		int [][] multi = new int[2][3];
		String[][] friends = {{"김","이","박"},{"최","오",	"삼식이"}};
		String myfri = friends[1][2];
//		myfri = friends[0][2];
		System.out.println(myfri);
		//초기화 생성식 
				//int [][] multi2 = {{1,2,3},{4,5,6}};//2*3 배열 초기화함.. 
				//{아우터 {이너}}  이건 [1][1]로 배열 생성하였을경우
		for (int i =0; i <friends.length; i++) {
			//첫동은 0동으로 시작 
			for (int j = 0; j<friends[i].length; j++) {//여기서 j는 이너 배열의 루프변수로 활용
				System.out.println(friends[i][j]);
			}
			
		}
		//향상된 for 구문 ...JDK1.5부터 지원되는 for 구문..
		//배열이나 나중에 배울 컬렉션(collection) 등의 집합 데이터를  지원하는 간단한 for 구문..
		int[] a = {1,2,3};
		for(int b:a) {// a 배열의 끝까지 자동으로 loop 를 돌아 각 index의 값은 b 변수에 자동대입.
			System.out.println(b);
			
			
		}
		//int 타입의 3*3 다중 배열을 생성하시고 변수명은 myMultiArr로 하세요 .
		//생성후 각 index의 값을 0,1,2로 모두 채우세요 .
		
		int [][]  myMultiArr = {{0,1,2},{0,1,2},{0,1,2}};
		 
		
			for (int i = 0; i<myMultiArr.length; i++) {
				//i = i*1;
				
				for (int j = 0; j<myMultiArr[i].length; j++) {
					 
					 //j = j*1;
					myMultiArr[i][j]=j;
				//System.out.println(myMultiArr[i][j]);
					System.out.printf("myMultiArr[%d][%d]",i,j);
				}
			}
				//가변 배열은 inner 배열이 length 가 동적으로 변경되는 형태를 뜻합니다.
				char[] stars[] = new char[10][];
				
				for (int i =0; i<stars.length; i++) {
					stars[i] = new char [i+1];
				
					for (int j = 0; j<stars[i].length; j++) {
						stars[i][j] = '*';
						System.out.print(stars[i][j]);
					}
					System.out.println();
					
				}
				
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
				
				
				
			}//main
		
		
		
		
		
	}


