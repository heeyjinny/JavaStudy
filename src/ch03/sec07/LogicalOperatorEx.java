package ch03.sec07;

public class LogicalOperatorEx {

	public static void main(String[] args) {
		
		int charCode = 'A'; //A는 65
		
		if( 65<=charCode && charCode<=90 ) {
			System.out.println("대문자");
		}
		
		if( 97<=charCode && charCode<=90) {
			System.out.println("소문자");
		}

	}

}
