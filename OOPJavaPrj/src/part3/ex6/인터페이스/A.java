package part3.ex6.인터페이스;

public class A {

	public A() {
		
	}
	
	private X x;
 
	public X getX() {
		return x;
	}

	
	public void setX(X x) {
		this.x = x;
	}


	public void print() {
		int total = x.total();
		System.out.printf("total is %d\n", total);
	}
	
}
