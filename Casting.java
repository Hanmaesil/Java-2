//������ Ÿ���� ��ȭ
public class Casting {

	public static void main(String[] args) {
		
		double a = 1.1;
		double b = 1; // 1.0���� ǥ�õ�, �Ҽ��� ���ڸ����� �������� ���� ����
		double b2 = (double) 1; // 7��° �� �ؼ�
		
		System.out.println(b);
		System.out.println(b2);
		
		//int c = 3.3; ������ ����
		double d = 1.1;
		double e = (int) 1.1; // �Ҽ��� ������ �ٲٴ� casting
		
		System.out.println(e);
		
		// 1 �̶�� ������ string�� �ٲٱ�
		
		String f = Integer. toString(1);
		System.out.println(f);
		System.out.println(f.getClass()); // getClass = � ���� ǥ���Ǵ��� �˷��ش�.

	}

}
