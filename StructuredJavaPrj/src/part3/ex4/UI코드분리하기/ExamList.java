package part3.ex4.UI�ڵ�и��ϱ�;

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
	
	public Exam get(int i) {
		return this.exams[i];
	}

	public void add(Exam exam) {
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

	public int size() {
		// TODO Auto-generated method stub
		return current;
	}	
	
}
