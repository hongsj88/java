package ex13.control2.continue_break;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int n = 0;
		Scanner scan = new Scanner(System.in);
		System.out.print("���� SPace�� �����ؼ� 5���̻� �Է��ϼ���");
		while(scan.hasNext()) {
			n = scan.nextInt();
			
			if (n < 10)
				continue;
			System.out.println(n);
		}

		
	}

}
