import part3.ex4.UI�ڵ�и��ϱ�.Exam;

public class Program {
	
//	1.������ -> Exam.class
//	2.���� -> Exam.zip
//	3.jar -> Exam.jar
	public static void main(String[] args) {
		NewLecExam exam = new NewLecExam();
		
		exam.setKor(10);
//		exam.setEng(10);
//		exam.setMath(10);
//		exam.setCom(8);
		System.out.printf("total ::: %3d\n" ,exam.total());
		System.out.printf("avg   ::: %6.2f\n" ,exam.avg());

	}

}
