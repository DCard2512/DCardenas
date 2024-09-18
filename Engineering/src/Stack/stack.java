package Stack;

import java.util.Arrays;
//import javal.util.

public class stack {
	
	private Object[] elements;
	private int size;
	private static final int INITIAL_CAPACITY = 3;
	
	public stack() {
		elements = new Object[INITIAL_CAPACITY];
		size = 0;
	}
	
	public int getSize() {
		return size;
	}
	
	public void push(Object e) {
		
		//Check Capacity
		if(elements.length == size) {
			elements = Arrays.copyOf(elements, 2 * size + 1);
		}
		//Pushes element onto stack
		elements[size++] = e;
	}
	
	
	public Object pop() {
		if(size == 0) {
			return "";
		}
		else {
			Object result = elements[--size];
			elements[size] = null;
			size--;
			return result;
		}
				
	}
	
	public  Boolean isEmpty() {
		return size == 0;
	}
	public String toString() {
		String result = "";
		for(int i = 0; i < size; i++) {
			result += elements[i] + " ";
		}
		return result;
		
	}
	
}
