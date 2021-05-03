package com.newlecture.app.util;

public class GList<T> {
	private Object[] nums;
	private int current;
	
	public GList() {
		current = 0;
		nums = new Object[3];
	}

	public void add(Object num) {
		nums[current] = num;
		current++;
	}

	public void clear() {
		current = 0;		
	}

	public Object get(int index) {
		if (current <= index)
			throw new IndexOutOfBoundsException();
		return nums[index];
	}

	public int size() {
		
		return current;
	}

}
