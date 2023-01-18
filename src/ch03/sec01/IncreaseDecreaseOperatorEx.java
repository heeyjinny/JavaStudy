package ch03.sec01;

public class IncreaseDecreaseOperatorEx {

	public static void main(String[] args) {
		
		int x = 10;
		int z;
		
		x++;
		++x;
		//x의 값은 12
		System.out.println("x = "+x);
		
		
		//증감 연산자가 뒤에 있으므로
		//연산식 수행 후 증감 연산자 실행됨
		//z에 x의 값 12가 대입된 다음
		//x는 따로 1증가...
		z = x++;
		System.out.println("z = "+z); //결과 값 12
		System.out.println("x = "+x); //결과 값 13

	}

}
