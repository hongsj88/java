package part3.ex1.ĸ��ȭ;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		ExamList list = new ExamList();		
		ExamList.init(list);
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
				
			    ExamList.inputList(list);
				
				break;
			case MENU_PRINT :
				ExamList.printList(list);
				
				break;
			case MENU_EXIT:
				System.out.println("Bye~~~~~");
				break ����;
			default: 
				System.out.println("�Է¿���!! 1~3�������� �����Ͻ� �� �ֽ��ϴ�.");
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
}
