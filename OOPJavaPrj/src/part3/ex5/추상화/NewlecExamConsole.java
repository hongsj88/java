package part3.ex5.�߻�ȭ;

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
		System.out.printf("��ǻ��%d\n",com);		
	}

	@Override
	protected void onInput(Exam exam) {
		Scanner scan = new Scanner(System.in);
		int com;
		do{
			System.out.printf("��ǻ�� :");
			com = scan.nextInt();
			if ((com < 0 || 100 < com) )
				System.out.println("��������(0~100)�� ������ϴ�.");
			
		}while(com < 0 || 100 < com) ;
		NewlecExam newlecExam = (NewlecExam)exam;
		newlecExam.setCom(com);
	}

}
