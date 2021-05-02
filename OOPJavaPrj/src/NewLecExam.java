import part3.ex4.UI코드분리하기.Exam;

public class NewLecExam extends Exam{
	private int com;
	
	public NewLecExam() {
		this(0, 0, 0, 0);
	}
	public NewLecExam(int kor, int eng, int math, int com) {
		super(kor,eng,math);
		this.com = com;		
	}
	
	
	@Override
	public float avg() {
		return total()/4.0f;
	}
	@Override
	public int total() {
		return super.total() + com;
	}
}
