package langex;

public class WrapperEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double d = 3.5;
		System.out.println(Math.ceil(d)); //소수점올림 
		
		System.out.println(Math.floor(d));//소수점내림
		
		System.out.println(Math.round(d));//반올림 
		
		int a = 10;
		Integer ig = Integer.valueOf("10.0");
		int c = a + ig;
		System.out.println(c);
	}
	
	

}
