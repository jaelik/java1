package utilEx;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListEx1 {

	
	public static void main(String[] args) {
		
		ArrayList list1 = new ArrayList();   // <> 제네릭  해당 integer 나 string 타입만 들어갈수있도록 정의
		
		//요소 추가..
		list1.add(5);
		list1.add(4);
		list1.add(3);
		list1.add(2);
		list1.add(1);
		list1.add(3);
		list1.add(0);
		list1.add("5");   //array 리스트는 String int  다같이 들어감 
		
		
		for (int i =0; i<list1.size(); i++) {
			System.out.println(list1.get(i));
		}
		List list = list1.subList(1, 4);
		ArrayList list2 = new ArrayList(list);
		
		print(list1,list2);
		
		ArrayList list3 = new ArrayList();
		list3.add("윤석열");
		list3.add("문재인");
		list3.add("박근혜");
		list3.add("이명박");
		list3.add("노무현");
		list3.add("dr.starange");
		list3.add("iron man");
		list3.add("Hulk");
		list3.add("Spider man");
		
		//Collections.sort(list1);  //정렬 예시
		Collections.sort(list2);
		Collections.sort(list3);
		
		print(list2,list3);
		
		// 리스트에서 겹치는 부분을 제외하는 메서드 활용
		System.out.println(list1.retainAll(list2));
		print(list1,list2);
		
		
		
	}
	
	//출력 메서드 정의.. 이 메서드는 arrayLIst 의 요소 (Elements) 를 출력하도록 정의 합니다. 
	static void print(ArrayList list1, ArrayList list2) {
		System.out.println("list1 : " + list1);
		System.out.println("list2 : " + list2);
	}
}
