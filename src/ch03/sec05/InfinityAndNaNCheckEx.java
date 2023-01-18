package ch03.sec05;

public class InfinityAndNaNCheckEx {

	public static void main(String[] args) {
		
		//실수를 0.0 또는 0.0f로 나누거나 나머지 구했을 때
		//연산결과가 무한대 또는 NaN나오는 것을 확이하여 처리 방법
		//Double.isInfinite()
		//Double.isNaN()
		
		int x = 5;
		double y = 0.0;
		double z = x % y;
		double s = x / y;
		
		if(Double.isFinite(z) || Double.isNaN(z)) {
			System.out.println("값 산출 불가");
			
		}else {
			System.out.println(z + 2);
		}
		
		if(Double.isFinite(s) || Double.isNaN(s)) {
			System.out.println("값 산출 불가");
			
		}else {
			System.out.println(z + 2);
		}

	}

}
