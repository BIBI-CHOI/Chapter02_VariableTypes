package ch02_4_console_in_out;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine();
			System.out.println("�Էµ� ���ڿ�: \"" + inputData + "\"" );
			if(inputData.equals("q")) {
				break;
			}
		}
		
		System.out.println("����");
	}

}