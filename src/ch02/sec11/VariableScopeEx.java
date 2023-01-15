package ch02.sec11;

public class VariableScopeEx {

	public static void main(String[] args) {
		
		/*  변수의 범위  */
		
		//메소드 블록 전체 사용할 수 있는 변수 선언
		int v1 = 15;
		
		//특정 블록 내부(if문) 에서만 사용할 수 있는 변수 선언
		if(v1>10) {
			//변수 v1은 메소드 전체에서 사용할 수 있
			int v2 = v1 - 10;
		}
		
		//변수 v2는 if문 안에서만 사용할 수 있으므로
		//컴파일 에러 발생...
		//int v3 = v1 + v2 + 5;

	}
}
