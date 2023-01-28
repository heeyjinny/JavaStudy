package ch03.sec08;

public class BitLogicEx {

	public static void main(String[] args) {
		//비트논리연산자
		//bit단위로 논리 연산 수행
		//피연산자 0,1  
		//산출결과 0,1
		
		//연산결과는 int타입이 되므로
		byte num1 = 45;
		byte num2 = 25;
		
		//컴파일 에러   
		//byte result = num1 & num2;
		//int변수에 대입해야 함
		int result = num1 & num2;
		
		System.out.println(result); //결과: 9

	}

}
