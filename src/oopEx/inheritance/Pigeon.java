/**
 * 
 */
package oopEx.inheritance;

import oopEx.inheritance.BirdAct;
/**
 *
 *
 */
public class Pigeon extends Animal implements BirdAct {

	private int hp;
//	public int max_Energe = 50;
//	public int death_Energe = 0;
	
	
	public Pigeon(String type) {
		super("비둘기");
		hp = BirdAct.PIGEON_MAX_ENERGY;//static 은 class꺼라 birdact에서 선언된 값을 .으로 불러와 공용으로 쓸수있다
	}

	
	public void floating() {
		
		System.out.println(this.type+"물고기 사냥");
	}

	
	public void fly() {
		try {
			
			if (hp ==BirdAct.ALL_ANIMALS_DEATH_ENERGY) {
				System.out.println(this.type+"이 에너지가 고갈되어 죽었습니다.");
			}
			Thread.sleep(2000);
			hp -= 10;
			
			System.out.println(this.type+"날다");
			
			System.out.println("현재 에너지 : = " +(hp));
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}//2초 쓰래드가 잠들었다 재 실행함. 쓰래드는 나중에 배웁니다.
		

	}

	
	public void sound() {
		
		System.out.println(this.type+"구구구 소리내다");

	}
	
	public int getHp() {
		return hp;
	}

}
