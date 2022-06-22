package oopEx;

public class UseCalc {

	static void callByValue(int a) {
		
		
		a= a+1;
		System.out.println(a);
	}
	
	static void callbyRef(int[] arr) {
		arr[0] = 100;
		System.out.println("callbyRef -->"+arr[0]);
	}
	
	public static void main(String[] args) {
		int a =10;
		callByValue(a);
		System.out.println(a);
		
		int [] myArr = {1};
		callbyRef(myArr);
		System.out.println("main myArr -->"+ myArr[0]);
		
		
		//3칙 계산기 사용해보기..
		Calculator calc = new Calculator();
		
		
		calc.calc('*',10, 10);

	}

}
