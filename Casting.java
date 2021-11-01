//데이터 타입의 변화
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1; // 1.0으로 표시됨, 소숫점 뒷자리에서 버려지는 것이 없음
		double b2 = (double) 1; // 7번째 줄 해석
		
		System.out.println(b);
		System.out.println(b2);
		
		//int c = 3.3; 정수라서 오류
		double d = 1.1;
		double e = (int) 1.1; // 소수를 정수로 바꾸는 casting
		
		System.out.println(e);
		
		// 1 이라는 정수를 string로 바꾸기
		
		String f = Integer. toString(1);
		System.out.println(f);
		System.out.println(f.getClass()); // getClass = 어떤 언어로 표현되는지 알려준다.

	}

}
