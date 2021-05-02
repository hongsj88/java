package part3.ex6.인터페이스;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) throws ClassNotFoundException, IOException, InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException  {
		FileInputStream fis = new FileInputStream("src/part3/ex6/인터페이스/setting.txt");
		Scanner scan = new Scanner(fis);
		String className = scan.nextLine();
		System.out.println(className);
		scan.close();
		fis.close();
		
		A a = new A();
//		B b = new B();
//		a.setX(b);
		Class clazz = Class.forName(className);
//		X x = (X)clazz.getDeclaredConstructor().newInstance();
		X x = (X)clazz.newInstance();
		a.setX(x);
		a.print();
	}
}
