package ch02_3_type_casting;

public class PromotionExample {
	public static void main(String[] args) {
		//�ڵ� Ÿ�� ��ȯ
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("intValue: " + intValue);
		
		char charValue = '��';
		intValue = charValue;
		System.out.println("���� �����ڵ�: " + intValue);
		
		intValue = 50;
		long longValue = intValue;
		System.out.println("longValue: " + longValue);
		
		longValue = 100;
		float floatValue = longValue;
		System.out.println("floatValue: " + floatValue);
		
		floatValue = 100.5F;
		double doublevalue = floatValue;
		System.out.println("doubleValue: " + doublevalue);
	}
}