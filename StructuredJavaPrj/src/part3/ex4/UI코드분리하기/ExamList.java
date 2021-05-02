package part3.ex4.UI코드분리하기;

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
	
	public Exam get(int i) {
		return this.exams[i];
	}

	public void add(Exam exam) {
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

	public int size() {
		// TODO Auto-generated method stub
		return current;
	}	
	
}
