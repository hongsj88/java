package part3.ex5.�߻�ȭ;

import java.util.Scanner;

public abstract class ExamConsole {
	
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
		System.out.print("����������������������������������������������������\n");
		System.out.print("��      �������            ��\n");	
		System.out.print("����������������������������������������������������\n");
		System.out.println("����������������������������������������������������������");
		
		for(int i = 0;i<size;i++) {
			Exam exam = list.get(i);//;
			int kor = exam.getKor(); //exam.kor;
			int eng = exam.getEng();
			int math = exam.getMath();
			total = exam.total();//kor + eng + math;
			float avg = exam.avg();
			System.out.printf("����%d\n",kor);
			System.out.printf("����%d\n",eng);
			System.out.printf("����%d\n",math);
			onPrint(exam);
			System.out.printf("���� : %3d \n",total);
			System.out.printf("��� : %6.2f \n",avg);
			System.out.println("����������������������������������������������������������");
		}
		
	}
	
	public void inputList() {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("����������������������������������������������������\n");
		System.out.print("��      �����Է�            ��\n");	
		System.out.print("����������������������������������������������������\n");
		
		int kor=0;
		int eng=0;
		int math =0;
		
		do{
			System.out.printf("���� :");
			kor = scan.nextInt();
			if ((kor < 0 || 100 < kor) )
				System.out.println("��������(0~100)�� ������ϴ�.");
			
		}while(kor < 0 || 100 < kor) ;
		
		do{
			System.out.printf("���� :");
			eng = scan.nextInt();
			if ((eng < 0 || 100 < eng) )
				System.out.println("��������(0~100)�� ������ϴ�.");
			
		}while(eng < 0 || 100 < eng) ;
		
		do{
			System.out.printf("���� :");
			math = scan.nextInt();
			if ((math < 0 || 100 < math) )
				System.out.println("��������(0~100)�� ������ϴ�.");
			
		}while(math < 0 || 100 < math) ;
		
		
//		Exam exam = new Exam(kor, eng, math);
		Exam exam = makeExam();
		exam.setKor(kor);
		exam.setEng(eng);
		exam.setMath(math);
		
		onInput(exam);
		/* �����͸� �߰��ϴ� ���� */
		list.add(exam);
	}

	
	protected abstract void onPrint(Exam exam);

	protected abstract void onInput(Exam exam);

	protected abstract Exam makeExam(); 
}
