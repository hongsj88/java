package ex03.io.escape;

public class Program {
	public static void main(String[] args) {
		int kor1, kor2, kor3;
		int total;
		float avg;

		kor1 = 50;
		kor2 = 60;
		kor3 = 80;

		total = kor1 + kor2 + kor3;
		avg = total / 3;
		//----- ���� ��� �κ� ---------------------------
		System.out.print("����������������������������������������������������\n");
		System.out.print("��      �������            ��\n");	
		System.out.print("����������������������������������������������������\n");
		System.out.print("����1 : 0 \n");
		System.out.print("����2 : 0 \n");
		System.out.print("����3 : 0 \n");
		System.out.print("���� : 0 \n");
		System.out.print("��� : 0.00 \n");
		
		System.out.printf("avg is %f\n", avg);
		System.out.printf("total is %d\n", total);
	}
}