package part3.ex3.Getters��Setters;

import java.util.Scanner;

public class ExamList {
	private Exam[] exams;
	private int current; // �ܺο��� �ش� ������ �������� ���ϰ� �Ѵ�.
						// ĸ��ȭ�� ���帮�� ������ �ƿ� ���� �Ǵ� ���̴�!!
	
	public ExamList() {
		this(3);		
	}
	
	// ������ overload
	// ���ǻ���
	// �⺻�����ڰ� ���� ��쿡�� �����Ұ�
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
		System.out.print("����������������������������������������������������\n");
		System.out.print("��      �������            ��\n");	
		System.out.print("����������������������������������������������������\n");
		System.out.println("����������������������������������������������������������");
		Exam[] exams = this.exams;
		for(int i = 0;i<size;i++) {
			Exam exam = exams[i];
			int kor = exam.getKor(); //exam.kor;
			int eng = exam.getEng();
			int math = exam.getMath();
			total = exam.total();//kor + eng + math;
			float avg = exam.getAvg();
			System.out.printf("����%d\n",kor);
			System.out.printf("����%d\n",eng);
			System.out.printf("����%d\n",math);
			
			System.out.printf("���� : %3d \n",total);
			System.out.printf("��� : %6.2f \n",avg
					);
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
		
		Exam exam = new Exam(kor, eng, math);
		Exam[] exams = this.exams;
		int size = current;
		if (exams.length == size) {
			// 1. ũ�Ⱑ 5�� �� ū ���ο� �迭�� ����
			Exam[] temp = new Exam[size + 5];
			
			// 2. ���� ���ֽ�Ű��
			for(int i=0;i<size;i++) {
				temp[i] = exams[i];
			}
			// 3. list.exams �� ���θ��� temp �迭�� �����ϵ��� �Ѵ�.
			exams = temp;
		}
		
		exams[current] = exam;
		current++;
	}	
	
}
