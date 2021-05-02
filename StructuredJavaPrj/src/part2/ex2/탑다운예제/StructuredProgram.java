package part2.ex2.ž�ٿ��;

import java.util.Scanner;

public class  StructuredProgram {
	
	public static void main(String[] args) {
		int [][] korList = new int[3][3];
		int menu;
		boolean keepLoop = true;
		final int MENU_INPUT = 1;
		final int MENU_PRINT = 2;
		final int MENU_EXIT = 3;
		
		����:
		while(keepLoop) {

			menu = inputMenu();
			
			switch(menu) {
			case MENU_INPUT:
				
				inputKors(korList);
				
				break;
			case MENU_PRINT :
				printKors(korList);
				
				break;
			case MENU_EXIT:
				System.out.println("Bye~~~~~");
				break ����;
			default: 
				System.out.println("�Է¿���!! 1~3�������� �����Ͻ� �� �ֽ��ϴ�.");
			}
		
		}
	}
	// �Լ��� � �̸��� �������ΰ�
	static void inputKors(int[][] kors) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("����������������������������������������������������\n");
		System.out.print("��      �����Է�            ��\n");	
		System.out.print("����������������������������������������������������\n");
		int kor1 = 0;
		for(int i = 0;i<3;i++) {
			for(int j=0;j<3;j++) {
				do{
					System.out.printf("\t%d�г� ����%d :",i+1,j+1);
					kor1 = scan.nextInt();
					if ((kor1 < 0 || 100 < kor1) )
						System.out.println("��������(0~100)�� ������ϴ�.");
					
				}while(kor1 < 0 || 100 < kor1) ;
				kors[i][j] = kor1;
			}
		}
	}
	static int  inputMenu() {
		//----- ���θ޴� �κ� ---------------------------
		Scanner scan = new Scanner(System.in);
		
		System.out.print("����������������������������������������������������\n");
		System.out.print("��      ���θ޴�            ��\n");	
		System.out.print("����������������������������������������������������\n");
		System.out.print("\t1. �����Է�");
		System.out.print("\t2. �������");
		System.out.print("\t3. ����");
		System.out.print("\t>");
		return scan.nextInt();
	}
	static void printKors(int[][] kors) {
		//----- ���� ��� �κ� ---------------------------
		int total;
		
		System.out.print("����������������������������������������������������\n");
		System.out.print("��      �������            ��\n");	
		System.out.print("����������������������������������������������������\n");
		System.out.println("����������������������������������������������������������");
		for(int i = 0;i<3;i++) {
			System.out.printf("<%d �г� �����> --------\n", i+1);
			total = 0;
			for(int j=0;j<3;j++) {
				System.out.printf("����%d : %3d\n",j+1,kors[i][j]);	
				total += kors[i][j];
				
			}
			
			System.out.printf("���� : %3d \n",total);
			System.out.printf("��� : %6.2f \n",total/3.0f					);
			System.out.println("����������������������������������������������������������");
		}
		
	}
}
