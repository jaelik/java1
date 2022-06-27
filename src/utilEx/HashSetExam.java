package utilEx;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class HashSetExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 * HashSet 을 이용해 로또 생성기를 만들어 봅니다.
		 * 중복을 허용하지 않는 특성을 이용하는데 포커스를 두세요.
		 */
		
		Set set = new HashSet();
		
		for (int i = 0; set.size()<6; i++ ) {
			set.add((int)(Math.random()*45)+1);
		}
		
		List list = new LinkedList(set);
		Collections.sort(list);
		
		System.out.println(list);
	}

}
