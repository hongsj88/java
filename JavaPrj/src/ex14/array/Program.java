package ex14.array;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		int kor1, kor2, kor3;
		int[][] kors = new int[3][3];
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
				
				
				break;
			case 2 :
				//----- ���� ��� �κ� ---------------------------
				
				total = kor1 + kor2 + kor3;
				avg = total / 3.0f;
				
				System.out.print("����������������������������������������������������\n");
				System.out.print("��      �������            ��\n");	
				System.out.print("����������������������������������������������������\n");
				System.out.println("����������������������������������������������������������");
				for(int i = 0;i<3;i++) {
					System.out.printf("<%d �г� �����> --------\n", i+1);
					total = 0;
					avg = 0;
					for(int j=0;j<3;j++) {
						System.out.printf("����%d : %3d\n",j+1,kors[i][j]);	
						total += kors[i][j];
						
					}
					
					System.out.printf("���� : %3d \n",total);
					System.out.printf("��� : %6.2f \n",total/3.01
							);
					System.out.println("����������������������������������������������������������");
				}
				
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
