package part3.ex1.ĸ��ȭ;

import java.util.Scanner;

public class ExamList {
	Exam[] exams;
	int current;
	
	static void printList(ExamList list) {
		printList(list, list.current);
		
	}
	
	static void printList(ExamList list,int size) {
		int total;
		System.out.print("����������������������������������������������������\n");
		System.out.print("��      �������            ��\n");	
		System.out.print("����������������������������������������������������\n");
		System.out.println("����������������������������������������������������������");
		Exam[] exams = list.exams;
		for(int i = 0;i<size;i++) {
			Exam exam = exams[i];
			int kor = exam.kor;
			int eng = exam.eng;
			int math = exam.math;
			total = kor + eng + math;
			System.out.printf("����%d\n",kor);
			System.out.printf("����%d\n",eng);
			System.out.printf("����%d\n",math);
			
			System.out.printf("���� : %3d \n",total);
			System.out.printf("��� : %6.2f \n",total/3.0f
					);
			System.out.println("����������������������������������������������������������");
		}
		
	}
	
	static void inputList(ExamList list ) {
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
		
		Exam exam = new Exam();
		exam.kor = kor;
		exam.eng = eng;
		exam.math = math;
		Exam[] exams = list.exams;
		int size = list.current;
		if (exams.length == size) {
			// 1. ũ�Ⱑ 5�� �� ū ���ο� �迭�� ����
			Exam[] temp = new Exam[size + 5];
			
			// 2. ���� ���ֽ�Ű��
			for(int i=0;i<size;i++) {
				temp[i] = exams[i];
			}
			// 3. list.exams �� ���θ��� temp �迭�� �����ϵ��� �Ѵ�.
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
