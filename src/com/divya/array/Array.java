package com.divya.array;

public class Array<Type> {
	private static final int INITIAL_DEFAULT_SIZE = 2;
	private int size;
	private Type[] array;
	private int minimumSize;

	public Array(int initialSize) {
		minimumSize = initialSize;
		array = (Type[]) new Object[initialSize];
		size = 0;
	}

	public Array() {
		this(INITIAL_DEFAULT_SIZE);
	}

	public int getSize() {
		return size;
	}

	int getArrayLength() {
		return array.length;
	}

	public void add(Type... number) {
		for (Type i : number) {
			add(i);
		}
	}

	public void add(Type number) {
		if (size >= array.length) {
			array = increaseArraySize();
		}
		array[size] = number;
		size++;
	}

	private Type[] increaseArraySize() {
		int arraySize = array.length * 2;
		Type[] newArray = (Type[]) new Object[arraySize];
		for (int i = 0; i < size; i++) {
			newArray[i] = array[i];
		}
		return newArray;

	}

	private Type[] decreaseArraySize() {
		int arraySize = array.length / 2;
		Type[] newArray = (Type[]) new Object[arraySize];
		for (int i = 0; i < size; i++) {
			newArray[i] = array[i];
		}
		return newArray;

	}

	public boolean deleteLastElement() {
		return deleteAtIndex(size - 1);
	}

	public boolean deleteFirstElement() {
		return deleteAtIndex(0);
	}

	public boolean insertAtLast(Type number) {
		return insertAtRequiredIndex(number, size);
	}

	public boolean insertAtFirst(Type number) {
		return insertAtRequiredIndex(number, 0);
	}

	public boolean insertAtRequiredIndex(Type number, int index) {
		// to insert we have to check size with length.
		if (size >= array.length - 1) {
			array = increaseArraySize();
		}
		if (index <= size) {
			for (int i = size; i >= index; i--) {
				array[i + 1] = array[i];
			}
			size++;
			array[index] = number;
			return true;
		}
		return false;
	}

	private boolean deleteAtIndex(int index) {
		if ((index < size) && (index >= 0)) {
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
		System.out.println("Array Size :" + size);
		System.out.println("Array Length :" + array.length);
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