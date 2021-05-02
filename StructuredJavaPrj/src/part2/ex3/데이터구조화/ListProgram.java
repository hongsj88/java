package part2.ex3.데이터구조화;

import java.util.Scanner;

public class ListProgram {

	public static void main(String[] args) {
		ExamList list = new ExamList();
		list.exams = new Exam[3];
		list.current = 0;
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
				
				inputList(list);
				
				break;
			case MENU_PRINT :
				printList(list);
				
				break;
			case MENU_EXIT:
				System.out.println("Bye~~~~~");
				break 종료;
			default: 
				System.out.println("입력오류!! 1~3번까지만 선택하실 수 있습니다.");
			}
		
		}
		
	}
	private static void printList(ExamList list) {
		printList(list, list.current);
		
	}
	private static void printList(ExamList list,int size) {
		int total;
		System.out.print("┌────────────────────────┐\n");
		System.out.print("│      성적출력            │\n");	
		System.out.print("└────────────────────────┘\n");
		System.out.println("─────────────────────────────");
		Exam[] exams = list.exams;
		for(int i = 0;i<size;i++) {
			Exam exam = exams[i];
			int kor = exam.kor;
			int eng = exam.eng;
			int math = exam.math;
			total = kor + eng + math;
			System.out.printf("국어%d\n",kor);
			System.out.printf("영어%d\n",eng);
			System.out.printf("수학%d\n",math);
			
			System.out.printf("총점 : %3d \n",total);
			System.out.printf("평균 : %6.2f \n",total/3.0f
					);
			System.out.println("─────────────────────────────");
		}
		
	}
	private static void inputList(ExamList list ) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("┌────────────────────────┐\n");
		System.out.print("│      성적입력            │\n");	
		System.out.print("└────────────────────────┘\n");
		
		int kor=0;
		int eng=0;
		int math =0;
		
		do{
			System.out.printf("국어 :");
			kor = scan.nextInt();
			if ((kor < 0 || 100 < kor) )
				System.out.println("성적범위(0~100)를 벗어났습니다.");
			
		}while(kor < 0 || 100 < kor) ;
		
		do{
			System.out.printf("영어 :");
			eng = scan.nextInt();
			if ((eng < 0 || 100 < eng) )
				System.out.println("성적범위(0~100)를 벗어났습니다.");
			
		}while(eng < 0 || 100 < eng) ;
		
		do{
			System.out.printf("수학 :");
			math = scan.nextInt();
			if ((math < 0 || 100 < math) )
				System.out.println("성적범위(0~100)를 벗어났습니다.");
			
		}while(math < 0 || 100 < math) ;
		
		Exam exam = new Exam();
		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;
		Exam[] exams = list.exams;
		int size = list.current;
		if (exams.length == size) {
			// 1. 크기가 5개 더 큰 새로운 배열을 생성
			Exam[] temp = new Exam[size + 5];
			
			// 2. 값을 이주시키기
			for(int i=0;i<size;i++) {
				temp[i] = exams[i];
			}
			// 3. list.exams 가 새로만든 temp 배열을 참조하도록 한다.
			list.exams = temp;
		}
		
		list.exams[list.current] = exam;
		list.current++;
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
