package part3.ex5.추상화;

import java.util.Scanner;

public class NewlecExamConsole extends ExamConsole {

	@Override
	protected Exam makeExam() {
		Exam exam = new NewlecExam();
		return exam;
	}

	@Override
	protected void onPrint(Exam exam) {
		NewlecExam newlecExam = (NewlecExam)exam;
		int com = newlecExam.getCom();
		System.out.printf("컴퓨터%d\n",com);		
	}

	@Override
	protected void onInput(Exam exam) {
		Scanner scan = new Scanner(System.in);
		int com;
		do{
			System.out.printf("컴퓨터 :");
			com = scan.nextInt();
			if ((com < 0 || 100 < com) )
				System.out.println("성적범위(0~100)를 벗어났습니다.");
			
		}while(com < 0 || 100 < com) ;
		NewlecExam newlecExam = (NewlecExam)exam;
		newlecExam.setCom(com);
	}

}
