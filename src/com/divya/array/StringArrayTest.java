package com.divya.array;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class StringArrayTest {
	@Test
	void addSingleElement() {
		Array<String> array = new Array<String>();
		array.add("5");
		assertEquals(1, array.getSize());
		assertEquals(2, array.getArrayLength());
		array.add("51");
		assertEquals(2, array.getSize());
		assertEquals(2, array.getArrayLength());
		array.insertAtRequiredIndex("1", 1);
		assertEquals(3, array.getSize());
		assertEquals(4, array.getArrayLength());
	}

	@Test
	void addmultipleElements() {
		Array<String> array = new Array<String>();
		array.add("1", "2", "3"," 4"," 5"," 6");
		assertEquals(6, array.getSize());
		assertEquals(8, array.getArrayLength());
	}

	@Test
	void addAtFirst() {
		Array<String> array = new Array<String>();
		array.add("1", "4", "6"," 7"," 2", "8", "3", "45");
		array.insertAtFirst("23");
		assertEquals(9, array.getSize());
		assertEquals(16, array.getArrayLength());
	}

	@Test
	void addAtLast() {
		Array<String> array = new Array<String>();
		array.add("1", "2", "3", "4", "5", "6");
		array.insertAtLast("16");
		assertEquals(7, array.getSize());
		assertEquals(8, array.getArrayLength());
	}

	@Test
	void addAtRequiredIndex() {
		Array<String> array = new Array<String>();
		array.add("2", "78");
		array.print();
		array.insertAtRequiredIndex("14",1);
		assertEquals(3, array.getSize());
		assertEquals(4, array.getArrayLength());
		array.print();
		array.insertAtRequiredIndex("24", 2);
		assertEquals(4, array.getSize());
		assertEquals(8, array.getArrayLength());
		array.print();
		array.insertAtRequiredIndex("42", 3);
		assertEquals(5, array.getSize());
		assertEquals(8, array.getArrayLength());
		array.print();
		array.insertAtRequiredIndex("412", 2);
		assertEquals(6, array.getSize());
		assertEquals(8, array.getArrayLength());
		array.print();
		array.insertAtRequiredIndex("12", 3);
		assertEquals(7, array.getSize());
		assertEquals(8, array.getArrayLength());
		array.print();
		array.insertAtRequiredIndex("8", 2);
		assertEquals(8, array.getSize());
		assertEquals(16, array.getArrayLength());
		array.print();
	}

	@Test
	void deleteFromEmptyArray() {
		Array<String> array = new Array<String>();
		assertFalse(array.deleteLastElement());
	}

	@Test
	void deleteOneElementFromArray() {
		Array<String> array = new Array<String>();
		array.add("44");
		assertEquals(1, array.getSize());
		assertEquals(2, array.getArrayLength());
		assertTrue(array.deleteLastElement());
		assertEquals(0, array.getSize());
		assertEquals(2, array.getArrayLength());
	}

	@Test
	void deleteManyELementsFromArray() {
		Array<String> array = new Array<String>();
		array.add("44");
		array.add("4");
		array.add("40");
		array.add("14");
		array.add("140");
		assertEquals(5, array.getSize());
		assertEquals(8, array.getArrayLength());
		assertTrue(array.deleteLastElement());
		assertEquals(4, array.getSize());
		assertEquals(4, array.getArrayLength());
		assertTrue(array.deleteFirstElement());
		assertEquals(3, array.getSize());
		assertEquals(4, array.getArrayLength());
		assertTrue(array.deleteLastElement());
		assertEquals(2, array.getSize());
		assertEquals(2, array.getArrayLength());
		assertTrue(array.deleteLastElement());
		assertEquals(1, array.getSize());
		assertEquals(2, array.getArrayLength());
		assertTrue(array.deleteLastElement());
		assertEquals(0, array.getSize());
		assertEquals(2, array.getArrayLength());
	}

}
