package ch02.sec01;

public class VariableExchangeEx {

	public static void main(String[] args) {
		
		//또 다른 변수에 대입되어 메모리간 값 복사하기
		//두 변수의 값 교환
		//새로운 변수 temp선언하여 교환
		
		int x = 3;
		int y = 5;
		System.out.println("x="+ x + ", y=" + y);
		
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x="+ x + ", y=" + y);

	}

}
