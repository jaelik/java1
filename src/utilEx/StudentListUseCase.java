package utilEx;

import java.util.ArrayList;

public class StudentListUseCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Student jaelik = new Student("황원준","010-1111-1111","whowhoman@naver.com");
		Student tome = new Student("톰","010-1111-1111","tome@naver.com");
		
		ArrayList<Student> hakseng = new ArrayList<Student>();
		hakseng.add(jaelik);
		hakseng.add(tome);
		
		
		System.out.println("현재 c 클래스의 학생수 : "+ hakseng.size());
		//각 학생들의 정보 
		for (Student sdt : hakseng) {
			System.out.println("이름:" + sdt.getName());
			System.out.println("이름:" + sdt.getEmail());
			System.out.println("이름:" + sdt.getHp());
		}
		

	}

}
