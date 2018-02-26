package com.divya.array;
public class Array {
	private static final int INITIAL_DEFAULT_SIZE = 2;
	private int size;
	private int[] array;
	private int minimumSize;

	public Array(int initialSize) {
		minimumSize = initialSize;
		array = new int[initialSize];
		size = 0;
	}

	public Array() {
		this(INITIAL_DEFAULT_SIZE);
	}

	public int getSize() {
		return size;
	}

	public void add(int... number) {
		for (int i : number) {
			add(i);
		}
	}

	public void add(int number) {
		if (size >= array.length) {
			array = increaseArraySize();
		}
		array[size] = number;
		size++;
	}

	private int[] increaseArraySize() {
		int arraySize = array.length * 2;
		int[] newArray = new int[arraySize];
		for (int i = 0; i < size; i++) {
			newArray[i] = array[i];
		}
		return newArray;

	}

	private int[] decreaseArraySize() {
		int arraySize = array.length / 2;
		int[] newArray = new int[arraySize];
		for (int i = 0; i < size; i++) {
			newArray[i] = array[i];
		}
		return newArray;

	}

	public boolean deleteLastElement() {
		return deleteAtIndex(size - 1);
	}
	
	private boolean deleteAtIndex(int index) {
		if (index < size) {
			for (int i = index; (i < size - 1); i++) {
				array[i] = array[i + 1];
			}
			size--;
			int arrayLengthAfterDecreasing = array.length / 2;
			if ((size <= arrayLengthAfterDecreasing) && (minimumSize <= arrayLengthAfterDecreasing)) {
				array = decreaseArraySize();
			}
			return true;
		}
		return false;

	}

	public void print() {
		System.out.println("Array Length :" + array.length);
		System.out.println("Array Size :" + size);
		System.out.println(this.toString());
	}

	@Override
	public String toString() {
		String str = "[";
		for (int i = 0; i < size; i++) {
			str += (" " + array[i] + " ");
		}
		str += "]";
		return str;
	}

}