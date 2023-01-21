package ch03.sec06;

public class CompareOperatorEx {

	public static void main(String[] args) {
		
		//비교 연산자
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2); //true
		boolean result2 = (num1 != num2); //false
		boolean result3 = (num1 <= num2); //true
		
		//자동 형변환 double
		int num3 = 1;
		double num4 = 1.0;
		boolean result4 = (num3 == num4); //1.0 == 1.0 true
		
		//자동 형변환 예외: 실수
		float num5 = 0.1f;
		double num6 = 0.1;
		boolean result5 = (num5 == num6); //false
		boolean result6 = (num5 == (float)num6); //true
		
		//문자열 비교
		String str1 = "자바";
		String str2 = "Java";
		boolean result7 = (str1.equals(str2)); //false
		boolean result8 = (!str1.equals(str2)); //true

	}

}
