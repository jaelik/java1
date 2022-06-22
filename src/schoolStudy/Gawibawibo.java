/*
 * 가위 바위보 게임을 만들어 봅시다. 
 * 1. 프로그램이 시작하면 다음 메세지를 출력시키세요     // do while 
 * 1.1가위,바위,보 중 하나를 입력하세요              //sc.
 * 2. 위값이 틀리면 틀린 값입니다. 출력후 재입력시키세요   //if   
 * 3. 만약 5번이상 틀리면 프로그램을 종료 합니다. 라는 메세지를 출력후 종료시키세요.//if 
 * 4. 정확한 값이 입력이 되면 컴퓨터와 게임을 시작 하고 결과를 출력 시키세요 .// else if 
 * 4.1 당신--> 가위, 컴퓨터 -->보. 당신승 // 
 * 5. 위 출력문 후 계속 할건지 물어보세요 (y/n) //if 
 * 5.1 만약 N를 입력하면 게임수,승,패,무,승률(33.3%) 을 출력시킨후 종료시키세요.
 * 5.2 만약 Y를 입력하면 게임은 반복됩니다.
 * 아래는 위 게임을 구성하기 위한 필수 API 몇개 보여드립니다.
 */



package schoolStudy;

import java.util.Scanner;

public class Gawibawibo {

	public static void main(String[] args) {
		 
		int count = 0;
		int userc =0;
		int comc=0;
		int samec=0;
		boolean Y = true;
		boolean N = false;
		int i=0;
		double avg;
	
		
		String player = "가위";
		//사용자의 값이 가위,바위,보 중 어떤것인지 확인하도록 하는 API
		boolean result = player.equals("가위");//만약 가위가 맞다면(공백없이)true 라 리턴됩니다.
		// 입력을 받을때 콘솔 또는 GUI 중 어떤걸 사용해도 무방합니다. 
		
		System.out.println("가위 바위 보 게임을 시작합니다.");
		System.out.println("가위[1], 바위[2],보[3]를 숫자로 입력하세요");
		
		
		do {
			
			Scanner sc = new Scanner(System.in); 
			int a = sc.nextInt();
			if(a==1) {
				System.out.println("당신은 가위 ");
				continue;
			}
			if (a==2) {
				System.out.println("당신은 바위");
				continue;
			}
			if (a==3) {
				System.out.println("당신은 보");
				continue;
			}
			
			if (a > 4 || a < 1) {
				System.out.println("잘못 입력 하였습니다 다시 입력하세요");
				i++;
				
				if(i==5) {
					System.out.println("5회 잘못입력하여 게임을 종료합니다.");
					break;
				}
				
				if(a>=1 || a<=3) {
			
				
				int com = (int) ((Math.random()*3) + 1);//1~3 까지의 정수를 랜덤하게 추출합니다 .
				
				if (com==1) {
					System.out.println("컴퓨터는 가위를 내어.");
					
					if (a==1) {
						System.out.println("비겼습니다");
						samec++;
					}
					if (a==2) {
							System.out.println("사용자가 이겼습니다");
						 userc++;
						}
					if (a==3) {
						System.out.println("컴퓨터가 이겼습니다.");
						comc++;
					}
				}
					if (com==2) {
							System.out.println("컴퓨터는 바위를 내어.");
						
						if (a==1) {
							System.out.println("컴퓨터가 이겼습니다");
							comc++;
						}
						if (a==2) {
								System.out.println("비겼습니다");
							 samec++;
							}
						if (a==3) {
							System.out.println("사용자가 이겼습니다.");
							userc++;
						}
					}		
					if (com==3) {
							System.out.println("컴퓨터는 보를 내어.");
						
							if (a==1) {
								System.out.println("사용자가 이겼습니다");
								userc++;
							}
							if (a==2) {
									System.out.println("컴퓨터가 이겼습니다 ");
									comc++;
								 
								}
							if (a==3) {
								System.out.println("비겼습니다.");
								samec++;
							}	
					}	
			     }
			}
			
			
			
				
				
			
		} while (i<6);
			
		
		
		
			
				
				
			
			
			
		
		
		
	
			
			
		
		
		//0>1>2: 가위바위보
	}

}
	