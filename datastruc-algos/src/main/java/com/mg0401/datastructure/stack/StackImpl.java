package com.mg0401.datastructure.stack;

public class StackImpl {
	
	private int stackSize;
	private long[] stackArray;
	int insertCounter = -1;
	int firstElement = 0;
	
	public StackImpl(int size) {
		this.stackSize = size;
		this.stackArray = new long[size];
	}
	
	public void push(long x) {
		if(isFull()) {
			System.out.println("Stack is Full");
		} else {
			insertCounter++;
			stackArray[insertCounter] = x;
		}
	}
	
	public long pop() {
		if (insertCounter != -1) {
			int tempCounter = insertCounter;
			insertCounter--;
			return stackArray[tempCounter];
		} else {
			System.out.println("Stack is Empty");
			return -1;
		}
	}
	
	public long peak() {
		return stackArray[insertCounter];
	}
	
	public boolean isEmpty() {
		boolean result = false;
		if(insertCounter == -1) {
		return true;
		}
	return result;
	}
	
	public boolean isFull() {
		boolean result = false;
		if(stackSize == insertCounter + 1 ) {
		return true;
		}
	return result;
	}
	
	public boolean isFullDiff() {
		return (stackSize == insertCounter + 1);
	}
	
	public int getStackSize() {
		return stackSize;
	}

	public long getStackArrayElemet(int i) {
		return stackArray[i];
	}

}
