package ex06.oper;

import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		int kor1, kor2, kor3;
		int total;
		float avg;
		
		Scanner scan = new Scanner(System.in);
		
		while(true) {

		kor1 = 0;
		kor2 = 0;
		kor3 = 0;
		//----- ���� �Է� �κ� ---------------------------
		
		System.out.print("����������������������������������������������������\n");
		System.out.print("��      �����Է�            ��\n");	
		System.out.print("����������������������������������������������������\n");
		
		do{
			System.out.print("\t����1:");
			kor1 = scan.nextInt();
			if ((kor1 < 0 || 100 < kor1) )
				System.out.println("��������(0~100)�� ������ϴ�.");
			
		}while(kor1 < 0 || 100 < kor1) ;
		
		System.out.print("����2:");
		kor2 = scan.nextInt();		
		System.out.print("����3:");
		kor3 = scan.nextInt();
		
		//----- ���� ��� �κ� ---------------------------
		
		total = kor1 + kor2 + kor3;
		avg = total / 3.0f;
		
		System.out.print("����������������������������������������������������\n");
		System.out.print("��      �������            ��\n");	
		System.out.print("����������������������������������������������������\n");
		System.out.printf("����1 : %3d\n",kor1);
		System.out.printf("����2 : %3d \n",kor2);
		System.out.printf("����3 : %3d \n",kor3);
		System.out.printf("���� : %3d \n",total);
		System.out.printf("��� : %6.2f \n",avg);
		
		}
	}
}
