package oopEx;

public class ConstructorEx {

	public static void main(String[] args) {
		
		//javaClassPerson jaelik = new javaClassPerson("황원준");
		javaClassPerson jaelik2 = new javaClassPerson("황원준", "주안4동",36 , 'M');
		//System.out.println(jaelik);
		System.out.println(jaelik2);
		
		jaelik2.setAddr("인천시 남구");
		
		String addr = jaelik2.getAddr();
		System.out.println(addr);
		int age = jaelik2.getAge();
		System.out.println(age);
		char gender = jaelik2.getGender();
		System.out.println(gender);
		String name = jaelik2.getName();
		System.out.println(name);
		
		
		
		//여러분을 표현하는 객체를 생성해 봅니다.
//		System.out.println(new javaClassPerson());//기본 생성자 호출..
//		
//		//생성된 객체를 Ref 해서 재사용할 수있도록한다..
//		
//		javaClassPerson Jaelik = new javaClassPerson();//인스턴스화(Instantiation)
		
		
		/*
		 * 캡슐화 때문에 컴파일 에러남 .. 	 
		jaelik.name = "황원준";
		jaelik.gender = 'M';
		jaelik.age = 36;
		jaelik.addr= "주안4동";	
		*/
		
		
//		System.out.println(Jaelik.toString());
		
		/*
		System.out.println("내 주소는 :"+ Jaelik.addr);
		System.out.println("내 나이는 :"+ Jaelik.age);
		System.out.println("내 성별은 :"+ Jaelik.gender);
		System.out.println("내 이름은 :"+ Jaelik.name);
		*/
		
		
		
		
	}

}
