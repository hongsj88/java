package part3.ex4.UI코드분리하기;

import java.util.Scanner;

public class ExamConsole {
	
	private ExamList list;
	
	public ExamConsole() {
		list = new ExamList();
	}
	//private ExamList list = new ExamList();
	
	void printList() {
		printList(list.size());
		
	}
	public void printList(int size) {
		int total;
		System.out.print("┌────────────────────────┐\n");
		System.out.print("│      성적출력            │\n");	
		System.out.print("└────────────────────────┘\n");
		System.out.println("─────────────────────────────");
		
		for(int i = 0;i<size;i++) {
			Exam exam = list.get(i);//;
			int kor = exam.getKor(); //exam.kor;
			int eng = exam.getEng();
			int math = exam.getMath();
			total = exam.total();//kor + eng + math;
			float avg = exam.avg();
			System.out.printf("국어%d\n",kor);
			System.out.printf("영어%d\n",eng);
			System.out.printf("수학%d\n",math);
			
			System.out.printf("총점 : %3d \n",total);
			System.out.printf("평균 : %6.2f \n",avg);
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
		
		Exam exam = new Exam(kor, eng, math);
		
		/* 데이터를 추가하는 로직 */
		list.add(exam);
	}
}
