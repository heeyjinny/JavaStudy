package ch02.sec06;

public class TextBlockEx {

	public static void main(String[] args) {
		
		//Java13 부터 텍스트 블록 문법 제공
		//str1과 str2의 문자열은 동일하게 출력됨
		String str1 = "" + 
		"{\n" + 
		"\t\"id\":\"winter\",\n" + 
		"\t\"name\":\"눈송이\"\n" +
		"}";
		
		String str2 = """
				{
					"id":"winter",
					"name":"눈송이"
				}""";
		
		System.out.println(str1);
		System.out.println("-------------------------------------");
		System.out.println(str2);
		System.out.println("-------------------------------------");
		
		
		//문자열 블록문법 사용 시 그대로 출력되기 때문에
		//만약 줄바꿈을 하지않고 이어서 출력하고 싶을 때
		//역슬래시\를 사용하여 줄바꿈을 하지 않도록 함
		String str = """
				안녕하세요.
				저는 \
				홍길동 \
				입니다. 
				""";
		System.out.println(str);

	}

}
