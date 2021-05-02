package part3.ex5.추상화;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		// 의존객체로서 main에게는 필요하지만 클래스의 멤버가 아니므로 
		// Program과 ExamConsole은 dependancy 
		Exam exam = new ExamConsole();
		ExamConsole console = 
		int menu;
		boolean keepLoop = true;
		final int MENU_INPUT = 1;
	final int MENU_PRINT = 2;
		final int MENU_EXIT = 3;
		
		종료:
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
				break 종료;
			default: 
				System.out.println("입력오류!! 1~3번까지만 선택하실 수 있습니다.");
			}
		
		}
		
	}
	
	static int  inputMenu() {
		//----- 메인메뉴 부분 ---------------------------
		Scanner scan = new Scanner(System.in);
		
		System.out.print("┌────────────────────────┐\n");
		System.out.print("│      메인메뉴            │\n");	
		System.out.print("└────────────────────────┘\n");
		System.out.print("\t1. 성적입력");
		System.out.print("\t2. 성적출력");
		System.out.print("\t3. 종료");
		System.out.print("\t>");
		return scan.nextInt();
	}
}
