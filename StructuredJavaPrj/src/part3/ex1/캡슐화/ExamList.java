package part3.ex1.캡슐화;

import java.util.Scanner;

public class ExamList {
	Exam[] exams;
	int current;
	
	static void printList(ExamList list) {
		printList(list, list.current);
		
	}
	
	static void printList(ExamList list,int size) {
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
	
	static void inputList(ExamList list ) {
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
	
	public static void init(ExamList list) {
		list.exams = new Exam[3];
		list.current = 0;		
	}
}
