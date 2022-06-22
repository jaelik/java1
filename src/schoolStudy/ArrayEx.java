/*
 * 배열은 Araay 라는 이름의 객체
 * 생성식[]
 * 
 * 
 */


package schoolStudy;

import java.util.Arrays;

public class ArrayEx {

	public static void main(String[] args) {
	System.out.println("안녕 : " + args[0]);
	//배열(arr) 생성식
	int [] intArr= new int[8];// 8개의 int가 들어갈 int Type  배열 생성 
	//배열 속성 length 이해하기 ... int 타입의 방갯수를 리턴함. 
	int arr2[] = {1,2,3,4,5};
	//(배열)Arrays 객체의 메서드를 이용해서 배열의 값을 출력해본다.
	System.out.println(Arrays.toString(arr2));// to String  배열의 값을 출력 
	
	//배열의 값 대입;;
	arr2[0] = 6;
	arr2[1]=7;
	arr2[2]=8;
	arr2[3]=9;
	arr2[4]=10;
	
	for (int i = 0, j = 10; i< arr2.length; i++,j--) {
		arr2[i] = j;
		System.out.println(arr2[i]);
	}
	
	System.out.println(arr2);//배열의 해쉬코드 출력됨.=[I@2401f4c3
	//자바의 Hash코드는 Heap 메모리 영역에 생성된 Intance(객체) 의 메모리값을 암호환 16진수의 값입니다.
	
	int leng =intArr.length;
	System.out.println("배열의 길이 :"+ leng);
	int avg; //선언
	//System.out.println(avg);//지역 변수는 출력문에 사용되기전에 반드시 초기화 또는 대입 되어야함.ㅈ
	//System.out.println(avg2);//
	
	System.out.println(intArr[0]);
	int val = intArr[1];
	System.out.println(val);
	
	for (int i = 0; i < intArr.length; i++) {
		System.out.println(i + "=" + intArr[i]);
		
	}
	}

}
