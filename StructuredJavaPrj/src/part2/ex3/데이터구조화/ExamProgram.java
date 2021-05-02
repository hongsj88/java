package part2.ex3.�����ͱ���ȭ;

import java.util.Scanner;

public class ExamProgram {

	public static void main(String[] args) {
		Exam exam = new Exam(); // ��������
//		exam.kor = 30;
//		exam.eng = 60;
//		exam.math = 70;
//		
		inputExam(exam);
		printExam(exam);
	}

	private static void printExam(Exam exam) {
		System.out.print("����������������������������������������������������\n");
		System.out.print("��      �������            ��\n");	
		System.out.print("����������������������������������������������������\n");
		System.out.println();//"����������������������������������������������������������");
		int kor = exam.kor;
		int eng = exam.eng;
		int math = exam.math;
		int total = exam.kor + exam.eng + exam.math;
		float avg = total/3.0f;
		
		System.out.printf("���� ::: %d\n",kor);
		System.out.printf("���� ::: %d\n",eng);
		System.out.printf("���� ::: %d\n",math);
		System.out.printf("���� ::: %3d\n", total);
		System.out.printf("��� ::: %6.2f\n", avg);
		System.out.println("����������������������������������������������������������");
		
	}

	private static void inputExam(Exam exam) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("����������������������������������������������������\n");
		System.out.print("��      �����Է�            ��\n");	
		System.out.print("����������������������������������������������������\n");
		int kor = 0;
		do{
			System.out.printf("���� :");
			kor = scan.nextInt();
			if ((kor < 0 || 100 < kor) )
				System.out.println("��������(0~100)�� ������ϴ�.");
			
		}while(kor < 0 || 100 < kor) ;
		
		int eng = 0;
		do{
			System.out.printf("���� :");
			kor = scan.nextInt();
			if ((eng < 0 || 100 < eng) )
				System.out.println("��������(0~100)�� ������ϴ�.");
			
		}while(eng < 0 || 100 < eng) ;
		int math = 0;
		do{
			System.out.printf("���� :");
			kor = scan.nextInt();
			if ((math < 0 || 100 < math) )
				System.out.println("��������(0~100)�� ������ϴ�.");
			
		}while(math < 0 || 100 < math) ;
		
		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;		
	}
		
		
		
	
}
