package part3.ex4.UI�ڵ�и��ϱ�;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// ������ü�μ� main���Դ� �ʿ������� Ŭ������ ����� �ƴϹǷ� 
		// Program�� ExamConsole�� dependancy 
		ExamConsole console = new ExamConsole();		
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
				
//			    ExamList.inputList(list);
				console.inputList();
				
				break;
			case MENU_PRINT :
//				ExamList.printList(list);
				console.printList();
				
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
