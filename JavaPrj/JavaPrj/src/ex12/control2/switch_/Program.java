package ex12.control2.switch_;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int kor1, kor2, kor3;
		int total;
		float avg;
		int menu;
		Scanner scan = new Scanner(System.in);
				

		kor1 = 0;
		kor2 = 0;
		kor3 = 0;
		����:
		while(true) {

			//----- ���θ޴� �κ� ---------------------------
			
			System.out.print("����������������������������������������������������\n");
			System.out.print("��      ���θ޴�            ��\n");	
			System.out.print("����������������������������������������������������\n");
			System.out.print("\t1. �����Է�");
			System.out.print("\t2. �������");
			System.out.print("\t3. ����");
			System.out.print("\t>");
			menu = scan.nextInt();
			switch(menu) {
			case 1:
				System.out.print("����������������������������������������������������\n");
				System.out.print("��      �����Է�            ��\n");	
				System.out.print("����������������������������������������������������\n");
				
				do{
					System.out.print("\t����1:");
					kor1 = scan.nextInt();
					if ((kor1 < 0 || 100 < kor1) )
						System.out.println("��������(0~100)�� ������ϴ�.");
					
				}while(kor1 < 0 || 100 < kor1) ;
				
				do{
					System.out.print("\t����2:");
					kor2 = scan.nextInt();
					if ((kor2 < 0 || 100 < kor2) )
						System.out.println("��������(0~100)�� ������ϴ�.");
					
				}while(kor2 < 0 || 100 < kor2) ;
				
				do{
					System.out.print("\t����3:");
					kor3 = scan.nextInt();
					if ((kor3 < 0 || 100 < kor3) )
						System.out.println("��������(0~100)�� ������ϴ�.");
					
				}while(kor3 < 0 || 100 < kor3) ;
				break;
			case 2 :
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
				break;
			case 3:
				System.out.println("Bye~~~~~");
				break ����;
			default: 
				System.out.println("�Է¿���!! 1~3�������� �����Ͻ� �� �ֽ��ϴ�.");
			}
		
		}
	}

}
