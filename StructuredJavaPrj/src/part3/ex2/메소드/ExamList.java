package part3.ex2.메소드;

import java.util.Scanner;

public class ExamList {
	private Exam[] exams;
	private int current; // 외부에서 해당 변수를 수정하지 못하게 한다.
						// 캡슐화를 깨드리는 행위를 아예 막게 되는 것이다!!
	
	public ExamList() {
		this(3);		
	}
	
	// 생성자 overload
	// 주의사항
	// 기본생성자가 없는 경우에는 생성불가
	//  
	public ExamList(int size) {
		exams = new Exam[size];
		current = 0;		
	}
	
	void printList() {
		printList(current);
		
	}
	public void printList(int size) {
		int total;
		System.out.print("┌────────────────────────┐\n");
		System.out.print("│      성적출력            │\n");	
		System.out.print("└────────────────────────┘\n");
		System.out.println("─────────────────────────────");
		Exam[] exams = this.exams;
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
	
	public void inputList() {
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
		Exam[] exams = this.exams;
		int size = current;
		if (exams.length == size) {
			// 1. 크기가 5개 더 큰 새로운 배열을 생성
			Exam[] temp = new Exam[size + 5];
			
			// 2. 값을 이주시키기
			for(int i=0;i<size;i++) {
				temp[i] = exams[i];
			}
			// 3. list.exams 가 새로만든 temp 배열을 참조하도록 한다.
			exams = temp;
		}
		
		exams[current] = exam;
		current++;
	}	
	
}
