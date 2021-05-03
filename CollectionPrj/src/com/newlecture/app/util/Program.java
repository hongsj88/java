package com.newlecture.app.util;

public class Program {

	public static void main(String[] args) {
		GList<String> list = new GList();
		list.add(3);
		list.add(5);		
		int size = list.size();
		System.out.printf("size : %d\n",size);
		
		list.clear();
		size = list.size();
		System.out.printf("size : %d\n",size);
		
		list.add(7);
		Object num = list.get(0);
		System.out.printf("num : %d\n",num);
//		IntList list = new IntList();
//		list.add(3);
//		list.add(5);
//		list.clear();
//		int size = list.size();
//		System.out.printf("size : %d\n",size);
//		list.add(7);
//		int num = list.get(0);
//		System.out.printf("num : %d\n",num);
		
	}

}
